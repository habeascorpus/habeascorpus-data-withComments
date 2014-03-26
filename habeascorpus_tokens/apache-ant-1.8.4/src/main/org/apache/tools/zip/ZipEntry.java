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
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
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
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipException	TokenNameIdentifier	 Zip Exception
;	TokenNameSEMICOLON	
/** * Extension that adds better handling of extra fields and provides * access to the internal and external file attributes. * * <p>The extra data is expected to follow the recommendation of * the .ZIP File Format Specification created by PKWARE Inc. :</p> * <ul> * <li>the extra byte array consists of a sequence of extra fields</li> * <li>each extra fields starts by a two byte header id followed by * a two byte sequence holding the length of the remainder of * data.</li> * </ul> * * <p>Any extra data that cannot be parsed by the rules above will be * consumed as "unparseable" extra data and treated differently by the * methods of this class. Versions prior to Apache Commons Compress * 1.1 would have thrown an exception if any attempt was made to read * or write extra data not conforming to the recommendation.</p> * @see <a href="http://www.pkware.com/documents/casestudies/APPNOTE.TXT"> * .ZIP File Format Specification</a> * */	TokenNameCOMMENT_JAVADOC	 Extension that adds better handling of extra fields and provides access to the internal and external file attributes. * <p>The extra data is expected to follow the recommendation of the .ZIP File Format Specification created by PKWARE Inc. :</p> <ul> <li>the extra byte array consists of a sequence of extra fields</li> <li>each extra fields starts by a two byte header id followed by a two byte sequence holding the length of the remainder of data.</li> </ul> * <p>Any extra data that cannot be parsed by the rules above will be consumed as "unparseable" extra data and treated differently by the methods of this class. Versions prior to Apache Commons Compress 1.1 would have thrown an exception if any attempt was made to read or write extra data not conforming to the recommendation.</p> @see <a href="http://www.pkware.com/documents/casestudies/APPNOTE.TXT"> .ZIP File Format Specification</a> 
public	TokenNamepublic	
class	TokenNameclass	
ZipEntry	TokenNameIdentifier	 Zip Entry
extends	TokenNameextends	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipEntry	TokenNameIdentifier	 Zip Entry
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PLATFORM_UNIX	TokenNameIdentifier	 PLATFORM  UNIX
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PLATFORM_FAT	TokenNameIdentifier	 PLATFORM  FAT
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHORT_MASK	TokenNameIdentifier	 SHORT  MASK
=	TokenNameEQUAL	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHORT_SHIFT	TokenNameIdentifier	 SHORT  SHIFT
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
internalAttributes	TokenNameIdentifier	 internal Attributes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
platform	TokenNameIdentifier	 platform
=	TokenNameEQUAL	
PLATFORM_FAT	TokenNameIdentifier	 PLATFORM  FAT
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
externalAttributes	TokenNameIdentifier	 external Attributes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
/*<ZipShort, ZipExtraField>*/	TokenNameCOMMENT_BLOCK	<ZipShort, ZipExtraField>
extraFields	TokenNameIdentifier	 extra Fields
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
UnparseableExtraFieldData	TokenNameIdentifier	 Unparseable Extra Field Data
unparseableExtra	TokenNameIdentifier	 unparseable Extra
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Creates a new zip entry with the specified name. * @param name the name of the entry * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Creates a new zip entry with the specified name. @param name the name of the entry @since 1.1 
public	TokenNamepublic	
ZipEntry	TokenNameIdentifier	 Zip Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new zip entry with fields taken from the specified zip entry. * @param entry the entry to get fields from * @since 1.1 * @throws ZipException on error */	TokenNameCOMMENT_JAVADOC	 Creates a new zip entry with fields taken from the specified zip entry. @param entry the entry to get fields from @since 1.1 @throws ZipException on error 
public	TokenNamepublic	
ZipEntry	TokenNameIdentifier	 Zip Entry
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipEntry	TokenNameIdentifier	 Zip Entry
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
throws	TokenNamethrows	
ZipException	TokenNameIdentifier	 Zip Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
extra	TokenNameIdentifier	 extra
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getExtra	TokenNameIdentifier	 get Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
extra	TokenNameIdentifier	 extra
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setExtraFields	TokenNameIdentifier	 set Extra Fields
(	TokenNameLPAREN	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
extra	TokenNameIdentifier	 extra
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
.	TokenNameDOT	
READ	TokenNameIdentifier	 READ
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// initializes extra data to an empty byte array 	TokenNameCOMMENT_LINE	initializes extra data to an empty byte array 
setExtra	TokenNameIdentifier	 set Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a new zip entry with fields taken from the specified zip entry. * @param entry the entry to get fields from * @throws ZipException on error * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Creates a new zip entry with fields taken from the specified zip entry. @param entry the entry to get fields from @throws ZipException on error @since 1.1 
public	TokenNamepublic	
ZipEntry	TokenNameIdentifier	 Zip Entry
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
throws	TokenNamethrows	
ZipException	TokenNameIdentifier	 Zip Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipEntry	TokenNameIdentifier	 Zip Entry
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setInternalAttributes	TokenNameIdentifier	 set Internal Attributes
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getInternalAttributes	TokenNameIdentifier	 get Internal Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setExternalAttributes	TokenNameIdentifier	 set External Attributes
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getExternalAttributes	TokenNameIdentifier	 get External Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setExtraFields	TokenNameIdentifier	 set Extra Fields
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @since 1.9 */	TokenNameCOMMENT_JAVADOC	 @since 1.9 
protected	TokenNameprotected	
ZipEntry	TokenNameIdentifier	 Zip Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Overwrite clone. * @return a cloned copy of this ZipEntry * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Overwrite clone. @return a cloned copy of this ZipEntry @since 1.1 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipEntry	TokenNameIdentifier	 Zip Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
setInternalAttributes	TokenNameIdentifier	 set Internal Attributes
(	TokenNameLPAREN	
getInternalAttributes	TokenNameIdentifier	 get Internal Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
setExternalAttributes	TokenNameIdentifier	 set External Attributes
(	TokenNameLPAREN	
getExternalAttributes	TokenNameIdentifier	 get External Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
setExtraFields	TokenNameIdentifier	 set Extra Fields
(	TokenNameLPAREN	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves the internal file attributes. * * @return the internal file attributes * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Retrieves the internal file attributes. * @return the internal file attributes @since 1.1 
public	TokenNamepublic	
int	TokenNameint	
getInternalAttributes	TokenNameIdentifier	 get Internal Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
internalAttributes	TokenNameIdentifier	 internal Attributes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the internal file attributes. * @param value an <code>int</code> value * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Sets the internal file attributes. @param value an <code>int</code> value @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
setInternalAttributes	TokenNameIdentifier	 set Internal Attributes
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internalAttributes	TokenNameIdentifier	 internal Attributes
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves the external file attributes. * @return the external file attributes * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Retrieves the external file attributes. @return the external file attributes @since 1.1 
public	TokenNamepublic	
long	TokenNamelong	
getExternalAttributes	TokenNameIdentifier	 get External Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
externalAttributes	TokenNameIdentifier	 external Attributes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the external file attributes. * @param value an <code>long</code> value * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Sets the external file attributes. @param value an <code>long</code> value @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
setExternalAttributes	TokenNameIdentifier	 set External Attributes
(	TokenNameLPAREN	
long	TokenNamelong	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
externalAttributes	TokenNameIdentifier	 external Attributes
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets Unix permissions in a way that is understood by Info-Zip's * unzip command. * @param mode an <code>int</code> value * @since Ant 1.5.2 */	TokenNameCOMMENT_JAVADOC	 Sets Unix permissions in a way that is understood by Info-Zip's unzip command. @param mode an <code>int</code> value @since Ant 1.5.2 
public	TokenNamepublic	
void	TokenNamevoid	
setUnixMode	TokenNameIdentifier	 set Unix Mode
(	TokenNameLPAREN	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// CheckStyle:MagicNumberCheck OFF - no point 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumberCheck OFF - no point 
setExternalAttributes	TokenNameIdentifier	 set External Attributes
(	TokenNameLPAREN	
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
<<	TokenNameLEFT_SHIFT	
SHORT_SHIFT	TokenNameIdentifier	 SHORT  SHIFT
)	TokenNameRPAREN	
// MS-DOS read-only attribute 	TokenNameCOMMENT_LINE	MS-DOS read-only attribute 
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
&	TokenNameAND	
0200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// MS-DOS directory flag 	TokenNameCOMMENT_LINE	MS-DOS directory flag 
|	TokenNameOR	
(	TokenNameLPAREN	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0x10	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumberCheck ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumberCheck ON 
platform	TokenNameIdentifier	 platform
=	TokenNameEQUAL	
PLATFORM_UNIX	TokenNameIdentifier	 PLATFORM  UNIX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Unix permission. * @return the unix permissions * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Unix permission. @return the unix permissions @since Ant 1.6 
public	TokenNamepublic	
int	TokenNameint	
getUnixMode	TokenNameIdentifier	 get Unix Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
platform	TokenNameIdentifier	 platform
!=	TokenNameNOT_EQUAL	
PLATFORM_UNIX	TokenNameIdentifier	 PLATFORM  UNIX
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
getExternalAttributes	TokenNameIdentifier	 get External Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
SHORT_SHIFT	TokenNameIdentifier	 SHORT  SHIFT
)	TokenNameRPAREN	
&	TokenNameAND	
SHORT_MASK	TokenNameIdentifier	 SHORT  MASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Platform specification to put into the &quot;version made * by&quot; part of the central file header. * * @return PLATFORM_FAT unless {@link #setUnixMode setUnixMode} * has been called, in which case PLATORM_UNIX will be returned. * * @since Ant 1.5.2 */	TokenNameCOMMENT_JAVADOC	 Platform specification to put into the &quot;version made by&quot; part of the central file header. * @return PLATFORM_FAT unless {@link #setUnixMode setUnixMode} has been called, in which case PLATORM_UNIX will be returned. * @since Ant 1.5.2 
public	TokenNamepublic	
int	TokenNameint	
getPlatform	TokenNameIdentifier	 get Platform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
platform	TokenNameIdentifier	 platform
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the platform (UNIX or FAT). * @param platform an <code>int</code> value - 0 is FAT, 3 is UNIX * @since 1.9 */	TokenNameCOMMENT_JAVADOC	 Set the platform (UNIX or FAT). @param platform an <code>int</code> value - 0 is FAT, 3 is UNIX @since 1.9 
protected	TokenNameprotected	
void	TokenNamevoid	
setPlatform	TokenNameIdentifier	 set Platform
(	TokenNameLPAREN	
int	TokenNameint	
platform	TokenNameIdentifier	 platform
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
platform	TokenNameIdentifier	 platform
=	TokenNameEQUAL	
platform	TokenNameIdentifier	 platform
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Replaces all currently attached extra fields with the new array. * @param fields an array of extra fields * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Replaces all currently attached extra fields with the new array. @param fields an array of extra fields @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
setExtraFields	TokenNameIdentifier	 set Extra Fields
(	TokenNameLPAREN	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extraFields	TokenNameIdentifier	 extra Fields
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
(	TokenNameLPAREN	
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
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
UnparseableExtraFieldData	TokenNameIdentifier	 Unparseable Extra Field Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unparseableExtra	TokenNameIdentifier	 unparseable Extra
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UnparseableExtraFieldData	TokenNameIdentifier	 Unparseable Extra Field Data
)	TokenNameRPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
extraFields	TokenNameIdentifier	 extra Fields
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getHeaderId	TokenNameIdentifier	 get Header Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
setExtra	TokenNameIdentifier	 set Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves all extra fields that have been parsed successfully. * @return an array of the extra fields */	TokenNameCOMMENT_JAVADOC	 Retrieves all extra fields that have been parsed successfully. @return an array of the extra fields 
public	TokenNamepublic	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves extra fields. * @param includeUnparseable whether to also return unparseable * extra fields as {@link UnparseableExtraFieldData} if such data * exists. * @return an array of the extra fields * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Retrieves extra fields. @param includeUnparseable whether to also return unparseable extra fields as {@link UnparseableExtraFieldData} if such data exists. @return an array of the extra fields @since 1.1 
public	TokenNamepublic	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
boolean	TokenNameboolean	
includeUnparseable	TokenNameIdentifier	 include Unparseable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
extraFields	TokenNameIdentifier	 extra Fields
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
includeUnparseable	TokenNameIdentifier	 include Unparseable
||	TokenNameOR_OR	
unparseableExtra	TokenNameIdentifier	 unparseable Extra
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
:	TokenNameCOLON	
new	TokenNamenew	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
unparseableExtra	TokenNameIdentifier	 unparseable Extra
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
extraFields	TokenNameIdentifier	 extra Fields
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
includeUnparseable	TokenNameIdentifier	 include Unparseable
&&	TokenNameAND_AND	
unparseableExtra	TokenNameIdentifier	 unparseable Extra
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
unparseableExtra	TokenNameIdentifier	 unparseable Extra
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds an extra field - replacing an already present extra field * of the same type. * * <p>If no extra field of the same type exists, the field will be * added as last field.</p> * @param ze an extra field * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Adds an extra field - replacing an already present extra field of the same type. * <p>If no extra field of the same type exists, the field will be added as last field.</p> @param ze an extra field @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
addExtraField	TokenNameIdentifier	 add Extra Field
(	TokenNameLPAREN	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
instanceof	TokenNameinstanceof	
UnparseableExtraFieldData	TokenNameIdentifier	 Unparseable Extra Field Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unparseableExtra	TokenNameIdentifier	 unparseable Extra
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UnparseableExtraFieldData	TokenNameIdentifier	 Unparseable Extra Field Data
)	TokenNameRPAREN	
ze	TokenNameIdentifier	 ze
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
extraFields	TokenNameIdentifier	 extra Fields
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extraFields	TokenNameIdentifier	 extra Fields
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
extraFields	TokenNameIdentifier	 extra Fields
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getHeaderId	TokenNameIdentifier	 get Header Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setExtra	TokenNameIdentifier	 set Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds an extra field - replacing an already present extra field * of the same type. * * <p>The new extra field will be the first one.</p> * @param ze an extra field * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Adds an extra field - replacing an already present extra field of the same type. * <p>The new extra field will be the first one.</p> @param ze an extra field @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
addAsFirstExtraField	TokenNameIdentifier	 add As First Extra Field
(	TokenNameLPAREN	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
instanceof	TokenNameinstanceof	
UnparseableExtraFieldData	TokenNameIdentifier	 Unparseable Extra Field Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unparseableExtra	TokenNameIdentifier	 unparseable Extra
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UnparseableExtraFieldData	TokenNameIdentifier	 Unparseable Extra Field Data
)	TokenNameRPAREN	
ze	TokenNameIdentifier	 ze
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
copy	TokenNameIdentifier	 copy
=	TokenNameEQUAL	
extraFields	TokenNameIdentifier	 extra Fields
;	TokenNameSEMICOLON	
extraFields	TokenNameIdentifier	 extra Fields
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
extraFields	TokenNameIdentifier	 extra Fields
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getHeaderId	TokenNameIdentifier	 get Header Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
copy	TokenNameIdentifier	 copy
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getHeaderId	TokenNameIdentifier	 get Header Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
extraFields	TokenNameIdentifier	 extra Fields
.	TokenNameDOT	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
copy	TokenNameIdentifier	 copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
setExtra	TokenNameIdentifier	 set Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove an extra field. * @param type the type of extra field to remove * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Remove an extra field. @param type the type of extra field to remove @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
removeExtraField	TokenNameIdentifier	 remove Extra Field
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
extraFields	TokenNameIdentifier	 extra Fields
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
extraFields	TokenNameIdentifier	 extra Fields
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setExtra	TokenNameIdentifier	 set Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes unparseable extra field data. */	TokenNameCOMMENT_JAVADOC	 Removes unparseable extra field data. 
public	TokenNamepublic	
void	TokenNamevoid	
removeUnparseableExtraFieldData	TokenNameIdentifier	 remove Unparseable Extra Field Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
unparseableExtra	TokenNameIdentifier	 unparseable Extra
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
unparseableExtra	TokenNameIdentifier	 unparseable Extra
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
setExtra	TokenNameIdentifier	 set Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Looks up an extra field by its header id. * * @return null if no such field exists. */	TokenNameCOMMENT_JAVADOC	 Looks up an extra field by its header id. * @return null if no such field exists. 
public	TokenNamepublic	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
getExtraField	TokenNameIdentifier	 get Extra Field
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
extraFields	TokenNameIdentifier	 extra Fields
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
)	TokenNameRPAREN	
extraFields	TokenNameIdentifier	 extra Fields
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Looks up extra field data that couldn't be parsed correctly. * * @return null if no such field exists. */	TokenNameCOMMENT_JAVADOC	 Looks up extra field data that couldn't be parsed correctly. * @return null if no such field exists. 
public	TokenNamepublic	
UnparseableExtraFieldData	TokenNameIdentifier	 Unparseable Extra Field Data
getUnparseableExtraFieldData	TokenNameIdentifier	 get Unparseable Extra Field Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
unparseableExtra	TokenNameIdentifier	 unparseable Extra
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses the given bytes as extra field data and consumes any * unparseable data as an {@link UnparseableExtraFieldData} * instance. * @param extra an array of bytes to be parsed into extra fields * @throws RuntimeException if the bytes cannot be parsed * @since 1.1 * @throws RuntimeException on error */	TokenNameCOMMENT_JAVADOC	 Parses the given bytes as extra field data and consumes any unparseable data as an {@link UnparseableExtraFieldData} instance. @param extra an array of bytes to be parsed into extra fields @throws RuntimeException if the bytes cannot be parsed @since 1.1 @throws RuntimeException on error 
public	TokenNamepublic	
void	TokenNamevoid	
setExtra	TokenNameIdentifier	 set Extra
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
extra	TokenNameIdentifier	 extra
)	TokenNameRPAREN	
throws	TokenNamethrows	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
local	TokenNameIdentifier	 local
=	TokenNameEQUAL	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
extra	TokenNameIdentifier	 extra
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
.	TokenNameDOT	
READ	TokenNameIdentifier	 READ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergeExtraFields	TokenNameIdentifier	 merge Extra Fields
(	TokenNameLPAREN	
local	TokenNameIdentifier	 local
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// actually this is not be possible as of Ant 1.8.1 	TokenNameCOMMENT_LINE	actually this is not be possible as of Ant 1.8.1 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Error parsing extra fields for entry: "	TokenNameStringLiteral	Error parsing extra fields for entry: 
+	TokenNamePLUS	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" - "	TokenNameStringLiteral	 - 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Unfortunately {@link java.util.zip.ZipOutputStream * java.util.zip.ZipOutputStream} seems to access the extra data * directly, so overriding getExtra doesn't help - we need to * modify super's data directly. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Unfortunately {@link java.util.zip.ZipOutputStream java.util.zip.ZipOutputStream} seems to access the extra data directly, so overriding getExtra doesn't help - we need to modify super's data directly. * @since 1.1 
protected	TokenNameprotected	
void	TokenNamevoid	
setExtra	TokenNameIdentifier	 set Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setExtra	TokenNameIdentifier	 set Extra
(	TokenNameLPAREN	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
mergeLocalFileDataData	TokenNameIdentifier	 merge Local File Data Data
(	TokenNameLPAREN	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the central directory part of extra fields. */	TokenNameCOMMENT_JAVADOC	 Sets the central directory part of extra fields. 
public	TokenNamepublic	
void	TokenNamevoid	
setCentralDirectoryExtra	TokenNameIdentifier	 set Central Directory Extra
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
central	TokenNameIdentifier	 central
=	TokenNameEQUAL	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
.	TokenNameDOT	
READ	TokenNameIdentifier	 READ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergeExtraFields	TokenNameIdentifier	 merge Extra Fields
(	TokenNameLPAREN	
central	TokenNameIdentifier	 central
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Retrieves the extra data for the local file data. * @return the extra data for local file * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Retrieves the extra data for the local file data. @return the extra data for local file @since 1.1 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLocalFileDataExtra	TokenNameIdentifier	 get Local File Data Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
extra	TokenNameIdentifier	 extra
=	TokenNameEQUAL	
getExtra	TokenNameIdentifier	 get Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
extra	TokenNameIdentifier	 extra
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
extra	TokenNameIdentifier	 extra
:	TokenNameCOLON	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves the extra data for the central directory. * @return the central directory extra data * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Retrieves the extra data for the central directory. @return the central directory extra data @since 1.1 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCentralDirectoryExtra	TokenNameIdentifier	 get Central Directory Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
mergeCentralDirectoryData	TokenNameIdentifier	 merge Central Directory Data
(	TokenNameLPAREN	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Make this class work in JDK 1.1 like a 1.2 class. * * <p>This either stores the size for later usage or invokes * setCompressedSize via reflection.</p> * @param size the size to use * @deprecated since 1.7. * Use setCompressedSize directly. * @since 1.2 */	TokenNameCOMMENT_JAVADOC	 Make this class work in JDK 1.1 like a 1.2 class. * <p>This either stores the size for later usage or invokes setCompressedSize via reflection.</p> @param size the size to use @deprecated since 1.7. Use setCompressedSize directly. @since 1.2 
public	TokenNamepublic	
void	TokenNamevoid	
setComprSize	TokenNameIdentifier	 set Compr Size
(	TokenNameLPAREN	
long	TokenNamelong	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setCompressedSize	TokenNameIdentifier	 set Compressed Size
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the name of the entry. * @return the entry name * @since 1.9 */	TokenNameCOMMENT_JAVADOC	 Get the name of the entry. @return the entry name @since 1.9 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
super	TokenNamesuper	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Is this entry a directory? * @return true if the entry is a directory * @since 1.10 */	TokenNameCOMMENT_JAVADOC	 Is this entry a directory? @return true if the entry is a directory @since 1.10 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the name of the entry. * @param name the name to use */	TokenNameCOMMENT_JAVADOC	 Set the name of the entry. @param name the name to use 
protected	TokenNameprotected	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the hashCode of the entry. * This uses the name as the hashcode. * @return a hashcode. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Get the hashCode of the entry. This uses the name as the hashcode. @return a hashcode. @since Ant 1.7 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this method has severe consequences on performance. We cannot rely 	TokenNameCOMMENT_LINE	this method has severe consequences on performance. We cannot rely 
// on the super.hashCode() method since super.getName() always return 	TokenNameCOMMENT_LINE	on the super.hashCode() method since super.getName() always return 
// the empty string in the current implemention (there's no setter) 	TokenNameCOMMENT_LINE	the empty string in the current implemention (there's no setter) 
// so it is basically draining the performance of a hashmap lookup 	TokenNameCOMMENT_LINE	so it is basically draining the performance of a hashmap lookup 
return	TokenNamereturn	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The equality method. In this case, the implementation returns 'this == o' * which is basically the equals method of the Object class. * @param o the object to compare to * @return true if this object is the same as <code>o</code> * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 The equality method. In this case, the implementation returns 'this == o' which is basically the equals method of the Object class. @param o the object to compare to @return true if this object is the same as <code>o</code> @since Ant 1.7 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If there are no extra fields, use the given fields as new extra * data - otherwise merge the fields assuming the existing fields * and the new fields stem from different locations inside the * archive. * @param f the extra fields to merge * @param local whether the new fields originate from local data */	TokenNameCOMMENT_JAVADOC	 If there are no extra fields, use the given fields as new extra data - otherwise merge the fields assuming the existing fields and the new fields stem from different locations inside the archive. @param f the extra fields to merge @param local whether the new fields originate from local data 
private	TokenNameprivate	
void	TokenNamevoid	
mergeExtraFields	TokenNameIdentifier	 merge Extra Fields
(	TokenNameLPAREN	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
boolean	TokenNameboolean	
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
throws	TokenNamethrows	
ZipException	TokenNameIdentifier	 Zip Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
extraFields	TokenNameIdentifier	 extra Fields
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setExtraFields	TokenNameIdentifier	 set Extra Fields
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
f	TokenNameIdentifier	 f
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
existing	TokenNameIdentifier	 existing
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
UnparseableExtraFieldData	TokenNameIdentifier	 Unparseable Extra Field Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
existing	TokenNameIdentifier	 existing
=	TokenNameEQUAL	
unparseableExtra	TokenNameIdentifier	 unparseable Extra
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
existing	TokenNameIdentifier	 existing
=	TokenNameEQUAL	
getExtraField	TokenNameIdentifier	 get Extra Field
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getHeaderId	TokenNameIdentifier	 get Header Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
existing	TokenNameIdentifier	 existing
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addExtraField	TokenNameIdentifier	 add Extra Field
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
local	TokenNameIdentifier	 local
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
existing	TokenNameIdentifier	 existing
instanceof	TokenNameinstanceof	
CentralDirectoryParsingZipExtraField	TokenNameIdentifier	 Central Directory Parsing Zip Extra Field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLocalFileDataData	TokenNameIdentifier	 get Local File Data Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
existing	TokenNameIdentifier	 existing
.	TokenNameDOT	
parseFromLocalFileData	TokenNameIdentifier	 parse From Local File Data
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getCentralDirectoryData	TokenNameIdentifier	 get Central Directory Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CentralDirectoryParsingZipExtraField	TokenNameIdentifier	 Central Directory Parsing Zip Extra Field
)	TokenNameRPAREN	
existing	TokenNameIdentifier	 existing
)	TokenNameRPAREN	
.	TokenNameDOT	
parseFromCentralDirectoryData	TokenNameIdentifier	 parse From Central Directory Data
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
setExtra	TokenNameIdentifier	 set Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
