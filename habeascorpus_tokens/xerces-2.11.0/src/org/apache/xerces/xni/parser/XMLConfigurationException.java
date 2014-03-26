/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * An XNI parser configuration exception. This exception class extends * <code>XNIException</code> in order to differentiate between general * parsing errors and configuration errors. * * @author Andy Clark, IBM * * @version $Id: XMLConfigurationException.java 447244 2006-09-18 05:20:40Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 An XNI parser configuration exception. This exception class extends <code>XNIException</code> in order to differentiate between general parsing errors and configuration errors. * @author Andy Clark, IBM * @version $Id: XMLConfigurationException.java 447244 2006-09-18 05:20:40Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
extends	TokenNameextends	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
5437427404547669188L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Exception type: identifier not recognized. */	TokenNameCOMMENT_JAVADOC	 Exception type: identifier not recognized. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NOT_RECOGNIZED	TokenNameIdentifier	 NOT  RECOGNIZED
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Exception type: identifier not supported. */	TokenNameCOMMENT_JAVADOC	 Exception type: identifier not supported. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NOT_SUPPORTED	TokenNameIdentifier	 NOT  SUPPORTED
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Exception type. */	TokenNameCOMMENT_JAVADOC	 Exception type. 
protected	TokenNameprotected	
short	TokenNameshort	
fType	TokenNameIdentifier	 f Type
;	TokenNameSEMICOLON	
/** Identifier. */	TokenNameCOMMENT_JAVADOC	 Identifier. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fIdentifier	TokenNameIdentifier	 f Identifier
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs a configuration exception with the specified type * and feature/property identifier. * * @param type The type of the exception. * @param identifier The feature or property identifier. * * @see #NOT_RECOGNIZED * @see #NOT_SUPPORTED */	TokenNameCOMMENT_JAVADOC	 Constructs a configuration exception with the specified type and feature/property identifier. * @param type The type of the exception. @param identifier The feature or property identifier. * @see #NOT_RECOGNIZED @see #NOT_SUPPORTED 
public	TokenNamepublic	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
identifier	TokenNameIdentifier	 identifier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
identifier	TokenNameIdentifier	 identifier
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
fIdentifier	TokenNameIdentifier	 f Identifier
=	TokenNameEQUAL	
identifier	TokenNameIdentifier	 identifier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(short,String) 	TokenNameCOMMENT_LINE	<init>(short,String) 
/** * Constructs a configuration exception with the specified type, * feature/property identifier, and error message * * @param type The type of the exception. * @param identifier The feature or property identifier. * @param message The error message. * * @see #NOT_RECOGNIZED * @see #NOT_SUPPORTED */	TokenNameCOMMENT_JAVADOC	 Constructs a configuration exception with the specified type, feature/property identifier, and error message * @param type The type of the exception. @param identifier The feature or property identifier. @param message The error message. * @see #NOT_RECOGNIZED @see #NOT_SUPPORTED 
public	TokenNamepublic	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
identifier	TokenNameIdentifier	 identifier
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
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
fIdentifier	TokenNameIdentifier	 f Identifier
=	TokenNameEQUAL	
identifier	TokenNameIdentifier	 identifier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(short,String,String) 	TokenNameCOMMENT_LINE	<init>(short,String,String) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * Returns the exception type. * * @see #NOT_RECOGNIZED * @see #NOT_SUPPORTED */	TokenNameCOMMENT_JAVADOC	 Returns the exception type. * @see #NOT_RECOGNIZED @see #NOT_SUPPORTED 
public	TokenNamepublic	
short	TokenNameshort	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fType	TokenNameIdentifier	 f Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getType():short 	TokenNameCOMMENT_LINE	getType():short 
/** Returns the feature or property identifier. */	TokenNameCOMMENT_JAVADOC	 Returns the feature or property identifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getIdentifier	TokenNameIdentifier	 get Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fIdentifier	TokenNameIdentifier	 f Identifier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getIdentifier():String 	TokenNameCOMMENT_LINE	getIdentifier():String 
}	TokenNameRBRACE	
// class XMLConfigurationException 	TokenNameCOMMENT_LINE	class XMLConfigurationException 
