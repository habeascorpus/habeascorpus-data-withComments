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
/** * @deprecated * This interface extends the <code>NodeEditAS</code> interface with * additional methods for document editing. An object implementing this * interface must also implement NodeEditAS interface. * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. */	TokenNameCOMMENT_JAVADOC	 @deprecated This interface extends the <code>NodeEditAS</code> interface with additional methods for document editing. An object implementing this interface must also implement NodeEditAS interface. <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. 
public	TokenNamepublic	
interface	TokenNameinterface	
CharacterDataEditAS	TokenNameIdentifier	 Character Data Edit AS
extends	TokenNameextends	
NodeEditAS	TokenNameIdentifier	 Node Edit AS
{	TokenNameLBRACE	
/** * <code>true</code> if content only whitespace; <code>false</code> for * non-whitespace. */	TokenNameCOMMENT_JAVADOC	 <code>true</code> if content only whitespace; <code>false</code> for non-whitespace. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getIsWhitespaceOnly	TokenNameIdentifier	 get Is Whitespace Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Determines if data can be set. * @param offset Offset. * @param count Argument to be set. * @return <code>true</code> if no reason it can't be done; * <code>false</code> if it can't be done. */	TokenNameCOMMENT_JAVADOC	 Determines if data can be set. @param offset Offset. @param count Argument to be set. @return <code>true</code> if no reason it can't be done; <code>false</code> if it can't be done. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canSetData	TokenNameIdentifier	 can Set Data
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Determines if data can be appended. * @param arg Argument to be appended. * @return <code>true</code> if no reason it can't be done; * <code>false</code> if it can't be done. */	TokenNameCOMMENT_JAVADOC	 Determines if data can be appended. @param arg Argument to be appended. @return <code>true</code> if no reason it can't be done; <code>false</code> if it can't be done. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canAppendData	TokenNameIdentifier	 can Append Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Determines if data can be replaced. * @param offset Offset. * @param count Replacement. * @param arg Argument to be set. * @return <code>true</code> if no reason it can't be done; * <code>false</code> if it can't be done. */	TokenNameCOMMENT_JAVADOC	 Determines if data can be replaced. @param offset Offset. @param count Replacement. @param arg Argument to be set. @return <code>true</code> if no reason it can't be done; <code>false</code> if it can't be done. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canReplaceData	TokenNameIdentifier	 can Replace Data
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Determines if data can be inserted. * @param offset Offset. * @param arg Argument to be set. * @return <code>true</code> if no reason it can't be done; * <code>false</code> if it can't be done. */	TokenNameCOMMENT_JAVADOC	 Determines if data can be inserted. @param offset Offset. @param arg Argument to be set. @return <code>true</code> if no reason it can't be done; <code>false</code> if it can't be done. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canInsertData	TokenNameIdentifier	 can Insert Data
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Determines if data can be deleted. * @param offset Offset. * @param count Number of 16-bit units to delete. * @return <code>true</code> if no reason it can't be done; * <code>false</code> if it can't be done. */	TokenNameCOMMENT_JAVADOC	 Determines if data can be deleted. @param offset Offset. @param count Number of 16-bit units to delete. @return <code>true</code> if no reason it can't be done; <code>false</code> if it can't be done. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canDeleteData	TokenNameIdentifier	 can Delete Data
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
