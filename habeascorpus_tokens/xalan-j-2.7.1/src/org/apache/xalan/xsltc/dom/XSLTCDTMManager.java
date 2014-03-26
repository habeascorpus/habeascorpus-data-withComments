/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XSLTCDTMManager.java 468651 2006-10-28 07:04:25Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XSLTCDTMManager.java 468651 2006-10-28 07:04:25Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Source	TokenNameIdentifier	 Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMSource	TokenNameIdentifier	 DOM Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXSource	TokenNameIdentifier	 SAX Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamSource	TokenNameIdentifier	 Stream Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMException	TokenNameIdentifier	 DTM Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
DTMManagerDefault	TokenNameIdentifier	 DTM Manager Default
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLMessages	TokenNameIdentifier	 XML Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
trax	TokenNameIdentifier	 trax
.	TokenNameDOT	
DOM2SAX	TokenNameIdentifier	 DO M2 SAX
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
XMLReader	TokenNameIdentifier	 XML Reader
;	TokenNameSEMICOLON	
/** * The default implementation for the DTMManager. */	TokenNameCOMMENT_JAVADOC	 The default implementation for the DTMManager. 
public	TokenNamepublic	
class	TokenNameclass	
XSLTCDTMManager	TokenNameIdentifier	 XSLTCDTM Manager
extends	TokenNameextends	
DTMManagerDefault	TokenNameIdentifier	 DTM Manager Default
{	TokenNameLBRACE	
/** The default class name to use as the manager. */	TokenNameCOMMENT_JAVADOC	 The default class name to use as the manager. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_CLASS_NAME	TokenNameIdentifier	 DEFAULT  CLASS  NAME
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.XSLTCDTMManager"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.XSLTCDTMManager
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_PROP_NAME	TokenNameIdentifier	 DEFAULT  PROP  NAME
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.XSLTCDTMManager"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.XSLTCDTMManager
;	TokenNameSEMICOLON	
/** Set this to true if you want a dump of the DTM after creation */	TokenNameCOMMENT_JAVADOC	 Set this to true if you want a dump of the DTM after creation 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DUMPTREE	TokenNameIdentifier	 DUMPTREE
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Set this to true if you want basic diagnostics */	TokenNameCOMMENT_JAVADOC	 Set this to true if you want basic diagnostics 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Constructor DTMManagerDefault * */	TokenNameCOMMENT_JAVADOC	 Constructor DTMManagerDefault 
public	TokenNamepublic	
XSLTCDTMManager	TokenNameIdentifier	 XSLTCDTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtain a new instance of a <code>DTMManager</code>. * This static method creates a new factory instance. * The current implementation just returns a new XSLTCDTMManager instance. */	TokenNameCOMMENT_JAVADOC	 Obtain a new instance of a <code>DTMManager</code>. This static method creates a new factory instance. The current implementation just returns a new XSLTCDTMManager instance. 
public	TokenNamepublic	
static	TokenNamestatic	
XSLTCDTMManager	TokenNameIdentifier	 XSLTCDTM Manager
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XSLTCDTMManager	TokenNameIdentifier	 XSLTCDTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look up the class that provides the XSLTC DTM Manager service. * The following lookup procedure is used to find the service provider. * <ol> * <li>The value of the * <code>org.apache.xalan.xsltc.dom.XSLTCDTMManager</code> property, is * checked.</li> * <li>The <code>xalan.propeties</code> file is checked for a property * of the same name.</li> * <li>The * <code>META-INF/services/org.apache.xalan.xsltc.dom.XSLTCDTMManager</code> * file is checked. * </ol> * The default is <code>org.apache.xalan.xsltc.dom.XSLTCDTMManager</code>. */	TokenNameCOMMENT_JAVADOC	 Look up the class that provides the XSLTC DTM Manager service. The following lookup procedure is used to find the service provider. <ol> <li>The value of the <code>org.apache.xalan.xsltc.dom.XSLTCDTMManager</code> property, is checked.</li> <li>The <code>xalan.propeties</code> file is checked for a property of the same name.</li> <li>The <code>META-INF/services/org.apache.xalan.xsltc.dom.XSLTCDTMManager</code> file is checked. </ol> The default is <code>org.apache.xalan.xsltc.dom.XSLTCDTMManager</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
Class	TokenNameIdentifier	 Class
getDTMManagerClass	TokenNameIdentifier	 get DTM Manager Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
mgrClass	TokenNameIdentifier	 mgr Class
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
lookUpFactoryClass	TokenNameIdentifier	 look Up Factory Class
(	TokenNameLPAREN	
DEFAULT_PROP_NAME	TokenNameIdentifier	 DEFAULT  PROP  NAME
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
DEFAULT_CLASS_NAME	TokenNameIdentifier	 DEFAULT  CLASS  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If no class found, default to this one. (This should never happen - 	TokenNameCOMMENT_LINE	If no class found, default to this one. (This should never happen - 
// the ObjectFactory has already been told that the current class is 	TokenNameCOMMENT_LINE	the ObjectFactory has already been told that the current class is 
// the default). 	TokenNameCOMMENT_LINE	the default). 
return	TokenNamereturn	
(	TokenNameLPAREN	
mgrClass	TokenNameIdentifier	 mgr Class
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
mgrClass	TokenNameIdentifier	 mgr Class
:	TokenNameCOLON	
XSLTCDTMManager	TokenNameIdentifier	 XSLTCDTM Manager
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an instance of a DTM, loaded with the content from the * specified source. If the unique flag is true, a new instance will * always be returned. Otherwise it is up to the DTMManager to return a * new instance or an instance that it already created and may be being used * by someone else. * (I think more parameters will need to be added for error handling, and * entity resolution). * * @param source the specification of the source object. * @param unique true if the returned DTM must be unique, probably because it * is going to be mutated. * @param whiteSpaceFilter Enables filtering of whitespace nodes, and may * be null. * @param incremental true if the DTM should be built incrementally, if * possible. * @param doIndexing true if the caller considers it worth it to use * indexing schemes. * * @return a non-null DTM reference. */	TokenNameCOMMENT_JAVADOC	 Get an instance of a DTM, loaded with the content from the specified source. If the unique flag is true, a new instance will always be returned. Otherwise it is up to the DTMManager to return a new instance or an instance that it already created and may be being used by someone else. (I think more parameters will need to be added for error handling, and entity resolution). * @param source the specification of the source object. @param unique true if the returned DTM must be unique, probably because it is going to be mutated. @param whiteSpaceFilter Enables filtering of whitespace nodes, and may be null. @param incremental true if the DTM should be built incrementally, if possible. @param doIndexing true if the caller considers it worth it to use indexing schemes. * @return a non-null DTM reference. 
public	TokenNamepublic	
DTM	TokenNameIdentifier	 DTM
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
boolean	TokenNameboolean	
unique	TokenNameIdentifier	 unique
,	TokenNameCOMMA	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
incremental	TokenNameIdentifier	 incremental
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doIndexing	TokenNameIdentifier	 do Indexing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
unique	TokenNameIdentifier	 unique
,	TokenNameCOMMA	
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
incremental	TokenNameIdentifier	 incremental
,	TokenNameCOMMA	
doIndexing	TokenNameIdentifier	 do Indexing
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an instance of a DTM, loaded with the content from the * specified source. If the unique flag is true, a new instance will * always be returned. Otherwise it is up to the DTMManager to return a * new instance or an instance that it already created and may be being used * by someone else. * (I think more parameters will need to be added for error handling, and * entity resolution). * * @param source the specification of the source object. * @param unique true if the returned DTM must be unique, probably because it * is going to be mutated. * @param whiteSpaceFilter Enables filtering of whitespace nodes, and may * be null. * @param incremental true if the DTM should be built incrementally, if * possible. * @param doIndexing true if the caller considers it worth it to use * indexing schemes. * @param buildIdIndex true if the id index table should be built. * * @return a non-null DTM reference. */	TokenNameCOMMENT_JAVADOC	 Get an instance of a DTM, loaded with the content from the specified source. If the unique flag is true, a new instance will always be returned. Otherwise it is up to the DTMManager to return a new instance or an instance that it already created and may be being used by someone else. (I think more parameters will need to be added for error handling, and entity resolution). * @param source the specification of the source object. @param unique true if the returned DTM must be unique, probably because it is going to be mutated. @param whiteSpaceFilter Enables filtering of whitespace nodes, and may be null. @param incremental true if the DTM should be built incrementally, if possible. @param doIndexing true if the caller considers it worth it to use indexing schemes. @param buildIdIndex true if the id index table should be built. * @return a non-null DTM reference. 
public	TokenNamepublic	
DTM	TokenNameIdentifier	 DTM
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
boolean	TokenNameboolean	
unique	TokenNameIdentifier	 unique
,	TokenNameCOMMA	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
incremental	TokenNameIdentifier	 incremental
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doIndexing	TokenNameIdentifier	 do Indexing
,	TokenNameCOMMA	
boolean	TokenNameboolean	
buildIdIndex	TokenNameIdentifier	 build Id Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
unique	TokenNameIdentifier	 unique
,	TokenNameCOMMA	
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
incremental	TokenNameIdentifier	 incremental
,	TokenNameCOMMA	
doIndexing	TokenNameIdentifier	 do Indexing
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buildIdIndex	TokenNameIdentifier	 build Id Index
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an instance of a DTM, loaded with the content from the * specified source. If the unique flag is true, a new instance will * always be returned. Otherwise it is up to the DTMManager to return a * new instance or an instance that it already created and may be being used * by someone else. * (I think more parameters will need to be added for error handling, and * entity resolution). * * @param source the specification of the source object. * @param unique true if the returned DTM must be unique, probably because it * is going to be mutated. * @param whiteSpaceFilter Enables filtering of whitespace nodes, and may * be null. * @param incremental true if the DTM should be built incrementally, if * possible. * @param doIndexing true if the caller considers it worth it to use * indexing schemes. * @param buildIdIndex true if the id index table should be built. * @param newNameTable true if we want to use a separate ExpandedNameTable * for this DTM. * * @return a non-null DTM reference. */	TokenNameCOMMENT_JAVADOC	 Get an instance of a DTM, loaded with the content from the specified source. If the unique flag is true, a new instance will always be returned. Otherwise it is up to the DTMManager to return a new instance or an instance that it already created and may be being used by someone else. (I think more parameters will need to be added for error handling, and entity resolution). * @param source the specification of the source object. @param unique true if the returned DTM must be unique, probably because it is going to be mutated. @param whiteSpaceFilter Enables filtering of whitespace nodes, and may be null. @param incremental true if the DTM should be built incrementally, if possible. @param doIndexing true if the caller considers it worth it to use indexing schemes. @param buildIdIndex true if the id index table should be built. @param newNameTable true if we want to use a separate ExpandedNameTable for this DTM. * @return a non-null DTM reference. 
public	TokenNamepublic	
DTM	TokenNameIdentifier	 DTM
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
boolean	TokenNameboolean	
unique	TokenNameIdentifier	 unique
,	TokenNameCOMMA	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
incremental	TokenNameIdentifier	 incremental
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doIndexing	TokenNameIdentifier	 do Indexing
,	TokenNameCOMMA	
boolean	TokenNameboolean	
buildIdIndex	TokenNameIdentifier	 build Id Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
newNameTable	TokenNameIdentifier	 new Name Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
unique	TokenNameIdentifier	 unique
,	TokenNameCOMMA	
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
incremental	TokenNameIdentifier	 incremental
,	TokenNameCOMMA	
doIndexing	TokenNameIdentifier	 do Indexing
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buildIdIndex	TokenNameIdentifier	 build Id Index
,	TokenNameCOMMA	
newNameTable	TokenNameIdentifier	 new Name Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an instance of a DTM, loaded with the content from the * specified source. If the unique flag is true, a new instance will * always be returned. Otherwise it is up to the DTMManager to return a * new instance or an instance that it already created and may be being used * by someone else. * (I think more parameters will need to be added for error handling, and * entity resolution). * * @param source the specification of the source object. * @param unique true if the returned DTM must be unique, probably because it * is going to be mutated. * @param whiteSpaceFilter Enables filtering of whitespace nodes, and may * be null. * @param incremental true if the DTM should be built incrementally, if * possible. * @param doIndexing true if the caller considers it worth it to use * indexing schemes. * @param hasUserReader true if <code>source</code> is a * <code>SAXSource</code> object that has an * <code>XMLReader</code>, that was specified by the * user. * @param size Specifies initial size of tables that represent the DTM * @param buildIdIndex true if the id index table should be built. * * @return a non-null DTM reference. */	TokenNameCOMMENT_JAVADOC	 Get an instance of a DTM, loaded with the content from the specified source. If the unique flag is true, a new instance will always be returned. Otherwise it is up to the DTMManager to return a new instance or an instance that it already created and may be being used by someone else. (I think more parameters will need to be added for error handling, and entity resolution). * @param source the specification of the source object. @param unique true if the returned DTM must be unique, probably because it is going to be mutated. @param whiteSpaceFilter Enables filtering of whitespace nodes, and may be null. @param incremental true if the DTM should be built incrementally, if possible. @param doIndexing true if the caller considers it worth it to use indexing schemes. @param hasUserReader true if <code>source</code> is a <code>SAXSource</code> object that has an <code>XMLReader</code>, that was specified by the user. @param size Specifies initial size of tables that represent the DTM @param buildIdIndex true if the id index table should be built. * @return a non-null DTM reference. 
public	TokenNamepublic	
DTM	TokenNameIdentifier	 DTM
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
boolean	TokenNameboolean	
unique	TokenNameIdentifier	 unique
,	TokenNameCOMMA	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
incremental	TokenNameIdentifier	 incremental
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doIndexing	TokenNameIdentifier	 do Indexing
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hasUserReader	TokenNameIdentifier	 has User Reader
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
boolean	TokenNameboolean	
buildIdIndex	TokenNameIdentifier	 build Id Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
unique	TokenNameIdentifier	 unique
,	TokenNameCOMMA	
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
incremental	TokenNameIdentifier	 incremental
,	TokenNameCOMMA	
doIndexing	TokenNameIdentifier	 do Indexing
,	TokenNameCOMMA	
hasUserReader	TokenNameIdentifier	 has User Reader
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
buildIdIndex	TokenNameIdentifier	 build Id Index
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an instance of a DTM, loaded with the content from the * specified source. If the unique flag is true, a new instance will * always be returned. Otherwise it is up to the DTMManager to return a * new instance or an instance that it already created and may be being used * by someone else. * (I think more parameters will need to be added for error handling, and * entity resolution). * * @param source the specification of the source object. * @param unique true if the returned DTM must be unique, probably because it * is going to be mutated. * @param whiteSpaceFilter Enables filtering of whitespace nodes, and may * be null. * @param incremental true if the DTM should be built incrementally, if * possible. * @param doIndexing true if the caller considers it worth it to use * indexing schemes. * @param hasUserReader true if <code>source</code> is a * <code>SAXSource</code> object that has an * <code>XMLReader</code>, that was specified by the * user. * @param size Specifies initial size of tables that represent the DTM * @param buildIdIndex true if the id index table should be built. * @param newNameTable true if we want to use a separate ExpandedNameTable * for this DTM. * * @return a non-null DTM reference. */	TokenNameCOMMENT_JAVADOC	 Get an instance of a DTM, loaded with the content from the specified source. If the unique flag is true, a new instance will always be returned. Otherwise it is up to the DTMManager to return a new instance or an instance that it already created and may be being used by someone else. (I think more parameters will need to be added for error handling, and entity resolution). * @param source the specification of the source object. @param unique true if the returned DTM must be unique, probably because it is going to be mutated. @param whiteSpaceFilter Enables filtering of whitespace nodes, and may be null. @param incremental true if the DTM should be built incrementally, if possible. @param doIndexing true if the caller considers it worth it to use indexing schemes. @param hasUserReader true if <code>source</code> is a <code>SAXSource</code> object that has an <code>XMLReader</code>, that was specified by the user. @param size Specifies initial size of tables that represent the DTM @param buildIdIndex true if the id index table should be built. @param newNameTable true if we want to use a separate ExpandedNameTable for this DTM. * @return a non-null DTM reference. 
public	TokenNamepublic	
DTM	TokenNameIdentifier	 DTM
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
boolean	TokenNameboolean	
unique	TokenNameIdentifier	 unique
,	TokenNameCOMMA	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
incremental	TokenNameIdentifier	 incremental
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doIndexing	TokenNameIdentifier	 do Indexing
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hasUserReader	TokenNameIdentifier	 has User Reader
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
boolean	TokenNameboolean	
buildIdIndex	TokenNameIdentifier	 build Id Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
newNameTable	TokenNameIdentifier	 new Name Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
&&	TokenNameAND_AND	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Starting "	TokenNameStringLiteral	Starting 
+	TokenNamePLUS	
(	TokenNameLPAREN	
unique	TokenNameIdentifier	 unique
?	TokenNameQUESTION	
"UNIQUE"	TokenNameStringLiteral	UNIQUE
:	TokenNameCOLON	
"shared"	TokenNameStringLiteral	shared
)	TokenNameRPAREN	
+	TokenNamePLUS	
" source: "	TokenNameStringLiteral	 source: 
+	TokenNamePLUS	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
dtmPos	TokenNameIdentifier	 dtm Pos
=	TokenNameEQUAL	
getFirstFreeDTMID	TokenNameIdentifier	 get First Free DTMID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
documentID	TokenNameIdentifier	 document ID
=	TokenNameEQUAL	
dtmPos	TokenNameIdentifier	 dtm Pos
<<	TokenNameLEFT_SHIFT	
IDENT_DTM_NODE_BITS	TokenNameIdentifier	 IDENT  DTM  NODE  BITS
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
DOMSource	TokenNameIdentifier	 DOM Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
DOMSource	TokenNameIdentifier	 DOM Source
domsrc	TokenNameIdentifier	 domsrc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMSource	TokenNameIdentifier	 DOM Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
final	TokenNamefinal	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
domsrc	TokenNameIdentifier	 domsrc
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DOM2SAX	TokenNameIdentifier	 DO M2 SAX
dom2sax	TokenNameIdentifier	 dom2sax
=	TokenNameEQUAL	
new	TokenNamenew	
DOM2SAX	TokenNameIdentifier	 DO M2 SAX
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SAXImpl	TokenNameIdentifier	 SAX Impl
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
new	TokenNamenew	
SAXImpl	TokenNameIdentifier	 SAX Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
documentID	TokenNameIdentifier	 document ID
,	TokenNameCOMMA	
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
doIndexing	TokenNameIdentifier	 do Indexing
,	TokenNameCOMMA	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
DEFAULT_BLOCKSIZE	TokenNameIdentifier	 DEFAULT  BLOCKSIZE
,	TokenNameCOMMA	
buildIdIndex	TokenNameIdentifier	 build Id Index
,	TokenNameCOMMA	
newNameTable	TokenNameIdentifier	 new Name Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
new	TokenNamenew	
SAXImpl	TokenNameIdentifier	 SAX Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
documentID	TokenNameIdentifier	 document ID
,	TokenNameCOMMA	
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
doIndexing	TokenNameIdentifier	 do Indexing
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
buildIdIndex	TokenNameIdentifier	 build Id Index
,	TokenNameCOMMA	
newNameTable	TokenNameIdentifier	 new Name Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
setDocumentURI	TokenNameIdentifier	 set Document URI
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDTM	TokenNameIdentifier	 add DTM
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
dtmPos	TokenNameIdentifier	 dtm Pos
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dom2sax	TokenNameIdentifier	 dom2sax
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
dom2sax	TokenNameIdentifier	 dom2sax
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
re	TokenNameIdentifier	 re
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isSAXSource	TokenNameIdentifier	 is SAX Source
=	TokenNameEQUAL	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
SAXSource	TokenNameIdentifier	 SAX Source
)	TokenNameRPAREN	
:	TokenNameCOLON	
true	TokenNametrue	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isStreamSource	TokenNameIdentifier	 is Stream Source
=	TokenNameEQUAL	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
StreamSource	TokenNameIdentifier	 Stream Source
)	TokenNameRPAREN	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isSAXSource	TokenNameIdentifier	 is SAX Source
||	TokenNameOR_OR	
isStreamSource	TokenNameIdentifier	 is Stream Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLReader	TokenNameIdentifier	 XML Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
InputSource	TokenNameIdentifier	 Input Source
xmlSource	TokenNameIdentifier	 xml Source
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xmlSource	TokenNameIdentifier	 xml Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
hasUserReader	TokenNameIdentifier	 has User Reader
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Make sure the user didn't lie 	TokenNameCOMMENT_LINE	Make sure the user didn't lie 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlSource	TokenNameIdentifier	 xml Source
=	TokenNameEQUAL	
SAXSource	TokenNameIdentifier	 SAX Source
.	TokenNameDOT	
sourceToInputSource	TokenNameIdentifier	 source To Input Source
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
urlOfSource	TokenNameIdentifier	 url Of Source
=	TokenNameEQUAL	
xmlSource	TokenNameIdentifier	 xml Source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
urlOfSource	TokenNameIdentifier	 url Of Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
urlOfSource	TokenNameIdentifier	 url Of Source
=	TokenNameEQUAL	
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
.	TokenNameDOT	
getAbsoluteURI	TokenNameIdentifier	 get Absolute URI
(	TokenNameLPAREN	
urlOfSource	TokenNameIdentifier	 url Of Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %REVIEW% Is there a better way to send a warning? 	TokenNameCOMMENT_LINE	%REVIEW% Is there a better way to send a warning? 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Can not absolutize URL: "	TokenNameStringLiteral	Can not absolutize URL: 
+	TokenNamePLUS	
urlOfSource	TokenNameIdentifier	 url Of Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
xmlSource	TokenNameIdentifier	 xml Source
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
urlOfSource	TokenNameIdentifier	 url Of Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Create the basic SAX2DTM. 	TokenNameCOMMENT_LINE	Create the basic SAX2DTM. 
SAXImpl	TokenNameIdentifier	 SAX Impl
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
new	TokenNamenew	
SAXImpl	TokenNameIdentifier	 SAX Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
documentID	TokenNameIdentifier	 document ID
,	TokenNameCOMMA	
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
doIndexing	TokenNameIdentifier	 do Indexing
,	TokenNameCOMMA	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
DEFAULT_BLOCKSIZE	TokenNameIdentifier	 DEFAULT  BLOCKSIZE
,	TokenNameCOMMA	
buildIdIndex	TokenNameIdentifier	 build Id Index
,	TokenNameCOMMA	
newNameTable	TokenNameIdentifier	 new Name Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
new	TokenNamenew	
SAXImpl	TokenNameIdentifier	 SAX Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
documentID	TokenNameIdentifier	 document ID
,	TokenNameCOMMA	
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
doIndexing	TokenNameIdentifier	 do Indexing
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
buildIdIndex	TokenNameIdentifier	 build Id Index
,	TokenNameCOMMA	
newNameTable	TokenNameIdentifier	 new Name Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Go ahead and add the DTM to the lookup table. This needs to be 	TokenNameCOMMENT_LINE	Go ahead and add the DTM to the lookup table. This needs to be 
// done before any parsing occurs. Note offset 0, since we've just 	TokenNameCOMMENT_LINE	done before any parsing occurs. Note offset 0, since we've just 
// created a new DTM. 	TokenNameCOMMENT_LINE	created a new DTM. 
addDTM	TokenNameIdentifier	 add DTM
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
dtmPos	TokenNameIdentifier	 dtm Pos
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Then the user will construct it themselves. 	TokenNameCOMMENT_LINE	Then the user will construct it themselves. 
return	TokenNamereturn	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getBuilder	TokenNameIdentifier	 get Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasUserReader	TokenNameIdentifier	 has User Reader
||	TokenNameOR_OR	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getDTDHandler	TokenNameIdentifier	 get DTD Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setDTDHandler	TokenNameIdentifier	 set DTD Handler
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasUserReader	TokenNameIdentifier	 has User Reader
||	TokenNameOR_OR	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"http://xml.org/sax/properties/lexical-handler"	TokenNameStringLiteral	http://xml.org/sax/properties/lexical-handler
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
xmlSource	TokenNameIdentifier	 xml Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
re	TokenNameIdentifier	 re
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasUserReader	TokenNameIdentifier	 has User Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
releaseXMLReader	TokenNameIdentifier	 release XML Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DUMPTREE	TokenNameIdentifier	 DUMPTREE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Dumping SAX2DOM"	TokenNameStringLiteral	Dumping SAX2DOM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
dumpDTM	TokenNameIdentifier	 dump DTM
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// It should have been handled by a derived class or the caller 	TokenNameCOMMENT_LINE	It should have been handled by a derived class or the caller 
// made a mistake. 	TokenNameCOMMENT_LINE	made a mistake. 
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_NOT_SUPPORTED	TokenNameIdentifier	 ER  NOT  SUPPORTED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
source	TokenNameIdentifier	 source
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
