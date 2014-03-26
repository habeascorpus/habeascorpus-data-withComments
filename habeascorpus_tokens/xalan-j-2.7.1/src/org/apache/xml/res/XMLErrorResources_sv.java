/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XMLErrorResources_sv.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XMLErrorResources_sv.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
/** * Set up error messages. * We build a two dimensional array of message keys and * message strings. In order to add a new message here, * you need to first add a String constant. And you need * to enter key, value pair as part of the contents * array. You also need to update MAX_CODE for error strings * and MAX_WARNING for warnings ( Needed for only information * purpose ) */	TokenNameCOMMENT_JAVADOC	 Set up error messages. We build a two dimensional array of message keys and message strings. In order to add a new message here, you need to first add a String constant. And you need to enter key, value pair as part of the contents array. You also need to update MAX_CODE for error strings and MAX_WARNING for warnings ( Needed for only information purpose ) 
public	TokenNamepublic	
class	TokenNameclass	
XMLErrorResources_sv	TokenNameIdentifier	 XML Error Resources sv
extends	TokenNameextends	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
{	TokenNameLBRACE	
/** Maximum error messages, this is needed to keep track of the number of messages. */	TokenNameCOMMENT_JAVADOC	 Maximum error messages, this is needed to keep track of the number of messages. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_CODE	TokenNameIdentifier	 MAX  CODE
=	TokenNameEQUAL	
61	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Maximum warnings, this is needed to keep track of the number of warnings. */	TokenNameCOMMENT_JAVADOC	 Maximum warnings, this is needed to keep track of the number of warnings. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_WARNING	TokenNameIdentifier	 MAX  WARNING
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Maximum misc strings. */	TokenNameCOMMENT_JAVADOC	 Maximum misc strings. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_OTHERS	TokenNameIdentifier	 MAX  OTHERS
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Maximum total warnings and error messages. */	TokenNameCOMMENT_JAVADOC	 Maximum total warnings and error messages. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_MESSAGES	TokenNameIdentifier	 MAX  MESSAGES
=	TokenNameEQUAL	
MAX_CODE	TokenNameIdentifier	 MAX  CODE
+	TokenNamePLUS	
MAX_WARNING	TokenNameIdentifier	 MAX  WARNING
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Error messages... 	TokenNameCOMMENT_LINE	Error messages... 
/** * Get the lookup table for error messages * * @return The association list. */	TokenNameCOMMENT_JAVADOC	 Get the lookup table for error messages * @return The association list. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getContents	TokenNameIdentifier	 get Contents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
/** Error message ID that has a null message, but takes in a single object. */	TokenNameCOMMENT_JAVADOC	 Error message ID that has a null message, but takes in a single object. 
{	TokenNameLBRACE	
"ER0000"	TokenNameStringLiteral	ER0000
,	TokenNameCOMMA	
"{0}"	TokenNameStringLiteral	{0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_FUNCTION_NOT_SUPPORTED */	TokenNameCOMMENT_JAVADOC	 ER_FUNCTION_NOT_SUPPORTED 
//public static final int ER_FUNCTION_NOT_SUPPORTED = 80; 	TokenNameCOMMENT_LINE	public static final int ER_FUNCTION_NOT_SUPPORTED = 80; 
{	TokenNameLBRACE	
ER_FUNCTION_NOT_SUPPORTED	TokenNameIdentifier	 ER  FUNCTION  NOT  SUPPORTED
,	TokenNameCOMMA	
"Funktion inte underst�dd:"	TokenNameStringLiteral	Funktion inte underst�dd:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Can't overwrite cause */	TokenNameCOMMENT_JAVADOC	 Can't overwrite cause 
//public static final int ER_CANNOT_OVERWRITE_CAUSE = 115; 	TokenNameCOMMENT_LINE	public static final int ER_CANNOT_OVERWRITE_CAUSE = 115; 
{	TokenNameLBRACE	
ER_CANNOT_OVERWRITE_CAUSE	TokenNameIdentifier	 ER  CANNOT  OVERWRITE  CAUSE
,	TokenNameCOMMA	
"Kan inte skriva �ver orsak"	TokenNameStringLiteral	Kan inte skriva �ver orsak
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** No default implementation found */	TokenNameCOMMENT_JAVADOC	 No default implementation found 
//public static final int ER_NO_DEFAULT_IMPL = 156; 	TokenNameCOMMENT_LINE	public static final int ER_NO_DEFAULT_IMPL = 156; 
{	TokenNameLBRACE	
ER_NO_DEFAULT_IMPL	TokenNameIdentifier	 ER  NO  DEFAULT  IMPL
,	TokenNameCOMMA	
"Standardimplementering saknas i:"	TokenNameStringLiteral	Standardimplementering saknas i:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ChunkedIntArray({0}) not currently supported */	TokenNameCOMMENT_JAVADOC	 ChunkedIntArray({0}) not currently supported 
//public static final int ER_CHUNKEDINTARRAY_NOT_SUPPORTED = 157; 	TokenNameCOMMENT_LINE	public static final int ER_CHUNKEDINTARRAY_NOT_SUPPORTED = 157; 
{	TokenNameLBRACE	
ER_CHUNKEDINTARRAY_NOT_SUPPORTED	TokenNameIdentifier	 ER  CHUNKEDINTARRAY  NOT  SUPPORTED
,	TokenNameCOMMA	
"ChunkedIntArray({0}) underst�ds f�r n�rvarande inte"	TokenNameStringLiteral	ChunkedIntArray({0}) underst�ds f�r n�rvarande inte
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Offset bigger than slot */	TokenNameCOMMENT_JAVADOC	 Offset bigger than slot 
//public static final int ER_OFFSET_BIGGER_THAN_SLOT = 158; 	TokenNameCOMMENT_LINE	public static final int ER_OFFSET_BIGGER_THAN_SLOT = 158; 
{	TokenNameLBRACE	
ER_OFFSET_BIGGER_THAN_SLOT	TokenNameIdentifier	 ER  OFFSET  BIGGER  THAN  SLOT
,	TokenNameCOMMA	
"Offset st�rre �n fack"	TokenNameStringLiteral	Offset st�rre �n fack
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Coroutine not available, id= */	TokenNameCOMMENT_JAVADOC	 Coroutine not available, id= 
//public static final int ER_COROUTINE_NOT_AVAIL = 159; 	TokenNameCOMMENT_LINE	public static final int ER_COROUTINE_NOT_AVAIL = 159; 
{	TokenNameLBRACE	
ER_COROUTINE_NOT_AVAIL	TokenNameIdentifier	 ER  COROUTINE  NOT  AVAIL
,	TokenNameCOMMA	
"Sidorutin inte tillg�nglig, id={0}"	TokenNameStringLiteral	Sidorutin inte tillg�nglig, id={0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** CoroutineManager recieved co_exit() request */	TokenNameCOMMENT_JAVADOC	 CoroutineManager recieved co_exit() request 
//public static final int ER_COROUTINE_CO_EXIT = 160; 	TokenNameCOMMENT_LINE	public static final int ER_COROUTINE_CO_EXIT = 160; 
{	TokenNameLBRACE	
ER_COROUTINE_CO_EXIT	TokenNameIdentifier	 ER  COROUTINE  CO  EXIT
,	TokenNameCOMMA	
"CoroutineManager mottog co_exit()-f�rfr�gan"	TokenNameStringLiteral	CoroutineManager mottog co_exit()-f�rfr�gan
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** co_joinCoroutineSet() failed */	TokenNameCOMMENT_JAVADOC	 co_joinCoroutineSet() failed 
//public static final int ER_COJOINROUTINESET_FAILED = 161; 	TokenNameCOMMENT_LINE	public static final int ER_COJOINROUTINESET_FAILED = 161; 
{	TokenNameLBRACE	
ER_COJOINROUTINESET_FAILED	TokenNameIdentifier	 ER  COJOINROUTINESET  FAILED
,	TokenNameCOMMA	
"co_joinCoroutineSet() misslyckades"	TokenNameStringLiteral	co_joinCoroutineSet() misslyckades
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Coroutine parameter error () */	TokenNameCOMMENT_JAVADOC	 Coroutine parameter error () 
//public static final int ER_COROUTINE_PARAM = 162; 	TokenNameCOMMENT_LINE	public static final int ER_COROUTINE_PARAM = 162; 
{	TokenNameLBRACE	
ER_COROUTINE_PARAM	TokenNameIdentifier	 ER  COROUTINE  PARAM
,	TokenNameCOMMA	
"Sidorutin fick parameterfel ({0})"	TokenNameStringLiteral	Sidorutin fick parameterfel ({0})
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** UNEXPECTED: Parser doTerminate answers */	TokenNameCOMMENT_JAVADOC	 UNEXPECTED: Parser doTerminate answers 
//public static final int ER_PARSER_DOTERMINATE_ANSWERS = 163; 	TokenNameCOMMENT_LINE	public static final int ER_PARSER_DOTERMINATE_ANSWERS = 163; 
{	TokenNameLBRACE	
ER_PARSER_DOTERMINATE_ANSWERS	TokenNameIdentifier	 ER  PARSER  DOTERMINATE  ANSWERS
,	TokenNameCOMMA	
" OV�NTAT: Parser doTerminate-svar {0}"	TokenNameStringLiteral	 OV�NTAT: Parser doTerminate-svar {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** parse may not be called while parsing */	TokenNameCOMMENT_JAVADOC	 parse may not be called while parsing 
//public static final int ER_NO_PARSE_CALL_WHILE_PARSING = 164; 	TokenNameCOMMENT_LINE	public static final int ER_NO_PARSE_CALL_WHILE_PARSING = 164; 
{	TokenNameLBRACE	
ER_NO_PARSE_CALL_WHILE_PARSING	TokenNameIdentifier	 ER  NO  PARSE  CALL  WHILE  PARSING
,	TokenNameCOMMA	
"parse f�r inte anropas medan tolkning sker"	TokenNameStringLiteral	parse f�r inte anropas medan tolkning sker
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Error: typed iterator for axis {0} not implemented */	TokenNameCOMMENT_JAVADOC	 Error: typed iterator for axis {0} not implemented 
//public static final int ER_TYPED_ITERATOR_AXIS_NOT_IMPLEMENTED = 165; 	TokenNameCOMMENT_LINE	public static final int ER_TYPED_ITERATOR_AXIS_NOT_IMPLEMENTED = 165; 
{	TokenNameLBRACE	
ER_TYPED_ITERATOR_AXIS_NOT_IMPLEMENTED	TokenNameIdentifier	 ER  TYPED  ITERATOR  AXIS  NOT  IMPLEMENTED
,	TokenNameCOMMA	
"Fel: typad upprepare f�r axel {0} inte implementerad"	TokenNameStringLiteral	Fel: typad upprepare f�r axel {0} inte implementerad
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Error: iterator for axis {0} not implemented */	TokenNameCOMMENT_JAVADOC	 Error: iterator for axis {0} not implemented 
//public static final int ER_ITERATOR_AXIS_NOT_IMPLEMENTED = 166; 	TokenNameCOMMENT_LINE	public static final int ER_ITERATOR_AXIS_NOT_IMPLEMENTED = 166; 
{	TokenNameLBRACE	
ER_ITERATOR_AXIS_NOT_IMPLEMENTED	TokenNameIdentifier	 ER  ITERATOR  AXIS  NOT  IMPLEMENTED
,	TokenNameCOMMA	
"Fel: upprepare f�r axel {0} inte implementerad"	TokenNameStringLiteral	Fel: upprepare f�r axel {0} inte implementerad
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Iterator clone not supported */	TokenNameCOMMENT_JAVADOC	 Iterator clone not supported 
//public static final int ER_ITERATOR_CLONE_NOT_SUPPORTED = 167; 	TokenNameCOMMENT_LINE	public static final int ER_ITERATOR_CLONE_NOT_SUPPORTED = 167; 
{	TokenNameLBRACE	
ER_ITERATOR_CLONE_NOT_SUPPORTED	TokenNameIdentifier	 ER  ITERATOR  CLONE  NOT  SUPPORTED
,	TokenNameCOMMA	
"Uppreparklon underst�ds inte"	TokenNameStringLiteral	Uppreparklon underst�ds inte
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Unknown axis traversal type */	TokenNameCOMMENT_JAVADOC	 Unknown axis traversal type 
//public static final int ER_UNKNOWN_AXIS_TYPE = 168; 	TokenNameCOMMENT_LINE	public static final int ER_UNKNOWN_AXIS_TYPE = 168; 
{	TokenNameLBRACE	
ER_UNKNOWN_AXIS_TYPE	TokenNameIdentifier	 ER  UNKNOWN  AXIS  TYPE
,	TokenNameCOMMA	
"Ok�nd axeltraverstyp: {0}"	TokenNameStringLiteral	Ok�nd axeltraverstyp: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Axis traverser not supported */	TokenNameCOMMENT_JAVADOC	 Axis traverser not supported 
//public static final int ER_AXIS_NOT_SUPPORTED = 169; 	TokenNameCOMMENT_LINE	public static final int ER_AXIS_NOT_SUPPORTED = 169; 
{	TokenNameLBRACE	
ER_AXIS_NOT_SUPPORTED	TokenNameIdentifier	 ER  AXIS  NOT  SUPPORTED
,	TokenNameCOMMA	
"Axeltravers underst�ds inte: {0}"	TokenNameStringLiteral	Axeltravers underst�ds inte: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** No more DTM IDs are available */	TokenNameCOMMENT_JAVADOC	 No more DTM IDs are available 
//public static final int ER_NO_DTMIDS_AVAIL = 170; 	TokenNameCOMMENT_LINE	public static final int ER_NO_DTMIDS_AVAIL = 170; 
{	TokenNameLBRACE	
ER_NO_DTMIDS_AVAIL	TokenNameIdentifier	 ER  NO  DTMIDS  AVAIL
,	TokenNameCOMMA	
"Inga fler DTM-IDs �r tillg�ngliga"	TokenNameStringLiteral	Inga fler DTM-IDs �r tillg�ngliga
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Not supported */	TokenNameCOMMENT_JAVADOC	 Not supported 
//public static final int ER_NOT_SUPPORTED = 171; 	TokenNameCOMMENT_LINE	public static final int ER_NOT_SUPPORTED = 171; 
{	TokenNameLBRACE	
ER_NOT_SUPPORTED	TokenNameIdentifier	 ER  NOT  SUPPORTED
,	TokenNameCOMMA	
"Underst�ds inte: {0}"	TokenNameStringLiteral	Underst�ds inte: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** node must be non-null for getDTMHandleFromNode */	TokenNameCOMMENT_JAVADOC	 node must be non-null for getDTMHandleFromNode 
//public static final int ER_NODE_NON_NULL = 172; 	TokenNameCOMMENT_LINE	public static final int ER_NODE_NON_NULL = 172; 
{	TokenNameLBRACE	
ER_NODE_NON_NULL	TokenNameIdentifier	 ER  NODE  NON  NULL
,	TokenNameCOMMA	
"Nod m�ste vara icke-null f�r getDTMHandleFromNode"	TokenNameStringLiteral	Nod m�ste vara icke-null f�r getDTMHandleFromNode
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Could not resolve the node to a handle */	TokenNameCOMMENT_JAVADOC	 Could not resolve the node to a handle 
//public static final int ER_COULD_NOT_RESOLVE_NODE = 173; 	TokenNameCOMMENT_LINE	public static final int ER_COULD_NOT_RESOLVE_NODE = 173; 
{	TokenNameLBRACE	
ER_COULD_NOT_RESOLVE_NODE	TokenNameIdentifier	 ER  COULD  NOT  RESOLVE  NODE
,	TokenNameCOMMA	
"Kunde inte l�sa nod till ett handtag"	TokenNameStringLiteral	Kunde inte l�sa nod till ett handtag
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** startParse may not be called while parsing */	TokenNameCOMMENT_JAVADOC	 startParse may not be called while parsing 
//public static final int ER_STARTPARSE_WHILE_PARSING = 174; 	TokenNameCOMMENT_LINE	public static final int ER_STARTPARSE_WHILE_PARSING = 174; 
{	TokenNameLBRACE	
ER_STARTPARSE_WHILE_PARSING	TokenNameIdentifier	 ER  STARTPARSE  WHILE  PARSING
,	TokenNameCOMMA	
"startParse f�r inte anropas medan tolkning sker"	TokenNameStringLiteral	startParse f�r inte anropas medan tolkning sker
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** startParse needs a non-null SAXParser */	TokenNameCOMMENT_JAVADOC	 startParse needs a non-null SAXParser 
//public static final int ER_STARTPARSE_NEEDS_SAXPARSER = 175; 	TokenNameCOMMENT_LINE	public static final int ER_STARTPARSE_NEEDS_SAXPARSER = 175; 
{	TokenNameLBRACE	
ER_STARTPARSE_NEEDS_SAXPARSER	TokenNameIdentifier	 ER  STARTPARSE  NEEDS  SAXPARSER
,	TokenNameCOMMA	
"startParse beh�ver en SAXParser som �r icke-null"	TokenNameStringLiteral	startParse beh�ver en SAXParser som �r icke-null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** could not initialize parser with */	TokenNameCOMMENT_JAVADOC	 could not initialize parser with 
//public static final int ER_COULD_NOT_INIT_PARSER = 176; 	TokenNameCOMMENT_LINE	public static final int ER_COULD_NOT_INIT_PARSER = 176; 
{	TokenNameLBRACE	
ER_COULD_NOT_INIT_PARSER	TokenNameIdentifier	 ER  COULD  NOT  INIT  PARSER
,	TokenNameCOMMA	
"kunde inte initialisera tolk med"	TokenNameStringLiteral	kunde inte initialisera tolk med
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** exception creating new instance for pool */	TokenNameCOMMENT_JAVADOC	 exception creating new instance for pool 
//public static final int ER_EXCEPTION_CREATING_POOL = 178; 	TokenNameCOMMENT_LINE	public static final int ER_EXCEPTION_CREATING_POOL = 178; 
{	TokenNameLBRACE	
ER_EXCEPTION_CREATING_POOL	TokenNameIdentifier	 ER  EXCEPTION  CREATING  POOL
,	TokenNameCOMMA	
"undantag skapar ny instans f�r pool"	TokenNameStringLiteral	undantag skapar ny instans f�r pool
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Path contains invalid escape sequence */	TokenNameCOMMENT_JAVADOC	 Path contains invalid escape sequence 
//public static final int ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE = 179; 	TokenNameCOMMENT_LINE	public static final int ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE = 179; 
{	TokenNameLBRACE	
ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE	TokenNameIdentifier	 ER  PATH  CONTAINS  INVALID  ESCAPE  SEQUENCE
,	TokenNameCOMMA	
"V�g inneh�ller ogiltig flyktsekvens"	TokenNameStringLiteral	V�g inneh�ller ogiltig flyktsekvens
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Scheme is required! */	TokenNameCOMMENT_JAVADOC	 Scheme is required! 
//public static final int ER_SCHEME_REQUIRED = 180; 	TokenNameCOMMENT_LINE	public static final int ER_SCHEME_REQUIRED = 180; 
{	TokenNameLBRACE	
ER_SCHEME_REQUIRED	TokenNameIdentifier	 ER  SCHEME  REQUIRED
,	TokenNameCOMMA	
"Schema kr�vs!"	TokenNameStringLiteral	Schema kr�vs!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** No scheme found in URI */	TokenNameCOMMENT_JAVADOC	 No scheme found in URI 
//public static final int ER_NO_SCHEME_IN_URI = 181; 	TokenNameCOMMENT_LINE	public static final int ER_NO_SCHEME_IN_URI = 181; 
{	TokenNameLBRACE	
ER_NO_SCHEME_IN_URI	TokenNameIdentifier	 ER  NO  SCHEME  IN  URI
,	TokenNameCOMMA	
"Schema saknas i URI: {0}"	TokenNameStringLiteral	Schema saknas i URI: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** No scheme found in URI */	TokenNameCOMMENT_JAVADOC	 No scheme found in URI 
//public static final int ER_NO_SCHEME_INURI = 182; 	TokenNameCOMMENT_LINE	public static final int ER_NO_SCHEME_INURI = 182; 
{	TokenNameLBRACE	
ER_NO_SCHEME_INURI	TokenNameIdentifier	 ER  NO  SCHEME  INURI
,	TokenNameCOMMA	
"Schema saknas i URI"	TokenNameStringLiteral	Schema saknas i URI
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Path contains invalid character: */	TokenNameCOMMENT_JAVADOC	 Path contains invalid character: 
//public static final int ER_PATH_INVALID_CHAR = 183; 	TokenNameCOMMENT_LINE	public static final int ER_PATH_INVALID_CHAR = 183; 
{	TokenNameLBRACE	
ER_PATH_INVALID_CHAR	TokenNameIdentifier	 ER  PATH  INVALID  CHAR
,	TokenNameCOMMA	
"V�g inneh�ller ogiltigt tecken: {0}"	TokenNameStringLiteral	V�g inneh�ller ogiltigt tecken: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Cannot set scheme from null string */	TokenNameCOMMENT_JAVADOC	 Cannot set scheme from null string 
//public static final int ER_SCHEME_FROM_NULL_STRING = 184; 	TokenNameCOMMENT_LINE	public static final int ER_SCHEME_FROM_NULL_STRING = 184; 
{	TokenNameLBRACE	
ER_SCHEME_FROM_NULL_STRING	TokenNameIdentifier	 ER  SCHEME  FROM  NULL  STRING
,	TokenNameCOMMA	
"Kan inte s�tta schema fr�n null-str�ng"	TokenNameStringLiteral	Kan inte s�tta schema fr�n null-str�ng
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** The scheme is not conformant. */	TokenNameCOMMENT_JAVADOC	 The scheme is not conformant. 
//public static final int ER_SCHEME_NOT_CONFORMANT = 185; 	TokenNameCOMMENT_LINE	public static final int ER_SCHEME_NOT_CONFORMANT = 185; 
{	TokenNameLBRACE	
ER_SCHEME_NOT_CONFORMANT	TokenNameIdentifier	 ER  SCHEME  NOT  CONFORMANT
,	TokenNameCOMMA	
"Schemat �r inte likformigt."	TokenNameStringLiteral	Schemat �r inte likformigt.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Host is not a well formed address */	TokenNameCOMMENT_JAVADOC	 Host is not a well formed address 
//public static final int ER_HOST_ADDRESS_NOT_WELLFORMED = 186; 	TokenNameCOMMENT_LINE	public static final int ER_HOST_ADDRESS_NOT_WELLFORMED = 186; 
{	TokenNameLBRACE	
ER_HOST_ADDRESS_NOT_WELLFORMED	TokenNameIdentifier	 ER  HOST  ADDRESS  NOT  WELLFORMED
,	TokenNameCOMMA	
"V�rd �r inte en v�lformulerad adress"	TokenNameStringLiteral	V�rd �r inte en v�lformulerad adress
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Port cannot be set when host is null */	TokenNameCOMMENT_JAVADOC	 Port cannot be set when host is null 
//public static final int ER_PORT_WHEN_HOST_NULL = 187; 	TokenNameCOMMENT_LINE	public static final int ER_PORT_WHEN_HOST_NULL = 187; 
{	TokenNameLBRACE	
ER_PORT_WHEN_HOST_NULL	TokenNameIdentifier	 ER  PORT  WHEN  HOST  NULL
,	TokenNameCOMMA	
"Port kan inte s�ttas n�r v�rd �r null"	TokenNameStringLiteral	Port kan inte s�ttas n�r v�rd �r null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Invalid port number */	TokenNameCOMMENT_JAVADOC	 Invalid port number 
//public static final int ER_INVALID_PORT = 188; 	TokenNameCOMMENT_LINE	public static final int ER_INVALID_PORT = 188; 
{	TokenNameLBRACE	
ER_INVALID_PORT	TokenNameIdentifier	 ER  INVALID  PORT
,	TokenNameCOMMA	
"Ogiltigt portnummer"	TokenNameStringLiteral	Ogiltigt portnummer
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Fragment can only be set for a generic URI */	TokenNameCOMMENT_JAVADOC	 Fragment can only be set for a generic URI 
//public static final int ER_FRAG_FOR_GENERIC_URI = 189; 	TokenNameCOMMENT_LINE	public static final int ER_FRAG_FOR_GENERIC_URI = 189; 
{	TokenNameLBRACE	
ER_FRAG_FOR_GENERIC_URI	TokenNameIdentifier	 ER  FRAG  FOR  GENERIC  URI
,	TokenNameCOMMA	
"Fragment kan bara s�ttas f�r en allm�n URI"	TokenNameStringLiteral	Fragment kan bara s�ttas f�r en allm�n URI
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Fragment cannot be set when path is null */	TokenNameCOMMENT_JAVADOC	 Fragment cannot be set when path is null 
//public static final int ER_FRAG_WHEN_PATH_NULL = 190; 	TokenNameCOMMENT_LINE	public static final int ER_FRAG_WHEN_PATH_NULL = 190; 
{	TokenNameLBRACE	
ER_FRAG_WHEN_PATH_NULL	TokenNameIdentifier	 ER  FRAG  WHEN  PATH  NULL
,	TokenNameCOMMA	
"Fragment kan inte s�ttas n�r v�g �r null"	TokenNameStringLiteral	Fragment kan inte s�ttas n�r v�g �r null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Fragment contains invalid character */	TokenNameCOMMENT_JAVADOC	 Fragment contains invalid character 
//public static final int ER_FRAG_INVALID_CHAR = 191; 	TokenNameCOMMENT_LINE	public static final int ER_FRAG_INVALID_CHAR = 191; 
{	TokenNameLBRACE	
ER_FRAG_INVALID_CHAR	TokenNameIdentifier	 ER  FRAG  INVALID  CHAR
,	TokenNameCOMMA	
"Fragment inneh�ller ogiltigt tecken"	TokenNameStringLiteral	Fragment inneh�ller ogiltigt tecken
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Parser is already in use */	TokenNameCOMMENT_JAVADOC	 Parser is already in use 
//public static final int ER_PARSER_IN_USE = 192; 	TokenNameCOMMENT_LINE	public static final int ER_PARSER_IN_USE = 192; 
{	TokenNameLBRACE	
ER_PARSER_IN_USE	TokenNameIdentifier	 ER  PARSER  IN  USE
,	TokenNameCOMMA	
"Tolk anv�nds redan"	TokenNameStringLiteral	Tolk anv�nds redan
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Parser is already in use */	TokenNameCOMMENT_JAVADOC	 Parser is already in use 
//public static final int ER_CANNOT_CHANGE_WHILE_PARSING = 193; 	TokenNameCOMMENT_LINE	public static final int ER_CANNOT_CHANGE_WHILE_PARSING = 193; 
{	TokenNameLBRACE	
ER_CANNOT_CHANGE_WHILE_PARSING	TokenNameIdentifier	 ER  CANNOT  CHANGE  WHILE  PARSING
,	TokenNameCOMMA	
"Kan inte �ndra {0} {1} medan tolkning sker"	TokenNameStringLiteral	Kan inte �ndra {0} {1} medan tolkning sker
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Self-causation not permitted */	TokenNameCOMMENT_JAVADOC	 Self-causation not permitted 
//public static final int ER_SELF_CAUSATION_NOT_PERMITTED = 194; 	TokenNameCOMMENT_LINE	public static final int ER_SELF_CAUSATION_NOT_PERMITTED = 194; 
{	TokenNameLBRACE	
ER_SELF_CAUSATION_NOT_PERMITTED	TokenNameIdentifier	 ER  SELF  CAUSATION  NOT  PERMITTED
,	TokenNameCOMMA	
"Sj�lvorsakande inte till�ten"	TokenNameStringLiteral	Sj�lvorsakande inte till�ten
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Userinfo may not be specified if host is not specified */	TokenNameCOMMENT_JAVADOC	 Userinfo may not be specified if host is not specified 
//public static final int ER_NO_USERINFO_IF_NO_HOST = 198; 	TokenNameCOMMENT_LINE	public static final int ER_NO_USERINFO_IF_NO_HOST = 198; 
{	TokenNameLBRACE	
ER_NO_USERINFO_IF_NO_HOST	TokenNameIdentifier	 ER  NO  USERINFO  IF  NO  HOST
,	TokenNameCOMMA	
"Userinfo f�r inte anges om v�rden inte �r angiven"	TokenNameStringLiteral	Userinfo f�r inte anges om v�rden inte �r angiven
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Port may not be specified if host is not specified */	TokenNameCOMMENT_JAVADOC	 Port may not be specified if host is not specified 
//public static final int ER_NO_PORT_IF_NO_HOST = 199; 	TokenNameCOMMENT_LINE	public static final int ER_NO_PORT_IF_NO_HOST = 199; 
{	TokenNameLBRACE	
ER_NO_PORT_IF_NO_HOST	TokenNameIdentifier	 ER  NO  PORT  IF  NO  HOST
,	TokenNameCOMMA	
"Port f�r inte anges om v�rden inte �r angiven"	TokenNameStringLiteral	Port f�r inte anges om v�rden inte �r angiven
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Query string cannot be specified in path and query string */	TokenNameCOMMENT_JAVADOC	 Query string cannot be specified in path and query string 
//public static final int ER_NO_QUERY_STRING_IN_PATH = 200; 	TokenNameCOMMENT_LINE	public static final int ER_NO_QUERY_STRING_IN_PATH = 200; 
{	TokenNameLBRACE	
ER_NO_QUERY_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  QUERY  STRING  IN  PATH
,	TokenNameCOMMA	
"F�rfr�gan-str�ng kan inte anges i v�g och f�rfr�gan-str�ng"	TokenNameStringLiteral	F�rfr�gan-str�ng kan inte anges i v�g och f�rfr�gan-str�ng
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Fragment cannot be specified in both the path and fragment */	TokenNameCOMMENT_JAVADOC	 Fragment cannot be specified in both the path and fragment 
//public static final int ER_NO_FRAGMENT_STRING_IN_PATH = 201; 	TokenNameCOMMENT_LINE	public static final int ER_NO_FRAGMENT_STRING_IN_PATH = 201; 
{	TokenNameLBRACE	
ER_NO_FRAGMENT_STRING_IN_PATH	TokenNameIdentifier	 ER  NO  FRAGMENT  STRING  IN  PATH
,	TokenNameCOMMA	
"Fragment kan inte anges i b�de v�gen och fragmentet"	TokenNameStringLiteral	Fragment kan inte anges i b�de v�gen och fragmentet
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Cannot initialize URI with empty parameters */	TokenNameCOMMENT_JAVADOC	 Cannot initialize URI with empty parameters 
//public static final int ER_CANNOT_INIT_URI_EMPTY_PARMS = 202; 	TokenNameCOMMENT_LINE	public static final int ER_CANNOT_INIT_URI_EMPTY_PARMS = 202; 
{	TokenNameLBRACE	
ER_CANNOT_INIT_URI_EMPTY_PARMS	TokenNameIdentifier	 ER  CANNOT  INIT  URI  EMPTY  PARMS
,	TokenNameCOMMA	
"Kan inte initialisera URI med tomma parametrar"	TokenNameStringLiteral	Kan inte initialisera URI med tomma parametrar
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Method not yet supported */	TokenNameCOMMENT_JAVADOC	 Method not yet supported 
//public static final int ER_METHOD_NOT_SUPPORTED = 210; 	TokenNameCOMMENT_LINE	public static final int ER_METHOD_NOT_SUPPORTED = 210; 
{	TokenNameLBRACE	
ER_METHOD_NOT_SUPPORTED	TokenNameIdentifier	 ER  METHOD  NOT  SUPPORTED
,	TokenNameCOMMA	
"Metod �nnu inte underst�dd "	TokenNameStringLiteral	Metod �nnu inte underst�dd 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** IncrementalSAXSource_Filter not currently restartable */	TokenNameCOMMENT_JAVADOC	 IncrementalSAXSource_Filter not currently restartable 
//public static final int ER_INCRSAXSRCFILTER_NOT_RESTARTABLE = 214; 	TokenNameCOMMENT_LINE	public static final int ER_INCRSAXSRCFILTER_NOT_RESTARTABLE = 214; 
{	TokenNameLBRACE	
ER_INCRSAXSRCFILTER_NOT_RESTARTABLE	TokenNameIdentifier	 ER  INCRSAXSRCFILTER  NOT  RESTARTABLE
,	TokenNameCOMMA	
"IncrementalSAXSource_Filter kan f�r n�rvarande inte startas om"	TokenNameStringLiteral	IncrementalSAXSource_Filter kan f�r n�rvarande inte startas om
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** IncrementalSAXSource_Filter not currently restartable */	TokenNameCOMMENT_JAVADOC	 IncrementalSAXSource_Filter not currently restartable 
//public static final int ER_XMLRDR_NOT_BEFORE_STARTPARSE = 215; 	TokenNameCOMMENT_LINE	public static final int ER_XMLRDR_NOT_BEFORE_STARTPARSE = 215; 
{	TokenNameLBRACE	
ER_XMLRDR_NOT_BEFORE_STARTPARSE	TokenNameIdentifier	 ER  XMLRDR  NOT  BEFORE  STARTPARSE
,	TokenNameCOMMA	
"XMLReader inte innan startParse-beg�ran"	TokenNameStringLiteral	XMLReader inte innan startParse-beg�ran
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Axis traverser not supported: {0} 	TokenNameCOMMENT_LINE	Axis traverser not supported: {0} 
//public static final int ER_AXIS_TRAVERSER_NOT_SUPPORTED = 235; 	TokenNameCOMMENT_LINE	public static final int ER_AXIS_TRAVERSER_NOT_SUPPORTED = 235; 
{	TokenNameLBRACE	
ER_AXIS_TRAVERSER_NOT_SUPPORTED	TokenNameIdentifier	 ER  AXIS  TRAVERSER  NOT  SUPPORTED
,	TokenNameCOMMA	
"Det g�r inte att v�nda axeln: {0}"	TokenNameStringLiteral	Det g�r inte att v�nda axeln: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// ListingErrorHandler created with null PrintWriter! 	TokenNameCOMMENT_LINE	ListingErrorHandler created with null PrintWriter! 
//public static final int ER_ERRORHANDLER_CREATED_WITH_NULL_PRINTWRITER = 236; 	TokenNameCOMMENT_LINE	public static final int ER_ERRORHANDLER_CREATED_WITH_NULL_PRINTWRITER = 236; 
{	TokenNameLBRACE	
ER_ERRORHANDLER_CREATED_WITH_NULL_PRINTWRITER	TokenNameIdentifier	 ER  ERRORHANDLER  CREATED  WITH  NULL  PRINTWRITER
,	TokenNameCOMMA	
"ListingErrorHandler skapad med null PrintWriter!"	TokenNameStringLiteral	ListingErrorHandler skapad med null PrintWriter!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//public static final int ER_SYSTEMID_UNKNOWN = 240; 	TokenNameCOMMENT_LINE	public static final int ER_SYSTEMID_UNKNOWN = 240; 
{	TokenNameLBRACE	
ER_SYSTEMID_UNKNOWN	TokenNameIdentifier	 ER  SYSTEMID  UNKNOWN
,	TokenNameCOMMA	
"SystemId ok�nt"	TokenNameStringLiteral	SystemId ok�nt
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Location of error unknown 	TokenNameCOMMENT_LINE	Location of error unknown 
//public static final int ER_LOCATION_UNKNOWN = 241; 	TokenNameCOMMENT_LINE	public static final int ER_LOCATION_UNKNOWN = 241; 
{	TokenNameLBRACE	
ER_LOCATION_UNKNOWN	TokenNameIdentifier	 ER  LOCATION  UNKNOWN
,	TokenNameCOMMA	
"Platsen f�r felet �r ok�nd"	TokenNameStringLiteral	Platsen f�r felet �r ok�nd
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_PREFIX_MUST_RESOLVE */	TokenNameCOMMENT_JAVADOC	 Field ER_PREFIX_MUST_RESOLVE 
//public static final int ER_PREFIX_MUST_RESOLVE = 52; 	TokenNameCOMMENT_LINE	public static final int ER_PREFIX_MUST_RESOLVE = 52; 
{	TokenNameLBRACE	
ER_PREFIX_MUST_RESOLVE	TokenNameIdentifier	 ER  PREFIX  MUST  RESOLVE
,	TokenNameCOMMA	
"Prefix must resolve to a namespace: {0}"	TokenNameStringLiteral	Prefix must resolve to a namespace: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_CREATEDOCUMENT_NOT_SUPPORTED */	TokenNameCOMMENT_JAVADOC	 Field ER_CREATEDOCUMENT_NOT_SUPPORTED 
//public static final int ER_CREATEDOCUMENT_NOT_SUPPORTED = 54; 	TokenNameCOMMENT_LINE	public static final int ER_CREATEDOCUMENT_NOT_SUPPORTED = 54; 
{	TokenNameLBRACE	
ER_CREATEDOCUMENT_NOT_SUPPORTED	TokenNameIdentifier	 ER  CREATEDOCUMENT  NOT  SUPPORTED
,	TokenNameCOMMA	
"createDocument() underst�ds inte av XPathContext!"	TokenNameStringLiteral	createDocument() underst�ds inte av XPathContext!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_CHILD_HAS_NO_OWNER_DOCUMENT */	TokenNameCOMMENT_JAVADOC	 Field ER_CHILD_HAS_NO_OWNER_DOCUMENT 
//public static final int ER_CHILD_HAS_NO_OWNER_DOCUMENT = 55; 	TokenNameCOMMENT_LINE	public static final int ER_CHILD_HAS_NO_OWNER_DOCUMENT = 55; 
{	TokenNameLBRACE	
ER_CHILD_HAS_NO_OWNER_DOCUMENT	TokenNameIdentifier	 ER  CHILD  HAS  NO  OWNER  DOCUMENT
,	TokenNameCOMMA	
"Attributbarn saknar �gardokument!"	TokenNameStringLiteral	Attributbarn saknar �gardokument!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_CHILD_HAS_NO_OWNER_DOCUMENT_ELEMENT */	TokenNameCOMMENT_JAVADOC	 Field ER_CHILD_HAS_NO_OWNER_DOCUMENT_ELEMENT 
//public static final int ER_CHILD_HAS_NO_OWNER_DOCUMENT_ELEMENT = 56; 	TokenNameCOMMENT_LINE	public static final int ER_CHILD_HAS_NO_OWNER_DOCUMENT_ELEMENT = 56; 
{	TokenNameLBRACE	
ER_CHILD_HAS_NO_OWNER_DOCUMENT_ELEMENT	TokenNameIdentifier	 ER  CHILD  HAS  NO  OWNER  DOCUMENT  ELEMENT
,	TokenNameCOMMA	
"Attributbarn saknar �gardokumentelement!"	TokenNameStringLiteral	Attributbarn saknar �gardokumentelement!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_CANT_OUTPUT_TEXT_BEFORE_DOC */	TokenNameCOMMENT_JAVADOC	 Field ER_CANT_OUTPUT_TEXT_BEFORE_DOC 
//public static final int ER_CANT_OUTPUT_TEXT_BEFORE_DOC = 63; 	TokenNameCOMMENT_LINE	public static final int ER_CANT_OUTPUT_TEXT_BEFORE_DOC = 63; 
{	TokenNameLBRACE	
ER_CANT_OUTPUT_TEXT_BEFORE_DOC	TokenNameIdentifier	 ER  CANT  OUTPUT  TEXT  BEFORE  DOC
,	TokenNameCOMMA	
"Varning: kan inte skriva ut text innan dokumentelement! Ignorerar..."	TokenNameStringLiteral	Varning: kan inte skriva ut text innan dokumentelement! Ignorerar...
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_CANT_HAVE_MORE_THAN_ONE_ROOT */	TokenNameCOMMENT_JAVADOC	 Field ER_CANT_HAVE_MORE_THAN_ONE_ROOT 
//public static final int ER_CANT_HAVE_MORE_THAN_ONE_ROOT = 64; 	TokenNameCOMMENT_LINE	public static final int ER_CANT_HAVE_MORE_THAN_ONE_ROOT = 64; 
{	TokenNameLBRACE	
ER_CANT_HAVE_MORE_THAN_ONE_ROOT	TokenNameIdentifier	 ER  CANT  HAVE  MORE  THAN  ONE  ROOT
,	TokenNameCOMMA	
"Kan inte ha mer �n en rot p� en DOM!"	TokenNameStringLiteral	Kan inte ha mer �n en rot p� en DOM!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Argument 'localName' is null */	TokenNameCOMMENT_JAVADOC	 Argument 'localName' is null 
//public static final int ER_ARG_LOCALNAME_NULL = 70; 	TokenNameCOMMENT_LINE	public static final int ER_ARG_LOCALNAME_NULL = 70; 
{	TokenNameLBRACE	
ER_ARG_LOCALNAME_NULL	TokenNameIdentifier	 ER  ARG  LOCALNAME  NULL
,	TokenNameCOMMA	
"Argument 'localName' �r null"	TokenNameStringLiteral	Argument 'localName' �r null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A QNAME has the syntactic form [NCName:]NCName 	TokenNameCOMMENT_LINE	Note to translators: A QNAME has the syntactic form [NCName:]NCName 
// The localname is the portion after the optional colon; the message indicates 	TokenNameCOMMENT_LINE	The localname is the portion after the optional colon; the message indicates 
// that there is a problem with that part of the QNAME. 	TokenNameCOMMENT_LINE	that there is a problem with that part of the QNAME. 
/** localname in QNAME should be a valid NCName */	TokenNameCOMMENT_JAVADOC	 localname in QNAME should be a valid NCName 
//public static final int ER_ARG_LOCALNAME_INVALID = 101; 	TokenNameCOMMENT_LINE	public static final int ER_ARG_LOCALNAME_INVALID = 101; 
{	TokenNameLBRACE	
ER_ARG_LOCALNAME_INVALID	TokenNameIdentifier	 ER  ARG  LOCALNAME  INVALID
,	TokenNameCOMMA	
"Localname i QNAME b�r vara ett giltigt NCName"	TokenNameStringLiteral	Localname i QNAME b�r vara ett giltigt NCName
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A QNAME has the syntactic form [NCName:]NCName 	TokenNameCOMMENT_LINE	Note to translators: A QNAME has the syntactic form [NCName:]NCName 
// The prefix is the portion before the optional colon; the message indicates 	TokenNameCOMMENT_LINE	The prefix is the portion before the optional colon; the message indicates 
// that there is a problem with that part of the QNAME. 	TokenNameCOMMENT_LINE	that there is a problem with that part of the QNAME. 
/** prefix in QNAME should be a valid NCName */	TokenNameCOMMENT_JAVADOC	 prefix in QNAME should be a valid NCName 
//public static final int ER_ARG_PREFIX_INVALID = 102; 	TokenNameCOMMENT_LINE	public static final int ER_ARG_PREFIX_INVALID = 102; 
{	TokenNameLBRACE	
ER_ARG_PREFIX_INVALID	TokenNameIdentifier	 ER  ARG  PREFIX  INVALID
,	TokenNameCOMMA	
"Prefixet i QNAME b�r vara ett giltigt NCName"	TokenNameStringLiteral	Prefixet i QNAME b�r vara ett giltigt NCName
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"BAD_CODE"	TokenNameStringLiteral	BAD_CODE
,	TokenNameCOMMA	
"Parameter till createMessage ligger utanf�r till�tet intervall"	TokenNameStringLiteral	Parameter till createMessage ligger utanf�r till�tet intervall
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"FORMAT_FAILED"	TokenNameStringLiteral	FORMAT_FAILED
,	TokenNameCOMMA	
"Undantag utl�st vid messageFormat-anrop"	TokenNameStringLiteral	Undantag utl�st vid messageFormat-anrop
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"line"	TokenNameStringLiteral	line
,	TokenNameCOMMA	
"Rad #"	TokenNameStringLiteral	Rad #
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"column"	TokenNameStringLiteral	column
,	TokenNameCOMMA	
"Kolumn #"	TokenNameStringLiteral	Kolumn #
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
