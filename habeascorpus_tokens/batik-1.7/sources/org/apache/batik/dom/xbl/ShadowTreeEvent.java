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
/** * Interface for shadow tree related events. * Eventually will move to org.w3c.dom.xbl (or some such package). * * @version $Id: ShadowTreeEvent.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Interface for shadow tree related events. Eventually will move to org.w3c.dom.xbl (or some such package). * @version $Id: ShadowTreeEvent.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ShadowTreeEvent	TokenNameIdentifier	 Shadow Tree Event
extends	TokenNameextends	
Event	TokenNameIdentifier	 Event
{	TokenNameLBRACE	
XBLShadowTreeElement	TokenNameIdentifier	 XBL Shadow Tree Element
getXblShadowTree	TokenNameIdentifier	 get Xbl Shadow Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
initShadowTreeEvent	TokenNameIdentifier	 init Shadow Tree Event
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cancelableArg	TokenNameIdentifier	 cancelable Arg
,	TokenNameCOMMA	
XBLShadowTreeElement	TokenNameIdentifier	 XBL Shadow Tree Element
xblShadowTreeArg	TokenNameIdentifier	 xbl Shadow Tree Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
initShadowTreeEventNS	TokenNameIdentifier	 init Shadow Tree Event NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURIArg	TokenNameIdentifier	 namespace URI Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cancelableArg	TokenNameIdentifier	 cancelable Arg
,	TokenNameCOMMA	
XBLShadowTreeElement	TokenNameIdentifier	 XBL Shadow Tree Element
xblShadowTreeArg	TokenNameIdentifier	 xbl Shadow Tree Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
