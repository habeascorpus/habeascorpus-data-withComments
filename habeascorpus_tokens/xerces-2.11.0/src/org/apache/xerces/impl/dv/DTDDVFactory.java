/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dv	TokenNameIdentifier	 dv
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
/** * The factory to create and return DTD types. The implementation should * store the created datatypes in static data, so that they can be shared by * multiple parser instance, and multiple threads. * * @xerces.internal * * @author Sandy Gao, IBM * * @version $Id: DTDDVFactory.java 558581 2007-07-23 01:38:26Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The factory to create and return DTD types. The implementation should store the created datatypes in static data, so that they can be shared by multiple parser instance, and multiple threads. * @xerces.internal * @author Sandy Gao, IBM * @version $Id: DTDDVFactory.java 558581 2007-07-23 01:38:26Z mrglavas $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DTDDVFactory	TokenNameIdentifier	 DTDDV Factory
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_FACTORY_CLASS	TokenNameIdentifier	 DEFAULT  FACTORY  CLASS
=	TokenNameEQUAL	
"org.apache.xerces.impl.dv.dtd.DTDDVFactoryImpl"	TokenNameStringLiteral	org.apache.xerces.impl.dv.dtd.DTDDVFactoryImpl
;	TokenNameSEMICOLON	
/** * Get an instance of the default DTDDVFactory implementation. * * @return an instance of DTDDVFactory implementation * @exception DVFactoryException cannot create an instance of the specified * class name or the default class name */	TokenNameCOMMENT_JAVADOC	 Get an instance of the default DTDDVFactory implementation. * @return an instance of DTDDVFactory implementation @exception DVFactoryException cannot create an instance of the specified class name or the default class name 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
DTDDVFactory	TokenNameIdentifier	 DTDDV Factory
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DVFactoryException	TokenNameIdentifier	 DV Factory Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
DEFAULT_FACTORY_CLASS	TokenNameIdentifier	 DEFAULT  FACTORY  CLASS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an instance of DTDDVFactory implementation. * * @param factoryClass name of the implementation to load. * @return an instance of DTDDVFactory implementation * @exception DVFactoryException cannot create an instance of the specified * class name or the default class name */	TokenNameCOMMENT_JAVADOC	 Get an instance of DTDDVFactory implementation. * @param factoryClass name of the implementation to load. @return an instance of DTDDVFactory implementation @exception DVFactoryException cannot create an instance of the specified class name or the default class name 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
DTDDVFactory	TokenNameIdentifier	 DTDDV Factory
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
factoryClass	TokenNameIdentifier	 factory Class
)	TokenNameRPAREN	
throws	TokenNamethrows	
DVFactoryException	TokenNameIdentifier	 DV Factory Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// if the class name is not specified, use the default one 	TokenNameCOMMENT_LINE	if the class name is not specified, use the default one 
return	TokenNamereturn	
(	TokenNameLPAREN	
DTDDVFactory	TokenNameIdentifier	 DTDDV Factory
)	TokenNameRPAREN	
(	TokenNameLPAREN	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
factoryClass	TokenNameIdentifier	 factory Class
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DVFactoryException	TokenNameIdentifier	 DV Factory Exception
(	TokenNameLPAREN	
"DTD factory class "	TokenNameStringLiteral	DTD factory class 
+	TokenNamePLUS	
factoryClass	TokenNameIdentifier	 factory Class
+	TokenNamePLUS	
" does not extend from DTDDVFactory."	TokenNameStringLiteral	 does not extend from DTDDVFactory.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// can't create a new object of this class 	TokenNameCOMMENT_LINE	can't create a new object of this class 
protected	TokenNameprotected	
DTDDVFactory	TokenNameIdentifier	 DTDDV Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * return a dtd type of the given name * * @param name the name of the datatype * @return the datatype validator of the given name */	TokenNameCOMMENT_JAVADOC	 return a dtd type of the given name * @param name the name of the datatype @return the datatype validator of the given name 
public	TokenNamepublic	
abstract	TokenNameabstract	
DatatypeValidator	TokenNameIdentifier	 Datatype Validator
getBuiltInDV	TokenNameIdentifier	 get Built In DV
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * get all built-in DVs, which are stored in a hashtable keyed by the name * * @return a hashtable which contains all datatypes */	TokenNameCOMMENT_JAVADOC	 get all built-in DVs, which are stored in a hashtable keyed by the name * @return a hashtable which contains all datatypes 
public	TokenNamepublic	
abstract	TokenNameabstract	
Hashtable	TokenNameIdentifier	 Hashtable
getBuiltInTypes	TokenNameIdentifier	 get Built In Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
