/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XMLStringFactoryDefault.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XMLStringFactoryDefault.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * The default implementation of XMLStringFactory. * This implementation creates XMLStringDefault objects. */	TokenNameCOMMENT_JAVADOC	 The default implementation of XMLStringFactory. This implementation creates XMLStringDefault objects. 
public	TokenNamepublic	
class	TokenNameclass	
XMLStringFactoryDefault	TokenNameIdentifier	 XML String Factory Default
extends	TokenNameextends	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
{	TokenNameLBRACE	
// A constant representing the empty String 	TokenNameCOMMENT_LINE	A constant representing the empty String 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
XMLStringDefault	TokenNameIdentifier	 XML String Default
EMPTY_STR	TokenNameIdentifier	 EMPTY  STR
=	TokenNameEQUAL	
new	TokenNamenew	
XMLStringDefault	TokenNameIdentifier	 XML String Default
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create a new XMLString from a Java string. * * * @param string Java String reference, which must be non-null. * * @return An XMLString object that wraps the String reference. */	TokenNameCOMMENT_JAVADOC	 Create a new XMLString from a Java string. * @param string Java String reference, which must be non-null. * @return An XMLString object that wraps the String reference. 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
newstr	TokenNameIdentifier	 newstr
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLStringDefault	TokenNameIdentifier	 XML String Default
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a XMLString from a FastStringBuffer. * * * @param fsb FastStringBuffer reference, which must be non-null. * @param start The start position in the array. * @param length The number of characters to read from the array. * * @return An XMLString object that wraps the FastStringBuffer reference. */	TokenNameCOMMENT_JAVADOC	 Create a XMLString from a FastStringBuffer. * @param fsb FastStringBuffer reference, which must be non-null. @param start The start position in the array. @param length The number of characters to read from the array. * @return An XMLString object that wraps the FastStringBuffer reference. 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
newstr	TokenNameIdentifier	 newstr
(	TokenNameLPAREN	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
fsb	TokenNameIdentifier	 fsb
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLStringDefault	TokenNameIdentifier	 XML String Default
(	TokenNameLPAREN	
fsb	TokenNameIdentifier	 fsb
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a XMLString from a FastStringBuffer. * * * @param string FastStringBuffer reference, which must be non-null. * @param start The start position in the array. * @param length The number of characters to read from the array. * * @return An XMLString object that wraps the FastStringBuffer reference. */	TokenNameCOMMENT_JAVADOC	 Create a XMLString from a FastStringBuffer. * @param string FastStringBuffer reference, which must be non-null. @param start The start position in the array. @param length The number of characters to read from the array. * @return An XMLString object that wraps the FastStringBuffer reference. 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
newstr	TokenNameIdentifier	 newstr
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLStringDefault	TokenNameIdentifier	 XML String Default
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a cheap representation of an empty string. * * @return An non-null reference to an XMLString that represents "". */	TokenNameCOMMENT_JAVADOC	 Get a cheap representation of an empty string. * @return An non-null reference to an XMLString that represents "". 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
emptystr	TokenNameIdentifier	 emptystr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
EMPTY_STR	TokenNameIdentifier	 EMPTY  STR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
