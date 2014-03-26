/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ObjectArray.java 468638 2006-10-28 06:52:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ObjectArray.java 468638 2006-10-28 06:52:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
lib	TokenNameIdentifier	 lib
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** * Provide a simple Array storage mechinsim where native Arrays will be use as * the basic storage mechinism but the Arrays will be stored as blocks. * The size of the Array blocks is determine during object construction. * This is intended to be a simple storage mechinsim where the storage only * can grow. Array elements can not be removed, only added to. */	TokenNameCOMMENT_JAVADOC	 Provide a simple Array storage mechinsim where native Arrays will be use as the basic storage mechinism but the Arrays will be stored as blocks. The size of the Array blocks is determine during object construction. This is intended to be a simple storage mechinsim where the storage only can grow. Array elements can not be removed, only added to. 
public	TokenNamepublic	
class	TokenNameclass	
ObjectArray	TokenNameIdentifier	 Object Array
{	TokenNameLBRACE	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_minArraySize	TokenNameIdentifier	 m min Array Size
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The container of all the sub arrays */	TokenNameCOMMENT_JAVADOC	 The container of all the sub arrays 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_Arrays	TokenNameIdentifier	 m  Arrays
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * An index that porvides the Vector entry for the current Array that is * being appended to. */	TokenNameCOMMENT_JAVADOC	 An index that porvides the Vector entry for the current Array that is being appended to. 
private	TokenNameprivate	
_ObjectArray	TokenNameIdentifier	 Object Array
m_currentArray	TokenNameIdentifier	 m current Array
;	TokenNameSEMICOLON	
/** * The next offset in the current Array to append a new object */	TokenNameCOMMENT_JAVADOC	 The next offset in the current Array to append a new object 
private	TokenNameprivate	
int	TokenNameint	
m_nextSlot	TokenNameIdentifier	 m next Slot
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
ObjectArray	TokenNameIdentifier	 Object Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Default constructor will work with a minimal fixed size 	TokenNameCOMMENT_LINE	Default constructor will work with a minimal fixed size 
// 	TokenNameCOMMENT_LINE	 
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param minArraySize The size of the Arrays stored in the Vector */	TokenNameCOMMENT_JAVADOC	 @param minArraySize The size of the Arrays stored in the Vector 
public	TokenNamepublic	
ObjectArray	TokenNameIdentifier	 Object Array
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
minArraySize	TokenNameIdentifier	 min Array Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
minArraySize	TokenNameIdentifier	 min Array Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param size * */	TokenNameCOMMENT_JAVADOC	 @param size 
private	TokenNameprivate	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_minArraySize	TokenNameIdentifier	 m min Array Size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
m_currentArray	TokenNameIdentifier	 m current Array
=	TokenNameEQUAL	
new	TokenNamenew	
_ObjectArray	TokenNameIdentifier	 Object Array
(	TokenNameLPAREN	
m_minArraySize	TokenNameIdentifier	 m min Array Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param idx Index of the Object in the Array * */	TokenNameCOMMENT_JAVADOC	 @param idx Index of the Object in the Array 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getAt	TokenNameIdentifier	 get At
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
arrayIndx	TokenNameIdentifier	 array Indx
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
/	TokenNameDIVIDE	
m_minArraySize	TokenNameIdentifier	 m min Array Size
;	TokenNameSEMICOLON	
int	TokenNameint	
arrayOffset	TokenNameIdentifier	 array Offset
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
(	TokenNameLPAREN	
arrayIndx	TokenNameIdentifier	 array Indx
*	TokenNameMULTIPLY	
m_minArraySize	TokenNameIdentifier	 m min Array Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// If the array has been off loaded to the Vector Storage them 	TokenNameCOMMENT_LINE	If the array has been off loaded to the Vector Storage them 
// grab it from there. 	TokenNameCOMMENT_LINE	grab it from there. 
if	TokenNameif	
(	TokenNameLPAREN	
arrayIndx	TokenNameIdentifier	 array Indx
<	TokenNameLESS	
m_Arrays	TokenNameIdentifier	 m  Arrays
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_ObjectArray	TokenNameIdentifier	 Object Array
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_ObjectArray	TokenNameIdentifier	 Object Array
)	TokenNameRPAREN	
m_Arrays	TokenNameIdentifier	 m  Arrays
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
arrayIndx	TokenNameIdentifier	 array Indx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
[	TokenNameLBRACKET	
arrayOffset	TokenNameIdentifier	 array Offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// We must be in the current array, so pull it from there 	TokenNameCOMMENT_LINE	We must be in the current array, so pull it from there 
// %REVIEW% We may want to check to see if arrayIndx is only 	TokenNameCOMMENT_LINE	%REVIEW% We may want to check to see if arrayIndx is only 
// one freater that the m_Arrays.size(); This code is safe but 	TokenNameCOMMENT_LINE	one freater that the m_Arrays.size(); This code is safe but 
// will repete if the index is greater than the array size. 	TokenNameCOMMENT_LINE	will repete if the index is greater than the array size. 
return	TokenNamereturn	
m_currentArray	TokenNameIdentifier	 m current Array
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
[	TokenNameLBRACKET	
arrayOffset	TokenNameIdentifier	 array Offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @param idx Index of the Object in the Array * @param obj , The value to set in the Array * */	TokenNameCOMMENT_JAVADOC	 @param idx Index of the Object in the Array @param obj , The value to set in the Array 
public	TokenNamepublic	
void	TokenNamevoid	
setAt	TokenNameIdentifier	 set At
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
arrayIndx	TokenNameIdentifier	 array Indx
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
/	TokenNameDIVIDE	
m_minArraySize	TokenNameIdentifier	 m min Array Size
;	TokenNameSEMICOLON	
int	TokenNameint	
arrayOffset	TokenNameIdentifier	 array Offset
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
(	TokenNameLPAREN	
arrayIndx	TokenNameIdentifier	 array Indx
*	TokenNameMULTIPLY	
m_minArraySize	TokenNameIdentifier	 m min Array Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// If the array has been off loaded to the Vector Storage them 	TokenNameCOMMENT_LINE	If the array has been off loaded to the Vector Storage them 
// grab it from there. 	TokenNameCOMMENT_LINE	grab it from there. 
if	TokenNameif	
(	TokenNameLPAREN	
arrayIndx	TokenNameIdentifier	 array Indx
<	TokenNameLESS	
m_Arrays	TokenNameIdentifier	 m  Arrays
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_ObjectArray	TokenNameIdentifier	 Object Array
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_ObjectArray	TokenNameIdentifier	 Object Array
)	TokenNameRPAREN	
m_Arrays	TokenNameIdentifier	 m  Arrays
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
arrayIndx	TokenNameIdentifier	 array Indx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
[	TokenNameLBRACKET	
arrayOffset	TokenNameIdentifier	 array Offset
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// We must be in the current array, so pull it from there 	TokenNameCOMMENT_LINE	We must be in the current array, so pull it from there 
// %REVIEW% We may want to check to see if arrayIndx is only 	TokenNameCOMMENT_LINE	%REVIEW% We may want to check to see if arrayIndx is only 
// one freater that the m_Arrays.size(); This code is safe but 	TokenNameCOMMENT_LINE	one freater that the m_Arrays.size(); This code is safe but 
// will repete if the index is greater than the array size. 	TokenNameCOMMENT_LINE	will repete if the index is greater than the array size. 
m_currentArray	TokenNameIdentifier	 m current Array
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
[	TokenNameLBRACKET	
arrayOffset	TokenNameIdentifier	 array Offset
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @param o Object to be appended to the Array * */	TokenNameCOMMENT_JAVADOC	 @param o Object to be appended to the Array 
public	TokenNamepublic	
int	TokenNameint	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_nextSlot	TokenNameIdentifier	 m next Slot
>=	TokenNameGREATER_EQUAL	
m_minArraySize	TokenNameIdentifier	 m min Array Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_Arrays	TokenNameIdentifier	 m  Arrays
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
m_currentArray	TokenNameIdentifier	 m current Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nextSlot	TokenNameIdentifier	 m next Slot
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_currentArray	TokenNameIdentifier	 m current Array
=	TokenNameEQUAL	
new	TokenNamenew	
_ObjectArray	TokenNameIdentifier	 Object Array
(	TokenNameLPAREN	
m_minArraySize	TokenNameIdentifier	 m min Array Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_currentArray	TokenNameIdentifier	 m current Array
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
[	TokenNameLBRACKET	
m_nextSlot	TokenNameIdentifier	 m next Slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_Arrays	TokenNameIdentifier	 m  Arrays
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
m_minArraySize	TokenNameIdentifier	 m min Array Size
)	TokenNameRPAREN	
+	TokenNamePLUS	
m_nextSlot	TokenNameIdentifier	 m next Slot
;	TokenNameSEMICOLON	
m_nextSlot	TokenNameIdentifier	 m next Slot
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** */	TokenNameCOMMENT_JAVADOC	 
class	TokenNameclass	
_ObjectArray	TokenNameIdentifier	 Object Array
{	TokenNameLBRACE	
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
objects	TokenNameIdentifier	 objects
;	TokenNameSEMICOLON	
/** * @param size */	TokenNameCOMMENT_JAVADOC	 @param size 
public	TokenNamepublic	
_ObjectArray	TokenNameIdentifier	 Object Array
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
objects	TokenNameIdentifier	 objects
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @param args * */	TokenNameCOMMENT_JAVADOC	 @param args 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"Zero"	TokenNameStringLiteral	Zero
,	TokenNameCOMMA	
"One"	TokenNameStringLiteral	One
,	TokenNameCOMMA	
"Two"	TokenNameStringLiteral	Two
,	TokenNameCOMMA	
"Three"	TokenNameStringLiteral	Three
,	TokenNameCOMMA	
"Four"	TokenNameStringLiteral	Four
,	TokenNameCOMMA	
"Five"	TokenNameStringLiteral	Five
,	TokenNameCOMMA	
"Six"	TokenNameStringLiteral	Six
,	TokenNameCOMMA	
"Seven"	TokenNameStringLiteral	Seven
,	TokenNameCOMMA	
"Eight"	TokenNameStringLiteral	Eight
,	TokenNameCOMMA	
"Nine"	TokenNameStringLiteral	Nine
,	TokenNameCOMMA	
"Ten"	TokenNameStringLiteral	Ten
,	TokenNameCOMMA	
"Eleven"	TokenNameStringLiteral	Eleven
,	TokenNameCOMMA	
"Twelve"	TokenNameStringLiteral	Twelve
,	TokenNameCOMMA	
"Thirteen"	TokenNameStringLiteral	Thirteen
,	TokenNameCOMMA	
"Fourteen"	TokenNameStringLiteral	Fourteen
,	TokenNameCOMMA	
"Fifteen"	TokenNameStringLiteral	Fifteen
,	TokenNameCOMMA	
"Sixteen"	TokenNameStringLiteral	Sixteen
,	TokenNameCOMMA	
"Seventeen"	TokenNameStringLiteral	Seventeen
,	TokenNameCOMMA	
"Eighteen"	TokenNameStringLiteral	Eighteen
,	TokenNameCOMMA	
"Nineteen"	TokenNameStringLiteral	Nineteen
,	TokenNameCOMMA	
"Twenty"	TokenNameStringLiteral	Twenty
,	TokenNameCOMMA	
"Twenty-One"	TokenNameStringLiteral	Twenty-One
,	TokenNameCOMMA	
"Twenty-Two"	TokenNameStringLiteral	Twenty-Two
,	TokenNameCOMMA	
"Twenty-Three"	TokenNameStringLiteral	Twenty-Three
,	TokenNameCOMMA	
"Twenty-Four"	TokenNameStringLiteral	Twenty-Four
,	TokenNameCOMMA	
"Twenty-Five"	TokenNameStringLiteral	Twenty-Five
,	TokenNameCOMMA	
"Twenty-Six"	TokenNameStringLiteral	Twenty-Six
,	TokenNameCOMMA	
"Twenty-Seven"	TokenNameStringLiteral	Twenty-Seven
,	TokenNameCOMMA	
"Twenty-Eight"	TokenNameStringLiteral	Twenty-Eight
,	TokenNameCOMMA	
"Twenty-Nine"	TokenNameStringLiteral	Twenty-Nine
,	TokenNameCOMMA	
"Thirty"	TokenNameStringLiteral	Thirty
,	TokenNameCOMMA	
"Thirty-One"	TokenNameStringLiteral	Thirty-One
,	TokenNameCOMMA	
"Thirty-Two"	TokenNameStringLiteral	Thirty-Two
,	TokenNameCOMMA	
"Thirty-Three"	TokenNameStringLiteral	Thirty-Three
,	TokenNameCOMMA	
"Thirty-Four"	TokenNameStringLiteral	Thirty-Four
,	TokenNameCOMMA	
"Thirty-Five"	TokenNameStringLiteral	Thirty-Five
,	TokenNameCOMMA	
"Thirty-Six"	TokenNameStringLiteral	Thirty-Six
,	TokenNameCOMMA	
"Thirty-Seven"	TokenNameStringLiteral	Thirty-Seven
,	TokenNameCOMMA	
"Thirty-Eight"	TokenNameStringLiteral	Thirty-Eight
,	TokenNameCOMMA	
"Thirty-Nine"	TokenNameStringLiteral	Thirty-Nine
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
ObjectArray	TokenNameIdentifier	 Object Array
m_ObjectArray	TokenNameIdentifier	 m  Object Array
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectArray	TokenNameIdentifier	 Object Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add them in, using the default block size 	TokenNameCOMMENT_LINE	Add them in, using the default block size 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" - "	TokenNameStringLiteral	 - 
+	TokenNamePLUS	
m_ObjectArray	TokenNameIdentifier	 m  Object Array
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now let's read them out sequentally 	TokenNameCOMMENT_LINE	Now let's read them out sequentally 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_ObjectArray	TokenNameIdentifier	 m  Object Array
.	TokenNameDOT	
getAt	TokenNameIdentifier	 get At
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Some Random Access 	TokenNameCOMMENT_LINE	Some Random Access 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_ObjectArray	TokenNameIdentifier	 m  Object Array
.	TokenNameDOT	
getAt	TokenNameIdentifier	 get At
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_ObjectArray	TokenNameIdentifier	 m  Object Array
.	TokenNameDOT	
getAt	TokenNameIdentifier	 get At
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_ObjectArray	TokenNameIdentifier	 m  Object Array
.	TokenNameDOT	
getAt	TokenNameIdentifier	 get At
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_ObjectArray	TokenNameIdentifier	 m  Object Array
.	TokenNameDOT	
getAt	TokenNameIdentifier	 get At
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_ObjectArray	TokenNameIdentifier	 m  Object Array
.	TokenNameDOT	
getAt	TokenNameIdentifier	 get At
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_ObjectArray	TokenNameIdentifier	 m  Object Array
.	TokenNameDOT	
getAt	TokenNameIdentifier	 get At
(	TokenNameLPAREN	
30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_ObjectArray	TokenNameIdentifier	 m  Object Array
.	TokenNameDOT	
getAt	TokenNameIdentifier	 get At
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_ObjectArray	TokenNameIdentifier	 m  Object Array
.	TokenNameDOT	
getAt	TokenNameIdentifier	 get At
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Out of bounds 	TokenNameCOMMENT_LINE	Out of bounds 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_ObjectArray	TokenNameIdentifier	 m  Object Array
.	TokenNameDOT	
getAt	TokenNameIdentifier	 get At
(	TokenNameLPAREN	
40	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
