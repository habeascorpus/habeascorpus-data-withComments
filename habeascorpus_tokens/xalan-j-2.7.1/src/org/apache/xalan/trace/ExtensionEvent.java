/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExtensionEvent.java 468644 2006-10-28 06:56:42Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExtensionEvent.java 468644 2006-10-28 06:56:42Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Constructor	TokenNameIdentifier	 Constructor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
;	TokenNameSEMICOLON	
/** * An event representing an extension call. */	TokenNameCOMMENT_JAVADOC	 An event representing an extension call. 
public	TokenNamepublic	
class	TokenNameclass	
ExtensionEvent	TokenNameIdentifier	 Extension Event
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_CONSTRUCTOR	TokenNameIdentifier	 DEFAULT  CONSTRUCTOR
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
METHOD	TokenNameIdentifier	 METHOD
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONSTRUCTOR	TokenNameIdentifier	 CONSTRUCTOR
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
m_callType	TokenNameIdentifier	 m call Type
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
m_transformer	TokenNameIdentifier	 m transformer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
m_method	TokenNameIdentifier	 m method
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
m_instance	TokenNameIdentifier	 m instance
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_arguments	TokenNameIdentifier	 m arguments
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ExtensionEvent	TokenNameIdentifier	 Extension Event
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_transformer	TokenNameIdentifier	 m transformer
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
m_method	TokenNameIdentifier	 m method
=	TokenNameEQUAL	
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
m_instance	TokenNameIdentifier	 m instance
=	TokenNameEQUAL	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
m_arguments	TokenNameIdentifier	 m arguments
=	TokenNameEQUAL	
arguments	TokenNameIdentifier	 arguments
;	TokenNameSEMICOLON	
m_callType	TokenNameIdentifier	 m call Type
=	TokenNameEQUAL	
METHOD	TokenNameIdentifier	 METHOD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ExtensionEvent	TokenNameIdentifier	 Extension Event
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
Constructor	TokenNameIdentifier	 Constructor
constructor	TokenNameIdentifier	 constructor
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_transformer	TokenNameIdentifier	 m transformer
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
m_instance	TokenNameIdentifier	 m instance
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_arguments	TokenNameIdentifier	 m arguments
=	TokenNameEQUAL	
arguments	TokenNameIdentifier	 arguments
;	TokenNameSEMICOLON	
m_method	TokenNameIdentifier	 m method
=	TokenNameEQUAL	
constructor	TokenNameIdentifier	 constructor
;	TokenNameSEMICOLON	
m_callType	TokenNameIdentifier	 m call Type
=	TokenNameEQUAL	
CONSTRUCTOR	TokenNameIdentifier	 CONSTRUCTOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ExtensionEvent	TokenNameIdentifier	 Extension Event
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_transformer	TokenNameIdentifier	 m transformer
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
m_instance	TokenNameIdentifier	 m instance
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_arguments	TokenNameIdentifier	 m arguments
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_method	TokenNameIdentifier	 m method
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
;	TokenNameSEMICOLON	
m_callType	TokenNameIdentifier	 m call Type
=	TokenNameEQUAL	
DEFAULT_CONSTRUCTOR	TokenNameIdentifier	 DEFAULT  CONSTRUCTOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
