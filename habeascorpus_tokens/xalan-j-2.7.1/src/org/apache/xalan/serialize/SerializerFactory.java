/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SerializerFactory.java 468642 2006-10-28 06:55:10Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SerializerFactory.java 468642 2006-10-28 06:55:10Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
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
OutputStream	TokenNameIdentifier	 Output Stream
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
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
;	TokenNameSEMICOLON	
/** * Factory for creating serializers. * @deprecated The new class to use is * org.apache.xml.serializer.SerializerFactory */	TokenNameCOMMENT_JAVADOC	 Factory for creating serializers. @deprecated The new class to use is org.apache.xml.serializer.SerializerFactory 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
{	TokenNameLBRACE	
private	TokenNameprivate	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns a serializer for the specified output method. Returns * null if no implementation exists that supports the specified * output method. For a list of the default output methods see * {@link org.apache.xml.serializer.Method}. * * @param format The output format * @return A suitable serializer, or null * @throws IllegalArgumentException (apparently -sc) if method is * null or an appropriate serializer can't be found * @throws WrappedRuntimeException (apparently -sc) if an * exception is thrown while trying to find serializer * @deprecated Use org.apache.xml.serializer.SerializerFactory */	TokenNameCOMMENT_JAVADOC	 Returns a serializer for the specified output method. Returns null if no implementation exists that supports the specified output method. For a list of the default output methods see {@link org.apache.xml.serializer.Method}. * @param format The output format @return A suitable serializer, or null @throws IllegalArgumentException (apparently -sc) if method is null or an appropriate serializer can't be found @throws WrappedRuntimeException (apparently -sc) if an exception is thrown while trying to find serializer @deprecated Use org.apache.xml.serializer.SerializerFactory 
public	TokenNamepublic	
static	TokenNamestatic	
Serializer	TokenNameIdentifier	 Serializer
getSerializer	TokenNameIdentifier	 get Serializer
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
Serializer	TokenNameIdentifier	 Serializer
ser	TokenNameIdentifier	 ser
;	TokenNameSEMICOLON	
ser	TokenNameIdentifier	 ser
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
.	TokenNameDOT	
getSerializer	TokenNameIdentifier	 get Serializer
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
.	TokenNameDOT	
SerializerWrapper	TokenNameIdentifier	 Serializer Wrapper
si	TokenNameIdentifier	 si
=	TokenNameEQUAL	
new	TokenNamenew	
SerializerWrapper	TokenNameIdentifier	 Serializer Wrapper
(	TokenNameLPAREN	
ser	TokenNameIdentifier	 ser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
si	TokenNameIdentifier	 si
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class just exists to wrap a new Serializer in the new package by * an old one. * @deprecated */	TokenNameCOMMENT_JAVADOC	 This class just exists to wrap a new Serializer in the new package by an old one. @deprecated 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
SerializerWrapper	TokenNameIdentifier	 Serializer Wrapper
implements	TokenNameimplements	
Serializer	TokenNameIdentifier	 Serializer
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
Serializer	TokenNameIdentifier	 Serializer
m_serializer	TokenNameIdentifier	 m serializer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DOMSerializer	TokenNameIdentifier	 DOM Serializer
m_old_DOMSerializer	TokenNameIdentifier	 m old  DOM Serializer
;	TokenNameSEMICOLON	
SerializerWrapper	TokenNameIdentifier	 Serializer Wrapper
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
Serializer	TokenNameIdentifier	 Serializer
ser	TokenNameIdentifier	 ser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_serializer	TokenNameIdentifier	 m serializer
=	TokenNameEQUAL	
ser	TokenNameIdentifier	 ser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_serializer	TokenNameIdentifier	 m serializer
.	TokenNameDOT	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
OutputStream	TokenNameIdentifier	 Output Stream
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_serializer	TokenNameIdentifier	 m serializer
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_serializer	TokenNameIdentifier	 m serializer
.	TokenNameDOT	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Writer	TokenNameIdentifier	 Writer
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_serializer	TokenNameIdentifier	 m serializer
.	TokenNameDOT	
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_serializer	TokenNameIdentifier	 m serializer
.	TokenNameDOT	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Properties	TokenNameIdentifier	 Properties
getOutputFormat	TokenNameIdentifier	 get Output Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_serializer	TokenNameIdentifier	 m serializer
.	TokenNameDOT	
getOutputFormat	TokenNameIdentifier	 get Output Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ContentHandler	TokenNameIdentifier	 Content Handler
asContentHandler	TokenNameIdentifier	 as Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
m_serializer	TokenNameIdentifier	 m serializer
.	TokenNameDOT	
asContentHandler	TokenNameIdentifier	 as Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return an old style DOMSerializer that wraps a new one. * @see org.apache.xalan.serialize.Serializer#asDOMSerializer() */	TokenNameCOMMENT_JAVADOC	 @return an old style DOMSerializer that wraps a new one. @see org.apache.xalan.serialize.Serializer#asDOMSerializer() 
public	TokenNamepublic	
DOMSerializer	TokenNameIdentifier	 DOM Serializer
asDOMSerializer	TokenNameIdentifier	 as DOM Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_old_DOMSerializer	TokenNameIdentifier	 m old  DOM Serializer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_old_DOMSerializer	TokenNameIdentifier	 m old  DOM Serializer
=	TokenNameEQUAL	
new	TokenNamenew	
DOMSerializerWrapper	TokenNameIdentifier	 DOM Serializer Wrapper
(	TokenNameLPAREN	
m_serializer	TokenNameIdentifier	 m serializer
.	TokenNameDOT	
asDOMSerializer	TokenNameIdentifier	 as DOM Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_old_DOMSerializer	TokenNameIdentifier	 m old  DOM Serializer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xalan.serialize.Serializer#reset() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xalan.serialize.Serializer#reset() 
public	TokenNamepublic	
boolean	TokenNameboolean	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_serializer	TokenNameIdentifier	 m serializer
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This class just wraps a new DOMSerializer with an old style one for * migration purposes. * */	TokenNameCOMMENT_JAVADOC	 This class just wraps a new DOMSerializer with an old style one for migration purposes. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
DOMSerializerWrapper	TokenNameIdentifier	 DOM Serializer Wrapper
implements	TokenNameimplements	
DOMSerializer	TokenNameIdentifier	 DOM Serializer
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
DOMSerializer	TokenNameIdentifier	 DOM Serializer
m_dom	TokenNameIdentifier	 m dom
;	TokenNameSEMICOLON	
DOMSerializerWrapper	TokenNameIdentifier	 DOM Serializer Wrapper
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
DOMSerializer	TokenNameIdentifier	 DOM Serializer
domser	TokenNameIdentifier	 domser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dom	TokenNameIdentifier	 m dom
=	TokenNameEQUAL	
domser	TokenNameIdentifier	 domser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
m_dom	TokenNameIdentifier	 m dom
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
