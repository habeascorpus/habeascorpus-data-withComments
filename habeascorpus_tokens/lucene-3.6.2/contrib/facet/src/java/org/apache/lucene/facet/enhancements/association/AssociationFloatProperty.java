package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
enhancements	TokenNameIdentifier	 enhancements
.	TokenNameDOT	
association	TokenNameIdentifier	 association
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
CategoryProperty	TokenNameIdentifier	 Category Property
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * An {@link AssociationProperty} which treats the association as float - the * association bits are actually float bits, and thus merging two associations * is done by float summation. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An {@link AssociationProperty} which treats the association as float - the association bits are actually float bits, and thus merging two associations is done by float summation. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
AssociationFloatProperty	TokenNameIdentifier	 Association Float Property
extends	TokenNameextends	
AssociationProperty	TokenNameIdentifier	 Association Property
{	TokenNameLBRACE	
/** * Constructor. * * @param value * The association value. */	TokenNameCOMMENT_JAVADOC	 Constructor. * @param value The association value. 
public	TokenNamepublic	
AssociationFloatProperty	TokenNameIdentifier	 Association Float Property
(	TokenNameLPAREN	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
!	TokenNameNOT	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
AssociationFloatProperty	TokenNameIdentifier	 Association Float Property
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AssociationFloatProperty	TokenNameIdentifier	 Association Float Property
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AssociationFloatProperty	TokenNameIdentifier	 Association Float Property
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
association	TokenNameIdentifier	 association
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
association	TokenNameIdentifier	 association
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
"AssociationFloatProperty"	TokenNameStringLiteral	AssociationFloatProperty
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
association	TokenNameIdentifier	 association
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
CategoryProperty	TokenNameIdentifier	 Category Property
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AssociationFloatProperty	TokenNameIdentifier	 Association Float Property
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AssociationFloatProperty	TokenNameIdentifier	 Association Float Property
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
association	TokenNameIdentifier	 association
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
intBitsToFloat	TokenNameIdentifier	 int Bits To Float
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
association	TokenNameIdentifier	 association
)	TokenNameRPAREN	
+	TokenNamePLUS	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
intBitsToFloat	TokenNameIdentifier	 int Bits To Float
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
association	TokenNameIdentifier	 association
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getFloatAssociation	TokenNameIdentifier	 get Float Association
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
intBitsToFloat	TokenNameIdentifier	 int Bits To Float
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
association	TokenNameIdentifier	 association
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
intBitsToFloat	TokenNameIdentifier	 int Bits To Float
(	TokenNameLPAREN	
getAssociation	TokenNameIdentifier	 get Association
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
