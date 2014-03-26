/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ListIterator	TokenNameIdentifier	 List Iterator
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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
Adler32	TokenNameIdentifier	 Adler32
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
Checksum	TokenNameIdentifier	 Checksum
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * This class implements caching functionality for raster images. * * @author <a href="mailto:paul_evenblij@compuware.com">Paul Evenblij</a> * @version $Id: ImageCacher.java 498747 2007-01-22 18:56:19Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class implements caching functionality for raster images. * @author <a href="mailto:paul_evenblij@compuware.com">Paul Evenblij</a> @version $Id: ImageCacher.java 498747 2007-01-22 18:56:19Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ImageCacher	TokenNameIdentifier	 Image Cacher
implements	TokenNameimplements	
SVGSyntax	TokenNameIdentifier	 SVG Syntax
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
{	TokenNameLBRACE	
DOMTreeManager	TokenNameIdentifier	 DOM Tree Manager
domTreeManager	TokenNameIdentifier	 dom Tree Manager
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
imageCache	TokenNameIdentifier	 image Cache
;	TokenNameSEMICOLON	
Checksum	TokenNameIdentifier	 Checksum
checkSum	TokenNameIdentifier	 check Sum
;	TokenNameSEMICOLON	
/** * Creates an ImageCacher. */	TokenNameCOMMENT_JAVADOC	 Creates an ImageCacher. 
public	TokenNamepublic	
ImageCacher	TokenNameIdentifier	 Image Cacher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
imageCache	TokenNameIdentifier	 image Cache
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkSum	TokenNameIdentifier	 check Sum
=	TokenNameEQUAL	
new	TokenNamenew	
Adler32	TokenNameIdentifier	 Adler32
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an ImageCacher. * * @param domTreeManager the DOMTreeManager for the tree this cacher works on */	TokenNameCOMMENT_JAVADOC	 Creates an ImageCacher. * @param domTreeManager the DOMTreeManager for the tree this cacher works on 
public	TokenNamepublic	
ImageCacher	TokenNameIdentifier	 Image Cacher
(	TokenNameLPAREN	
DOMTreeManager	TokenNameIdentifier	 DOM Tree Manager
domTreeManager	TokenNameIdentifier	 dom Tree Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setDOMTreeManager	TokenNameIdentifier	 set DOM Tree Manager
(	TokenNameLPAREN	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the DOMTreeManager this cacher should work on. * * @param domTreeManager the DOMTreeManager for the tree this cacher works on */	TokenNameCOMMENT_JAVADOC	 Sets the DOMTreeManager this cacher should work on. * @param domTreeManager the DOMTreeManager for the tree this cacher works on 
public	TokenNamepublic	
void	TokenNamevoid	
setDOMTreeManager	TokenNameIdentifier	 set DOM Tree Manager
(	TokenNameLPAREN	
DOMTreeManager	TokenNameIdentifier	 DOM Tree Manager
domTreeManager	TokenNameIdentifier	 dom Tree Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
=	TokenNameEQUAL	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DOMTreeManager	TokenNameIdentifier	 DOM Tree Manager
getDOMTreeManager	TokenNameIdentifier	 get DOM Tree Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if the image is already in the cache, and * adds it if not. Returns a unique id for the entry. * * @param os the image as a byte stream * @param width the width of the image * @param height the height of the image * @param ctx the SVGGeneratorContext * * @return a URI for the image * @throws SVGGraphics2DIOException if an error occurs during image file i/o */	TokenNameCOMMENT_JAVADOC	 Checks if the image is already in the cache, and adds it if not. Returns a unique id for the entry. * @param os the image as a byte stream @param width the width of the image @param height the height of the image @param ctx the SVGGeneratorContext * @return a URI for the image @throws SVGGraphics2DIOException if an error occurs during image file i/o 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
throws	TokenNamethrows	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
{	TokenNameLBRACE	
// We determine a checksum value for the byte data, and use it 	TokenNameCOMMENT_LINE	We determine a checksum value for the byte data, and use it 
// as hash key for the image. This may not be unique, so we 	TokenNameCOMMENT_LINE	as hash key for the image. This may not be unique, so we 
// need to check on actual byte-for-byte equality as well. 	TokenNameCOMMENT_LINE	need to check on actual byte-for-byte equality as well. 
// The checksum will be sufficient in most cases. 	TokenNameCOMMENT_LINE	The checksum will be sufficient in most cases. 
int	TokenNameint	
checksum	TokenNameIdentifier	 checksum
=	TokenNameEQUAL	
getChecksum	TokenNameIdentifier	 get Checksum
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
checksum	TokenNameIdentifier	 checksum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
href	TokenNameIdentifier	 href
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
getCacheableData	TokenNameIdentifier	 get Cacheable Data
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LinkedList	TokenNameIdentifier	 Linked List
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LinkedList	TokenNameIdentifier	 Linked List
)	TokenNameRPAREN	
imageCache	TokenNameIdentifier	 image Cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Key not found: make a new key/value pair 	TokenNameCOMMENT_LINE	Key not found: make a new key/value pair 
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
imageCache	TokenNameIdentifier	 image Cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Key found: check if the image is already in the list 	TokenNameCOMMENT_LINE	Key found: check if the image is already in the list 
for	TokenNamefor	
(	TokenNameLPAREN	
ListIterator	TokenNameIdentifier	 List Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ImageCacheEntry	TokenNameIdentifier	 Image Cache Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ImageCacheEntry	TokenNameIdentifier	 Image Cache Entry
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
checksum	TokenNameIdentifier	 checksum
==	TokenNameEQUAL_EQUAL	
checksum	TokenNameIdentifier	 checksum
&&	TokenNameAND_AND	
imagesMatch	TokenNameIdentifier	 images Match
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
href	TokenNameIdentifier	 href
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
href	TokenNameIdentifier	 href
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
href	TokenNameIdentifier	 href
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Still no hit: add our own 	TokenNameCOMMENT_LINE	Still no hit: add our own 
ImageCacheEntry	TokenNameIdentifier	 Image Cache Entry
newEntry	TokenNameIdentifier	 new Entry
=	TokenNameEQUAL	
createEntry	TokenNameIdentifier	 create Entry
(	TokenNameLPAREN	
checksum	TokenNameIdentifier	 checksum
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newEntry	TokenNameIdentifier	 new Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
href	TokenNameIdentifier	 href
=	TokenNameEQUAL	
newEntry	TokenNameIdentifier	 new Entry
.	TokenNameDOT	
href	TokenNameIdentifier	 href
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
href	TokenNameIdentifier	 href
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an object which can be cached. * Implementation must determine which information * should actually be stored. * * @param os the byte stream which is to be coerced */	TokenNameCOMMENT_JAVADOC	 Returns an object which can be cached. Implementation must determine which information should actually be stored. * @param os the byte stream which is to be coerced 
abstract	TokenNameabstract	
Object	TokenNameIdentifier	 Object
getCacheableData	TokenNameIdentifier	 get Cacheable Data
(	TokenNameLPAREN	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Determines if two images are equal. * Interpretation of the objects referred to by * <code>o1</code> and <code>o2</code> is entirely * implementation-dependent. * * @param o1 object referring to one image * @param o2 object referring to the other image */	TokenNameCOMMENT_JAVADOC	 Determines if two images are equal. Interpretation of the objects referred to by <code>o1</code> and <code>o2</code> is entirely implementation-dependent. * @param o1 object referring to one image @param o2 object referring to the other image 
abstract	TokenNameabstract	
boolean	TokenNameboolean	
imagesMatch	TokenNameIdentifier	 images Match
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
throws	TokenNamethrows	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
;	TokenNameSEMICOLON	
/** * Creates a new entry for keeping in the cache. * * @param checksum the checksum from which the hash key is derived * @param data the data to be cached * @param width image width * @param height image height * @param ctx the SVGGeneratorContext */	TokenNameCOMMENT_JAVADOC	 Creates a new entry for keeping in the cache. * @param checksum the checksum from which the hash key is derived @param data the data to be cached @param width image width @param height image height @param ctx the SVGGeneratorContext 
abstract	TokenNameabstract	
ImageCacheEntry	TokenNameIdentifier	 Image Cache Entry
createEntry	TokenNameIdentifier	 create Entry
(	TokenNameLPAREN	
int	TokenNameint	
checksum	TokenNameIdentifier	 checksum
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
throws	TokenNamethrows	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
;	TokenNameSEMICOLON	
/** * Calculates a checksum value for the given data. */	TokenNameCOMMENT_JAVADOC	 Calculates a checksum value for the given data. 
int	TokenNameint	
getChecksum	TokenNameIdentifier	 get Checksum
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkSum	TokenNameIdentifier	 check Sum
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkSum	TokenNameIdentifier	 check Sum
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
checkSum	TokenNameIdentifier	 check Sum
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Instances of this class are created to keep track of the * set of images processed by the ImageHandler. Each entry * corresponds to one unique member of this set. */	TokenNameCOMMENT_JAVADOC	 Instances of this class are created to keep track of the set of images processed by the ImageHandler. Each entry corresponds to one unique member of this set. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ImageCacheEntry	TokenNameIdentifier	 Image Cache Entry
{	TokenNameLBRACE	
/** A checksum calculated for the data cached */	TokenNameCOMMENT_JAVADOC	 A checksum calculated for the data cached 
public	TokenNamepublic	
int	TokenNameint	
checksum	TokenNameIdentifier	 checksum
;	TokenNameSEMICOLON	
/** An implementation-dependent object referring to the data */	TokenNameCOMMENT_JAVADOC	 An implementation-dependent object referring to the data 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
/** A uri identifying the data */	TokenNameCOMMENT_JAVADOC	 A uri identifying the data 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
href	TokenNameIdentifier	 href
;	TokenNameSEMICOLON	
/** * Creates a new entry */	TokenNameCOMMENT_JAVADOC	 Creates a new entry 
ImageCacheEntry	TokenNameIdentifier	 Image Cache Entry
(	TokenNameLPAREN	
int	TokenNameint	
checksum	TokenNameIdentifier	 checksum
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
href	TokenNameIdentifier	 href
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
checksum	TokenNameIdentifier	 checksum
=	TokenNameEQUAL	
checksum	TokenNameIdentifier	 checksum
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
href	TokenNameIdentifier	 href
=	TokenNameEQUAL	
href	TokenNameIdentifier	 href
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Cache implementation for images embedded in the SVG file. */	TokenNameCOMMENT_JAVADOC	 Cache implementation for images embedded in the SVG file. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Embedded	TokenNameIdentifier	 Embedded
extends	TokenNameextends	
ImageCacher	TokenNameIdentifier	 Image Cacher
{	TokenNameLBRACE	
/** * Sets the DOMTreeManager this cacher should work on. * * @param domTreeManager the DOMTreeManager for the tree this cacher works on */	TokenNameCOMMENT_JAVADOC	 Sets the DOMTreeManager this cacher should work on. * @param domTreeManager the DOMTreeManager for the tree this cacher works on 
public	TokenNamepublic	
void	TokenNamevoid	
setDOMTreeManager	TokenNameIdentifier	 set DOM Tree Manager
(	TokenNameLPAREN	
DOMTreeManager	TokenNameIdentifier	 DOM Tree Manager
domTreeManager	TokenNameIdentifier	 dom Tree Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// A new DOMTreeManager implies a new cache, because we cache 	TokenNameCOMMENT_LINE	A new DOMTreeManager implies a new cache, because we cache 
// images in the SVG tree itself 	TokenNameCOMMENT_LINE	images in the SVG tree itself 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
!=	TokenNameNOT_EQUAL	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
=	TokenNameEQUAL	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
imageCache	TokenNameIdentifier	 image Cache
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
getCacheableData	TokenNameIdentifier	 get Cacheable Data
(	TokenNameLPAREN	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In order to have only one instance of the image data 	TokenNameCOMMENT_LINE	In order to have only one instance of the image data 
// in memory, we cache the entire xlink:href attribute value, 	TokenNameCOMMENT_LINE	in memory, we cache the entire xlink:href attribute value, 
// so we can just pass a reference to the tree manager. 	TokenNameCOMMENT_LINE	so we can just pass a reference to the tree manager. 
return	TokenNamereturn	
DATA_PROTOCOL_PNG_PREFIX	TokenNameIdentifier	 DATA  PROTOCOL  PNG  PREFIX
+	TokenNamePLUS	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
imagesMatch	TokenNameIdentifier	 images Match
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ImageCacheEntry	TokenNameIdentifier	 Image Cache Entry
createEntry	TokenNameIdentifier	 create Entry
(	TokenNameLPAREN	
int	TokenNameint	
checksum	TokenNameIdentifier	 checksum
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get a new unique id 	TokenNameCOMMENT_LINE	Get a new unique id 
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
idGenerator	TokenNameIdentifier	 id Generator
.	TokenNameDOT	
generateID	TokenNameIdentifier	 generate ID
(	TokenNameLPAREN	
ID_PREFIX_IMAGE	TokenNameIdentifier	 ID  PREFIX  IMAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add the image data reference to the <defs> section 	TokenNameCOMMENT_LINE	Add the image data reference to the <defs> section 
addToTree	TokenNameIdentifier	 add To Tree
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create new cache entry 	TokenNameCOMMENT_LINE	Create new cache entry 
return	TokenNamereturn	
new	TokenNamenew	
ImageCacheEntry	TokenNameIdentifier	 Image Cache Entry
(	TokenNameLPAREN	
checksum	TokenNameIdentifier	 checksum
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
SIGN_POUND	TokenNameIdentifier	 SIGN  POUND
+	TokenNamePLUS	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// <<<<<<<<<< error ?? 	TokenNameCOMMENT_LINE	<<<<<<<<<< error ?? 
}	TokenNameRBRACE	
/** * Adds a new image element to the defs section for cached images. */	TokenNameCOMMENT_JAVADOC	 Adds a new image element to the defs section for cached images. 
private	TokenNameprivate	
void	TokenNamevoid	
addToTree	TokenNameIdentifier	 add To Tree
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
href	TokenNameIdentifier	 href
,	TokenNameCOMMA	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
domFactory	TokenNameIdentifier	 dom Factory
=	TokenNameEQUAL	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
.	TokenNameDOT	
getDOMFactory	TokenNameIdentifier	 get DOM Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Element imageDefs = getImageDefs(domFactory, ctx); 	TokenNameCOMMENT_LINE	Element imageDefs = getImageDefs(domFactory, ctx); 
// Create and initialize the new image element 	TokenNameCOMMENT_LINE	Create and initialize the new image element 
Element	TokenNameIdentifier	 Element
imageElement	TokenNameIdentifier	 image Element
=	TokenNameEQUAL	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_IMAGE_TAG	TokenNameIdentifier	 SVG  IMAGE  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
imageElement	TokenNameIdentifier	 image Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
imageElement	TokenNameIdentifier	 image Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_WIDTH_ATTRIBUTE	TokenNameIdentifier	 SVG  WIDTH  ATTRIBUTE
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
imageElement	TokenNameIdentifier	 image Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_HEIGHT_ATTRIBUTE	TokenNameIdentifier	 SVG  HEIGHT  ATTRIBUTE
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
imageElement	TokenNameIdentifier	 image Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
DefaultImageHandler	TokenNameIdentifier	 Default Image Handler
.	TokenNameDOT	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
XLINK_HREF_QNAME	TokenNameIdentifier	 XLINK  HREF  QNAME
,	TokenNameCOMMA	
href	TokenNameIdentifier	 href
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// imageDefs.appendChild(imageElement); 	TokenNameCOMMENT_LINE	imageDefs.appendChild(imageElement); 
domTreeManager	TokenNameIdentifier	 dom Tree Manager
.	TokenNameDOT	
addOtherDef	TokenNameIdentifier	 add Other Def
(	TokenNameLPAREN	
imageElement	TokenNameIdentifier	 image Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the top level defs section dedicated to cached * embedded images, creating one if necessary. * This one very simply creates a new defs section for each image, * causing them to be spread throughout the entire SVG tree. * A nicer implementation would group all imageDefs sections into * one. */	TokenNameCOMMENT_JAVADOC	 Returns the top level defs section dedicated to cached embedded images, creating one if necessary. This one very simply creates a new defs section for each image, causing them to be spread throughout the entire SVG tree. A nicer implementation would group all imageDefs sections into one. 
/*private Element getImageDefs(Document domFactory, SVGGeneratorContext ctx) { Element imageDefs = domFactory.createElementNS(SVG_NAMESPACE_URI, SVG_DEFS_TAG); String id = ctx.idGenerator.generateID(ID_PREFIX_IMAGE_DEFS); imageDefs.setAttributeNS(null, SVG_ID_ATTRIBUTE, id); domTreeManager.appendGroup(imageDefs, null); return imageDefs; }*/	TokenNameCOMMENT_BLOCK	private Element getImageDefs(Document domFactory, SVGGeneratorContext ctx) { Element imageDefs = domFactory.createElementNS(SVG_NAMESPACE_URI, SVG_DEFS_TAG); String id = ctx.idGenerator.generateID(ID_PREFIX_IMAGE_DEFS); imageDefs.setAttributeNS(null, SVG_ID_ATTRIBUTE, id); domTreeManager.appendGroup(imageDefs, null); return imageDefs; }
}	TokenNameRBRACE	
/** * Cache implementation for file-based images. */	TokenNameCOMMENT_JAVADOC	 Cache implementation for file-based images. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
External	TokenNameIdentifier	 External
extends	TokenNameextends	
ImageCacher	TokenNameIdentifier	 Image Cacher
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
imageDir	TokenNameIdentifier	 image Dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
;	TokenNameSEMICOLON	
public	TokenNamepublic	
External	TokenNameIdentifier	 External
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
imageDir	TokenNameIdentifier	 image Dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
imageDir	TokenNameIdentifier	 image Dir
=	TokenNameEQUAL	
imageDir	TokenNameIdentifier	 image Dir
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
suffix	TokenNameIdentifier	 suffix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
getCacheableData	TokenNameIdentifier	 get Cacheable Data
(	TokenNameLPAREN	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
os	TokenNameIdentifier	 os
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
imagesMatch	TokenNameIdentifier	 images Match
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
throws	TokenNamethrows	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
FileInputStream	TokenNameIdentifier	 File Input Stream
imageStream	TokenNameIdentifier	 image Stream
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
)	TokenNameRPAREN	
o1	TokenNameIdentifier	 o1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
imageLen	TokenNameIdentifier	 image Len
=	TokenNameEQUAL	
imageStream	TokenNameIdentifier	 image Stream
.	TokenNameDOT	
available	TokenNameIdentifier	 available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
imageBytes	TokenNameIdentifier	 image Bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
imageLen	TokenNameIdentifier	 image Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
candidateBytes	TokenNameIdentifier	 candidate Bytes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
)	TokenNameRPAREN	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bytesRead	TokenNameIdentifier	 bytes Read
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bytesRead	TokenNameIdentifier	 bytes Read
!=	TokenNameNOT_EQUAL	
imageLen	TokenNameIdentifier	 image Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytesRead	TokenNameIdentifier	 bytes Read
+=	TokenNamePLUS_EQUAL	
imageStream	TokenNameIdentifier	 image Stream
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
imageBytes	TokenNameIdentifier	 image Bytes
,	TokenNameCOMMA	
bytesRead	TokenNameIdentifier	 bytes Read
,	TokenNameCOMMA	
imageLen	TokenNameIdentifier	 image Len
-	TokenNameMINUS	
bytesRead	TokenNameIdentifier	 bytes Read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
imageBytes	TokenNameIdentifier	 image Bytes
,	TokenNameCOMMA	
candidateBytes	TokenNameIdentifier	 candidate Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
(	TokenNameLPAREN	
ERR_READ	TokenNameIdentifier	 ERR  READ
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
)	TokenNameRPAREN	
o1	TokenNameIdentifier	 o1
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
match	TokenNameIdentifier	 match
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ImageCacheEntry	TokenNameIdentifier	 Image Cache Entry
createEntry	TokenNameIdentifier	 create Entry
(	TokenNameLPAREN	
int	TokenNameint	
checksum	TokenNameIdentifier	 checksum
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
throws	TokenNamethrows	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
{	TokenNameLBRACE	
// Create a new file in image directory 	TokenNameCOMMENT_LINE	Create a new file in image directory 
File	TokenNameIdentifier	 File
imageFile	TokenNameIdentifier	 image File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// While the files we are generating exist, try to create 	TokenNameCOMMENT_LINE	While the files we are generating exist, try to create 
// another unique id. 	TokenNameCOMMENT_LINE	another unique id. 
while	TokenNamewhile	
(	TokenNameLPAREN	
imageFile	TokenNameIdentifier	 image File
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fileId	TokenNameIdentifier	 file Id
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
idGenerator	TokenNameIdentifier	 id Generator
.	TokenNameDOT	
generateID	TokenNameIdentifier	 generate ID
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
imageFile	TokenNameIdentifier	 image File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
imageDir	TokenNameIdentifier	 image Dir
,	TokenNameCOMMA	
fileId	TokenNameIdentifier	 file Id
+	TokenNamePLUS	
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
imageFile	TokenNameIdentifier	 image File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
imageFile	TokenNameIdentifier	 image File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Write data to file 	TokenNameCOMMENT_LINE	Write data to file 
OutputStream	TokenNameIdentifier	 Output Stream
outputStream	TokenNameIdentifier	 output Stream
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
imageFile	TokenNameIdentifier	 image File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
.	TokenNameDOT	
writeTo	TokenNameIdentifier	 write To
(	TokenNameLPAREN	
outputStream	TokenNameIdentifier	 output Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DIOException	TokenNameIdentifier	 SVG Graphics2 DIO Exception
(	TokenNameLPAREN	
ERR_WRITE	TokenNameIdentifier	 ERR  WRITE
+	TokenNamePLUS	
imageFile	TokenNameIdentifier	 image File
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Create new cache entry 	TokenNameCOMMENT_LINE	Create new cache entry 
return	TokenNamereturn	
new	TokenNamenew	
ImageCacheEntry	TokenNameIdentifier	 Image Cache Entry
(	TokenNameLPAREN	
checksum	TokenNameIdentifier	 checksum
,	TokenNameCOMMA	
imageFile	TokenNameIdentifier	 image File
,	TokenNameCOMMA	
imageFile	TokenNameIdentifier	 image File
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// <<<<<<<<<< error ?? 	TokenNameCOMMENT_LINE	<<<<<<<<<< error ?? 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
