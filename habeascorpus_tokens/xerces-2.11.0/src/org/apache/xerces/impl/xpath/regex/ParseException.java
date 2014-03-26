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
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
;	TokenNameSEMICOLON	
/** * @xerces.internal * * @author TAMURA Kent &lt;kent@trl.ibm.co.jp&gt; * @version $Id: ParseException.java 572108 2007-09-02 18:48:31Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @author TAMURA Kent &lt;kent@trl.ibm.co.jp&gt; @version $Id: ParseException.java 572108 2007-09-02 18:48:31Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
ParseException	TokenNameIdentifier	 Parse Exception
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
7012400318097691370L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
/* public ParseException(String mes) { this(mes, -1); } */	TokenNameCOMMENT_BLOCK	 public ParseException(String mes) { this(mes, -1); } 
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mes	TokenNameIdentifier	 mes
,	TokenNameCOMMA	
int	TokenNameint	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
mes	TokenNameIdentifier	 mes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @return -1 if location information is not available. */	TokenNameCOMMENT_JAVADOC	 * @return -1 if location information is not available. 
public	TokenNamepublic	
int	TokenNameint	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
