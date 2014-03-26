/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Comparison	TokenNameIdentifier	 Comparison
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Parameter	TokenNameIdentifier	 Parameter
;	TokenNameSEMICOLON	
/** * Selector that filters files based on their size. * * @since 1.5 */	TokenNameCOMMENT_JAVADOC	 Selector that filters files based on their size. * @since 1.5 
public	TokenNamepublic	
class	TokenNameclass	
SizeSelector	TokenNameIdentifier	 Size Selector
extends	TokenNameextends	
BaseExtendSelector	TokenNameIdentifier	 Base Extend Selector
{	TokenNameLBRACE	
/** Constants for kilo, kibi etc */	TokenNameCOMMENT_JAVADOC	 Constants for kilo, kibi etc 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
KILO	TokenNameIdentifier	 KILO
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
KIBI	TokenNameIdentifier	 KIBI
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
KIBI_POS	TokenNameIdentifier	 KIBI  POS
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MEGA	TokenNameIdentifier	 MEGA
=	TokenNameEQUAL	
1000000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MEGA_POS	TokenNameIdentifier	 MEGA  POS
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MEBI	TokenNameIdentifier	 MEBI
=	TokenNameEQUAL	
1048576	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MEBI_POS	TokenNameIdentifier	 MEBI  POS
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
GIGA	TokenNameIdentifier	 GIGA
=	TokenNameEQUAL	
1000000000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
GIGA_POS	TokenNameIdentifier	 GIGA  POS
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
GIBI	TokenNameIdentifier	 GIBI
=	TokenNameEQUAL	
1073741824L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
GIBI_POS	TokenNameIdentifier	 GIBI  POS
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
TERA	TokenNameIdentifier	 TERA
=	TokenNameEQUAL	
1000000000000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TERA_POS	TokenNameIdentifier	 TERA  POS
=	TokenNameEQUAL	
27	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
TEBI	TokenNameIdentifier	 TEBI
=	TokenNameEQUAL	
1099511627776L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TEBI_POS	TokenNameIdentifier	 TEBI  POS
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
END_POS	TokenNameIdentifier	 END  POS
=	TokenNameEQUAL	
36	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Used for parameterized custom selector */	TokenNameCOMMENT_JAVADOC	 Used for parameterized custom selector 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SIZE_KEY	TokenNameIdentifier	 SIZE  KEY
=	TokenNameEQUAL	
"value"	TokenNameStringLiteral	value
;	TokenNameSEMICOLON	
/** Used for parameterized custom selector */	TokenNameCOMMENT_JAVADOC	 Used for parameterized custom selector 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNITS_KEY	TokenNameIdentifier	 UNITS  KEY
=	TokenNameEQUAL	
"units"	TokenNameStringLiteral	units
;	TokenNameSEMICOLON	
/** Used for parameterized custom selector */	TokenNameCOMMENT_JAVADOC	 Used for parameterized custom selector 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WHEN_KEY	TokenNameIdentifier	 WHEN  KEY
=	TokenNameEQUAL	
"when"	TokenNameStringLiteral	when
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
multiplier	TokenNameIdentifier	 multiplier
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
sizelimit	TokenNameIdentifier	 sizelimit
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Comparison	TokenNameIdentifier	 Comparison
when	TokenNameIdentifier	 when
=	TokenNameEQUAL	
Comparison	TokenNameIdentifier	 Comparison
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
;	TokenNameSEMICOLON	
/** * Creates a new <code>SizeSelector</code> instance. * */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>SizeSelector</code> instance. 
public	TokenNamepublic	
SizeSelector	TokenNameIdentifier	 Size Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns a <code>String</code> object representing the specified * SizeSelector. This is "{sizeselector value: " + <"compare", * "less", "more", "equal"> + "}". * @return a string describing this object */	TokenNameCOMMENT_JAVADOC	 Returns a <code>String</code> object representing the specified SizeSelector. This is "{sizeselector value: " + <"compare", "less", "more", "equal"> + "}". @return a string describing this object 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"{sizeselector value: "	TokenNameStringLiteral	{sizeselector value: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sizelimit	TokenNameIdentifier	 sizelimit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"compare: "	TokenNameStringLiteral	compare: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
when	TokenNameIdentifier	 when
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A size selector needs to know what size to base its selecting on. * This will be further modified by the multiplier to get an * actual size limit. * * @param size the size to select against expressed in units. */	TokenNameCOMMENT_JAVADOC	 A size selector needs to know what size to base its selecting on. This will be further modified by the multiplier to get an actual size limit. * @param size the size to select against expressed in units. 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
long	TokenNamelong	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
multiplier	TokenNameIdentifier	 multiplier
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sizelimit	TokenNameIdentifier	 sizelimit
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
*	TokenNameMULTIPLY	
multiplier	TokenNameIdentifier	 multiplier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the units to use for the comparison. This is a little * complicated because common usage has created standards that * play havoc with capitalization rules. Thus, some people will * use "K" for indicating 1000's, when the SI standard calls for * "k". Others have tried to introduce "K" as a multiple of 1024, * but that falls down when you reach "M", since "m" is already * defined as 0.001. * <p> * To get around this complexity, a number of standards bodies * have proposed the 2^10 standard, and at least one has adopted * it. But we are still left with a populace that isn't clear on * how capitalization should work. * <p> * We therefore ignore capitalization as much as possible. * Completely mixed case is not possible, but all upper and lower * forms are accepted for all long and short forms. Since we have * no need to work with the 0.001 case, this practice works here. * <p> * This function translates all the long and short forms that a * unit prefix can occur in and translates them into a single * multiplier. * * @param units The units to compare the size to, using an * EnumeratedAttribute. */	TokenNameCOMMENT_JAVADOC	 Sets the units to use for the comparison. This is a little complicated because common usage has created standards that play havoc with capitalization rules. Thus, some people will use "K" for indicating 1000's, when the SI standard calls for "k". Others have tried to introduce "K" as a multiple of 1024, but that falls down when you reach "M", since "m" is already defined as 0.001. <p> To get around this complexity, a number of standards bodies have proposed the 2^10 standard, and at least one has adopted it. But we are still left with a populace that isn't clear on how capitalization should work. <p> We therefore ignore capitalization as much as possible. Completely mixed case is not possible, but all upper and lower forms are accepted for all long and short forms. Since we have no need to work with the 0.001 case, this practice works here. <p> This function translates all the long and short forms that a unit prefix can occur in and translates them into a single multiplier. * @param units The units to compare the size to, using an EnumeratedAttribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setUnits	TokenNameIdentifier	 set Units
(	TokenNameLPAREN	
ByteUnits	TokenNameIdentifier	 Byte Units
units	TokenNameIdentifier	 units
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
units	TokenNameIdentifier	 units
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
multiplier	TokenNameIdentifier	 multiplier
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
KIBI_POS	TokenNameIdentifier	 KIBI  POS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
multiplier	TokenNameIdentifier	 multiplier
=	TokenNameEQUAL	
KILO	TokenNameIdentifier	 KILO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
MEGA_POS	TokenNameIdentifier	 MEGA  POS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
multiplier	TokenNameIdentifier	 multiplier
=	TokenNameEQUAL	
KIBI	TokenNameIdentifier	 KIBI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
MEBI_POS	TokenNameIdentifier	 MEBI  POS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
multiplier	TokenNameIdentifier	 multiplier
=	TokenNameEQUAL	
MEGA	TokenNameIdentifier	 MEGA
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
GIGA_POS	TokenNameIdentifier	 GIGA  POS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
multiplier	TokenNameIdentifier	 multiplier
=	TokenNameEQUAL	
MEBI	TokenNameIdentifier	 MEBI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
GIBI_POS	TokenNameIdentifier	 GIBI  POS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
multiplier	TokenNameIdentifier	 multiplier
=	TokenNameEQUAL	
GIGA	TokenNameIdentifier	 GIGA
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
TERA_POS	TokenNameIdentifier	 TERA  POS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
multiplier	TokenNameIdentifier	 multiplier
=	TokenNameEQUAL	
GIBI	TokenNameIdentifier	 GIBI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
TEBI_POS	TokenNameIdentifier	 TEBI  POS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
multiplier	TokenNameIdentifier	 multiplier
=	TokenNameEQUAL	
TERA	TokenNameIdentifier	 TERA
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
END_POS	TokenNameIdentifier	 END  POS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
multiplier	TokenNameIdentifier	 multiplier
=	TokenNameEQUAL	
TEBI	TokenNameIdentifier	 TEBI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
multiplier	TokenNameIdentifier	 multiplier
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sizelimit	TokenNameIdentifier	 sizelimit
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
*	TokenNameMULTIPLY	
multiplier	TokenNameIdentifier	 multiplier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This specifies when the file should be selected, whether it be * when the file matches a particular size, when it is smaller, * or whether it is larger. * * @param when The comparison to perform, an EnumeratedAttribute. */	TokenNameCOMMENT_JAVADOC	 This specifies when the file should be selected, whether it be when the file matches a particular size, when it is smaller, or whether it is larger. * @param when The comparison to perform, an EnumeratedAttribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setWhen	TokenNameIdentifier	 set When
(	TokenNameLPAREN	
SizeComparisons	TokenNameIdentifier	 Size Comparisons
when	TokenNameIdentifier	 when
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
when	TokenNameIdentifier	 when
=	TokenNameEQUAL	
when	TokenNameIdentifier	 when
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * When using this as a custom selector, this method will be called. * It translates each parameter into the appropriate setXXX() call. * * @param parameters the complete set of parameters for this selector. */	TokenNameCOMMENT_JAVADOC	 When using this as a custom selector, this method will be called. It translates each parameter into the appropriate setXXX() call. * @param parameters the complete set of parameters for this selector. 
public	TokenNamepublic	
void	TokenNamevoid	
setParameters	TokenNameIdentifier	 set Parameters
(	TokenNameLPAREN	
Parameter	TokenNameIdentifier	 Parameter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setParameters	TokenNameIdentifier	 set Parameters
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
paramname	TokenNameIdentifier	 paramname
=	TokenNameEQUAL	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
SIZE_KEY	TokenNameIdentifier	 SIZE  KEY
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfe	TokenNameIdentifier	 nfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Invalid size setting "	TokenNameStringLiteral	Invalid size setting 
+	TokenNamePLUS	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
UNITS_KEY	TokenNameIdentifier	 UNITS  KEY
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteUnits	TokenNameIdentifier	 Byte Units
units	TokenNameIdentifier	 units
=	TokenNameEQUAL	
new	TokenNamenew	
ByteUnits	TokenNameIdentifier	 Byte Units
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
units	TokenNameIdentifier	 units
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setUnits	TokenNameIdentifier	 set Units
(	TokenNameLPAREN	
units	TokenNameIdentifier	 units
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
WHEN_KEY	TokenNameIdentifier	 WHEN  KEY
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SizeComparisons	TokenNameIdentifier	 Size Comparisons
scmp	TokenNameIdentifier	 scmp
=	TokenNameEQUAL	
new	TokenNamenew	
SizeComparisons	TokenNameIdentifier	 Size Comparisons
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scmp	TokenNameIdentifier	 scmp
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setWhen	TokenNameIdentifier	 set When
(	TokenNameLPAREN	
scmp	TokenNameIdentifier	 scmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Invalid parameter "	TokenNameStringLiteral	Invalid parameter 
+	TokenNamePLUS	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Checks to make sure all settings are kosher. In this case, it * means that the size attribute has been set (to a positive value), * that the multiplier has a valid setting, and that the size limit * is valid. Since the latter is a calculated value, this can only * fail due to a programming error. * </p> * <p>If a problem is detected, the setError() method is called. * </p> */	TokenNameCOMMENT_JAVADOC	 <p>Checks to make sure all settings are kosher. In this case, it means that the size attribute has been set (to a positive value), that the multiplier has a valid setting, and that the size limit is valid. Since the latter is a calculated value, this can only fail due to a programming error. </p> <p>If a problem is detected, the setError() method is called. </p> 
public	TokenNamepublic	
void	TokenNamevoid	
verifySettings	TokenNameIdentifier	 verify Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"The value attribute is required, and must be positive"	TokenNameStringLiteral	The value attribute is required, and must be positive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
multiplier	TokenNameIdentifier	 multiplier
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Invalid Units supplied, must be K,Ki,M,Mi,G,Gi,T,or Ti"	TokenNameStringLiteral	Invalid Units supplied, must be K,Ki,M,Mi,G,Gi,T,or Ti
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
sizelimit	TokenNameIdentifier	 sizelimit
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Internal error: Code is not setting sizelimit correctly"	TokenNameStringLiteral	Internal error: Code is not setting sizelimit correctly
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The heart of the matter. This is where the selector gets to decide * on the inclusion of a file in a particular fileset. * * @param basedir A java.io.File object for the base directory. * @param filename The name of the file to check. * @param file A File object for this filename. * @return whether the file should be selected or not. */	TokenNameCOMMENT_JAVADOC	 The heart of the matter. This is where the selector gets to decide on the inclusion of a file in a particular fileset. * @param basedir A java.io.File object for the base directory. @param filename The name of the file to check. @param file A File object for this filename. @return whether the file should be selected or not. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// throw BuildException on error 	TokenNameCOMMENT_LINE	throw BuildException on error 
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Directory size never selected for 	TokenNameCOMMENT_LINE	Directory size never selected for 
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
sizelimit	TokenNameIdentifier	 sizelimit
;	TokenNameSEMICOLON	
return	TokenNamereturn	
when	TokenNameIdentifier	 when
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Enumerated attribute with the values for units. * <p> * This treats the standard SI units as representing powers of ten, * as they should. If you want the powers of 2 that approximate * the SI units, use the first two characters followed by a * <code>bi</code>. So 1024 (2^10) becomes <code>kibi</code>, * 1048576 (2^20) becomes <code>mebi</code>, 1073741824 (2^30) * becomes <code>gibi</code>, and so on. The symbols are also * accepted, and these are the first letter capitalized followed * by an <code>i</code>. <code>Ki</code>, <code>Mi</code>, * <code>Gi</code>, and so on. Capitalization variations on these * are also accepted. * <p> * This binary prefix system is approved by the IEC and appears on * its way for approval by other agencies, but it is not an SI * standard. It disambiguates things for us, though. */	TokenNameCOMMENT_JAVADOC	 Enumerated attribute with the values for units. <p> This treats the standard SI units as representing powers of ten, as they should. If you want the powers of 2 that approximate the SI units, use the first two characters followed by a <code>bi</code>. So 1024 (2^10) becomes <code>kibi</code>, 1048576 (2^20) becomes <code>mebi</code>, 1073741824 (2^30) becomes <code>gibi</code>, and so on. The symbols are also accepted, and these are the first letter capitalized followed by an <code>i</code>. <code>Ki</code>, <code>Mi</code>, <code>Gi</code>, and so on. Capitalization variations on these are also accepted. <p> This binary prefix system is approved by the IEC and appears on its way for approval by other agencies, but it is not an SI standard. It disambiguates things for us, though. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ByteUnits	TokenNameIdentifier	 Byte Units
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
/** * @return the values as an array of strings */	TokenNameCOMMENT_JAVADOC	 @return the values as an array of strings 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"K"	TokenNameStringLiteral	K
,	TokenNameCOMMA	
"k"	TokenNameStringLiteral	k
,	TokenNameCOMMA	
"kilo"	TokenNameStringLiteral	kilo
,	TokenNameCOMMA	
"KILO"	TokenNameStringLiteral	KILO
,	TokenNameCOMMA	
"Ki"	TokenNameStringLiteral	Ki
,	TokenNameCOMMA	
"KI"	TokenNameStringLiteral	KI
,	TokenNameCOMMA	
"ki"	TokenNameStringLiteral	ki
,	TokenNameCOMMA	
"kibi"	TokenNameStringLiteral	kibi
,	TokenNameCOMMA	
"KIBI"	TokenNameStringLiteral	KIBI
,	TokenNameCOMMA	
"M"	TokenNameStringLiteral	M
,	TokenNameCOMMA	
"m"	TokenNameStringLiteral	m
,	TokenNameCOMMA	
"mega"	TokenNameStringLiteral	mega
,	TokenNameCOMMA	
"MEGA"	TokenNameStringLiteral	MEGA
,	TokenNameCOMMA	
"Mi"	TokenNameStringLiteral	Mi
,	TokenNameCOMMA	
"MI"	TokenNameStringLiteral	MI
,	TokenNameCOMMA	
"mi"	TokenNameStringLiteral	mi
,	TokenNameCOMMA	
"mebi"	TokenNameStringLiteral	mebi
,	TokenNameCOMMA	
"MEBI"	TokenNameStringLiteral	MEBI
,	TokenNameCOMMA	
"G"	TokenNameStringLiteral	G
,	TokenNameCOMMA	
"g"	TokenNameStringLiteral	g
,	TokenNameCOMMA	
"giga"	TokenNameStringLiteral	giga
,	TokenNameCOMMA	
"GIGA"	TokenNameStringLiteral	GIGA
,	TokenNameCOMMA	
"Gi"	TokenNameStringLiteral	Gi
,	TokenNameCOMMA	
"GI"	TokenNameStringLiteral	GI
,	TokenNameCOMMA	
"gi"	TokenNameStringLiteral	gi
,	TokenNameCOMMA	
"gibi"	TokenNameStringLiteral	gibi
,	TokenNameCOMMA	
"GIBI"	TokenNameStringLiteral	GIBI
,	TokenNameCOMMA	
"T"	TokenNameStringLiteral	T
,	TokenNameCOMMA	
"t"	TokenNameStringLiteral	t
,	TokenNameCOMMA	
"tera"	TokenNameStringLiteral	tera
,	TokenNameCOMMA	
"TERA"	TokenNameStringLiteral	TERA
,	TokenNameCOMMA	
/* You wish! */	TokenNameCOMMENT_BLOCK	 You wish! 
"Ti"	TokenNameStringLiteral	Ti
,	TokenNameCOMMA	
"TI"	TokenNameStringLiteral	TI
,	TokenNameCOMMA	
"ti"	TokenNameStringLiteral	ti
,	TokenNameCOMMA	
"tebi"	TokenNameStringLiteral	tebi
,	TokenNameCOMMA	
"TEBI"	TokenNameStringLiteral	TEBI
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Enumerated attribute with the values for size comparison. */	TokenNameCOMMENT_JAVADOC	 Enumerated attribute with the values for size comparison. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
SizeComparisons	TokenNameIdentifier	 Size Comparisons
extends	TokenNameextends	
Comparison	TokenNameIdentifier	 Comparison
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
