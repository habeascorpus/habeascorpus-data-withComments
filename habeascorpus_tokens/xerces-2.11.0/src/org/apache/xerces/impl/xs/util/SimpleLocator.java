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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XMLLocator	TokenNameIdentifier	 XML Locator
;	TokenNameSEMICOLON	
/** * An XMLLocator implementation used for schema error reporting. * * @xerces.internal * * @author Sandy Gao, IBM * @version $Id: SimpleLocator.java 660072 2008-05-26 02:05:15Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 An XMLLocator implementation used for schema error reporting. * @xerces.internal * @author Sandy Gao, IBM @version $Id: SimpleLocator.java 660072 2008-05-26 02:05:15Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
SimpleLocator	TokenNameIdentifier	 Simple Locator
implements	TokenNameimplements	
XMLLocator	TokenNameIdentifier	 XML Locator
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
lsid	TokenNameIdentifier	 lsid
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
esid	TokenNameIdentifier	 esid
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
charOffset	TokenNameIdentifier	 char Offset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SimpleLocator	TokenNameIdentifier	 Simple Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
SimpleLocator	TokenNameIdentifier	 Simple Locator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lsid	TokenNameIdentifier	 lsid
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
esid	TokenNameIdentifier	 esid
,	TokenNameCOMMA	
int	TokenNameint	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
int	TokenNameint	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
lsid	TokenNameIdentifier	 lsid
,	TokenNameCOMMA	
esid	TokenNameIdentifier	 esid
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lsid	TokenNameIdentifier	 lsid
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
esid	TokenNameIdentifier	 esid
,	TokenNameCOMMA	
int	TokenNameint	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
int	TokenNameint	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
lsid	TokenNameIdentifier	 lsid
,	TokenNameCOMMA	
esid	TokenNameIdentifier	 esid
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SimpleLocator	TokenNameIdentifier	 Simple Locator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lsid	TokenNameIdentifier	 lsid
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
esid	TokenNameIdentifier	 esid
,	TokenNameCOMMA	
int	TokenNameint	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
int	TokenNameint	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lsid	TokenNameIdentifier	 lsid
=	TokenNameEQUAL	
lsid	TokenNameIdentifier	 lsid
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
esid	TokenNameIdentifier	 esid
=	TokenNameEQUAL	
esid	TokenNameIdentifier	 esid
;	TokenNameSEMICOLON	
charOffset	TokenNameIdentifier	 char Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lsid	TokenNameIdentifier	 lsid
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
esid	TokenNameIdentifier	 esid
,	TokenNameCOMMA	
int	TokenNameint	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
int	TokenNameint	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lsid	TokenNameIdentifier	 lsid
=	TokenNameEQUAL	
lsid	TokenNameIdentifier	 lsid
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
esid	TokenNameIdentifier	 esid
=	TokenNameEQUAL	
esid	TokenNameIdentifier	 esid
;	TokenNameSEMICOLON	
charOffset	TokenNameIdentifier	 char Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getCharacterOffset	TokenNameIdentifier	 get Character Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
charOffset	TokenNameIdentifier	 char Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
esid	TokenNameIdentifier	 esid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLiteralSystemId	TokenNameIdentifier	 get Literal System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lsid	TokenNameIdentifier	 lsid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseSystemId	TokenNameIdentifier	 get Base System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setColumnNumber	TokenNameIdentifier	 set Column Number
(	TokenNameLPAREN	
int	TokenNameint	
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
col	TokenNameIdentifier	 col
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLineNumber	TokenNameIdentifier	 set Line Number
(	TokenNameLPAREN	
int	TokenNameint	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCharacterOffset	TokenNameIdentifier	 set Character Offset
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charOffset	TokenNameIdentifier	 char Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xerces.xni.XMLResourceIdentifier#setBaseSystemId(String) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xni.XMLResourceIdentifier#setBaseSystemId(String) 
public	TokenNamepublic	
void	TokenNamevoid	
setBaseSystemId	TokenNameIdentifier	 set Base System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @see org.apache.xerces.xni.XMLResourceIdentifier#setExpandedSystemId(String) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xni.XMLResourceIdentifier#setExpandedSystemId(String) 
public	TokenNamepublic	
void	TokenNamevoid	
setExpandedSystemId	TokenNameIdentifier	 set Expanded System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
esid	TokenNameIdentifier	 esid
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xerces.xni.XMLResourceIdentifier#setLiteralSystemId(String) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xni.XMLResourceIdentifier#setLiteralSystemId(String) 
public	TokenNamepublic	
void	TokenNamevoid	
setLiteralSystemId	TokenNameIdentifier	 set Literal System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lsid	TokenNameIdentifier	 lsid
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xerces.xni.XMLResourceIdentifier#setPublicId(String) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xni.XMLResourceIdentifier#setPublicId(String) 
public	TokenNamepublic	
void	TokenNamevoid	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns the encoding of the current entity. * Since these locators are used in the construction of * XMLParseExceptions, which know nothing about encodings, there is * no point in having this object deal intelligently * with encoding information. */	TokenNameCOMMENT_JAVADOC	 Returns the encoding of the current entity. Since these locators are used in the construction of XMLParseExceptions, which know nothing about encodings, there is no point in having this object deal intelligently with encoding information. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getXMLVersion	TokenNameIdentifier	 get XML Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
