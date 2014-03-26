package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
configuration	TokenNameIdentifier	 configuration
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringReader	TokenNameIdentifier	 String Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
Xpp3DomBuilder	TokenNameIdentifier	 Xpp3 Dom Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
pull	TokenNameIdentifier	 pull
.	TokenNameDOT	
XmlPullParserException	TokenNameIdentifier	 Xml Pull Parser Exception
;	TokenNameSEMICOLON	
/** * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
DefaultBeanConfiguratorTest	TokenNameIdentifier	 Default Bean Configurator Test
extends	TokenNameextends	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
BeanConfigurator	TokenNameIdentifier	 Bean Configurator
configurator	TokenNameIdentifier	 configurator
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
configurator	TokenNameIdentifier	 configurator
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
BeanConfigurator	TokenNameIdentifier	 Bean Configurator
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
configurator	TokenNameIdentifier	 configurator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
toConfig	TokenNameIdentifier	 to Config
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
xml	TokenNameIdentifier	 xml
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
Xpp3DomBuilder	TokenNameIdentifier	 Xpp3 Dom Builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
"<configuration>"	TokenNameStringLiteral	<configuration>
+	TokenNamePLUS	
xml	TokenNameIdentifier	 xml
+	TokenNamePLUS	
"</configuration>"	TokenNameStringLiteral	</configuration>
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
XmlPullParserException	TokenNameIdentifier	 Xml Pull Parser Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMinimal	TokenNameIdentifier	 test Minimal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BeanConfigurationException	TokenNameIdentifier	 Bean Configuration Exception
{	TokenNameLBRACE	
SomeBean	TokenNameIdentifier	 Some Bean
bean	TokenNameIdentifier	 bean
=	TokenNameEQUAL	
new	TokenNamenew	
SomeBean	TokenNameIdentifier	 Some Bean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
toConfig	TokenNameIdentifier	 to Config
(	TokenNameLPAREN	
"<file>test</file>"	TokenNameStringLiteral	<file>test</file>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DefaultBeanConfigurationRequest	TokenNameIdentifier	 Default Bean Configuration Request
request	TokenNameIdentifier	 request
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultBeanConfigurationRequest	TokenNameIdentifier	 Default Bean Configuration Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setBean	TokenNameIdentifier	 set Bean
(	TokenNameLPAREN	
bean	TokenNameIdentifier	 bean
)	TokenNameRPAREN	
.	TokenNameDOT	
setConfiguration	TokenNameIdentifier	 set Configuration
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
configurator	TokenNameIdentifier	 configurator
.	TokenNameDOT	
configureBean	TokenNameIdentifier	 configure Bean
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bean	TokenNameIdentifier	 bean
.	TokenNameDOT	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPreAndPostProcessing	TokenNameIdentifier	 test Pre And Post Processing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BeanConfigurationException	TokenNameIdentifier	 Bean Configuration Exception
{	TokenNameLBRACE	
SomeBean	TokenNameIdentifier	 Some Bean
bean	TokenNameIdentifier	 bean
=	TokenNameEQUAL	
new	TokenNamenew	
SomeBean	TokenNameIdentifier	 Some Bean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
toConfig	TokenNameIdentifier	 to Config
(	TokenNameLPAREN	
"<file>${test}</file>"	TokenNameStringLiteral	<file>${test}</file>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BeanConfigurationValuePreprocessor	TokenNameIdentifier	 Bean Configuration Value Preprocessor
preprocessor	TokenNameIdentifier	 preprocessor
=	TokenNameEQUAL	
new	TokenNamenew	
BeanConfigurationValuePreprocessor	TokenNameIdentifier	 Bean Configuration Value Preprocessor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
preprocessValue	TokenNameIdentifier	 preprocess Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
throws	TokenNamethrows	
BeanConfigurationException	TokenNameIdentifier	 Bean Configuration Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"${"	TokenNameStringLiteral	${
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
BeanConfigurationPathTranslator	TokenNameIdentifier	 Bean Configuration Path Translator
translator	TokenNameIdentifier	 translator
=	TokenNameEQUAL	
new	TokenNamenew	
BeanConfigurationPathTranslator	TokenNameIdentifier	 Bean Configuration Path Translator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
File	TokenNameIdentifier	 File
translatePath	TokenNameIdentifier	 translate Path
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"base"	TokenNameStringLiteral	base
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsoluteFile	TokenNameIdentifier	 get Absolute File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
DefaultBeanConfigurationRequest	TokenNameIdentifier	 Default Bean Configuration Request
request	TokenNameIdentifier	 request
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultBeanConfigurationRequest	TokenNameIdentifier	 Default Bean Configuration Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setBean	TokenNameIdentifier	 set Bean
(	TokenNameLPAREN	
bean	TokenNameIdentifier	 bean
)	TokenNameRPAREN	
.	TokenNameDOT	
setConfiguration	TokenNameIdentifier	 set Configuration
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setValuePreprocessor	TokenNameIdentifier	 set Value Preprocessor
(	TokenNameLPAREN	
preprocessor	TokenNameIdentifier	 preprocessor
)	TokenNameRPAREN	
.	TokenNameDOT	
setPathTranslator	TokenNameIdentifier	 set Path Translator
(	TokenNameLPAREN	
translator	TokenNameIdentifier	 translator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
configurator	TokenNameIdentifier	 configurator
.	TokenNameDOT	
configureBean	TokenNameIdentifier	 configure Bean
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"base/test"	TokenNameStringLiteral	base/test
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsoluteFile	TokenNameIdentifier	 get Absolute File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bean	TokenNameIdentifier	 bean
.	TokenNameDOT	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testChildConfigurationElement	TokenNameIdentifier	 test Child Configuration Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BeanConfigurationException	TokenNameIdentifier	 Bean Configuration Exception
{	TokenNameLBRACE	
SomeBean	TokenNameIdentifier	 Some Bean
bean	TokenNameIdentifier	 bean
=	TokenNameEQUAL	
new	TokenNamenew	
SomeBean	TokenNameIdentifier	 Some Bean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
toConfig	TokenNameIdentifier	 to Config
(	TokenNameLPAREN	
"<wrapper><file>test</file></wrapper>"	TokenNameStringLiteral	<wrapper><file>test</file></wrapper>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DefaultBeanConfigurationRequest	TokenNameIdentifier	 Default Bean Configuration Request
request	TokenNameIdentifier	 request
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultBeanConfigurationRequest	TokenNameIdentifier	 Default Bean Configuration Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setBean	TokenNameIdentifier	 set Bean
(	TokenNameLPAREN	
bean	TokenNameIdentifier	 bean
)	TokenNameRPAREN	
.	TokenNameDOT	
setConfiguration	TokenNameIdentifier	 set Configuration
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
,	TokenNameCOMMA	
"wrapper"	TokenNameStringLiteral	wrapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
configurator	TokenNameIdentifier	 configurator
.	TokenNameDOT	
configureBean	TokenNameIdentifier	 configure Bean
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bean	TokenNameIdentifier	 bean
.	TokenNameDOT	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
SomeBean	TokenNameIdentifier	 Some Bean
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
