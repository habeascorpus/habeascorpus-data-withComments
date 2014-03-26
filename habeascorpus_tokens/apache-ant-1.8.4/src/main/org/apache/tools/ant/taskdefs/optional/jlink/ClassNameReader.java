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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
jlink	TokenNameIdentifier	 jlink
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInputStream	TokenNameIdentifier	 Data Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
/** * Reads just enough of a class file to determine the class' full name. * * <p>Extremely minimal constant pool implementation, mainly to support extracting * strings from a class file. */	TokenNameCOMMENT_JAVADOC	 Reads just enough of a class file to determine the class' full name. * <p>Extremely minimal constant pool implementation, mainly to support extracting strings from a class file. 
class	TokenNameclass	
ConstantPool	TokenNameIdentifier	 Constant Pool
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
UTF8	TokenNameIdentifier	 UT F8
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
UNUSED	TokenNameIdentifier	 UNUSED
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
INTEGER	TokenNameIdentifier	 INTEGER
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FLOAT	TokenNameIdentifier	 FLOAT
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
LONG	TokenNameIdentifier	 LONG
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DOUBLE	TokenNameIdentifier	 DOUBLE
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
CLASS	TokenNameIdentifier	 CLASS
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
STRING	TokenNameIdentifier	 STRING
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FIELDREF	TokenNameIdentifier	 FIELDREF
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
METHODREF	TokenNameIdentifier	 METHODREF
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
INTERFACEMETHODREF	TokenNameIdentifier	 INTERFACEMETHODREF
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
NAMEANDTYPE	TokenNameIdentifier	 NAMEANDTYPE
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
types	TokenNameIdentifier	 types
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Create a constant pool. * @param data the data input containing the class. * @throws IOException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Create a constant pool. @param data the data input containing the class. @throws IOException if there is an error. 
ConstantPool	TokenNameIdentifier	 Constant Pool
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
types	TokenNameIdentifier	 types
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// read in all constant pool entries. 	TokenNameCOMMENT_LINE	read in all constant pool entries. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
UTF8	TokenNameIdentifier	 UT F8
:	TokenNameCOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
UNUSED	TokenNameIdentifier	 UNUSED
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
INTEGER	TokenNameIdentifier	 INTEGER
:	TokenNameCOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
FLOAT	TokenNameIdentifier	 FLOAT
:	TokenNameCOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
readFloat	TokenNameIdentifier	 read Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LONG	TokenNameIdentifier	 LONG
:	TokenNameCOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DOUBLE	TokenNameIdentifier	 DOUBLE
:	TokenNameCOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
readDouble	TokenNameIdentifier	 read Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CLASS	TokenNameIdentifier	 CLASS
:	TokenNameCOLON	
case	TokenNamecase	
STRING	TokenNameIdentifier	 STRING
:	TokenNameCOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
FIELDREF	TokenNameIdentifier	 FIELDREF
:	TokenNameCOLON	
case	TokenNamecase	
METHODREF	TokenNameIdentifier	 METHODREF
:	TokenNameCOLON	
case	TokenNamecase	
INTERFACEMETHODREF	TokenNameIdentifier	 INTERFACEMETHODREF
:	TokenNameCOLON	
case	TokenNamecase	
NAMEANDTYPE	TokenNameIdentifier	 NAMEANDTYPE
:	TokenNameCOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// Do nothing 	TokenNameCOMMENT_LINE	Do nothing 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Provides a quick and dirty way to determine the true name of a class * given just an InputStream. Reads in just enough to perform this * minimal task only. */	TokenNameCOMMENT_JAVADOC	 Provides a quick and dirty way to determine the true name of a class given just an InputStream. Reads in just enough to perform this minimal task only. 
public	TokenNamepublic	
class	TokenNameclass	
ClassNameReader	TokenNameIdentifier	 Class Name Reader
extends	TokenNameextends	
Object	TokenNameIdentifier	 Object
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLASS_MAGIC_NUMBER	TokenNameIdentifier	 CLASS  MAGIC  NUMBER
=	TokenNameEQUAL	
0xCAFEBABE	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Get the class name of a class in an input stream. * * @param input an <code>InputStream</code> value * @return the name of the class * @exception IOException if an error occurs */	TokenNameCOMMENT_JAVADOC	 Get the class name of a class in an input stream. * @param input an <code>InputStream</code> value @return the name of the class @exception IOException if an error occurs 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
DataInputStream	TokenNameIdentifier	 Data Input Stream
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// verify this is a valid class file. 	TokenNameCOMMENT_LINE	verify this is a valid class file. 
int	TokenNameint	
cookie	TokenNameIdentifier	 cookie
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cookie	TokenNameIdentifier	 cookie
!=	TokenNameNOT_EQUAL	
CLASS_MAGIC_NUMBER	TokenNameIdentifier	 CLASS  MAGIC  NUMBER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* int version = */	TokenNameCOMMENT_BLOCK	 int version = 
data	TokenNameIdentifier	 data
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read the constant pool. 	TokenNameCOMMENT_LINE	read the constant pool. 
ConstantPool	TokenNameIdentifier	 Constant Pool
constants	TokenNameIdentifier	 constants
=	TokenNameEQUAL	
new	TokenNamenew	
ConstantPool	TokenNameIdentifier	 Constant Pool
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
constants	TokenNameIdentifier	 constants
.	TokenNameDOT	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
// read access flags and class index. 	TokenNameCOMMENT_LINE	read access flags and class index. 
/* int accessFlags = */	TokenNameCOMMENT_BLOCK	 int accessFlags = 
data	TokenNameIdentifier	 data
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
classIndex	TokenNameIdentifier	 class Index
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
stringIndex	TokenNameIdentifier	 string Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
classIndex	TokenNameIdentifier	 class Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
stringIndex	TokenNameIdentifier	 string Index
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
