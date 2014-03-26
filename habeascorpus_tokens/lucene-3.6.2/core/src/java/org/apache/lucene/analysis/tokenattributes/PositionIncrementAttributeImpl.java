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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
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
/** The positionIncrement determines the position of this token * relative to the previous Token in a {@link TokenStream}, used in phrase * searching. * * <p>The default value is one. * * <p>Some common uses for this are:<ul> * * <li>Set it to zero to put multiple terms in the same position. This is * useful if, e.g., a word has multiple stems. Searches for phrases * including either stem will match. In this case, all but the first stem's * increment should be set to zero: the increment of the first instance * should be one. Repeating a token with an increment of zero can also be * used to boost the scores of matches on that token. * * <li>Set it to values greater than one to inhibit exact phrase matches. * If, for example, one does not want phrases to match across removed stop * words, then one could build a stop word filter that removes stop words and * also sets the increment to the number of stop words removed before each * non-stop word. Then exact phrase queries will only match when the terms * occur with no intervening stop words. * * </ul> */	TokenNameCOMMENT_JAVADOC	 The positionIncrement determines the position of this token relative to the previous Token in a {@link TokenStream}, used in phrase searching. * <p>The default value is one. * <p>Some common uses for this are:<ul> * <li>Set it to zero to put multiple terms in the same position. This is useful if, e.g., a word has multiple stems. Searches for phrases including either stem will match. In this case, all but the first stem's increment should be set to zero: the increment of the first instance should be one. Repeating a token with an increment of zero can also be used to boost the scores of matches on that token. * <li>Set it to values greater than one to inhibit exact phrase matches. If, for example, one does not want phrases to match across removed stop words, then one could build a stop word filter that removes stop words and also sets the increment to the number of stop words removed before each non-stop word. Then exact phrase queries will only match when the terms occur with no intervening stop words. * </ul> 
public	TokenNamepublic	
class	TokenNameclass	
PositionIncrementAttributeImpl	TokenNameIdentifier	 Position Increment Attribute Impl
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
implements	TokenNameimplements	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
positionIncrement	TokenNameIdentifier	 position Increment
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Set the position increment. The default value is one. * * @param positionIncrement the distance from the prior term */	TokenNameCOMMENT_JAVADOC	 Set the position increment. The default value is one. * @param positionIncrement the distance from the prior term 
public	TokenNamepublic	
void	TokenNamevoid	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
int	TokenNameint	
positionIncrement	TokenNameIdentifier	 position Increment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
positionIncrement	TokenNameIdentifier	 position Increment
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Increment must be zero or greater: got "	TokenNameStringLiteral	Increment must be zero or greater: got 
+	TokenNamePLUS	
positionIncrement	TokenNameIdentifier	 position Increment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
positionIncrement	TokenNameIdentifier	 position Increment
=	TokenNameEQUAL	
positionIncrement	TokenNameIdentifier	 position Increment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the position increment of this Token. * @see #setPositionIncrement */	TokenNameCOMMENT_JAVADOC	 Returns the position increment of this Token. @see #setPositionIncrement 
public	TokenNamepublic	
int	TokenNameint	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
positionIncrement	TokenNameIdentifier	 position Increment
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
this	TokenNamethis	
.	TokenNameDOT	
positionIncrement	TokenNameIdentifier	 position Increment
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
PositionIncrementAttributeImpl	TokenNameIdentifier	 Position Increment Attribute Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PositionIncrementAttributeImpl	TokenNameIdentifier	 Position Increment Attribute Impl
_other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PositionIncrementAttributeImpl	TokenNameIdentifier	 Position Increment Attribute Impl
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
return	TokenNamereturn	
positionIncrement	TokenNameIdentifier	 position Increment
==	TokenNameEQUAL_EQUAL	
_other	TokenNameIdentifier	 other
.	TokenNameDOT	
positionIncrement	TokenNameIdentifier	 position Increment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
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
positionIncrement	TokenNameIdentifier	 position Increment
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
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
)	TokenNameRPAREN	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
positionIncrement	TokenNameIdentifier	 position Increment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
