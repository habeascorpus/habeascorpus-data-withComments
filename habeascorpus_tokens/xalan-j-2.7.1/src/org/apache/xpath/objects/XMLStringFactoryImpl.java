/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XMLStringFactoryImpl.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XMLStringFactoryImpl.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
XMLString	TokenNameIdentifier	 XML String
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
;	TokenNameSEMICOLON	
/** * Class XMLStringFactoryImpl creates XString versions of XMLStrings. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Class XMLStringFactoryImpl creates XString versions of XMLStrings. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
XMLStringFactoryImpl	TokenNameIdentifier	 XML String Factory Impl
extends	TokenNameextends	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
{	TokenNameLBRACE	
/** The XMLStringFactory to pass to DTM construction. */	TokenNameCOMMENT_JAVADOC	 The XMLStringFactory to pass to DTM construction. 
private	TokenNameprivate	
static	TokenNamestatic	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
m_xstringfactory	TokenNameIdentifier	 m xstringfactory
=	TokenNameEQUAL	
new	TokenNamenew	
XMLStringFactoryImpl	TokenNameIdentifier	 XML String Factory Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the XMLStringFactory to pass to DTM construction. * * * @return A never-null static reference to a String factory. */	TokenNameCOMMENT_JAVADOC	 Get the XMLStringFactory to pass to DTM construction. * @return A never-null static reference to a String factory. 
public	TokenNamepublic	
static	TokenNamestatic	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
getFactory	TokenNameIdentifier	 get Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_xstringfactory	TokenNameIdentifier	 m xstringfactory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
XString	TokenNameIdentifier	 X String
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
XStringForFSB	TokenNameIdentifier	 X String For FSB
(	TokenNameLPAREN	
fsb	TokenNameIdentifier	 fsb
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
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
XStringForChars	TokenNameIdentifier	 X String For Chars
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
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
XString	TokenNameIdentifier	 X String
.	TokenNameDOT	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
