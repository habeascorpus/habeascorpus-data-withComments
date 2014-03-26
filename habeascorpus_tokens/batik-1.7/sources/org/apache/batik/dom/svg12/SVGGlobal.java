/* * Copyright (c) 2005 World Wide Web Consortium, * * (Massachusetts Institute of Technology, European Research Consortium for * Informatics and Mathematics, Keio University). All Rights Reserved. This * work is distributed under the W3C(r) Software License [1] in the hope that * it will be useful, but WITHOUT ANY WARRANTY; without even the implied * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. * * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231 * * Modifications: * * September 18, 2005 * Translated IDL to Java. * Placed interface in org.apache.batik.dom.svg12 for the time being. * Added javadocs. */	TokenNameCOMMENT_BLOCK	 Copyright (c) 2005 World Wide Web Consortium, * (Massachusetts Institute of Technology, European Research Consortium for Informatics and Mathematics, Keio University). All Rights Reserved. This work is distributed under the W3C(r) Software License [1] in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231 * Modifications: * September 18, 2005 Translated IDL to Java. Placed interface in org.apache.batik.dom.svg12 for the time being. Added javadocs. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg12	TokenNameIdentifier	 svg12
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
EventTarget	TokenNameIdentifier	 Event Target
;	TokenNameSEMICOLON	
/** * Interface for a global scripting object for an SVG document. * Eventually will move to org.w3c.dom.svg (or some such package). * * @version $Id: SVGGlobal.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Interface for a global scripting object for an SVG document. Eventually will move to org.w3c.dom.svg (or some such package). * @version $Id: SVGGlobal.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SVGGlobal	TokenNameIdentifier	 SVG Global
extends	TokenNameextends	
Global	TokenNameIdentifier	 Global
{	TokenNameLBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Gets the document. 	TokenNameCOMMENT_LINE	* Gets the document. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// Document getDocument(); 	TokenNameCOMMENT_LINE	Document getDocument(); 
// 	TokenNameCOMMENT_LINE	 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Returns the parent global scripting object. 	TokenNameCOMMENT_LINE	* Returns the parent global scripting object. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// Global getParent(); 	TokenNameCOMMENT_LINE	Global getParent(); 
// 	TokenNameCOMMENT_LINE	 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Returns the current location loaded by the user agent. 	TokenNameCOMMENT_LINE	* Returns the current location loaded by the user agent. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// String getLocation(); 	TokenNameCOMMENT_LINE	String getLocation(); 
// 	TokenNameCOMMENT_LINE	 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Move to a new document. 	TokenNameCOMMENT_LINE	* Move to a new document. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// void gotoLocation(String newURL); 	TokenNameCOMMENT_LINE	void gotoLocation(String newURL); 
// 	TokenNameCOMMENT_LINE	 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Parses an XML fragment. 	TokenNameCOMMENT_LINE	* Parses an XML fragment. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// Node parseXML(String source, Document document); 	TokenNameCOMMENT_LINE	Node parseXML(String source, Document document); 
// 	TokenNameCOMMENT_LINE	 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Serializes a DOM node. 	TokenNameCOMMENT_LINE	* Serializes a DOM node. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// String printNode(Node node); 	TokenNameCOMMENT_LINE	String printNode(Node node); 
// 	TokenNameCOMMENT_LINE	 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Timer method. 	TokenNameCOMMENT_LINE	* Timer method. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// SVGTimer createTimer(long delay, long interval, boolean start); 	TokenNameCOMMENT_LINE	SVGTimer createTimer(long delay, long interval, boolean start); 
// 	TokenNameCOMMENT_LINE	 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Creates a URLRequest object. 	TokenNameCOMMENT_LINE	* Creates a URLRequest object. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// URLRequest createURLRequest(); 	TokenNameCOMMENT_LINE	URLRequest createURLRequest(); 
// 	TokenNameCOMMENT_LINE	 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Creates a Connection object. 	TokenNameCOMMENT_LINE	* Creates a Connection object. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// Connection createConnection(); 	TokenNameCOMMENT_LINE	Connection createConnection(); 
/** * Starts mouse capture. */	TokenNameCOMMENT_JAVADOC	 Starts mouse capture. 
void	TokenNamevoid	
startMouseCapture	TokenNameIdentifier	 start Mouse Capture
(	TokenNameLPAREN	
EventTarget	TokenNameIdentifier	 Event Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
boolean	TokenNameboolean	
sendAll	TokenNameIdentifier	 send All
,	TokenNameCOMMA	
boolean	TokenNameboolean	
autoRelease	TokenNameIdentifier	 auto Release
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Stops mouse capture. */	TokenNameCOMMENT_JAVADOC	 Stops mouse capture. 
void	TokenNamevoid	
stopMouseCapture	TokenNameIdentifier	 stop Mouse Capture
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Creates a FileDialog object. 	TokenNameCOMMENT_LINE	* Creates a FileDialog object. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// FileDialog createFileDialog(); 	TokenNameCOMMENT_LINE	FileDialog createFileDialog(); 
// 	TokenNameCOMMENT_LINE	 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Creates an SVGEventFilter object. 	TokenNameCOMMENT_LINE	* Creates an SVGEventFilter object. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// SVGEventFilter createEventFilter(); 	TokenNameCOMMENT_LINE	SVGEventFilter createEventFilter(); 
// 	TokenNameCOMMENT_LINE	 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Sets a client-side persistent value. 	TokenNameCOMMENT_LINE	* Sets a client-side persistent value. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// void setPersistentValue(String name, String value); 	TokenNameCOMMENT_LINE	void setPersistentValue(String name, String value); 
// 	TokenNameCOMMENT_LINE	 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Gets a client-side persistent value. 	TokenNameCOMMENT_LINE	* Gets a client-side persistent value. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// String getPersistentValue(String name); 	TokenNameCOMMENT_LINE	String getPersistentValue(String name); 
}	TokenNameRBRACE	
