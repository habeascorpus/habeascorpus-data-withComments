/* * Copyright (c) 2006 World Wide Web Consortium, * * (Massachusetts Institute of Technology, European Research Consortium for * Informatics and Mathematics, Keio University). All Rights Reserved. This * work is distributed under the W3C(r) Software License [1] in the hope that * it will be useful, but WITHOUT ANY WARRANTY; without even the implied * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. * * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231 */	TokenNameCOMMENT_BLOCK	 Copyright (c) 2006 World Wide Web Consortium, * (Massachusetts Institute of Technology, European Research Consortium for Informatics and Mathematics, Keio University). All Rights Reserved. This work is distributed under the W3C(r) Software License [1] in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
;	TokenNameSEMICOLON	
/** * Event operations may throw an <code>EventException</code> as specified in * their method descriptions. * <p>See also the <a href='http://www.w3.org/TR/2006/WD-DOM-Level-3-Events-20060413'> Document Object Model (DOM) Level 3 Events Specification </a>. * @since DOM Level 2 */	TokenNameCOMMENT_JAVADOC	 Event operations may throw an <code>EventException</code> as specified in their method descriptions. <p>See also the <a href='http://www.w3.org/TR/2006/WD-DOM-Level-3-Events-20060413'> Document Object Model (DOM) Level 3 Events Specification </a>. @since DOM Level 2 
public	TokenNamepublic	
class	TokenNameclass	
EventException	TokenNameIdentifier	 Event Exception
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
public	TokenNamepublic	
EventException	TokenNameIdentifier	 Event Exception
(	TokenNameLPAREN	
short	TokenNameshort	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
// EventExceptionCode 	TokenNameCOMMENT_LINE	EventExceptionCode 
/** * If the <code>Event.type</code> was not specified by initializing the * event before the method was called. Specification of the * <code>Event.type</code> as <code>null</code> or an empty string will * also trigger this exception. */	TokenNameCOMMENT_JAVADOC	 If the <code>Event.type</code> was not specified by initializing the event before the method was called. Specification of the <code>Event.type</code> as <code>null</code> or an empty string will also trigger this exception. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
UNSPECIFIED_EVENT_TYPE_ERR	TokenNameIdentifier	 UNSPECIFIED  EVENT  TYPE  ERR
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * If the <code>Event</code> object is already dispatched in the tree. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 If the <code>Event</code> object is already dispatched in the tree. @since DOM Level 3 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DISPATCH_REQUEST_ERR	TokenNameIdentifier	 DISPATCH  REQUEST  ERR
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
