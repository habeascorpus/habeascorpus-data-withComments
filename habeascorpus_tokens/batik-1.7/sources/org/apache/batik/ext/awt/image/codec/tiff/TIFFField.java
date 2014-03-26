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
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
tiff	TokenNameIdentifier	 tiff
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * A class representing a field in a TIFF 6.0 Image File Directory. * * <p> The TIFF file format is described in more detail in the * comments for the TIFFDescriptor class. * * <p> A field in a TIFF Image File Directory (IFD). A field is defined * as a sequence of values of identical data type. TIFF 6.0 defines * 12 data types, which are mapped internally onto the Java datatypes * byte, int, long, float, and double. * * <p><b> This class is not a committed part of the JAI API. It may * be removed or changed in future releases of JAI.</b> * * @see TIFFDirectory * @version $Id: TIFFField.java 501495 2007-01-30 18:00:36Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A class representing a field in a TIFF 6.0 Image File Directory. * <p> The TIFF file format is described in more detail in the comments for the TIFFDescriptor class. * <p> A field in a TIFF Image File Directory (IFD). A field is defined as a sequence of values of identical data type. TIFF 6.0 defines 12 data types, which are mapped internally onto the Java datatypes byte, int, long, float, and double. * <p><b> This class is not a committed part of the JAI API. It may be removed or changed in future releases of JAI.</b> * @see TIFFDirectory @version $Id: TIFFField.java 501495 2007-01-30 18:00:36Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TIFFField	TokenNameIdentifier	 TIFF Field
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** Flag for 8 bit unsigned integers. */	TokenNameCOMMENT_JAVADOC	 Flag for 8 bit unsigned integers. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_BYTE	TokenNameIdentifier	 TIFF  BYTE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Flag for null-terminated ASCII strings. */	TokenNameCOMMENT_JAVADOC	 Flag for null-terminated ASCII strings. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_ASCII	TokenNameIdentifier	 TIFF  ASCII
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Flag for 16 bit unsigned integers. */	TokenNameCOMMENT_JAVADOC	 Flag for 16 bit unsigned integers. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_SHORT	TokenNameIdentifier	 TIFF  SHORT
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Flag for 32 bit unsigned integers. */	TokenNameCOMMENT_JAVADOC	 Flag for 32 bit unsigned integers. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_LONG	TokenNameIdentifier	 TIFF  LONG
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Flag for pairs of 32 bit unsigned integers. */	TokenNameCOMMENT_JAVADOC	 Flag for pairs of 32 bit unsigned integers. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_RATIONAL	TokenNameIdentifier	 TIFF  RATIONAL
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Flag for 8 bit signed integers. */	TokenNameCOMMENT_JAVADOC	 Flag for 8 bit signed integers. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_SBYTE	TokenNameIdentifier	 TIFF  SBYTE
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Flag for 8 bit uninterpreted bytes. */	TokenNameCOMMENT_JAVADOC	 Flag for 8 bit uninterpreted bytes. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_UNDEFINED	TokenNameIdentifier	 TIFF  UNDEFINED
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Flag for 16 bit signed integers. */	TokenNameCOMMENT_JAVADOC	 Flag for 16 bit signed integers. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_SSHORT	TokenNameIdentifier	 TIFF  SSHORT
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Flag for 32 bit signed integers. */	TokenNameCOMMENT_JAVADOC	 Flag for 32 bit signed integers. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_SLONG	TokenNameIdentifier	 TIFF  SLONG
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Flag for pairs of 32 bit signed integers. */	TokenNameCOMMENT_JAVADOC	 Flag for pairs of 32 bit signed integers. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_SRATIONAL	TokenNameIdentifier	 TIFF  SRATIONAL
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Flag for 32 bit IEEE floats. */	TokenNameCOMMENT_JAVADOC	 Flag for 32 bit IEEE floats. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_FLOAT	TokenNameIdentifier	 TIFF  FLOAT
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Flag for 64 bit IEEE doubles. */	TokenNameCOMMENT_JAVADOC	 Flag for 64 bit IEEE doubles. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_DOUBLE	TokenNameIdentifier	 TIFF  DOUBLE
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The tag number. */	TokenNameCOMMENT_JAVADOC	 The tag number. 
int	TokenNameint	
tag	TokenNameIdentifier	 tag
;	TokenNameSEMICOLON	
/** The tag type. */	TokenNameCOMMENT_JAVADOC	 The tag type. 
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** The number of data items present in the field. */	TokenNameCOMMENT_JAVADOC	 The number of data items present in the field. 
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
/** The field data. */	TokenNameCOMMENT_JAVADOC	 The field data. 
Object	TokenNameIdentifier	 Object
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
/** The default constructor. */	TokenNameCOMMENT_JAVADOC	 The default constructor. 
TIFFField	TokenNameIdentifier	 TIFF Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Constructs a TIFFField with arbitrary data. The data * parameter must be an array of a Java type appropriate for the * type of the TIFF field. Since there is no available 32-bit * unsigned datatype, long is used. The mapping between types is * as follows: * * <table border=1> * <tr> * <th> TIFF type </th> <th> Java type </th> * <tr> * <td><tt>TIFF_BYTE</tt></td> <td><tt>byte</tt></td> * <tr> * <td><tt>TIFF_ASCII</tt></td> <td><tt>String</tt></td> * <tr> * <td><tt>TIFF_SHORT</tt></td> <td><tt>char</tt></td> * <tr> * <td><tt>TIFF_LONG</tt></td> <td><tt>long</tt></td> * <tr> * <td><tt>TIFF_RATIONAL</tt></td> <td><tt>long[2]</tt></td> * <tr> * <td><tt>TIFF_SBYTE</tt></td> <td><tt>byte</tt></td> * <tr> * <td><tt>TIFF_UNDEFINED</tt></td> <td><tt>byte</tt></td> * <tr> * <td><tt>TIFF_SSHORT</tt></td> <td><tt>short</tt></td> * <tr> * <td><tt>TIFF_SLONG</tt></td> <td><tt>int</tt></td> * <tr> * <td><tt>TIFF_SRATIONAL</tt></td> <td><tt>int[2]</tt></td> * <tr> * <td><tt>TIFF_FLOAT</tt></td> <td><tt>float</tt></td> * <tr> * <td><tt>TIFF_DOUBLE</tt></td> <td><tt>double</tt></td> * </table> */	TokenNameCOMMENT_JAVADOC	 Constructs a TIFFField with arbitrary data. The data parameter must be an array of a Java type appropriate for the type of the TIFF field. Since there is no available 32-bit unsigned datatype, long is used. The mapping between types is as follows: * <table border=1> <tr> <th> TIFF type </th> <th> Java type </th> <tr> <td><tt>TIFF_BYTE</tt></td> <td><tt>byte</tt></td> <tr> <td><tt>TIFF_ASCII</tt></td> <td><tt>String</tt></td> <tr> <td><tt>TIFF_SHORT</tt></td> <td><tt>char</tt></td> <tr> <td><tt>TIFF_LONG</tt></td> <td><tt>long</tt></td> <tr> <td><tt>TIFF_RATIONAL</tt></td> <td><tt>long[2]</tt></td> <tr> <td><tt>TIFF_SBYTE</tt></td> <td><tt>byte</tt></td> <tr> <td><tt>TIFF_UNDEFINED</tt></td> <td><tt>byte</tt></td> <tr> <td><tt>TIFF_SSHORT</tt></td> <td><tt>short</tt></td> <tr> <td><tt>TIFF_SLONG</tt></td> <td><tt>int</tt></td> <tr> <td><tt>TIFF_SRATIONAL</tt></td> <td><tt>int[2]</tt></td> <tr> <td><tt>TIFF_FLOAT</tt></td> <td><tt>float</tt></td> <tr> <td><tt>TIFF_DOUBLE</tt></td> <td><tt>double</tt></td> </table> 
public	TokenNamepublic	
TIFFField	TokenNameIdentifier	 TIFF Field
(	TokenNameLPAREN	
int	TokenNameint	
tag	TokenNameIdentifier	 tag
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tag	TokenNameIdentifier	 tag
=	TokenNameEQUAL	
tag	TokenNameIdentifier	 tag
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the tag number, between 0 and 65535. */	TokenNameCOMMENT_JAVADOC	 Returns the tag number, between 0 and 65535. 
public	TokenNamepublic	
int	TokenNameint	
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tag	TokenNameIdentifier	 tag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the type of the data stored in the IFD. * For a TIFF6.0 file, the value will equal one of the * TIFF_ constants defined in this class. For future * revisions of TIFF, higher values are possible. * */	TokenNameCOMMENT_JAVADOC	 Returns the type of the data stored in the IFD. For a TIFF6.0 file, the value will equal one of the TIFF_ constants defined in this class. For future revisions of TIFF, higher values are possible. 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of elements in the IFD. */	TokenNameCOMMENT_JAVADOC	 Returns the number of elements in the IFD. 
public	TokenNamepublic	
int	TokenNameint	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the data as an uninterpreted array of bytes. * The type of the field must be one of TIFF_BYTE, TIFF_SBYTE, * or TIFF_UNDEFINED; * * <p> For data in TIFF_BYTE format, the application must take * care when promoting the data to longer integral types * to avoid sign extension. * * <p> A ClassCastException will be thrown if the field is not * of type TIFF_BYTE, TIFF_SBYTE, or TIFF_UNDEFINED. */	TokenNameCOMMENT_JAVADOC	 Returns the data as an uninterpreted array of bytes. The type of the field must be one of TIFF_BYTE, TIFF_SBYTE, or TIFF_UNDEFINED; * <p> For data in TIFF_BYTE format, the application must take care when promoting the data to longer integral types to avoid sign extension. * <p> A ClassCastException will be thrown if the field is not of type TIFF_BYTE, TIFF_SBYTE, or TIFF_UNDEFINED. 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAsBytes	TokenNameIdentifier	 get As Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns TIFF_SHORT data as an array of chars (unsigned 16-bit * integers). * * <p> A ClassCastException will be thrown if the field is not * of type TIFF_SHORT. */	TokenNameCOMMENT_JAVADOC	 Returns TIFF_SHORT data as an array of chars (unsigned 16-bit integers). * <p> A ClassCastException will be thrown if the field is not of type TIFF_SHORT. 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAsChars	TokenNameIdentifier	 get As Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns TIFF_SSHORT data as an array of shorts (signed 16-bit * integers). * * <p> A ClassCastException will be thrown if the field is not * of type TIFF_SSHORT. */	TokenNameCOMMENT_JAVADOC	 Returns TIFF_SSHORT data as an array of shorts (signed 16-bit integers). * <p> A ClassCastException will be thrown if the field is not of type TIFF_SSHORT. 
public	TokenNamepublic	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAsShorts	TokenNameIdentifier	 get As Shorts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns TIFF_SLONG data as an array of ints (signed 32-bit * integers). * * <p> A ClassCastException will be thrown if the field is not * of type TIFF_SLONG. */	TokenNameCOMMENT_JAVADOC	 Returns TIFF_SLONG data as an array of ints (signed 32-bit integers). * <p> A ClassCastException will be thrown if the field is not of type TIFF_SLONG. 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAsInts	TokenNameIdentifier	 get As Ints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns TIFF_LONG data as an array of longs (signed 64-bit * integers). * * <p> A ClassCastException will be thrown if the field is not * of type TIFF_LONG. */	TokenNameCOMMENT_JAVADOC	 Returns TIFF_LONG data as an array of longs (signed 64-bit integers). * <p> A ClassCastException will be thrown if the field is not of type TIFF_LONG. 
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAsLongs	TokenNameIdentifier	 get As Longs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns TIFF_FLOAT data as an array of floats. * * <p> A ClassCastException will be thrown if the field is not * of type TIFF_FLOAT. */	TokenNameCOMMENT_JAVADOC	 Returns TIFF_FLOAT data as an array of floats. * <p> A ClassCastException will be thrown if the field is not of type TIFF_FLOAT. 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAsFloats	TokenNameIdentifier	 get As Floats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns TIFF_DOUBLE data as an array of doubles. * * <p> A ClassCastException will be thrown if the field is not * of type TIFF_DOUBLE. */	TokenNameCOMMENT_JAVADOC	 Returns TIFF_DOUBLE data as an array of doubles. * <p> A ClassCastException will be thrown if the field is not of type TIFF_DOUBLE. 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAsDoubles	TokenNameIdentifier	 get As Doubles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns TIFF_SRATIONAL data as an array of 2-element arrays of ints. * * <p> A ClassCastException will be thrown if the field is not * of type TIFF_SRATIONAL. */	TokenNameCOMMENT_JAVADOC	 Returns TIFF_SRATIONAL data as an array of 2-element arrays of ints. * <p> A ClassCastException will be thrown if the field is not of type TIFF_SRATIONAL. 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAsSRationals	TokenNameIdentifier	 get As S Rationals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns TIFF_RATIONAL data as an array of 2-element arrays of longs. * * <p> A ClassCastException will be thrown if the field is not * of type TIFF_RATTIONAL. */	TokenNameCOMMENT_JAVADOC	 Returns TIFF_RATIONAL data as an array of 2-element arrays of longs. * <p> A ClassCastException will be thrown if the field is not of type TIFF_RATTIONAL. 
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAsRationals	TokenNameIdentifier	 get As Rationals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns data in TIFF_BYTE, TIFF_SBYTE, TIFF_UNDEFINED, TIFF_SHORT, * TIFF_SSHORT, or TIFF_SLONG format as an int. * * <p> TIFF_BYTE and TIFF_UNDEFINED data are treated as unsigned; * that is, no sign extension will take place and the returned * value will be in the range [0, 255]. TIFF_SBYTE data will * be returned in the range [-128, 127]. * * <p> A ClassCastException will be thrown if the field is not of * type TIFF_BYTE, TIFF_SBYTE, TIFF_UNDEFINED, TIFF_SHORT, * TIFF_SSHORT, or TIFF_SLONG. */	TokenNameCOMMENT_JAVADOC	 Returns data in TIFF_BYTE, TIFF_SBYTE, TIFF_UNDEFINED, TIFF_SHORT, TIFF_SSHORT, or TIFF_SLONG format as an int. * <p> TIFF_BYTE and TIFF_UNDEFINED data are treated as unsigned; that is, no sign extension will take place and the returned value will be in the range [0, 255]. TIFF_SBYTE data will be returned in the range [-128, 127]. * <p> A ClassCastException will be thrown if the field is not of type TIFF_BYTE, TIFF_SBYTE, TIFF_UNDEFINED, TIFF_SHORT, TIFF_SSHORT, or TIFF_SLONG. 
public	TokenNamepublic	
int	TokenNameint	
getAsInt	TokenNameIdentifier	 get As Int
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TIFF_BYTE	TokenNameIdentifier	 TIFF  BYTE
:	TokenNameCOLON	
case	TokenNamecase	
TIFF_UNDEFINED	TokenNameIdentifier	 TIFF  UNDEFINED
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_SBYTE	TokenNameIdentifier	 TIFF  SBYTE
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_SHORT	TokenNameIdentifier	 TIFF  SHORT
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
&	TokenNameAND	
0xffff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_SSHORT	TokenNameIdentifier	 TIFF  SSHORT
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_SLONG	TokenNameIdentifier	 TIFF  SLONG
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns data in TIFF_BYTE, TIFF_SBYTE, TIFF_UNDEFINED, TIFF_SHORT, * TIFF_SSHORT, TIFF_SLONG, or TIFF_LONG format as a long. * * <p> TIFF_BYTE and TIFF_UNDEFINED data are treated as unsigned; * that is, no sign extension will take place and the returned * value will be in the range [0, 255]. TIFF_SBYTE data will * be returned in the range [-128, 127]. * * <p> A ClassCastException will be thrown if the field is not of * type TIFF_BYTE, TIFF_SBYTE, TIFF_UNDEFINED, TIFF_SHORT, * TIFF_SSHORT, TIFF_SLONG, or TIFF_LONG. */	TokenNameCOMMENT_JAVADOC	 Returns data in TIFF_BYTE, TIFF_SBYTE, TIFF_UNDEFINED, TIFF_SHORT, TIFF_SSHORT, TIFF_SLONG, or TIFF_LONG format as a long. * <p> TIFF_BYTE and TIFF_UNDEFINED data are treated as unsigned; that is, no sign extension will take place and the returned value will be in the range [0, 255]. TIFF_SBYTE data will be returned in the range [-128, 127]. * <p> A ClassCastException will be thrown if the field is not of type TIFF_BYTE, TIFF_SBYTE, TIFF_UNDEFINED, TIFF_SHORT, TIFF_SSHORT, TIFF_SLONG, or TIFF_LONG. 
public	TokenNamepublic	
long	TokenNamelong	
getAsLong	TokenNameIdentifier	 get As Long
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TIFF_BYTE	TokenNameIdentifier	 TIFF  BYTE
:	TokenNameCOLON	
case	TokenNamecase	
TIFF_UNDEFINED	TokenNameIdentifier	 TIFF  UNDEFINED
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_SBYTE	TokenNameIdentifier	 TIFF  SBYTE
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_SHORT	TokenNameIdentifier	 TIFF  SHORT
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
&	TokenNameAND	
0xffff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_SSHORT	TokenNameIdentifier	 TIFF  SSHORT
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_SLONG	TokenNameIdentifier	 TIFF  SLONG
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_LONG	TokenNameIdentifier	 TIFF  LONG
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns data in any numerical format as a float. Data in * TIFF_SRATIONAL or TIFF_RATIONAL format are evaluated by * dividing the numerator into the denominator using * double-precision arithmetic and then truncating to single * precision. Data in TIFF_SLONG, TIFF_LONG, or TIFF_DOUBLE * format may suffer from truncation. * * <p> A ClassCastException will be thrown if the field is * of type TIFF_UNDEFINED or TIFF_ASCII. */	TokenNameCOMMENT_JAVADOC	 Returns data in any numerical format as a float. Data in TIFF_SRATIONAL or TIFF_RATIONAL format are evaluated by dividing the numerator into the denominator using double-precision arithmetic and then truncating to single precision. Data in TIFF_SLONG, TIFF_LONG, or TIFF_DOUBLE format may suffer from truncation. * <p> A ClassCastException will be thrown if the field is of type TIFF_UNDEFINED or TIFF_ASCII. 
public	TokenNamepublic	
float	TokenNamefloat	
getAsFloat	TokenNameIdentifier	 get As Float
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TIFF_BYTE	TokenNameIdentifier	 TIFF  BYTE
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_SBYTE	TokenNameIdentifier	 TIFF  SBYTE
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_SHORT	TokenNameIdentifier	 TIFF  SHORT
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
&	TokenNameAND	
0xffff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_SSHORT	TokenNameIdentifier	 TIFF  SSHORT
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_SLONG	TokenNameIdentifier	 TIFF  SLONG
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_LONG	TokenNameIdentifier	 TIFF  LONG
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_FLOAT	TokenNameIdentifier	 TIFF  FLOAT
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_DOUBLE	TokenNameIdentifier	 TIFF  DOUBLE
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_SRATIONAL	TokenNameIdentifier	 TIFF  SRATIONAL
:	TokenNameCOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ivalue	TokenNameIdentifier	 ivalue
=	TokenNameEQUAL	
getAsSRational	TokenNameIdentifier	 get As S Rational
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
ivalue	TokenNameIdentifier	 ivalue
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
ivalue	TokenNameIdentifier	 ivalue
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_RATIONAL	TokenNameIdentifier	 TIFF  RATIONAL
:	TokenNameCOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lvalue	TokenNameIdentifier	 lvalue
=	TokenNameEQUAL	
getAsRational	TokenNameIdentifier	 get As Rational
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
lvalue	TokenNameIdentifier	 lvalue
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
lvalue	TokenNameIdentifier	 lvalue
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns data in any numerical format as a float. Data in * TIFF_SRATIONAL or TIFF_RATIONAL format are evaluated by * dividing the numerator into the denominator using * double-precision arithmetic. * * <p> A ClassCastException will be thrown if the field is of * type TIFF_UNDEFINED or TIFF_ASCII. */	TokenNameCOMMENT_JAVADOC	 Returns data in any numerical format as a float. Data in TIFF_SRATIONAL or TIFF_RATIONAL format are evaluated by dividing the numerator into the denominator using double-precision arithmetic. * <p> A ClassCastException will be thrown if the field is of type TIFF_UNDEFINED or TIFF_ASCII. 
public	TokenNamepublic	
double	TokenNamedouble	
getAsDouble	TokenNameIdentifier	 get As Double
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TIFF_BYTE	TokenNameIdentifier	 TIFF  BYTE
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_SBYTE	TokenNameIdentifier	 TIFF  SBYTE
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_SHORT	TokenNameIdentifier	 TIFF  SHORT
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
&	TokenNameAND	
0xffff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_SSHORT	TokenNameIdentifier	 TIFF  SSHORT
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_SLONG	TokenNameIdentifier	 TIFF  SLONG
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_LONG	TokenNameIdentifier	 TIFF  LONG
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_FLOAT	TokenNameIdentifier	 TIFF  FLOAT
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_DOUBLE	TokenNameIdentifier	 TIFF  DOUBLE
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_SRATIONAL	TokenNameIdentifier	 TIFF  SRATIONAL
:	TokenNameCOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ivalue	TokenNameIdentifier	 ivalue
=	TokenNameEQUAL	
getAsSRational	TokenNameIdentifier	 get As S Rational
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
ivalue	TokenNameIdentifier	 ivalue
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
ivalue	TokenNameIdentifier	 ivalue
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_RATIONAL	TokenNameIdentifier	 TIFF  RATIONAL
:	TokenNameCOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lvalue	TokenNameIdentifier	 lvalue
=	TokenNameEQUAL	
getAsRational	TokenNameIdentifier	 get As Rational
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
lvalue	TokenNameIdentifier	 lvalue
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
lvalue	TokenNameIdentifier	 lvalue
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a TIFF_ASCII data item as a String. * * <p> A ClassCastException will be thrown if the field is not * of type TIFF_ASCII. */	TokenNameCOMMENT_JAVADOC	 Returns a TIFF_ASCII data item as a String. * <p> A ClassCastException will be thrown if the field is not of type TIFF_ASCII. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAsString	TokenNameIdentifier	 get As String
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a TIFF_SRATIONAL data item as a two-element array * of ints. * * <p> A ClassCastException will be thrown if the field is not * of type TIFF_SRATIONAL. */	TokenNameCOMMENT_JAVADOC	 Returns a TIFF_SRATIONAL data item as a two-element array of ints. * <p> A ClassCastException will be thrown if the field is not of type TIFF_SRATIONAL. 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAsSRational	TokenNameIdentifier	 get As S Rational
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a TIFF_RATIONAL data item as a two-element array * of ints. * * <p> A ClassCastException will be thrown if the field is not * of type TIFF_RATIONAL. */	TokenNameCOMMENT_JAVADOC	 Returns a TIFF_RATIONAL data item as a two-element array of ints. * <p> A ClassCastException will be thrown if the field is not of type TIFF_RATIONAL. 
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAsRational	TokenNameIdentifier	 get As Rational
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares this <code>TIFFField</code> with another * <code>TIFFField</code> by comparing the tags. * * <p><b>Note: this class has a natural ordering that is inconsistent * with <code>equals()</code>.</b> * * @throws IllegalArgumentException if the parameter is <code>null</code>. * @throws ClassCastException if the parameter is not a * <code>TIFFField</code>. */	TokenNameCOMMENT_JAVADOC	 Compares this <code>TIFFField</code> with another <code>TIFFField</code> by comparing the tags. * <p><b>Note: this class has a natural ordering that is inconsistent with <code>equals()</code>.</b> * @throws IllegalArgumentException if the parameter is <code>null</code>. @throws ClassCastException if the parameter is not a <code>TIFFField</code>. 
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
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
int	TokenNameint	
oTag	TokenNameIdentifier	 o Tag
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TIFFField	TokenNameIdentifier	 TIFF Field
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
<	TokenNameLESS	
oTag	TokenNameIdentifier	 o Tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
>	TokenNameGREATER	
oTag	TokenNameIdentifier	 o Tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
