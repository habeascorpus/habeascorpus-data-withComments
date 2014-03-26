package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestRamUsageEstimator	TokenNameIdentifier	 Test Ram Usage Estimator
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSanity	TokenNameIdentifier	 test Sanity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
"test string"	TokenNameStringLiteral	test string
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
shallowSizeOfInstance	TokenNameIdentifier	 shallow Size Of Instance
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Holder	TokenNameIdentifier	 Holder
holder	TokenNameIdentifier	 holder
=	TokenNameEQUAL	
new	TokenNamenew	
Holder	TokenNameIdentifier	 Holder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
holder	TokenNameIdentifier	 holder
.	TokenNameDOT	
holder	TokenNameIdentifier	 holder
=	TokenNameEQUAL	
new	TokenNamenew	
Holder	TokenNameIdentifier	 Holder
(	TokenNameLPAREN	
"string2"	TokenNameStringLiteral	string2
,	TokenNameCOMMA	
5000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
holder	TokenNameIdentifier	 holder
)	TokenNameRPAREN	
>	TokenNameGREATER	
shallowSizeOfInstance	TokenNameIdentifier	 shallow Size Of Instance
(	TokenNameLPAREN	
Holder	TokenNameIdentifier	 Holder
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
holder	TokenNameIdentifier	 holder
)	TokenNameRPAREN	
>	TokenNameGREATER	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
holder	TokenNameIdentifier	 holder
.	TokenNameDOT	
holder	TokenNameIdentifier	 holder
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
shallowSizeOfInstance	TokenNameIdentifier	 shallow Size Of Instance
(	TokenNameLPAREN	
HolderSubclass	TokenNameIdentifier	 Holder Subclass
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
shallowSizeOfInstance	TokenNameIdentifier	 shallow Size Of Instance
(	TokenNameLPAREN	
Holder	TokenNameIdentifier	 Holder
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
shallowSizeOfInstance	TokenNameIdentifier	 shallow Size Of Instance
(	TokenNameLPAREN	
Holder	TokenNameIdentifier	 Holder
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
shallowSizeOfInstance	TokenNameIdentifier	 shallow Size Of Instance
(	TokenNameLPAREN	
HolderSubclass2	TokenNameIdentifier	 Holder Subclass2
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
strings	TokenNameIdentifier	 strings
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
"test string"	TokenNameStringLiteral	test string
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
"hollow"	TokenNameStringLiteral	hollow
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
"catchmaster"	TokenNameStringLiteral	catchmaster
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
strings	TokenNameIdentifier	 strings
)	TokenNameRPAREN	
>	TokenNameGREATER	
shallowSizeOf	TokenNameIdentifier	 shallow Size Of
(	TokenNameLPAREN	
strings	TokenNameIdentifier	 strings
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testStaticOverloads	TokenNameIdentifier	 test Static Overloads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Random	TokenNameIdentifier	 Random
rnd	TokenNameIdentifier	 rnd
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
rnd	TokenNameIdentifier	 rnd
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
rnd	TokenNameIdentifier	 rnd
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
rnd	TokenNameIdentifier	 rnd
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
{	TokenNameLBRACE	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
rnd	TokenNameIdentifier	 rnd
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
rnd	TokenNameIdentifier	 rnd
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
rnd	TokenNameIdentifier	 rnd
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
{	TokenNameLBRACE	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
rnd	TokenNameIdentifier	 rnd
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
rnd	TokenNameIdentifier	 rnd
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReferenceSize	TokenNameIdentifier	 test Reference Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSupportedJVM	TokenNameIdentifier	 is Supported JVM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"WARN: Your JVM does not support certain Oracle/Sun extensions."	TokenNameStringLiteral	WARN: Your JVM does not support certain Oracle/Sun extensions.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Memory estimates may be inaccurate."	TokenNameStringLiteral	 Memory estimates may be inaccurate.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Please report this to the Lucene mailing list."	TokenNameStringLiteral	 Please report this to the Lucene mailing list.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"JVM version: "	TokenNameStringLiteral	JVM version: 
+	TokenNamePLUS	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
JVM_INFO_STRING	TokenNameIdentifier	 JVM  INFO  STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"UnsupportedFeatures:"	TokenNameStringLiteral	UnsupportedFeatures:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
JvmFeature	TokenNameIdentifier	 Jvm Feature
f	TokenNameIdentifier	 f
:	TokenNameCOLON	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
getUnsupportedFeatures	TokenNameIdentifier	 get Unsupported Features
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" - "	TokenNameStringLiteral	 - 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
==	TokenNameEQUAL_EQUAL	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
JvmFeature	TokenNameIdentifier	 Jvm Feature
.	TokenNameDOT	
OBJECT_ALIGNMENT	TokenNameIdentifier	 OBJECT  ALIGNMENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"; Please note: All 32bit Oracle/Sun VMs and Java 5 64bit VMs don't allow exact OBJECT_ALIGNMENT retrieval, this is a known issue."	TokenNameStringLiteral	; Please note: All 32bit Oracle/Sun VMs and Java 5 64bit VMs don't allow exact OBJECT_ALIGNMENT retrieval, this is a known issue.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
==	TokenNameEQUAL_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JRE_IS_64BIT	TokenNameIdentifier	 JRE  IS 64 BIT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"For 32bit JVMs, reference size must always be 4?"	TokenNameStringLiteral	For 32bit JVMs, reference size must always be 4?
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unused"	TokenNameStringLiteral	unused
)	TokenNameRPAREN	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
Holder	TokenNameIdentifier	 Holder
{	TokenNameLBRACE	
long	TokenNamelong	
field1	TokenNameIdentifier	 field1
=	TokenNameEQUAL	
5000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
"name"	TokenNameStringLiteral	name
;	TokenNameSEMICOLON	
Holder	TokenNameIdentifier	 Holder
holder	TokenNameIdentifier	 holder
;	TokenNameSEMICOLON	
long	TokenNamelong	
field2	TokenNameIdentifier	 field2
,	TokenNameCOMMA	
field3	TokenNameIdentifier	 field3
,	TokenNameCOMMA	
field4	TokenNameIdentifier	 field4
;	TokenNameSEMICOLON	
Holder	TokenNameIdentifier	 Holder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
Holder	TokenNameIdentifier	 Holder
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
long	TokenNamelong	
field1	TokenNameIdentifier	 field1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
field1	TokenNameIdentifier	 field1
=	TokenNameEQUAL	
field1	TokenNameIdentifier	 field1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unused"	TokenNameStringLiteral	unused
)	TokenNameRPAREN	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
HolderSubclass	TokenNameIdentifier	 Holder Subclass
extends	TokenNameextends	
Holder	TokenNameIdentifier	 Holder
{	TokenNameLBRACE	
byte	TokenNamebyte	
foo	TokenNameIdentifier	 foo
;	TokenNameSEMICOLON	
int	TokenNameint	
bar	TokenNameIdentifier	 bar
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
HolderSubclass2	TokenNameIdentifier	 Holder Subclass2
extends	TokenNameextends	
Holder	TokenNameIdentifier	 Holder
{	TokenNameLBRACE	
// empty, only inherits all fields -> size should be identical to superclass 	TokenNameCOMMENT_LINE	empty, only inherits all fields -> size should be identical to superclass 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
