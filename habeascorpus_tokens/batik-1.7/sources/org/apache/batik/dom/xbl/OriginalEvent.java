/* * Copyright (c) 2005 World Wide Web Consortium, * * (Massachusetts Institute of Technology, European Research Consortium for * Informatics and Mathematics, Keio University). All Rights Reserved. This * work is distributed under the W3C(r) Software License [1] in the hope that * it will be useful, but WITHOUT ANY WARRANTY; without even the implied * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. * * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231 * * Modifications: * * September 10, 2005 * Placed interface in org.apache.batik.dom.xbl for the time being. * Added javadocs. */	TokenNameCOMMENT_BLOCK	 Copyright (c) 2005 World Wide Web Consortium, * (Massachusetts Institute of Technology, European Research Consortium for Informatics and Mathematics, Keio University). All Rights Reserved. This work is distributed under the W3C(r) Software License [1] in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231 * Modifications: * September 10, 2005 Placed interface in org.apache.batik.dom.xbl for the time being. Added javadocs. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
xbl	TokenNameIdentifier	 xbl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
Event	TokenNameIdentifier	 Event
;	TokenNameSEMICOLON	
/** * Interface implemented by Event objects usable in an XBL processing * document. * Eventually will move to org.w3c.dom.xbl (or some such package). * * @version $Id: OriginalEvent.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Interface implemented by Event objects usable in an XBL processing document. Eventually will move to org.w3c.dom.xbl (or some such package). * @version $Id: OriginalEvent.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
OriginalEvent	TokenNameIdentifier	 Original Event
{	TokenNameLBRACE	
/** * Gets the event from which this event was cloned. */	TokenNameCOMMENT_JAVADOC	 Gets the event from which this event was cloned. 
Event	TokenNameIdentifier	 Event
getOriginalEvent	TokenNameIdentifier	 get Original Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
