/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
LogLog	TokenNameIdentifier	 Log Log
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
EntityResolver	TokenNameIdentifier	 Entity Resolver
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
;	TokenNameSEMICOLON	
/** * An {@link EntityResolver} specifically designed to return * <code>log4j.dtd</code> which is embedded within the log4j jar * file. * * @author Paul Austin * */	TokenNameCOMMENT_JAVADOC	 An {@link EntityResolver} specifically designed to return <code>log4j.dtd</code> which is embedded within the log4j jar file. * @author Paul Austin 
public	TokenNamepublic	
class	TokenNameclass	
Log4jEntityResolver	TokenNameIdentifier	 Log4j Entity Resolver
implements	TokenNameimplements	
EntityResolver	TokenNameIdentifier	 Entity Resolver
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PUBLIC_ID	TokenNameIdentifier	 PUBLIC  ID
=	TokenNameEQUAL	
"-//APACHE//DTD LOG4J 1.2//EN"	TokenNameStringLiteral	-//APACHE//DTD LOG4J 1.2//EN
;	TokenNameSEMICOLON	
public	TokenNamepublic	
InputSource	TokenNameIdentifier	 Input Source
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"log4j.dtd"	TokenNameStringLiteral	log4j.dtd
)	TokenNameRPAREN	
||	TokenNameOR_OR	
PUBLIC_ID	TokenNameIdentifier	 PUBLIC  ID
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
"/org/apache/log4j/xml/log4j.dtd"	TokenNameStringLiteral	/org/apache/log4j/xml/log4j.dtd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Could not find [log4j.dtd] using ["	TokenNameStringLiteral	Could not find [log4j.dtd] using [
+	TokenNamePLUS	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"] class loader, parsed without DTD."	TokenNameStringLiteral	] class loader, parsed without DTD.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
