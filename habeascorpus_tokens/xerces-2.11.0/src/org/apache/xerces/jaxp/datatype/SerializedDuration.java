/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
jaxp	TokenNameIdentifier	 jaxp
.	TokenNameDOT	
datatype	TokenNameIdentifier	 datatype
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectStreamException	TokenNameIdentifier	 Object Stream Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * <p>Serialized form of <code>javax.xml.datatype.Duration</code>.</p> * * @author Michael Glavassevich, IBM * @version $Id: SerializedDuration.java 756261 2009-03-19 23:35:50Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>Serialized form of <code>javax.xml.datatype.Duration</code>.</p> * @author Michael Glavassevich, IBM @version $Id: SerializedDuration.java 756261 2009-03-19 23:35:50Z mrglavas $ 
final	TokenNamefinal	
class	TokenNameclass	
SerializedDuration	TokenNameIdentifier	 Serialized Duration
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
3897193592341225793L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
lexicalValue	TokenNameIdentifier	 lexical Value
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SerializedDuration	TokenNameIdentifier	 Serialized Duration
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lexicalValue	TokenNameIdentifier	 lexical Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lexicalValue	TokenNameIdentifier	 lexical Value
=	TokenNameEQUAL	
lexicalValue	TokenNameIdentifier	 lexical Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
readResolve	TokenNameIdentifier	 read Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ObjectStreamException	TokenNameIdentifier	 Object Stream Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DatatypeFactoryImpl	TokenNameIdentifier	 Datatype Factory Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
newDuration	TokenNameIdentifier	 new Duration
(	TokenNameLPAREN	
lexicalValue	TokenNameIdentifier	 lexical Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
