package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
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
TokenStream	TokenNameIdentifier	 Token Stream
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
/** *This attribute can be used to mark a token as a keyword. Keyword aware * {@link TokenStream}s can decide to modify a token based on the return value * of {@link #isKeyword()} if the token is modified. Stemming filters for * instance can use this attribute to conditionally skip a term if * {@link #isKeyword()} returns <code>true</code>. */	TokenNameCOMMENT_JAVADOC	 *This attribute can be used to mark a token as a keyword. Keyword aware {@link TokenStream}s can decide to modify a token based on the return value of {@link #isKeyword()} if the token is modified. Stemming filters for instance can use this attribute to conditionally skip a term if {@link #isKeyword()} returns <code>true</code>. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
KeywordAttributeImpl	TokenNameIdentifier	 Keyword Attribute Impl
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
implements	TokenNameimplements	
KeywordAttribute	TokenNameIdentifier	 Keyword Attribute
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
keyword	TokenNameIdentifier	 keyword
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keyword	TokenNameIdentifier	 keyword
=	TokenNameEQUAL	
false	TokenNamefalse	
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
KeywordAttribute	TokenNameIdentifier	 Keyword Attribute
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
KeywordAttribute	TokenNameIdentifier	 Keyword Attribute
)	TokenNameRPAREN	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
setKeyword	TokenNameIdentifier	 set Keyword
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyword	TokenNameIdentifier	 keyword
?	TokenNameQUESTION	
31	TokenNameIntegerLiteral	
:	TokenNameCOLON	
37	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
KeywordAttributeImpl	TokenNameIdentifier	 Keyword Attribute Impl
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
KeywordAttributeImpl	TokenNameIdentifier	 Keyword Attribute Impl
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
keyword	TokenNameIdentifier	 keyword
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
keyword	TokenNameIdentifier	 keyword
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <code>true</code> iff the current token is a keyword, otherwise * <code>false</code>/ * * @return <code>true</code> iff the current token is a keyword, otherwise * <code>false</code>/ */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> iff the current token is a keyword, otherwise <code>false</code>/ * @return <code>true</code> iff the current token is a keyword, otherwise <code>false</code>/ 
public	TokenNamepublic	
boolean	TokenNameboolean	
isKeyword	TokenNameIdentifier	 is Keyword
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyword	TokenNameIdentifier	 keyword
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Marks the current token as keyword iff set to <code>true</code>. * * @param isKeyword * <code>true</code> iff the current token is a keyword, otherwise * <code>false</code>. */	TokenNameCOMMENT_JAVADOC	 Marks the current token as keyword iff set to <code>true</code>. * @param isKeyword <code>true</code> iff the current token is a keyword, otherwise <code>false</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setKeyword	TokenNameIdentifier	 set Keyword
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isKeyword	TokenNameIdentifier	 is Keyword
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keyword	TokenNameIdentifier	 keyword
=	TokenNameEQUAL	
isKeyword	TokenNameIdentifier	 is Keyword
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
