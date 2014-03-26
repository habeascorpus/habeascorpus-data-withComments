/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
/** Implemented by classes capable of configuring log4j using a URL. @since 1.0 @author Anders Kristensen */	TokenNameCOMMENT_JAVADOC	 Implemented by classes capable of configuring log4j using a URL. @since 1.0 @author Anders Kristensen 
public	TokenNamepublic	
interface	TokenNameinterface	
Configurator	TokenNameIdentifier	 Configurator
{	TokenNameLBRACE	
/** Special level value signifying inherited behaviour. The current value of this string constant is <b>inherited</b>. {@link #NULL} is a synonym. */	TokenNameCOMMENT_JAVADOC	 Special level value signifying inherited behaviour. The current value of this string constant is <b>inherited</b>. {@link #NULL} is a synonym. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INHERITED	TokenNameIdentifier	 INHERITED
=	TokenNameEQUAL	
"inherited"	TokenNameStringLiteral	inherited
;	TokenNameSEMICOLON	
/** Special level signifying inherited behaviour, same as {@link #INHERITED}. The current value of this string constant is <b>null</b>. */	TokenNameCOMMENT_JAVADOC	 Special level signifying inherited behaviour, same as {@link #INHERITED}. The current value of this string constant is <b>null</b>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NULL	TokenNameIdentifier	 NULL
=	TokenNameEQUAL	
"null"	TokenNameStringLiteral	null
;	TokenNameSEMICOLON	
/** Interpret a resource pointed by a InputStream and set up log4j accordingly. The configuration is done relative to the <code>hierarchy</code> parameter. @param inputStream The InputStream to parse @param repository The hierarchy to operation upon. @since 1.2.17 */	TokenNameCOMMENT_JAVADOC	 Interpret a resource pointed by a InputStream and set up log4j accordingly. The configuration is done relative to the <code>hierarchy</code> parameter. @param inputStream The InputStream to parse @param repository The hierarchy to operation upon. @since 1.2.17 
void	TokenNamevoid	
doConfigure	TokenNameIdentifier	 do Configure
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
LoggerRepository	TokenNameIdentifier	 Logger Repository
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Interpret a resource pointed by a URL and set up log4j accordingly. The configuration is done relative to the <code>hierarchy</code> parameter. @param url The URL to parse @param repository The hierarchy to operation upon. */	TokenNameCOMMENT_JAVADOC	 Interpret a resource pointed by a URL and set up log4j accordingly. The configuration is done relative to the <code>hierarchy</code> parameter. @param url The URL to parse @param repository The hierarchy to operation upon. 
void	TokenNamevoid	
doConfigure	TokenNameIdentifier	 do Configure
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
LoggerRepository	TokenNameIdentifier	 Logger Repository
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
