/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: OutputPropertyUtils.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: OutputPropertyUtils.java 468654 2006-10-28 07:09:23Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
/** * This class contains some static methods that act as helpers when parsing a * Java Property object. * * This class is not a public API. * It is only public because it is used outside of this package. * * @see java.util.Properties * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class contains some static methods that act as helpers when parsing a Java Property object. * This class is not a public API. It is only public because it is used outside of this package. * @see java.util.Properties @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
OutputPropertyUtils	TokenNameIdentifier	 Output Property Utils
{	TokenNameLBRACE	
/** * Searches for the boolean property with the specified key in the property list. * If the key is not found in this property list, the default property list, * and its defaults, recursively, are then checked. The method returns * <code>false</code> if the property is not found, or if the value is other * than "yes". * * @param key the property key. * @param props the list of properties that will be searched. * @return the value in this property list as a boolean value, or false * if null or not "yes". */	TokenNameCOMMENT_JAVADOC	 Searches for the boolean property with the specified key in the property list. If the key is not found in this property list, the default property list, and its defaults, recursively, are then checked. The method returns <code>false</code> if the property is not found, or if the value is other than "yes". * @param key the property key. @param props the list of properties that will be searched. @return the value in this property list as a boolean value, or false if null or not "yes". 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
getBooleanProperty	TokenNameIdentifier	 get Boolean Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
s	TokenNameIdentifier	 s
||	TokenNameOR_OR	
!	TokenNameNOT	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"yes"	TokenNameStringLiteral	yes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the int property with the specified key in the property list. * If the key is not found in this property list, the default property list, * and its defaults, recursively, are then checked. The method returns * <code>false</code> if the property is not found, or if the value is other * than "yes". * * @param key the property key. * @param props the list of properties that will be searched. * @return the value in this property list as a int value, or 0 * if null or not a number. */	TokenNameCOMMENT_JAVADOC	 Searches for the int property with the specified key in the property list. If the key is not found in this property list, the default property list, and its defaults, recursively, are then checked. The method returns <code>false</code> if the property is not found, or if the value is other than "yes". * @param key the property key. @param props the list of properties that will be searched. @return the value in this property list as a int value, or 0 if null or not a number. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getIntProperty	TokenNameIdentifier	 get Int Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
