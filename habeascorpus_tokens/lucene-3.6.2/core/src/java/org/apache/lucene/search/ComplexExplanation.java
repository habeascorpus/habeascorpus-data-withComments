package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** Expert: Describes the score computation for document and query, and * can distinguish a match independent of a positive value. */	TokenNameCOMMENT_JAVADOC	 Expert: Describes the score computation for document and query, and can distinguish a match independent of a positive value. 
public	TokenNamepublic	
class	TokenNameclass	
ComplexExplanation	TokenNameIdentifier	 Complex Explanation
extends	TokenNameextends	
Explanation	TokenNameIdentifier	 Explanation
{	TokenNameLBRACE	
private	TokenNameprivate	
Boolean	TokenNameIdentifier	 Boolean
match	TokenNameIdentifier	 match
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ComplexExplanation	TokenNameIdentifier	 Complex Explanation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ComplexExplanation	TokenNameIdentifier	 Complex Explanation
(	TokenNameLPAREN	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
,	TokenNameCOMMA	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// NOTE: use of "boolean" instead of "Boolean" in params is conscious 	TokenNameCOMMENT_LINE	NOTE: use of "boolean" instead of "Boolean" in params is conscious 
// choice to encourage clients to be specific. 	TokenNameCOMMENT_LINE	choice to encourage clients to be specific. 
super	TokenNamesuper	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
match	TokenNameIdentifier	 match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The match status of this explanation node. * @return May be null if match status is unknown */	TokenNameCOMMENT_JAVADOC	 The match status of this explanation node. @return May be null if match status is unknown 
public	TokenNamepublic	
Boolean	TokenNameIdentifier	 Boolean
getMatch	TokenNameIdentifier	 get Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
match	TokenNameIdentifier	 match
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the match status assigned to this explanation node. * @param match May be null if match status is unknown */	TokenNameCOMMENT_JAVADOC	 Sets the match status assigned to this explanation node. @param match May be null if match status is unknown 
public	TokenNamepublic	
void	TokenNamevoid	
setMatch	TokenNameIdentifier	 set Match
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
match	TokenNameIdentifier	 match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
match	TokenNameIdentifier	 match
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicates whether or not this Explanation models a good match. * * <p> * If the match status is explicitly set (i.e.: not null) this method * uses it; otherwise it defers to the superclass. * </p> * @see #getMatch */	TokenNameCOMMENT_JAVADOC	 Indicates whether or not this Explanation models a good match. * <p> If the match status is explicitly set (i.e.: not null) this method uses it; otherwise it defers to the superclass. </p> @see #getMatch 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isMatch	TokenNameIdentifier	 is Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Boolean	TokenNameIdentifier	 Boolean
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
getMatch	TokenNameIdentifier	 get Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m	TokenNameIdentifier	 m
?	TokenNameQUESTION	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
super	TokenNamesuper	
.	TokenNameDOT	
isMatch	TokenNameIdentifier	 is Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getSummary	TokenNameIdentifier	 get Summary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
getMatch	TokenNameIdentifier	 get Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getSummary	TokenNameIdentifier	 get Summary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" = "	TokenNameStringLiteral	 = 
+	TokenNamePLUS	
(	TokenNameLPAREN	
isMatch	TokenNameIdentifier	 is Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"(MATCH) "	TokenNameStringLiteral	(MATCH) 
:	TokenNameCOLON	
"(NON-MATCH) "	TokenNameStringLiteral	(NON-MATCH) 
)	TokenNameRPAREN	
+	TokenNamePLUS	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
