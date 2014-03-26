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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
ProjectComponent	TokenNameIdentifier	 Project Component
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
/** * ANT Jar-Task SPI extension * * @see <a href="http://issues.apache.org/bugzilla/show_bug.cgi?id=31520"> * http://issues.apache.org/bugzilla/show_bug.cgi?id=31520</a> */	TokenNameCOMMENT_JAVADOC	 ANT Jar-Task SPI extension * @see <a href="http://issues.apache.org/bugzilla/show_bug.cgi?id=31520"> http://issues.apache.org/bugzilla/show_bug.cgi?id=31520</a> 
public	TokenNamepublic	
class	TokenNameclass	
Service	TokenNameIdentifier	 Service
extends	TokenNameextends	
ProjectComponent	TokenNameIdentifier	 Project Component
{	TokenNameLBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
providerList	TokenNameIdentifier	 provider List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** * Set the provider classname. * @param className the classname of a provider of this service. */	TokenNameCOMMENT_JAVADOC	 Set the provider classname. @param className the classname of a provider of this service. 
public	TokenNamepublic	
void	TokenNamevoid	
setProvider	TokenNameIdentifier	 set Provider
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Provider	TokenNameIdentifier	 Provider
provider	TokenNameIdentifier	 provider
=	TokenNameEQUAL	
new	TokenNamenew	
Provider	TokenNameIdentifier	 Provider
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
provider	TokenNameIdentifier	 provider
.	TokenNameDOT	
setClassName	TokenNameIdentifier	 set Class Name
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
providerList	TokenNameIdentifier	 provider List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
provider	TokenNameIdentifier	 provider
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a nested provider element. * @param provider a provider element. */	TokenNameCOMMENT_JAVADOC	 Add a nested provider element. @param provider a provider element. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredProvider	TokenNameIdentifier	 add Configured Provider
(	TokenNameLPAREN	
Provider	TokenNameIdentifier	 Provider
provider	TokenNameIdentifier	 provider
)	TokenNameRPAREN	
{	TokenNameLBRACE	
provider	TokenNameIdentifier	 provider
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
providerList	TokenNameIdentifier	 provider List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
provider	TokenNameIdentifier	 provider
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the service type. */	TokenNameCOMMENT_JAVADOC	 @return the service type. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the service type. * @param type the service type, a classname of * an interface or a class (normally * abstract). */	TokenNameCOMMENT_JAVADOC	 Set the service type. @param type the service type, a classname of an interface or a class (normally abstract). 
public	TokenNamepublic	
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the implementations of this * services as an inputstream. * @return an inputstream of the classname names * encoded as UTF-8. * @throws IOException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Return the implementations of this services as an inputstream. @return an inputstream of the classname names encoded as UTF-8. @throws IOException if there is an error. 
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
getAsStream	TokenNameIdentifier	 get As Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
arrayOut	TokenNameIdentifier	 array Out
;	TokenNameSEMICOLON	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
providerIterator	TokenNameIdentifier	 provider Iterator
;	TokenNameSEMICOLON	
Provider	TokenNameIdentifier	 Provider
provider	TokenNameIdentifier	 provider
;	TokenNameSEMICOLON	
arrayOut	TokenNameIdentifier	 array Out
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
arrayOut	TokenNameIdentifier	 array Out
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
providerIterator	TokenNameIdentifier	 provider Iterator
=	TokenNameEQUAL	
providerList	TokenNameIdentifier	 provider List
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
providerIterator	TokenNameIdentifier	 provider Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
provider	TokenNameIdentifier	 provider
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Provider	TokenNameIdentifier	 Provider
)	TokenNameRPAREN	
providerIterator	TokenNameIdentifier	 provider Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
provider	TokenNameIdentifier	 provider
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
arrayOut	TokenNameIdentifier	 array Out
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if this object is configured correctly as a nested * element. */	TokenNameCOMMENT_JAVADOC	 Check if this object is configured correctly as a nested element. 
public	TokenNamepublic	
void	TokenNamevoid	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"type attribute must be set for service element"	TokenNameStringLiteral	type attribute must be set for service element
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Invalid empty type classname"	TokenNameStringLiteral	Invalid empty type classname
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
providerList	TokenNameIdentifier	 provider List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"provider attribute or nested provider element must be set!"	TokenNameStringLiteral	provider attribute or nested provider element must be set!
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
