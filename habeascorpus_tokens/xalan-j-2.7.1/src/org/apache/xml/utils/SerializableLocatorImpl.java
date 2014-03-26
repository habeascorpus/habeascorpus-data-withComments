/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SerializableLocatorImpl.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SerializableLocatorImpl.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * The standard SAX implementation of LocatorImpl is not serializable, * limiting its utility as "a persistent snapshot of a locator". * This is a quick hack to make it so. Note that it makes more sense * in many cases to set up fields to hold this data rather than pointing * at another object... but that decision should be made on architectural * grounds rather than serializability. *<p> * It isn't clear whether subclassing LocatorImpl and adding serialization * methods makes more sense than copying it and just adding Serializable * to its interface. Since it's so simple, I've taken the latter approach * for now. * * @see org.xml.sax.helpers.LocatorImpl * @see org.xml.sax.Locator Locator * @since XalanJ2 * @author Joe Kesselman * @version 1.0 */	TokenNameCOMMENT_JAVADOC	 The standard SAX implementation of LocatorImpl is not serializable, limiting its utility as "a persistent snapshot of a locator". This is a quick hack to make it so. Note that it makes more sense in many cases to set up fields to hold this data rather than pointing at another object... but that decision should be made on architectural grounds rather than serializability. *<p> It isn't clear whether subclassing LocatorImpl and adding serialization methods makes more sense than copying it and just adding Serializable to its interface. Since it's so simple, I've taken the latter approach for now. * @see org.xml.sax.helpers.LocatorImpl @see org.xml.sax.Locator Locator @since XalanJ2 @author Joe Kesselman @version 1.0 
public	TokenNamepublic	
class	TokenNameclass	
SerializableLocatorImpl	TokenNameIdentifier	 Serializable Locator Impl
implements	TokenNameimplements	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Locator	TokenNameIdentifier	 Locator
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
2660312888446371460L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Zero-argument constructor. * * <p>SAX says "This will not normally be useful, since the main purpose * of this class is to make a snapshot of an existing Locator." In fact, * it _is_ sometimes useful when you want to construct a new Locator * pointing to a specific location... which, after all, is why the * setter methods are provided. * </p> */	TokenNameCOMMENT_JAVADOC	 Zero-argument constructor. * <p>SAX says "This will not normally be useful, since the main purpose of this class is to make a snapshot of an existing Locator." In fact, it _is_ sometimes useful when you want to construct a new Locator pointing to a specific location... which, after all, is why the setter methods are provided. </p> 
public	TokenNamepublic	
SerializableLocatorImpl	TokenNameIdentifier	 Serializable Locator Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Copy constructor. * * <p>Create a persistent copy of the current state of a locator. * When the original locator changes, this copy will still keep * the original values (and it can be used outside the scope of * DocumentHandler methods).</p> * * @param locator The locator to copy. */	TokenNameCOMMENT_JAVADOC	 Copy constructor. * <p>Create a persistent copy of the current state of a locator. When the original locator changes, this copy will still keep the original values (and it can be used outside the scope of DocumentHandler methods).</p> * @param locator The locator to copy. 
public	TokenNamepublic	
SerializableLocatorImpl	TokenNameIdentifier	 Serializable Locator Impl
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Locator	TokenNameIdentifier	 Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setLineNumber	TokenNameIdentifier	 set Line Number
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setColumnNumber	TokenNameIdentifier	 set Column Number
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Implementation of org.xml.sax.Locator 	TokenNameCOMMENT_LINE	Implementation of org.xml.sax.Locator 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Return the saved public identifier. * * @return The public identifier as a string, or null if none * is available. * @see org.xml.sax.Locator#getPublicId * @see #setPublicId */	TokenNameCOMMENT_JAVADOC	 Return the saved public identifier. * @return The public identifier as a string, or null if none is available. @see org.xml.sax.Locator#getPublicId @see #setPublicId 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the saved system identifier. * * @return The system identifier as a string, or null if none * is available. * @see org.xml.sax.Locator#getSystemId * @see #setSystemId */	TokenNameCOMMENT_JAVADOC	 Return the saved system identifier. * @return The system identifier as a string, or null if none is available. @see org.xml.sax.Locator#getSystemId @see #setSystemId 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the saved line number (1-based). * * @return The line number as an integer, or -1 if none is available. * @see org.xml.sax.Locator#getLineNumber * @see #setLineNumber */	TokenNameCOMMENT_JAVADOC	 Return the saved line number (1-based). * @return The line number as an integer, or -1 if none is available. @see org.xml.sax.Locator#getLineNumber @see #setLineNumber 
public	TokenNamepublic	
int	TokenNameint	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the saved column number (1-based). * * @return The column number as an integer, or -1 if none is available. * @see org.xml.sax.Locator#getColumnNumber * @see #setColumnNumber */	TokenNameCOMMENT_JAVADOC	 Return the saved column number (1-based). * @return The column number as an integer, or -1 if none is available. @see org.xml.sax.Locator#getColumnNumber @see #setColumnNumber 
public	TokenNamepublic	
int	TokenNameint	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
columnNumber	TokenNameIdentifier	 column Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Setters for the properties (not in org.xml.sax.Locator) 	TokenNameCOMMENT_LINE	Setters for the properties (not in org.xml.sax.Locator) 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Set the public identifier for this locator. * * @param publicId The new public identifier, or null * if none is available. * @see #getPublicId */	TokenNameCOMMENT_JAVADOC	 Set the public identifier for this locator. * @param publicId The new public identifier, or null if none is available. @see #getPublicId 
public	TokenNamepublic	
void	TokenNamevoid	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
publicId	TokenNameIdentifier	 public Id
=	TokenNameEQUAL	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the system identifier for this locator. * * @param systemId The new system identifier, or null * if none is available. * @see #getSystemId */	TokenNameCOMMENT_JAVADOC	 Set the system identifier for this locator. * @param systemId The new system identifier, or null if none is available. @see #getSystemId 
public	TokenNamepublic	
void	TokenNamevoid	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the line number for this locator (1-based). * * @param lineNumber The line number, or -1 if none is available. * @see #getLineNumber */	TokenNameCOMMENT_JAVADOC	 Set the line number for this locator (1-based). * @param lineNumber The line number, or -1 if none is available. @see #getLineNumber 
public	TokenNamepublic	
void	TokenNamevoid	
setLineNumber	TokenNameIdentifier	 set Line Number
(	TokenNameLPAREN	
int	TokenNameint	
lineNumber	TokenNameIdentifier	 line Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
=	TokenNameEQUAL	
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the column number for this locator (1-based). * * @param columnNumber The column number, or -1 if none is available. * @see #getColumnNumber */	TokenNameCOMMENT_JAVADOC	 Set the column number for this locator (1-based). * @param columnNumber The column number, or -1 if none is available. @see #getColumnNumber 
public	TokenNamepublic	
void	TokenNamevoid	
setColumnNumber	TokenNameIdentifier	 set Column Number
(	TokenNameLPAREN	
int	TokenNameint	
columnNumber	TokenNameIdentifier	 column Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
columnNumber	TokenNameIdentifier	 column Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Internal state. 	TokenNameCOMMENT_LINE	Internal state. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * The public ID. * @serial */	TokenNameCOMMENT_JAVADOC	 The public ID. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
/** * The system ID. * @serial */	TokenNameCOMMENT_JAVADOC	 The system ID. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
/** * The line number. * @serial */	TokenNameCOMMENT_JAVADOC	 The line number. @serial 
private	TokenNameprivate	
int	TokenNameint	
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
/** * The column number. * @serial */	TokenNameCOMMENT_JAVADOC	 The column number. @serial 
private	TokenNameprivate	
int	TokenNameint	
columnNumber	TokenNameIdentifier	 column Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end of LocatorImpl.java 	TokenNameCOMMENT_LINE	end of LocatorImpl.java 
