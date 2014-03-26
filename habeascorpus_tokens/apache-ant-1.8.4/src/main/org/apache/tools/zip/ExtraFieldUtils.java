/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipException	TokenNameIdentifier	 Zip Exception
;	TokenNameSEMICOLON	
/** * ZipExtraField related methods * */	TokenNameCOMMENT_JAVADOC	 ZipExtraField related methods 
// CheckStyle:HideUtilityClassConstructorCheck OFF (bc) 	TokenNameCOMMENT_LINE	CheckStyle:HideUtilityClassConstructorCheck OFF (bc) 
public	TokenNamepublic	
class	TokenNameclass	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WORD	TokenNameIdentifier	 WORD
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Static registry of known extra fields. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Static registry of known extra fields. * @since 1.1 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
implementations	TokenNameIdentifier	 implementations
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
implementations	TokenNameIdentifier	 implementations
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
JarMarker	TokenNameIdentifier	 Jar Marker
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
UnicodePathExtraField	TokenNameIdentifier	 Unicode Path Extra Field
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
UnicodeCommentExtraField	TokenNameIdentifier	 Unicode Comment Extra Field
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Register a ZipExtraField implementation. * * <p>The given class must have a no-arg constructor and implement * the {@link ZipExtraField ZipExtraField interface}.</p> * @param c the class to register * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Register a ZipExtraField implementation. * <p>The given class must have a no-arg constructor and implement the {@link ZipExtraField ZipExtraField interface}.</p> @param c the class to register * @since 1.1 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
implementations	TokenNameIdentifier	 implementations
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getHeaderId	TokenNameIdentifier	 get Header Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
cc	TokenNameIdentifier	 cc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
" doesn't implement ZipExtraField"	TokenNameStringLiteral	 doesn't implement ZipExtraField
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
" is not a concrete class"	TokenNameStringLiteral	 is not a concrete class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
"'s no-arg constructor is not public"	TokenNameStringLiteral	's no-arg constructor is not public
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create an instance of the approriate ExtraField, falls back to * {@link UnrecognizedExtraField UnrecognizedExtraField}. * @param headerId the header identifier * @return an instance of the appropiate ExtraField * @exception InstantiationException if unable to instantiate the class * @exception IllegalAccessException if not allowed to instatiate the class * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Create an instance of the approriate ExtraField, falls back to {@link UnrecognizedExtraField UnrecognizedExtraField}. @param headerId the header identifier @return an instance of the appropiate ExtraField @exception InstantiationException if unable to instantiate the class @exception IllegalAccessException if not allowed to instatiate the class @since 1.1 
public	TokenNamepublic	
static	TokenNamestatic	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
createExtraField	TokenNameIdentifier	 create Extra Field
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
headerId	TokenNameIdentifier	 header Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
,	TokenNameCOMMA	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
)	TokenNameRPAREN	
implementations	TokenNameIdentifier	 implementations
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
headerId	TokenNameIdentifier	 header Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
new	TokenNamenew	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
setHeaderId	TokenNameIdentifier	 set Header Id
(	TokenNameLPAREN	
headerId	TokenNameIdentifier	 header Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
u	TokenNameIdentifier	 u
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Split the array into ExtraFields and populate them with the * given data as local file data, throwing an exception if the * data cannot be parsed. * @param data an array of bytes as it appears in local file data * @return an array of ExtraFields * @throws ZipException on error */	TokenNameCOMMENT_JAVADOC	 Split the array into ExtraFields and populate them with the given data as local file data, throwing an exception if the data cannot be parsed. @param data an array of bytes as it appears in local file data @return an array of ExtraFields @throws ZipException on error 
public	TokenNamepublic	
static	TokenNamestatic	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
ZipException	TokenNameIdentifier	 Zip Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
.	TokenNameDOT	
THROW	TokenNameIdentifier	 THROW
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Split the array into ExtraFields and populate them with the * given data, throwing an exception if the data cannot be parsed. * @param data an array of bytes * @param local whether data originates from the local file data * or the central directory * @return an array of ExtraFields * @since 1.1 * @throws ZipException on error */	TokenNameCOMMENT_JAVADOC	 Split the array into ExtraFields and populate them with the given data, throwing an exception if the data cannot be parsed. @param data an array of bytes @param local whether data originates from the local file data or the central directory @return an array of ExtraFields @since 1.1 @throws ZipException on error 
public	TokenNamepublic	
static	TokenNamestatic	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
boolean	TokenNameboolean	
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
throws	TokenNamethrows	
ZipException	TokenNameIdentifier	 Zip Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
local	TokenNameIdentifier	 local
,	TokenNameCOMMA	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
.	TokenNameDOT	
THROW	TokenNameIdentifier	 THROW
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Split the array into ExtraFields and populate them with the * given data. * @param data an array of bytes * @param local whether data originates from the local file data * or the central directory * @param onUnparseableData what to do if the extra field data * cannot be parsed. * @return an array of ExtraFields * @throws ZipException on error * @since Ant 1.8.1 */	TokenNameCOMMENT_JAVADOC	 Split the array into ExtraFields and populate them with the given data. @param data an array of bytes @param local whether data originates from the local file data or the central directory @param onUnparseableData what to do if the extra field data cannot be parsed. @return an array of ExtraFields @throws ZipException on error @since Ant 1.8.1 
public	TokenNamepublic	
static	TokenNamestatic	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
boolean	TokenNameboolean	
local	TokenNameIdentifier	 local
,	TokenNameCOMMA	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
onUnparseableData	TokenNameIdentifier	 on Unparseable Data
)	TokenNameRPAREN	
throws	TokenNamethrows	
ZipException	TokenNameIdentifier	 Zip Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
LOOP	TokenNameIdentifier	 LOOP
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<=	TokenNameLESS_EQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
WORD	TokenNameIdentifier	 WORD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipShort	TokenNameIdentifier	 Zip Short
headerId	TokenNameIdentifier	 header Id
=	TokenNameEQUAL	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
(	TokenNameLPAREN	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
onUnparseableData	TokenNameIdentifier	 on Unparseable Data
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
.	TokenNameDOT	
THROW_KEY	TokenNameIdentifier	 THROW  KEY
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
ZipException	TokenNameIdentifier	 Zip Exception
(	TokenNameLPAREN	
"bad extra field starting at "	TokenNameStringLiteral	bad extra field starting at 
+	TokenNamePLUS	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
". Block length of "	TokenNameStringLiteral	. Block length of 
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
" bytes exceeds remaining"	TokenNameStringLiteral	 bytes exceeds remaining
+	TokenNamePLUS	
" data of "	TokenNameStringLiteral	 data of 
+	TokenNamePLUS	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
WORD	TokenNameIdentifier	 WORD
)	TokenNameRPAREN	
+	TokenNamePLUS	
" bytes."	TokenNameStringLiteral	 bytes.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
.	TokenNameDOT	
READ_KEY	TokenNameIdentifier	 READ  KEY
:	TokenNameCOLON	
UnparseableExtraFieldData	TokenNameIdentifier	 Unparseable Extra Field Data
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
new	TokenNamenew	
UnparseableExtraFieldData	TokenNameIdentifier	 Unparseable Extra Field Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
{	TokenNameLBRACE	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
parseFromLocalFileData	TokenNameIdentifier	 parse From Local File Data
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
parseFromCentralDirectoryData	TokenNameIdentifier	 parse From Central Directory Data
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/*FALLTHROUGH*/	TokenNameCOMMENT_BLOCK	FALLTHROUGH
case	TokenNamecase	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
.	TokenNameDOT	
SKIP_KEY	TokenNameIdentifier	 SKIP  KEY
:	TokenNameCOLON	
// since we cannot parse the data we must assume 	TokenNameCOMMENT_LINE	since we cannot parse the data we must assume 
// the extra field consumes the whole rest of the 	TokenNameCOMMENT_LINE	the extra field consumes the whole rest of the 
// available data 	TokenNameCOMMENT_LINE	available data 
break	TokenNamebreak	
LOOP	TokenNameIdentifier	 LOOP
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
ZipException	TokenNameIdentifier	 Zip Exception
(	TokenNameLPAREN	
"unknown UnparseableExtraField key: "	TokenNameStringLiteral	unknown UnparseableExtraField key: 
+	TokenNamePLUS	
onUnparseableData	TokenNameIdentifier	 on Unparseable Data
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
createExtraField	TokenNameIdentifier	 create Extra Field
(	TokenNameLPAREN	
headerId	TokenNameIdentifier	 header Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
local	TokenNameIdentifier	 local
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
instanceof	TokenNameinstanceof	
CentralDirectoryParsingZipExtraField	TokenNameIdentifier	 Central Directory Parsing Zip Extra Field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
parseFromLocalFileData	TokenNameIdentifier	 parse From Local File Data
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CentralDirectoryParsingZipExtraField	TokenNameIdentifier	 Central Directory Parsing Zip Extra Field
)	TokenNameRPAREN	
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
.	TokenNameDOT	
parseFromCentralDirectoryData	TokenNameIdentifier	 parse From Central Directory Data
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ZipException	TokenNameIdentifier	 Zip Exception
(	TokenNameLPAREN	
ie	TokenNameIdentifier	 ie
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
iae	TokenNameIdentifier	 iae
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ZipException	TokenNameIdentifier	 Zip Exception
(	TokenNameLPAREN	
iae	TokenNameIdentifier	 iae
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
start	TokenNameIdentifier	 start
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Merges the local file data fields of the given ZipExtraFields. * @param data an array of ExtraFiles * @return an array of bytes * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Merges the local file data fields of the given ZipExtraFields. @param data an array of ExtraFiles @return an array of bytes @since 1.1 
public	TokenNamepublic	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mergeLocalFileDataData	TokenNameIdentifier	 merge Local File Data Data
(	TokenNameLPAREN	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
lastIsUnparseableHolder	TokenNameIdentifier	 last Is Unparseable Holder
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
UnparseableExtraFieldData	TokenNameIdentifier	 Unparseable Extra Field Data
;	TokenNameSEMICOLON	
int	TokenNameint	
regularExtraFieldCount	TokenNameIdentifier	 regular Extra Field Count
=	TokenNameEQUAL	
lastIsUnparseableHolder	TokenNameIdentifier	 last Is Unparseable Holder
?	TokenNameQUESTION	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
WORD	TokenNameIdentifier	 WORD
*	TokenNameMULTIPLY	
regularExtraFieldCount	TokenNameIdentifier	 regular Extra Field Count
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
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLocalFileDataLength	TokenNameIdentifier	 get Local File Data Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
sum	TokenNameIdentifier	 sum
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
regularExtraFieldCount	TokenNameIdentifier	 regular Extra Field Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getHeaderId	TokenNameIdentifier	 get Header Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLocalFileDataLength	TokenNameIdentifier	 get Local File Data Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
local	TokenNameIdentifier	 local
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLocalFileDataData	TokenNameIdentifier	 get Local File Data Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
local	TokenNameIdentifier	 local
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
,	TokenNameCOMMA	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastIsUnparseableHolder	TokenNameIdentifier	 last Is Unparseable Holder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
local	TokenNameIdentifier	 local
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLocalFileDataData	TokenNameIdentifier	 get Local File Data Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
local	TokenNameIdentifier	 local
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Merges the central directory fields of the given ZipExtraFields. * @param data an array of ExtraFields * @return an array of bytes * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Merges the central directory fields of the given ZipExtraFields. @param data an array of ExtraFields @return an array of bytes @since 1.1 
public	TokenNamepublic	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mergeCentralDirectoryData	TokenNameIdentifier	 merge Central Directory Data
(	TokenNameLPAREN	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
lastIsUnparseableHolder	TokenNameIdentifier	 last Is Unparseable Holder
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
UnparseableExtraFieldData	TokenNameIdentifier	 Unparseable Extra Field Data
;	TokenNameSEMICOLON	
int	TokenNameint	
regularExtraFieldCount	TokenNameIdentifier	 regular Extra Field Count
=	TokenNameEQUAL	
lastIsUnparseableHolder	TokenNameIdentifier	 last Is Unparseable Holder
?	TokenNameQUESTION	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
WORD	TokenNameIdentifier	 WORD
*	TokenNameMULTIPLY	
regularExtraFieldCount	TokenNameIdentifier	 regular Extra Field Count
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
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getCentralDirectoryLength	TokenNameIdentifier	 get Central Directory Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
sum	TokenNameIdentifier	 sum
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
regularExtraFieldCount	TokenNameIdentifier	 regular Extra Field Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getHeaderId	TokenNameIdentifier	 get Header Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getCentralDirectoryLength	TokenNameIdentifier	 get Central Directory Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
local	TokenNameIdentifier	 local
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getCentralDirectoryData	TokenNameIdentifier	 get Central Directory Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
local	TokenNameIdentifier	 local
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
,	TokenNameCOMMA	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastIsUnparseableHolder	TokenNameIdentifier	 last Is Unparseable Holder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
local	TokenNameIdentifier	 local
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getCentralDirectoryData	TokenNameIdentifier	 get Central Directory Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
local	TokenNameIdentifier	 local
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * "enum" for the possible actions to take if the extra field * cannot be parsed. */	TokenNameCOMMENT_JAVADOC	 "enum" for the possible actions to take if the extra field cannot be parsed. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
{	TokenNameLBRACE	
/** * Key for "throw an exception" action. */	TokenNameCOMMENT_JAVADOC	 Key for "throw an exception" action. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
THROW_KEY	TokenNameIdentifier	 THROW  KEY
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Key for "skip" action. */	TokenNameCOMMENT_JAVADOC	 Key for "skip" action. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SKIP_KEY	TokenNameIdentifier	 SKIP  KEY
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Key for "read" action. */	TokenNameCOMMENT_JAVADOC	 Key for "read" action. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
READ_KEY	TokenNameIdentifier	 READ  KEY
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Throw an exception if field cannot be parsed. */	TokenNameCOMMENT_JAVADOC	 Throw an exception if field cannot be parsed. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
THROW	TokenNameIdentifier	 THROW
=	TokenNameEQUAL	
new	TokenNamenew	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
(	TokenNameLPAREN	
THROW_KEY	TokenNameIdentifier	 THROW  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Skip the extra field entirely and don't make its data * available - effectively removing the extra field data. */	TokenNameCOMMENT_JAVADOC	 Skip the extra field entirely and don't make its data available - effectively removing the extra field data. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
SKIP	TokenNameIdentifier	 SKIP
=	TokenNameEQUAL	
new	TokenNamenew	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
(	TokenNameLPAREN	
SKIP_KEY	TokenNameIdentifier	 SKIP  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Read the extra field data into an instance of {@link * UnparseableExtraFieldData UnparseableExtraFieldData}. */	TokenNameCOMMENT_JAVADOC	 Read the extra field data into an instance of {@link UnparseableExtraFieldData UnparseableExtraFieldData}. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
READ	TokenNameIdentifier	 READ
=	TokenNameEQUAL	
new	TokenNamenew	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
(	TokenNameLPAREN	
READ_KEY	TokenNameIdentifier	 READ  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
private	TokenNameprivate	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Key of the action to take. */	TokenNameCOMMENT_JAVADOC	 Key of the action to take. 
public	TokenNamepublic	
int	TokenNameint	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
