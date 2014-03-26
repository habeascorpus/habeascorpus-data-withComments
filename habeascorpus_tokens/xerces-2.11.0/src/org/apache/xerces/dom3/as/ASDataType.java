/* * Copyright (c) 2001 World Wide Web Consortium, * (Massachusetts Institute of Technology, Institut National de * Recherche en Informatique et en Automatique, Keio University). All * Rights Reserved. This program is distributed under the W3C's Software * Intellectual Property License. This program is distributed in the * hope that it will be useful, but WITHOUT ANY WARRANTY; without even * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR * PURPOSE. * See W3C License http://www.w3.org/Consortium/Legal/ for more details. */	TokenNameCOMMENT_BLOCK	 Copyright (c) 2001 World Wide Web Consortium, (Massachusetts Institute of Technology, Institut National de Recherche en Informatique et en Automatique, Keio University). All Rights Reserved. This program is distributed under the W3C's Software Intellectual Property License. This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See W3C License http://www.w3.org/Consortium/Legal/ for more details. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom3	TokenNameIdentifier	 dom3
.	TokenNameDOT	
as	TokenNameIdentifier	 as
;	TokenNameSEMICOLON	
/** * @deprecated * The datatypes supported by DOM AS implementations. Further datatypes may be * added in the Schema/PSVI spec. * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. */	TokenNameCOMMENT_JAVADOC	 @deprecated The datatypes supported by DOM AS implementations. Further datatypes may be added in the Schema/PSVI spec. <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. 
public	TokenNamepublic	
interface	TokenNameinterface	
ASDataType	TokenNameIdentifier	 AS Data Type
{	TokenNameLBRACE	
/** * One of the enumerated codes representing the data type. */	TokenNameCOMMENT_JAVADOC	 One of the enumerated codes representing the data type. 
public	TokenNamepublic	
short	TokenNameshort	
getDataType	TokenNameIdentifier	 get Data Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// DATA_TYPES 	TokenNameCOMMENT_LINE	DATA_TYPES 
/** * A code representing the string data type as defined in . */	TokenNameCOMMENT_JAVADOC	 A code representing the string data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
STRING_DATATYPE	TokenNameIdentifier	 STRING  DATATYPE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The NOTATION data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The NOTATION data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NOTATION_DATATYPE	TokenNameIdentifier	 NOTATION  DATATYPE
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The ID data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The ID data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ID_DATATYPE	TokenNameIdentifier	 ID  DATATYPE
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The IDREF data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The IDREF data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
IDREF_DATATYPE	TokenNameIdentifier	 IDREF  DATATYPE
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The IDREFS data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The IDREFS data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
IDREFS_DATATYPE	TokenNameIdentifier	 IDREFS  DATATYPE
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The ENTITY data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The ENTITY data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ENTITY_DATATYPE	TokenNameIdentifier	 ENTITY  DATATYPE
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The ENTITIES data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The ENTITIES data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ENTITIES_DATATYPE	TokenNameIdentifier	 ENTITIES  DATATYPE
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The NMTOKEN data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The NMTOKEN data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NMTOKEN_DATATYPE	TokenNameIdentifier	 NMTOKEN  DATATYPE
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The NMTOKENS data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The NMTOKENS data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NMTOKENS_DATATYPE	TokenNameIdentifier	 NMTOKENS  DATATYPE
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A code representing the boolean data type as defined in . */	TokenNameCOMMENT_JAVADOC	 A code representing the boolean data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
BOOLEAN_DATATYPE	TokenNameIdentifier	 BOOLEAN  DATATYPE
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A code representing the float data type as defined in . */	TokenNameCOMMENT_JAVADOC	 A code representing the float data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FLOAT_DATATYPE	TokenNameIdentifier	 FLOAT  DATATYPE
=	TokenNameEQUAL	
101	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A code representing the double data type as defined in . */	TokenNameCOMMENT_JAVADOC	 A code representing the double data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DOUBLE_DATATYPE	TokenNameIdentifier	 DOUBLE  DATATYPE
=	TokenNameEQUAL	
102	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The decimal data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The decimal data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DECIMAL_DATATYPE	TokenNameIdentifier	 DECIMAL  DATATYPE
=	TokenNameEQUAL	
103	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The hexbinary data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The hexbinary data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
HEXBINARY_DATATYPE	TokenNameIdentifier	 HEXBINARY  DATATYPE
=	TokenNameEQUAL	
104	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The base64binary data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The base64binary data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
BASE64BINARY_DATATYPE	TokenNameIdentifier	 BAS E64 BINARY  DATATYPE
=	TokenNameEQUAL	
105	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Then uri reference data type as defined in . */	TokenNameCOMMENT_JAVADOC	 Then uri reference data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ANYURI_DATATYPE	TokenNameIdentifier	 ANYURI  DATATYPE
=	TokenNameEQUAL	
106	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Then XML qualified name data type as defined in . */	TokenNameCOMMENT_JAVADOC	 Then XML qualified name data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
QNAME_DATATYPE	TokenNameIdentifier	 QNAME  DATATYPE
=	TokenNameEQUAL	
107	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The duration data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The duration data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DURATION_DATATYPE	TokenNameIdentifier	 DURATION  DATATYPE
=	TokenNameEQUAL	
108	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The datetime data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The datetime data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DATETIME_DATATYPE	TokenNameIdentifier	 DATETIME  DATATYPE
=	TokenNameEQUAL	
109	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The date data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The date data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DATE_DATATYPE	TokenNameIdentifier	 DATE  DATATYPE
=	TokenNameEQUAL	
110	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The time data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The time data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TIME_DATATYPE	TokenNameIdentifier	 TIME  DATATYPE
=	TokenNameEQUAL	
111	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The yearmonth data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The yearmonth data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
GYEARMONTH_DATATYPE	TokenNameIdentifier	 GYEARMONTH  DATATYPE
=	TokenNameEQUAL	
112	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The year data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The year data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
GYEAR_DATATYPE	TokenNameIdentifier	 GYEAR  DATATYPE
=	TokenNameEQUAL	
113	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The monthday data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The monthday data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
GMONTHDAY_DATATYPE	TokenNameIdentifier	 GMONTHDAY  DATATYPE
=	TokenNameEQUAL	
114	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The day data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The day data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
GDAY_DATATYPE	TokenNameIdentifier	 GDAY  DATATYPE
=	TokenNameEQUAL	
115	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The month data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The month data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
GMONTH_DATATYPE	TokenNameIdentifier	 GMONTH  DATATYPE
=	TokenNameEQUAL	
116	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The integer data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The integer data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
INTEGER	TokenNameIdentifier	 INTEGER
=	TokenNameEQUAL	
117	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A code representing the Name data type as defined in . */	TokenNameCOMMENT_JAVADOC	 A code representing the Name data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NAME_DATATYPE	TokenNameIdentifier	 NAME  DATATYPE
=	TokenNameEQUAL	
200	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A code representing the NCName data type as defined in . */	TokenNameCOMMENT_JAVADOC	 A code representing the NCName data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NCNAME_DATATYPE	TokenNameIdentifier	 NCNAME  DATATYPE
=	TokenNameEQUAL	
201	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A code representing the Normalized string data type as defined in . */	TokenNameCOMMENT_JAVADOC	 A code representing the Normalized string data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NORMALIZEDSTRING_DATATYPE	TokenNameIdentifier	 NORMALIZEDSTRING  DATATYPE
=	TokenNameEQUAL	
202	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The token data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The token data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TOKEN_DATATYPE	TokenNameIdentifier	 TOKEN  DATATYPE
=	TokenNameEQUAL	
203	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The Language data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The Language data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
LANGUAGE_DATATYPE	TokenNameIdentifier	 LANGUAGE  DATATYPE
=	TokenNameEQUAL	
204	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The Non-positive integer data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The Non-positive integer data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NONPOSITIVEINTEGER_DATATYPE	TokenNameIdentifier	 NONPOSITIVEINTEGER  DATATYPE
=	TokenNameEQUAL	
205	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Then negative integer data type as defined in . */	TokenNameCOMMENT_JAVADOC	 Then negative integer data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NEGATIVEINTEGER_DATATYPE	TokenNameIdentifier	 NEGATIVEINTEGER  DATATYPE
=	TokenNameEQUAL	
206	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Then long data type as defined in . */	TokenNameCOMMENT_JAVADOC	 Then long data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
LONG_DATATYPE	TokenNameIdentifier	 LONG  DATATYPE
=	TokenNameEQUAL	
207	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The integer data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The integer data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
INT_DATATYPE	TokenNameIdentifier	 INT  DATATYPE
=	TokenNameEQUAL	
208	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The short data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The short data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
SHORT_DATATYPE	TokenNameIdentifier	 SHORT  DATATYPE
=	TokenNameEQUAL	
209	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The byte data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The byte data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
BYTE_DATATYPE	TokenNameIdentifier	 BYTE  DATATYPE
=	TokenNameEQUAL	
210	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The non-negative integer data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The non-negative integer data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NONNEGATIVEINTEGER_DATATYPE	TokenNameIdentifier	 NONNEGATIVEINTEGER  DATATYPE
=	TokenNameEQUAL	
211	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The unsigned long data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The unsigned long data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
UNSIGNEDLONG_DATATYPE	TokenNameIdentifier	 UNSIGNEDLONG  DATATYPE
=	TokenNameEQUAL	
212	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The unsigned integer data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The unsigned integer data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
UNSIGNEDINT_DATATYPE	TokenNameIdentifier	 UNSIGNEDINT  DATATYPE
=	TokenNameEQUAL	
213	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The unsigned short data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The unsigned short data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
UNSIGNEDSHORT_DATATYPE	TokenNameIdentifier	 UNSIGNEDSHORT  DATATYPE
=	TokenNameEQUAL	
214	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The unsigned byte data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The unsigned byte data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
UNSIGNEDBYTE_DATATYPE	TokenNameIdentifier	 UNSIGNEDBYTE  DATATYPE
=	TokenNameEQUAL	
215	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The positive integer data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The positive integer data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
POSITIVEINTEGER_DATATYPE	TokenNameIdentifier	 POSITIVEINTEGER  DATATYPE
=	TokenNameEQUAL	
216	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The other simple data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The other simple data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
OTHER_SIMPLE_DATATYPE	TokenNameIdentifier	 OTHER  SIMPLE  DATATYPE
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The user-defined complex data type as defined in . */	TokenNameCOMMENT_JAVADOC	 The user-defined complex data type as defined in . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
COMPLEX_DATATYPE	TokenNameIdentifier	 COMPLEX  DATATYPE
=	TokenNameEQUAL	
1001	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
