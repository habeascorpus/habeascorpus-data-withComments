/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NameSpace.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NameSpace.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * A representation of a namespace. One of these will * be pushed on the namespace stack for each * element. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 A representation of a namespace. One of these will be pushed on the namespace stack for each element. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
NameSpace	TokenNameIdentifier	 Name Space
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1471232939184881839L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Next NameSpace element on the stack. * @serial */	TokenNameCOMMENT_JAVADOC	 Next NameSpace element on the stack. @serial 
public	TokenNamepublic	
NameSpace	TokenNameIdentifier	 Name Space
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Prefix of this NameSpace element. * @serial */	TokenNameCOMMENT_JAVADOC	 Prefix of this NameSpace element. @serial 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
m_prefix	TokenNameIdentifier	 m prefix
;	TokenNameSEMICOLON	
/** Namespace URI of this NameSpace element. * @serial */	TokenNameCOMMENT_JAVADOC	 Namespace URI of this NameSpace element. @serial 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
m_uri	TokenNameIdentifier	 m uri
;	TokenNameSEMICOLON	
// if null, then Element namespace is empty. 	TokenNameCOMMENT_LINE	if null, then Element namespace is empty. 
/** * Construct a namespace for placement on the * result tree namespace stack. * * @param prefix Prefix of this element * @param uri URI of this element */	TokenNameCOMMENT_JAVADOC	 Construct a namespace for placement on the result tree namespace stack. * @param prefix Prefix of this element @param uri URI of this element 
public	TokenNamepublic	
NameSpace	TokenNameIdentifier	 Name Space
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_prefix	TokenNameIdentifier	 m prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
m_uri	TokenNameIdentifier	 m uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
