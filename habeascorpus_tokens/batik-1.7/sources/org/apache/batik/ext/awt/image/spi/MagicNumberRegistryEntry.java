/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StreamCorruptedException	TokenNameIdentifier	 Stream Corrupted Exception
;	TokenNameSEMICOLON	
/** * This Image tag registry entry is built around the notion of magic * numbers. These are strings of bytes that are at a well known * location in the input stream (often the start). * * This base class can handle the compatiblity check based on a list * of Magic Numbers that correspond to your format (Some formats have * multiple magic numbers associated with them). * * @version $Id: MagicNumberRegistryEntry.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This Image tag registry entry is built around the notion of magic numbers. These are strings of bytes that are at a well known location in the input stream (often the start). * This base class can handle the compatiblity check based on a list of Magic Numbers that correspond to your format (Some formats have multiple magic numbers associated with them). * @version $Id: MagicNumberRegistryEntry.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
MagicNumberRegistryEntry	TokenNameIdentifier	 Magic Number Registry Entry
extends	TokenNameextends	
AbstractRegistryEntry	TokenNameIdentifier	 Abstract Registry Entry
implements	TokenNameimplements	
StreamRegistryEntry	TokenNameIdentifier	 Stream Registry Entry
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
PRIORITY	TokenNameIdentifier	 PRIORITY
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Inner class that represents one magic number. Simply consists * of an offset in bytes from the start of the file, and a byte * array that must match. */	TokenNameCOMMENT_JAVADOC	 Inner class that represents one magic number. Simply consists of an offset in bytes from the start of the file, and a byte array that must match. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
MagicNumber	TokenNameIdentifier	 Magic Number
{	TokenNameLBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
magicNumber	TokenNameIdentifier	 magic Number
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
/** * Constructor. * @param offset the location of the magic number in file. * @param magicNumber the sequence of bytes that must match. */	TokenNameCOMMENT_JAVADOC	 Constructor. @param offset the location of the magic number in file. @param magicNumber the sequence of bytes that must match. 
public	TokenNamepublic	
MagicNumber	TokenNameIdentifier	 Magic Number
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
magicNumber	TokenNameIdentifier	 magic Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
magicNumber	TokenNameIdentifier	 magic Number
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
magicNumber	TokenNameIdentifier	 magic Number
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
magicNumber	TokenNameIdentifier	 magic Number
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the maximum number of bytes that will be read for * this magic number compairison. */	TokenNameCOMMENT_JAVADOC	 Returns the maximum number of bytes that will be read for this magic number compairison. 
int	TokenNameint	
getReadlimit	TokenNameIdentifier	 get Readlimit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
magicNumber	TokenNameIdentifier	 magic Number
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs the check of is. */	TokenNameCOMMENT_JAVADOC	 Performs the check of is. 
boolean	TokenNameboolean	
isMatch	TokenNameIdentifier	 is Match
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
StreamCorruptedException	TokenNameIdentifier	 Stream Corrupted Exception
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
getReadlimit	TokenNameIdentifier	 get Readlimit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Skip to the offset location. 	TokenNameCOMMENT_LINE	Skip to the offset location. 
while	TokenNamewhile	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
rn	TokenNameIdentifier	 rn
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rn	TokenNameIdentifier	 rn
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
+=	TokenNamePLUS_EQUAL	
rn	TokenNameIdentifier	 rn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
rn	TokenNameIdentifier	 rn
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rn	TokenNameIdentifier	 rn
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
+=	TokenNamePLUS_EQUAL	
rn	TokenNameIdentifier	 rn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
magicNumber	TokenNameIdentifier	 magic Number
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
magicNumber	TokenNameIdentifier	 magic Number
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Make sure we always put back what we have read. 	TokenNameCOMMENT_LINE	Make sure we always put back what we have read. 
// If this throws an IOException then the current 	TokenNameCOMMENT_LINE	If this throws an IOException then the current 
// stream should be closed an reopend by the registry. 	TokenNameCOMMENT_LINE	stream should be closed an reopend by the registry. 
is	TokenNameIdentifier	 is
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
StreamCorruptedException	TokenNameIdentifier	 Stream Corrupted Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** The list of magic numbers associated with this entry */	TokenNameCOMMENT_JAVADOC	 The list of magic numbers associated with this entry 
MagicNumber	TokenNameIdentifier	 Magic Number
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
magicNumbers	TokenNameIdentifier	 magic Numbers
;	TokenNameSEMICOLON	
/** * Constructor, simplifies construction of entry when only * one extension and one magic number is required. * @param name Format Name * @param priority the priority of the RegistryEntry * @param ext Standard extension * @param mimeType the supported MIME type * @param offset Offset of magic number * @param magicNumber byte array to match. */	TokenNameCOMMENT_JAVADOC	 Constructor, simplifies construction of entry when only one extension and one magic number is required. @param name Format Name @param priority the priority of the RegistryEntry @param ext Standard extension @param mimeType the supported MIME type @param offset Offset of magic number @param magicNumber byte array to match. 
public	TokenNamepublic	
MagicNumberRegistryEntry	TokenNameIdentifier	 Magic Number Registry Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
float	TokenNamefloat	
priority	TokenNameIdentifier	 priority
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ext	TokenNameIdentifier	 ext
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
mimeType	TokenNameIdentifier	 mime Type
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
magicNumber	TokenNameIdentifier	 magic Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
priority	TokenNameIdentifier	 priority
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
,	TokenNameCOMMA	
mimeType	TokenNameIdentifier	 mime Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
magicNumbers	TokenNameIdentifier	 magic Numbers
=	TokenNameEQUAL	
new	TokenNamenew	
MagicNumber	TokenNameIdentifier	 Magic Number
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
magicNumbers	TokenNameIdentifier	 magic Numbers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
MagicNumber	TokenNameIdentifier	 Magic Number
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
magicNumber	TokenNameIdentifier	 magic Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor, simplifies construction of entry when only * one extension and one magic number is required. * @param name Format Name * @param ext Standard extension * @param mimeType the supported MIME type * @param offset Offset of magic number * @param magicNumber byte array to match. */	TokenNameCOMMENT_JAVADOC	 Constructor, simplifies construction of entry when only one extension and one magic number is required. @param name Format Name @param ext Standard extension @param mimeType the supported MIME type @param offset Offset of magic number @param magicNumber byte array to match. 
public	TokenNamepublic	
MagicNumberRegistryEntry	TokenNameIdentifier	 Magic Number Registry Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ext	TokenNameIdentifier	 ext
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
mimeType	TokenNameIdentifier	 mime Type
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
magicNumber	TokenNameIdentifier	 magic Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
PRIORITY	TokenNameIdentifier	 PRIORITY
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
,	TokenNameCOMMA	
mimeType	TokenNameIdentifier	 mime Type
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
magicNumber	TokenNameIdentifier	 magic Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor, simplifies construction of entry when only * one extension is required. * @param name Format Name * @param priority the priority of the RegistryEntry * @param ext Standard extension * @param mimeType the supported MIME type * @param magicNumbers Array of magic numbers any of which can match. */	TokenNameCOMMENT_JAVADOC	 Constructor, simplifies construction of entry when only one extension is required. @param name Format Name @param priority the priority of the RegistryEntry @param ext Standard extension @param mimeType the supported MIME type @param magicNumbers Array of magic numbers any of which can match. 
public	TokenNamepublic	
MagicNumberRegistryEntry	TokenNameIdentifier	 Magic Number Registry Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
float	TokenNamefloat	
priority	TokenNameIdentifier	 priority
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ext	TokenNameIdentifier	 ext
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
mimeType	TokenNameIdentifier	 mime Type
,	TokenNameCOMMA	
MagicNumber	TokenNameIdentifier	 Magic Number
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
magicNumbers	TokenNameIdentifier	 magic Numbers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
priority	TokenNameIdentifier	 priority
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
,	TokenNameCOMMA	
mimeType	TokenNameIdentifier	 mime Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
magicNumbers	TokenNameIdentifier	 magic Numbers
=	TokenNameEQUAL	
magicNumbers	TokenNameIdentifier	 magic Numbers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor, simplifies construction of entry when only * one extension is required. * @param name Format Name * @param ext Standard extension * @param mimeType the supported MIME type * @param magicNumbers Array of magic numbers any of which can match. */	TokenNameCOMMENT_JAVADOC	 Constructor, simplifies construction of entry when only one extension is required. @param name Format Name @param ext Standard extension @param mimeType the supported MIME type @param magicNumbers Array of magic numbers any of which can match. 
public	TokenNamepublic	
MagicNumberRegistryEntry	TokenNameIdentifier	 Magic Number Registry Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ext	TokenNameIdentifier	 ext
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
mimeType	TokenNameIdentifier	 mime Type
,	TokenNameCOMMA	
MagicNumber	TokenNameIdentifier	 Magic Number
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
magicNumbers	TokenNameIdentifier	 magic Numbers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
PRIORITY	TokenNameIdentifier	 PRIORITY
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
,	TokenNameCOMMA	
mimeType	TokenNameIdentifier	 mime Type
,	TokenNameCOMMA	
magicNumbers	TokenNameIdentifier	 magic Numbers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor, simplifies construction of entry when only * one magic number is required. * @param name Format Name * @param priority the priority of the RegistryEntry * @param exts Standard set of extensions * @param mimeTypes array of supported MIME types * @param offset Offset of magic number * @param magicNumber byte array to match. */	TokenNameCOMMENT_JAVADOC	 Constructor, simplifies construction of entry when only one magic number is required. @param name Format Name @param priority the priority of the RegistryEntry @param exts Standard set of extensions @param mimeTypes array of supported MIME types @param offset Offset of magic number @param magicNumber byte array to match. 
public	TokenNamepublic	
MagicNumberRegistryEntry	TokenNameIdentifier	 Magic Number Registry Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
float	TokenNamefloat	
priority	TokenNameIdentifier	 priority
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
exts	TokenNameIdentifier	 exts
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mimeTypes	TokenNameIdentifier	 mime Types
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
magicNumber	TokenNameIdentifier	 magic Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
priority	TokenNameIdentifier	 priority
,	TokenNameCOMMA	
exts	TokenNameIdentifier	 exts
,	TokenNameCOMMA	
mimeTypes	TokenNameIdentifier	 mime Types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
magicNumbers	TokenNameIdentifier	 magic Numbers
=	TokenNameEQUAL	
new	TokenNamenew	
MagicNumber	TokenNameIdentifier	 Magic Number
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
magicNumbers	TokenNameIdentifier	 magic Numbers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
MagicNumber	TokenNameIdentifier	 Magic Number
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
magicNumber	TokenNameIdentifier	 magic Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor, simplifies construction of entry when only * one magic number is required. * @param name Format Name * @param exts Standard set of extensions * @param mimeTypes array of supported MIME types * @param offset Offset of magic number * @param magicNumbers byte array to match. */	TokenNameCOMMENT_JAVADOC	 Constructor, simplifies construction of entry when only one magic number is required. @param name Format Name @param exts Standard set of extensions @param mimeTypes array of supported MIME types @param offset Offset of magic number @param magicNumbers byte array to match. 
public	TokenNamepublic	
MagicNumberRegistryEntry	TokenNameIdentifier	 Magic Number Registry Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
exts	TokenNameIdentifier	 exts
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mimeTypes	TokenNameIdentifier	 mime Types
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
magicNumbers	TokenNameIdentifier	 magic Numbers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
PRIORITY	TokenNameIdentifier	 PRIORITY
,	TokenNameCOMMA	
exts	TokenNameIdentifier	 exts
,	TokenNameCOMMA	
mimeTypes	TokenNameIdentifier	 mime Types
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
magicNumbers	TokenNameIdentifier	 magic Numbers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor * @param name Format Name * @param priority the priority of the RegistryEntry * @param exts Standard set of extensions * @param mimeTypes array of supported MIME types * @param magicNumbers array of magic numbers any of which can match. */	TokenNameCOMMENT_JAVADOC	 Constructor @param name Format Name @param priority the priority of the RegistryEntry @param exts Standard set of extensions @param mimeTypes array of supported MIME types @param magicNumbers array of magic numbers any of which can match. 
public	TokenNamepublic	
MagicNumberRegistryEntry	TokenNameIdentifier	 Magic Number Registry Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
float	TokenNamefloat	
priority	TokenNameIdentifier	 priority
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
exts	TokenNameIdentifier	 exts
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mimeTypes	TokenNameIdentifier	 mime Types
,	TokenNameCOMMA	
MagicNumber	TokenNameIdentifier	 Magic Number
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
magicNumbers	TokenNameIdentifier	 magic Numbers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
priority	TokenNameIdentifier	 priority
,	TokenNameCOMMA	
exts	TokenNameIdentifier	 exts
,	TokenNameCOMMA	
mimeTypes	TokenNameIdentifier	 mime Types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
magicNumbers	TokenNameIdentifier	 magic Numbers
=	TokenNameEQUAL	
magicNumbers	TokenNameIdentifier	 magic Numbers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor * @param name Format Name * @param exts Standard set of extensions * @param mimeTypes array of supported MIME types * @param magicNumbers array of magic numbers any of which can match. */	TokenNameCOMMENT_JAVADOC	 Constructor @param name Format Name @param exts Standard set of extensions @param mimeTypes array of supported MIME types @param magicNumbers array of magic numbers any of which can match. 
public	TokenNamepublic	
MagicNumberRegistryEntry	TokenNameIdentifier	 Magic Number Registry Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
exts	TokenNameIdentifier	 exts
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mimeTypes	TokenNameIdentifier	 mime Types
,	TokenNameCOMMA	
MagicNumber	TokenNameIdentifier	 Magic Number
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
magicNumbers	TokenNameIdentifier	 magic Numbers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
PRIORITY	TokenNameIdentifier	 PRIORITY
,	TokenNameCOMMA	
exts	TokenNameIdentifier	 exts
,	TokenNameCOMMA	
mimeTypes	TokenNameIdentifier	 mime Types
,	TokenNameCOMMA	
magicNumbers	TokenNameIdentifier	 magic Numbers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor, allows for overriding the default priority of * magic number entries. This should be needed very rarely since * magic number checks are fairly relyable and hence aren't usually * sensative to order issues. * @param name Format Name * @param exts Standard set of extensions * @param magicNumbers array of magic numbers any of which can match. * @param priority The priority of this entry (1000 is baseline) */	TokenNameCOMMENT_JAVADOC	 Constructor, allows for overriding the default priority of magic number entries. This should be needed very rarely since magic number checks are fairly relyable and hence aren't usually sensative to order issues. @param name Format Name @param exts Standard set of extensions @param magicNumbers array of magic numbers any of which can match. @param priority The priority of this entry (1000 is baseline) 
public	TokenNamepublic	
MagicNumberRegistryEntry	TokenNameIdentifier	 Magic Number Registry Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
exts	TokenNameIdentifier	 exts
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mimeTypes	TokenNameIdentifier	 mime Types
,	TokenNameCOMMA	
MagicNumber	TokenNameIdentifier	 Magic Number
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
magicNumbers	TokenNameIdentifier	 magic Numbers
,	TokenNameCOMMA	
float	TokenNamefloat	
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
priority	TokenNameIdentifier	 priority
,	TokenNameCOMMA	
exts	TokenNameIdentifier	 exts
,	TokenNameCOMMA	
mimeTypes	TokenNameIdentifier	 mime Types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
magicNumbers	TokenNameIdentifier	 magic Numbers
=	TokenNameEQUAL	
magicNumbers	TokenNameIdentifier	 magic Numbers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the maximume read ahead needed for all magic numbers. */	TokenNameCOMMENT_JAVADOC	 Returns the maximume read ahead needed for all magic numbers. 
public	TokenNamepublic	
int	TokenNameint	
getReadlimit	TokenNameIdentifier	 get Readlimit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
maxbuf	TokenNameIdentifier	 maxbuf
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
magicNumbers	TokenNameIdentifier	 magic Numbers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
req	TokenNameIdentifier	 req
=	TokenNameEQUAL	
magicNumbers	TokenNameIdentifier	 magic Numbers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getReadlimit	TokenNameIdentifier	 get Readlimit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
req	TokenNameIdentifier	 req
>	TokenNameGREATER	
maxbuf	TokenNameIdentifier	 maxbuf
)	TokenNameRPAREN	
maxbuf	TokenNameIdentifier	 maxbuf
=	TokenNameEQUAL	
req	TokenNameIdentifier	 req
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
maxbuf	TokenNameIdentifier	 maxbuf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if the stream contains an image that can be * handled by this format handler */	TokenNameCOMMENT_JAVADOC	 Check if the stream contains an image that can be handled by this format handler 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompatibleStream	TokenNameIdentifier	 is Compatible Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
StreamCorruptedException	TokenNameIdentifier	 Stream Corrupted Exception
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
magicNumbers	TokenNameIdentifier	 magic Numbers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
magicNumbers	TokenNameIdentifier	 magic Numbers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
isMatch	TokenNameIdentifier	 is Match
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
