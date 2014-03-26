package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
Token	TokenNameIdentifier	 Token
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ToStringUtil	TokenNameIdentifier	 To String Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
AttributeReflector	TokenNameIdentifier	 Attribute Reflector
;	TokenNameSEMICOLON	
/** * Attribute for Kuromoji reading data */	TokenNameCOMMENT_JAVADOC	 Attribute for Kuromoji reading data 
public	TokenNamepublic	
class	TokenNameclass	
ReadingAttributeImpl	TokenNameIdentifier	 Reading Attribute Impl
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
implements	TokenNameimplements	
ReadingAttribute	TokenNameIdentifier	 Reading Attribute
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
private	TokenNameprivate	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getReading	TokenNameIdentifier	 get Reading
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
getReading	TokenNameIdentifier	 get Reading
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPronunciation	TokenNameIdentifier	 get Pronunciation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
getPronunciation	TokenNameIdentifier	 get Pronunciation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setToken	TokenNameIdentifier	 set Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ReadingAttribute	TokenNameIdentifier	 Reading Attribute
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ReadingAttribute	TokenNameIdentifier	 Reading Attribute
)	TokenNameRPAREN	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setToken	TokenNameIdentifier	 set Token
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reflectWith	TokenNameIdentifier	 reflect With
(	TokenNameLPAREN	
AttributeReflector	TokenNameIdentifier	 Attribute Reflector
reflector	TokenNameIdentifier	 reflector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
reading	TokenNameIdentifier	 reading
=	TokenNameEQUAL	
getReading	TokenNameIdentifier	 get Reading
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
readingEN	TokenNameIdentifier	 reading EN
=	TokenNameEQUAL	
reading	TokenNameIdentifier	 reading
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
ToStringUtil	TokenNameIdentifier	 To String Util
.	TokenNameDOT	
getRomanization	TokenNameIdentifier	 get Romanization
(	TokenNameLPAREN	
reading	TokenNameIdentifier	 reading
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pronunciation	TokenNameIdentifier	 pronunciation
=	TokenNameEQUAL	
getPronunciation	TokenNameIdentifier	 get Pronunciation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pronunciationEN	TokenNameIdentifier	 pronunciation EN
=	TokenNameEQUAL	
pronunciation	TokenNameIdentifier	 pronunciation
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
ToStringUtil	TokenNameIdentifier	 To String Util
.	TokenNameDOT	
getRomanization	TokenNameIdentifier	 get Romanization
(	TokenNameLPAREN	
pronunciation	TokenNameIdentifier	 pronunciation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reflector	TokenNameIdentifier	 reflector
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
(	TokenNameLPAREN	
ReadingAttribute	TokenNameIdentifier	 Reading Attribute
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"reading"	TokenNameStringLiteral	reading
,	TokenNameCOMMA	
reading	TokenNameIdentifier	 reading
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reflector	TokenNameIdentifier	 reflector
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
(	TokenNameLPAREN	
ReadingAttribute	TokenNameIdentifier	 Reading Attribute
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"reading (en)"	TokenNameStringLiteral	reading (en)
,	TokenNameCOMMA	
readingEN	TokenNameIdentifier	 reading EN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reflector	TokenNameIdentifier	 reflector
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
(	TokenNameLPAREN	
ReadingAttribute	TokenNameIdentifier	 Reading Attribute
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"pronunciation"	TokenNameStringLiteral	pronunciation
,	TokenNameCOMMA	
pronunciation	TokenNameIdentifier	 pronunciation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reflector	TokenNameIdentifier	 reflector
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
(	TokenNameLPAREN	
ReadingAttribute	TokenNameIdentifier	 Reading Attribute
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"pronunciation (en)"	TokenNameStringLiteral	pronunciation (en)
,	TokenNameCOMMA	
pronunciationEN	TokenNameIdentifier	 pronunciation EN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
