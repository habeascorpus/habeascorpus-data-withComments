/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
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
FileInputStream	TokenNameIdentifier	 File Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileWriter	TokenNameIdentifier	 File Writer
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipEntry	TokenNameIdentifier	 Zip Entry
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
Filter	TokenNameIdentifier	 Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
OptionHandler	TokenNameIdentifier	 Option Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
ThrowableRenderer	TokenNameIdentifier	 Throwable Renderer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
ThrowableRendererSupport	TokenNameIdentifier	 Throwable Renderer Support
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
varia	TokenNameIdentifier	 varia
.	TokenNameDOT	
LevelRangeFilter	TokenNameIdentifier	 Level Range Filter
;	TokenNameSEMICOLON	
/** * Test property configurator. * */	TokenNameCOMMENT_JAVADOC	 Test property configurator. 
public	TokenNamepublic	
class	TokenNameclass	
PropertyConfiguratorTest	TokenNameIdentifier	 Property Configurator Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
PropertyConfiguratorTest	TokenNameIdentifier	 Property Configurator Test
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
testName	TokenNameIdentifier	 test Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
testName	TokenNameIdentifier	 test Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test for bug 40944. * Did not catch IllegalArgumentException on Properties.load * and close input stream. * @throws IOException if IOException creating properties file. */	TokenNameCOMMENT_JAVADOC	 Test for bug 40944. Did not catch IllegalArgumentException on Properties.load and close input stream. @throws IOException if IOException creating properties file. 
public	TokenNamepublic	
void	TokenNamevoid	
testBadUnicodeEscape	TokenNameIdentifier	 test Bad Unicode Escape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
"output/badescape.properties"	TokenNameStringLiteral	output/badescape.properties
;	TokenNameSEMICOLON	
FileWriter	TokenNameIdentifier	 File Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
FileWriter	TokenNameIdentifier	 File Writer
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"log4j.rootLogger=\uXX41"	TokenNameStringLiteral	log4j.rootLogger=\uXX41
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test for bug 40944. * configure(URL) never closed opened stream. * @throws IOException if IOException creating properties file. */	TokenNameCOMMENT_JAVADOC	 Test for bug 40944. configure(URL) never closed opened stream. @throws IOException if IOException creating properties file. 
public	TokenNamepublic	
void	TokenNamevoid	
testURL	TokenNameIdentifier	 test URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"output/unclosed.properties"	TokenNameStringLiteral	output/unclosed.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileWriter	TokenNameIdentifier	 File Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
FileWriter	TokenNameIdentifier	 File Writer
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"log4j.rootLogger=debug"	TokenNameStringLiteral	log4j.rootLogger=debug
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
toURL	TokenNameIdentifier	 to URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test for bug 40944. * configure(URL) did not catch IllegalArgumentException and * did not close stream. * @throws IOException if IOException creating properties file. */	TokenNameCOMMENT_JAVADOC	 Test for bug 40944. configure(URL) did not catch IllegalArgumentException and did not close stream. @throws IOException if IOException creating properties file. 
public	TokenNamepublic	
void	TokenNamevoid	
testURLBadEscape	TokenNameIdentifier	 test URL Bad Escape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"output/urlbadescape.properties"	TokenNameStringLiteral	output/urlbadescape.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileWriter	TokenNameIdentifier	 File Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
FileWriter	TokenNameIdentifier	 File Writer
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"log4j.rootLogger=\uXX41"	TokenNameStringLiteral	log4j.rootLogger=\uXX41
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
toURL	TokenNameIdentifier	 to URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests configuring Log4J from an InputStream. * * @since 1.2.17 */	TokenNameCOMMENT_JAVADOC	 Tests configuring Log4J from an InputStream. * @since 1.2.17 
public	TokenNamepublic	
void	TokenNamevoid	
testInputStream	TokenNameIdentifier	 test Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"input/filter1.properties"	TokenNameStringLiteral	input/filter1.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
inputStream	TokenNameIdentifier	 input Stream
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
inputStream	TokenNameIdentifier	 input Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
inputStream	TokenNameIdentifier	 input Stream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
validateNested	TokenNameIdentifier	 validate Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
resetConfiguration	TokenNameIdentifier	 reset Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validateNested	TokenNameIdentifier	 validate Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RollingFileAppender	TokenNameIdentifier	 Rolling File Appender
rfa	TokenNameIdentifier	 rfa
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RollingFileAppender	TokenNameIdentifier	 Rolling File Appender
)	TokenNameRPAREN	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"org.apache.log4j.PropertyConfiguratorTest"	TokenNameStringLiteral	org.apache.log4j.PropertyConfiguratorTest
)	TokenNameRPAREN	
.	TokenNameDOT	
getAppender	TokenNameIdentifier	 get Appender
(	TokenNameLPAREN	
"ROLLING"	TokenNameStringLiteral	ROLLING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FixedWindowRollingPolicy	TokenNameIdentifier	 Fixed Window Rolling Policy
rollingPolicy	TokenNameIdentifier	 rolling Policy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FixedWindowRollingPolicy	TokenNameIdentifier	 Fixed Window Rolling Policy
)	TokenNameRPAREN	
rfa	TokenNameIdentifier	 rfa
.	TokenNameDOT	
getRollingPolicy	TokenNameIdentifier	 get Rolling Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"filterBase-test1.log"	TokenNameStringLiteral	filterBase-test1.log
,	TokenNameCOMMA	
rollingPolicy	TokenNameIdentifier	 rolling Policy
.	TokenNameDOT	
getActiveFileName	TokenNameIdentifier	 get Active File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"filterBased-test1.%i"	TokenNameStringLiteral	filterBased-test1.%i
,	TokenNameCOMMA	
rollingPolicy	TokenNameIdentifier	 rolling Policy
.	TokenNameDOT	
getFileNamePattern	TokenNameIdentifier	 get File Name Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
rollingPolicy	TokenNameIdentifier	 rolling Policy
.	TokenNameDOT	
getMinIndex	TokenNameIdentifier	 get Min Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
rollingPolicy	TokenNameIdentifier	 rolling Policy
.	TokenNameDOT	
isActivated	TokenNameIdentifier	 is Activated
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FilterBasedTriggeringPolicy	TokenNameIdentifier	 Filter Based Triggering Policy
triggeringPolicy	TokenNameIdentifier	 triggering Policy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FilterBasedTriggeringPolicy	TokenNameIdentifier	 Filter Based Triggering Policy
)	TokenNameRPAREN	
rfa	TokenNameIdentifier	 rfa
.	TokenNameDOT	
getTriggeringPolicy	TokenNameIdentifier	 get Triggering Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LevelRangeFilter	TokenNameIdentifier	 Level Range Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LevelRangeFilter	TokenNameIdentifier	 Level Range Filter
)	TokenNameRPAREN	
triggeringPolicy	TokenNameIdentifier	 triggering Policy
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
getLevelMin	TokenNameIdentifier	 get Level Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test for bug 47465. * configure(URL) did not close opened JarURLConnection. * @throws IOException if IOException creating properties jar. */	TokenNameCOMMENT_JAVADOC	 Test for bug 47465. configure(URL) did not close opened JarURLConnection. @throws IOException if IOException creating properties jar. 
public	TokenNamepublic	
void	TokenNamevoid	
testJarURL	TokenNameIdentifier	 test Jar URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"output"	TokenNameStringLiteral	output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"output/properties.jar"	TokenNameStringLiteral	output/properties.jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
zos	TokenNameIdentifier	 zos
=	TokenNameEQUAL	
new	TokenNamenew	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zos	TokenNameIdentifier	 zos
.	TokenNameDOT	
putNextEntry	TokenNameIdentifier	 put Next Entry
(	TokenNameLPAREN	
new	TokenNamenew	
ZipEntry	TokenNameIdentifier	 Zip Entry
(	TokenNameLPAREN	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
DEFAULT_CONFIGURATION_FILE	TokenNameIdentifier	 DEFAULT  CONFIGURATION  FILE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zos	TokenNameIdentifier	 zos
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"log4j.rootLogger=debug"	TokenNameStringLiteral	log4j.rootLogger=debug
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zos	TokenNameIdentifier	 zos
.	TokenNameDOT	
closeEntry	TokenNameIdentifier	 close Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zos	TokenNameIdentifier	 zos
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
"jar:"	TokenNameStringLiteral	jar:
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
toURL	TokenNameIdentifier	 to URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"!/"	TokenNameStringLiteral	!/
+	TokenNamePLUS	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
DEFAULT_CONFIGURATION_FILE	TokenNameIdentifier	 DEFAULT  CONFIGURATION  FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test processing of log4j.reset property, see bug 17531. * */	TokenNameCOMMENT_JAVADOC	 Test processing of log4j.reset property, see bug 17531. 
public	TokenNamepublic	
void	TokenNamevoid	
testReset	TokenNameIdentifier	 test Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
VectorAppender	TokenNameIdentifier	 Vector Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
VectorAppender	TokenNameIdentifier	 Vector Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"A1"	TokenNameStringLiteral	A1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"log4j.reset"	TokenNameStringLiteral	log4j.reset
,	TokenNameCOMMA	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAppender	TokenNameIdentifier	 get Appender
(	TokenNameLPAREN	
"A1"	TokenNameStringLiteral	A1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
resetConfiguration	TokenNameIdentifier	 reset Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Mock definition of org.apache.log4j.rolling.RollingPolicy * from extras companion. */	TokenNameCOMMENT_JAVADOC	 Mock definition of org.apache.log4j.rolling.RollingPolicy from extras companion. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
RollingPolicy	TokenNameIdentifier	 Rolling Policy
implements	TokenNameimplements	
OptionHandler	TokenNameIdentifier	 Option Handler
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
activated	TokenNameIdentifier	 activated
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RollingPolicy	TokenNameIdentifier	 Rolling Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
activated	TokenNameIdentifier	 activated
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isActivated	TokenNameIdentifier	 is Activated
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
activated	TokenNameIdentifier	 activated
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Mock definition of FixedWindowRollingPolicy from extras companion. */	TokenNameCOMMENT_JAVADOC	 Mock definition of FixedWindowRollingPolicy from extras companion. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
FixedWindowRollingPolicy	TokenNameIdentifier	 Fixed Window Rolling Policy
extends	TokenNameextends	
RollingPolicy	TokenNameIdentifier	 Rolling Policy
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
activeFileName	TokenNameIdentifier	 active File Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fileNamePattern	TokenNameIdentifier	 file Name Pattern
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
minIndex	TokenNameIdentifier	 min Index
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FixedWindowRollingPolicy	TokenNameIdentifier	 Fixed Window Rolling Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minIndex	TokenNameIdentifier	 min Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getActiveFileName	TokenNameIdentifier	 get Active File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
activeFileName	TokenNameIdentifier	 active File Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setActiveFileName	TokenNameIdentifier	 set Active File Name
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
activeFileName	TokenNameIdentifier	 active File Name
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFileNamePattern	TokenNameIdentifier	 get File Name Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fileNamePattern	TokenNameIdentifier	 file Name Pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFileNamePattern	TokenNameIdentifier	 set File Name Pattern
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fileNamePattern	TokenNameIdentifier	 file Name Pattern
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMinIndex	TokenNameIdentifier	 get Min Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
minIndex	TokenNameIdentifier	 min Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMinIndex	TokenNameIdentifier	 set Min Index
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minIndex	TokenNameIdentifier	 min Index
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Mock definition of TriggeringPolicy from extras companion. */	TokenNameCOMMENT_JAVADOC	 Mock definition of TriggeringPolicy from extras companion. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
TriggeringPolicy	TokenNameIdentifier	 Triggering Policy
implements	TokenNameimplements	
OptionHandler	TokenNameIdentifier	 Option Handler
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
activated	TokenNameIdentifier	 activated
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TriggeringPolicy	TokenNameIdentifier	 Triggering Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
activated	TokenNameIdentifier	 activated
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isActivated	TokenNameIdentifier	 is Activated
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
activated	TokenNameIdentifier	 activated
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Mock definition of FilterBasedTriggeringPolicy from extras companion. */	TokenNameCOMMENT_JAVADOC	 Mock definition of FilterBasedTriggeringPolicy from extras companion. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
FilterBasedTriggeringPolicy	TokenNameIdentifier	 Filter Based Triggering Policy
extends	TokenNameextends	
TriggeringPolicy	TokenNameIdentifier	 Triggering Policy
{	TokenNameLBRACE	
private	TokenNameprivate	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FilterBasedTriggeringPolicy	TokenNameIdentifier	 Filter Based Triggering Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFilter	TokenNameIdentifier	 set Filter
(	TokenNameLPAREN	
final	TokenNamefinal	
Filter	TokenNameIdentifier	 Filter
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Filter	TokenNameIdentifier	 Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Mock definition of org.apache.log4j.rolling.RollingFileAppender * from extras companion. */	TokenNameCOMMENT_JAVADOC	 Mock definition of org.apache.log4j.rolling.RollingFileAppender from extras companion. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
RollingFileAppender	TokenNameIdentifier	 Rolling File Appender
extends	TokenNameextends	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
{	TokenNameLBRACE	
private	TokenNameprivate	
RollingPolicy	TokenNameIdentifier	 Rolling Policy
rollingPolicy	TokenNameIdentifier	 rolling Policy
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TriggeringPolicy	TokenNameIdentifier	 Triggering Policy
triggeringPolicy	TokenNameIdentifier	 triggering Policy
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
append	TokenNameIdentifier	 append
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RollingFileAppender	TokenNameIdentifier	 Rolling File Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
RollingPolicy	TokenNameIdentifier	 Rolling Policy
getRollingPolicy	TokenNameIdentifier	 get Rolling Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rollingPolicy	TokenNameIdentifier	 rolling Policy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRollingPolicy	TokenNameIdentifier	 set Rolling Policy
(	TokenNameLPAREN	
final	TokenNamefinal	
RollingPolicy	TokenNameIdentifier	 Rolling Policy
policy	TokenNameIdentifier	 policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rollingPolicy	TokenNameIdentifier	 rolling Policy
=	TokenNameEQUAL	
policy	TokenNameIdentifier	 policy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TriggeringPolicy	TokenNameIdentifier	 Triggering Policy
getTriggeringPolicy	TokenNameIdentifier	 get Triggering Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
triggeringPolicy	TokenNameIdentifier	 triggering Policy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTriggeringPolicy	TokenNameIdentifier	 set Triggering Policy
(	TokenNameLPAREN	
final	TokenNamefinal	
TriggeringPolicy	TokenNameIdentifier	 Triggering Policy
policy	TokenNameIdentifier	 policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
triggeringPolicy	TokenNameIdentifier	 triggering Policy
=	TokenNameEQUAL	
policy	TokenNameIdentifier	 policy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getAppend	TokenNameIdentifier	 get Append
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
append	TokenNameIdentifier	 append
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setAppend	TokenNameIdentifier	 set Append
(	TokenNameLPAREN	
boolean	TokenNameboolean	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
append	TokenNameIdentifier	 append
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
requiresLayout	TokenNameIdentifier	 requires Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
final	TokenNamefinal	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests processing of nested objects, see bug 36384. */	TokenNameCOMMENT_JAVADOC	 Tests processing of nested objects, see bug 36384. 
public	TokenNamepublic	
void	TokenNamevoid	
testNested	TokenNameIdentifier	 test Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
"input/filter1.properties"	TokenNameStringLiteral	input/filter1.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
validateNested	TokenNameIdentifier	 validate Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
resetConfiguration	TokenNameIdentifier	 reset Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Mock ThrowableRenderer for testThrowableRenderer. See bug 45721. */	TokenNameCOMMENT_JAVADOC	 Mock ThrowableRenderer for testThrowableRenderer. See bug 45721. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
MockThrowableRenderer	TokenNameIdentifier	 Mock Throwable Renderer
implements	TokenNameimplements	
ThrowableRenderer	TokenNameIdentifier	 Throwable Renderer
,	TokenNameCOMMA	
OptionHandler	TokenNameIdentifier	 Option Handler
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
activated	TokenNameIdentifier	 activated
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
showVersion	TokenNameIdentifier	 show Version
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MockThrowableRenderer	TokenNameIdentifier	 Mock Throwable Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
activated	TokenNameIdentifier	 activated
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isActivated	TokenNameIdentifier	 is Activated
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
activated	TokenNameIdentifier	 activated
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
doRender	TokenNameIdentifier	 do Render
(	TokenNameLPAREN	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setShowVersion	TokenNameIdentifier	 set Show Version
(	TokenNameLPAREN	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
showVersion	TokenNameIdentifier	 show Version
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getShowVersion	TokenNameIdentifier	 get Show Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
showVersion	TokenNameIdentifier	 show Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test of log4j.throwableRenderer support. See bug 45721. */	TokenNameCOMMENT_JAVADOC	 Test of log4j.throwableRenderer support. See bug 45721. 
public	TokenNamepublic	
void	TokenNamevoid	
testThrowableRenderer	TokenNameIdentifier	 test Throwable Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"log4j.throwableRenderer"	TokenNameStringLiteral	log4j.throwableRenderer
,	TokenNameCOMMA	
"org.apache.log4j.PropertyConfiguratorTest$MockThrowableRenderer"	TokenNameStringLiteral	org.apache.log4j.PropertyConfiguratorTest$MockThrowableRenderer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"log4j.throwableRenderer.showVersion"	TokenNameStringLiteral	log4j.throwableRenderer.showVersion
,	TokenNameCOMMA	
"false"	TokenNameStringLiteral	false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ThrowableRendererSupport	TokenNameIdentifier	 Throwable Renderer Support
repo	TokenNameIdentifier	 repo
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ThrowableRendererSupport	TokenNameIdentifier	 Throwable Renderer Support
)	TokenNameRPAREN	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MockThrowableRenderer	TokenNameIdentifier	 Mock Throwable Renderer
renderer	TokenNameIdentifier	 renderer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MockThrowableRenderer	TokenNameIdentifier	 Mock Throwable Renderer
)	TokenNameRPAREN	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
getThrowableRenderer	TokenNameIdentifier	 get Throwable Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
resetConfiguration	TokenNameIdentifier	 reset Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
renderer	TokenNameIdentifier	 renderer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
isActivated	TokenNameIdentifier	 is Activated
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
getShowVersion	TokenNameIdentifier	 get Show Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
