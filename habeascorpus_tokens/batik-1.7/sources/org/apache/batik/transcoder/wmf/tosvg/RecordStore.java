/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
wmf	TokenNameIdentifier	 wmf
.	TokenNameDOT	
tosvg	TokenNameIdentifier	 tosvg
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
wmf	TokenNameIdentifier	 wmf
.	TokenNameDOT	
WMFConstants	TokenNameIdentifier	 WMF Constants
;	TokenNameSEMICOLON	
/** * An object that stores the vector graphics records. * * @deprecated jan '07 : this class is not used anywhere in Batik, it might be removed in the future. * Probably WMFRecordStore is what you need. * * @author <a href="mailto:luano@asd.ie">Luan O'Carroll</a> * @version $Id: RecordStore.java 501518 2007-01-30 18:56:13Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 An object that stores the vector graphics records. * @deprecated jan '07 : this class is not used anywhere in Batik, it might be removed in the future. Probably WMFRecordStore is what you need. * @author <a href="mailto:luano@asd.ie">Luan O'Carroll</a> @version $Id: RecordStore.java 501518 2007-01-30 18:56:13Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
RecordStore	TokenNameIdentifier	 Record Store
{	TokenNameLBRACE	
public	TokenNamepublic	
RecordStore	TokenNameIdentifier	 Record Store
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets the internal storage and viewport coordinates. */	TokenNameCOMMENT_JAVADOC	 Resets the internal storage and viewport coordinates. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numRecords	TokenNameIdentifier	 num Records
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
vpX	TokenNameIdentifier	 vp X
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
vpY	TokenNameIdentifier	 vp Y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
vpW	TokenNameIdentifier	 vp W
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
vpH	TokenNameIdentifier	 vp H
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
numObjects	TokenNameIdentifier	 num Objects
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
objectVector	TokenNameIdentifier	 object Vector
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setReading	TokenNameIdentifier	 set Reading
(	TokenNameLPAREN	
boolean	TokenNameboolean	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bReading	TokenNameIdentifier	 b Reading
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
isReading	TokenNameIdentifier	 is Reading
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bReading	TokenNameIdentifier	 b Reading
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads the Wmf file from the specified Stream. * A Wmf file can be produced using the GConvert utility found at * http://www.asd.ie/Wmf.htm * * The Wmf format is slightly more compact than the original WMF format and * in some cases may produce better handling of colours. */	TokenNameCOMMENT_JAVADOC	 Reads the Wmf file from the specified Stream. A Wmf file can be produced using the GConvert utility found at http://www.asd.ie/Wmf.htm * The Wmf format is slightly more compact than the original WMF format and in some cases may produce better handling of colours. 
public	TokenNamepublic	
boolean	TokenNameboolean	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
DataInputStream	TokenNameIdentifier	 Data Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
setReading	TokenNameIdentifier	 set Reading
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
numRecords	TokenNameIdentifier	 num Records
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
numObjects	TokenNameIdentifier	 num Objects
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
objectVector	TokenNameIdentifier	 object Vector
.	TokenNameDOT	
ensureCapacity	TokenNameIdentifier	 ensure Capacity
(	TokenNameLPAREN	
numObjects	TokenNameIdentifier	 num Objects
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numObjects	TokenNameIdentifier	 num Objects
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
objectVector	TokenNameIdentifier	 object Vector
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
GdiObject	TokenNameIdentifier	 Gdi Object
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
functionId	TokenNameIdentifier	 function Id
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
functionId	TokenNameIdentifier	 function Id
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
MetaRecord	TokenNameIdentifier	 Meta Record
mr	TokenNameIdentifier	 mr
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
functionId	TokenNameIdentifier	 function Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_TEXTOUT	TokenNameIdentifier	 META  TEXTOUT
:	TokenNameCOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_DRAWTEXT	TokenNameIdentifier	 META  DRAWTEXT
:	TokenNameCOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_EXTTEXTOUT	TokenNameIdentifier	 META  EXTTEXTOUT
:	TokenNameCOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CREATEFONTINDIRECT	TokenNameIdentifier	 META  CREATEFONTINDIRECT
:	TokenNameCOLON	
{	TokenNameLBRACE	
short	TokenNameshort	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
=	TokenNameEQUAL	
new	TokenNamenew	
MetaRecord	TokenNameIdentifier	 Meta Record
.	TokenNameDOT	
StringRecord	TokenNameIdentifier	 String Record
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
mr	TokenNameIdentifier	 mr
=	TokenNameEQUAL	
new	TokenNamenew	
MetaRecord	TokenNameIdentifier	 Meta Record
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
numPts	TokenNameIdentifier	 num Pts
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
numPts	TokenNameIdentifier	 num Pts
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
functionId	TokenNameIdentifier	 function Id
=	TokenNameEQUAL	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
numPts	TokenNameIdentifier	 num Pts
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
AddElement	TokenNameIdentifier	 Add Element
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numRecords	TokenNameIdentifier	 num Records
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setReading	TokenNameIdentifier	 set Reading
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a GdiObject to the internal handle table. * Adds the object at the next free location. * * This function should not normally be called by an application. */	TokenNameCOMMENT_JAVADOC	 Adds a GdiObject to the internal handle table. Adds the object at the next free location. * This function should not normally be called by an application. 
public	TokenNamepublic	
void	TokenNamevoid	
addObject	TokenNameIdentifier	 add Object
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
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
numObjects	TokenNameIdentifier	 num Objects
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GdiObject	TokenNameIdentifier	 Gdi Object
gdi	TokenNameIdentifier	 gdi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GdiObject	TokenNameIdentifier	 Gdi Object
)	TokenNameRPAREN	
objectVector	TokenNameIdentifier	 object Vector
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
gdi	TokenNameIdentifier	 gdi
.	TokenNameDOT	
used	TokenNameIdentifier	 used
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gdi	TokenNameIdentifier	 gdi
.	TokenNameDOT	
Setup	TokenNameIdentifier	 Setup
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastObjectIdx	TokenNameIdentifier	 last Object Idx
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds a GdiObject to the internal handle table. * Wmf files specify the index as given in EMF records such as * EMRCREATEPENINDIRECT whereas WMF files always use 0. * * This function should not normally be called by an application. */	TokenNameCOMMENT_JAVADOC	 Adds a GdiObject to the internal handle table. Wmf files specify the index as given in EMF records such as EMRCREATEPENINDIRECT whereas WMF files always use 0. * This function should not normally be called by an application. 
public	TokenNamepublic	
void	TokenNamevoid	
addObjectAt	TokenNameIdentifier	 add Object At
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>	TokenNameGREATER	
numObjects	TokenNameIdentifier	 num Objects
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addObject	TokenNameIdentifier	 add Object
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastObjectIdx	TokenNameIdentifier	 last Object Idx
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numObjects	TokenNameIdentifier	 num Objects
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GdiObject	TokenNameIdentifier	 Gdi Object
gdi	TokenNameIdentifier	 gdi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GdiObject	TokenNameIdentifier	 Gdi Object
)	TokenNameRPAREN	
objectVector	TokenNameIdentifier	 object Vector
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gdi	TokenNameIdentifier	 gdi
.	TokenNameDOT	
Setup	TokenNameIdentifier	 Setup
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the current URL */	TokenNameCOMMENT_JAVADOC	 Returns the current URL 
public	TokenNamepublic	
URL	TokenNameIdentifier	 URL
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the current URL */	TokenNameCOMMENT_JAVADOC	 Sets the current URL 
public	TokenNamepublic	
void	TokenNamevoid	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
newUrl	TokenNameIdentifier	 new Url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
newUrl	TokenNameIdentifier	 new Url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a GdiObject from the handle table */	TokenNameCOMMENT_JAVADOC	 Returns a GdiObject from the handle table 
public	TokenNamepublic	
GdiObject	TokenNameIdentifier	 Gdi Object
getObject	TokenNameIdentifier	 get Object
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
GdiObject	TokenNameIdentifier	 Gdi Object
)	TokenNameRPAREN	
objectVector	TokenNameIdentifier	 object Vector
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a meta record. */	TokenNameCOMMENT_JAVADOC	 Returns a meta record. 
public	TokenNamepublic	
MetaRecord	TokenNameIdentifier	 Meta Record
getRecord	TokenNameIdentifier	 get Record
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
MetaRecord	TokenNameIdentifier	 Meta Record
)	TokenNameRPAREN	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a number of records in the image */	TokenNameCOMMENT_JAVADOC	 Returns a number of records in the image 
public	TokenNamepublic	
int	TokenNameint	
getNumRecords	TokenNameIdentifier	 get Num Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numRecords	TokenNameIdentifier	 num Records
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of GdiObjects in the handle table */	TokenNameCOMMENT_JAVADOC	 Returns the number of GdiObjects in the handle table 
public	TokenNamepublic	
int	TokenNameint	
getNumObjects	TokenNameIdentifier	 get Num Objects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numObjects	TokenNameIdentifier	 num Objects
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the viewport x origin */	TokenNameCOMMENT_JAVADOC	 Returns the viewport x origin 
public	TokenNamepublic	
int	TokenNameint	
getVpX	TokenNameIdentifier	 get Vp X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
vpX	TokenNameIdentifier	 vp X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the viewport y origin */	TokenNameCOMMENT_JAVADOC	 Returns the viewport y origin 
public	TokenNamepublic	
int	TokenNameint	
getVpY	TokenNameIdentifier	 get Vp Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
vpY	TokenNameIdentifier	 vp Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the viewport width */	TokenNameCOMMENT_JAVADOC	 Returns the viewport width 
public	TokenNamepublic	
int	TokenNameint	
getVpW	TokenNameIdentifier	 get Vp W
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
vpW	TokenNameIdentifier	 vp W
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the viewport height */	TokenNameCOMMENT_JAVADOC	 Returns the viewport height 
public	TokenNamepublic	
int	TokenNameint	
getVpH	TokenNameIdentifier	 get Vp H
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
vpH	TokenNameIdentifier	 vp H
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the viewport x origin */	TokenNameCOMMENT_JAVADOC	 Sets the viewport x origin 
public	TokenNamepublic	
void	TokenNamevoid	
setVpX	TokenNameIdentifier	 set Vp X
(	TokenNameLPAREN	
int	TokenNameint	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vpX	TokenNameIdentifier	 vp X
=	TokenNameEQUAL	
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the viewport y origin */	TokenNameCOMMENT_JAVADOC	 Sets the viewport y origin 
public	TokenNamepublic	
void	TokenNamevoid	
setVpY	TokenNameIdentifier	 set Vp Y
(	TokenNameLPAREN	
int	TokenNameint	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vpY	TokenNameIdentifier	 vp Y
=	TokenNameEQUAL	
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the viewport width */	TokenNameCOMMENT_JAVADOC	 Sets the viewport width 
public	TokenNamepublic	
void	TokenNamevoid	
setVpW	TokenNameIdentifier	 set Vp W
(	TokenNameLPAREN	
int	TokenNameint	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vpW	TokenNameIdentifier	 vp W
=	TokenNameEQUAL	
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the viewport height */	TokenNameCOMMENT_JAVADOC	 Sets the viewport height 
public	TokenNamepublic	
void	TokenNamevoid	
setVpH	TokenNameIdentifier	 set Vp H
(	TokenNameLPAREN	
int	TokenNameint	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vpH	TokenNameIdentifier	 vp H
=	TokenNameEQUAL	
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
transient	TokenNametransient	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
transient	TokenNametransient	
int	TokenNameint	
numRecords	TokenNameIdentifier	 num Records
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
transient	TokenNametransient	
int	TokenNameint	
numObjects	TokenNameIdentifier	 num Objects
;	TokenNameSEMICOLON	
public	TokenNamepublic	
transient	TokenNametransient	
int	TokenNameint	
lastObjectIdx	TokenNameIdentifier	 last Object Idx
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
transient	TokenNametransient	
int	TokenNameint	
vpX	TokenNameIdentifier	 vp X
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
transient	TokenNametransient	
int	TokenNameint	
vpY	TokenNameIdentifier	 vp Y
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
transient	TokenNametransient	
int	TokenNameint	
vpW	TokenNameIdentifier	 vp W
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
transient	TokenNametransient	
int	TokenNameint	
vpH	TokenNameIdentifier	 vp H
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
transient	TokenNametransient	
Vector	TokenNameIdentifier	 Vector
records	TokenNameIdentifier	 records
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
transient	TokenNametransient	
Vector	TokenNameIdentifier	 Vector
objectVector	TokenNameIdentifier	 object Vector
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
transient	TokenNametransient	
boolean	TokenNameboolean	
bReading	TokenNameIdentifier	 b Reading
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
