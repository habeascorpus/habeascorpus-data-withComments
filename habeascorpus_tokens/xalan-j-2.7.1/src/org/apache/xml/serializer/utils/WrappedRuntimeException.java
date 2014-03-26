/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: WrappedRuntimeException.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: WrappedRuntimeException.java 468654 2006-10-28 07:09:23Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * This class is for throwing important checked exceptions * over non-checked methods. It should be used with care, * and in limited circumstances. * * This class is a copy of the one in org.apache.xml.utils. * It exists to cut the serializers dependancy on that package. * * This class is not a public API, it is only public because it is * used by org.apache.xml.serializer. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class is for throwing important checked exceptions over non-checked methods. It should be used with care, and in limited circumstances. * This class is a copy of the one in org.apache.xml.utils. It exists to cut the serializers dependancy on that package. * This class is not a public API, it is only public because it is used by org.apache.xml.serializer. @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
7140414456714658073L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Primary checked exception. * @serial */	TokenNameCOMMENT_JAVADOC	 Primary checked exception. @serial 
private	TokenNameprivate	
Exception	TokenNameIdentifier	 Exception
m_exception	TokenNameIdentifier	 m exception
;	TokenNameSEMICOLON	
/** * Construct a WrappedRuntimeException from a * checked exception. * * @param e Primary checked exception */	TokenNameCOMMENT_JAVADOC	 Construct a WrappedRuntimeException from a checked exception. * @param e Primary checked exception 
public	TokenNamepublic	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_exception	TokenNameIdentifier	 m exception
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor WrappedRuntimeException * * * @param msg Exception information. * @param e Primary checked exception */	TokenNameCOMMENT_JAVADOC	 Constructor WrappedRuntimeException * @param msg Exception information. @param e Primary checked exception 
public	TokenNamepublic	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_exception	TokenNameIdentifier	 m exception
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the checked exception that this runtime exception wraps. * * @return The primary checked exception */	TokenNameCOMMENT_JAVADOC	 Get the checked exception that this runtime exception wraps. * @return The primary checked exception 
public	TokenNamepublic	
Exception	TokenNameIdentifier	 Exception
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_exception	TokenNameIdentifier	 m exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	