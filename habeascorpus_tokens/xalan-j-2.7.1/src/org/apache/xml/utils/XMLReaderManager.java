/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XMLReaderManager.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XMLReaderManager.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
FactoryConfigurationError	TokenNameIdentifier	 Factory Configuration Error
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
XMLReaderFactory	TokenNameIdentifier	 XML Reader Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * Creates XMLReader objects and caches them for re-use. * This class follows the singleton pattern. */	TokenNameCOMMENT_JAVADOC	 Creates XMLReader objects and caches them for re-use. This class follows the singleton pattern. 
public	TokenNamepublic	
class	TokenNameclass	
XMLReaderManager	TokenNameIdentifier	 XML Reader Manager
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACES_FEATURE	TokenNameIdentifier	 NAMESPACES  FEATURE
=	TokenNameEQUAL	
"http://xml.org/sax/features/namespaces"	TokenNameStringLiteral	http://xml.org/sax/features/namespaces
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACE_PREFIXES_FEATURE	TokenNameIdentifier	 NAMESPACE  PREFIXES  FEATURE
=	TokenNameEQUAL	
"http://xml.org/sax/features/namespace-prefixes"	TokenNameStringLiteral	http://xml.org/sax/features/namespace-prefixes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
XMLReaderManager	TokenNameIdentifier	 XML Reader Manager
m_singletonManager	TokenNameIdentifier	 m singleton Manager
=	TokenNameEQUAL	
new	TokenNamenew	
XMLReaderManager	TokenNameIdentifier	 XML Reader Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Parser factory to be used to construct XMLReader objects */	TokenNameCOMMENT_JAVADOC	 Parser factory to be used to construct XMLReader objects 
private	TokenNameprivate	
static	TokenNamestatic	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
m_parserFactory	TokenNameIdentifier	 m parser Factory
;	TokenNameSEMICOLON	
/** * Cache of XMLReader objects */	TokenNameCOMMENT_JAVADOC	 Cache of XMLReader objects 
private	TokenNameprivate	
ThreadLocal	TokenNameIdentifier	 Thread Local
m_readers	TokenNameIdentifier	 m readers
;	TokenNameSEMICOLON	
/** * Keeps track of whether an XMLReader object is in use. */	TokenNameCOMMENT_JAVADOC	 Keeps track of whether an XMLReader object is in use. 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
m_inUse	TokenNameIdentifier	 m in Use
;	TokenNameSEMICOLON	
/** * Hidden constructor */	TokenNameCOMMENT_JAVADOC	 Hidden constructor 
private	TokenNameprivate	
XMLReaderManager	TokenNameIdentifier	 XML Reader Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Retrieves the singleton reader manager */	TokenNameCOMMENT_JAVADOC	 Retrieves the singleton reader manager 
public	TokenNamepublic	
static	TokenNamestatic	
XMLReaderManager	TokenNameIdentifier	 XML Reader Manager
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_singletonManager	TokenNameIdentifier	 m singleton Manager
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves a cached XMLReader for this thread, or creates a new * XMLReader, if the existing reader is in use. When the caller no * longer needs the reader, it must release it with a call to * {@link #releaseXMLReader}. */	TokenNameCOMMENT_JAVADOC	 Retrieves a cached XMLReader for this thread, or creates a new XMLReader, if the existing reader is in use. When the caller no longer needs the reader, it must release it with a call to {@link #releaseXMLReader}. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
XMLReader	TokenNameIdentifier	 XML Reader
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
XMLReader	TokenNameIdentifier	 XML Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
readerInUse	TokenNameIdentifier	 reader In Use
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_readers	TokenNameIdentifier	 m readers
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// When the m_readers.get() method is called for the first time 	TokenNameCOMMENT_LINE	When the m_readers.get() method is called for the first time 
// on a thread, a new XMLReader will automatically be created. 	TokenNameCOMMENT_LINE	on a thread, a new XMLReader will automatically be created. 
m_readers	TokenNameIdentifier	 m readers
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadLocal	TokenNameIdentifier	 Thread Local
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_inUse	TokenNameIdentifier	 m in Use
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_inUse	TokenNameIdentifier	 m in Use
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If the cached reader for this thread is in use, construct a new 	TokenNameCOMMENT_LINE	If the cached reader for this thread is in use, construct a new 
// one; otherwise, return the cached reader. 	TokenNameCOMMENT_LINE	one; otherwise, return the cached reader. 
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLReader	TokenNameIdentifier	 XML Reader
)	TokenNameRPAREN	
m_readers	TokenNameIdentifier	 m readers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
threadHasReader	TokenNameIdentifier	 thread Has Reader
=	TokenNameEQUAL	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
threadHasReader	TokenNameIdentifier	 thread Has Reader
||	TokenNameOR_OR	
m_inUse	TokenNameIdentifier	 m in Use
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// According to JAXP 1.2 specification, if a SAXSource 	TokenNameCOMMENT_LINE	According to JAXP 1.2 specification, if a SAXSource 
// is created using a SAX InputSource the Transformer or 	TokenNameCOMMENT_LINE	is created using a SAX InputSource the Transformer or 
// TransformerFactory creates a reader via the 	TokenNameCOMMENT_LINE	TransformerFactory creates a reader via the 
// XMLReaderFactory if setXMLReader is not used 	TokenNameCOMMENT_LINE	XMLReaderFactory if setXMLReader is not used 
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
XMLReaderFactory	TokenNameIdentifier	 XML Reader Factory
.	TokenNameDOT	
createXMLReader	TokenNameIdentifier	 create XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// If unable to create an instance, let's try to use 	TokenNameCOMMENT_LINE	If unable to create an instance, let's try to use 
// the XMLReader from JAXP 	TokenNameCOMMENT_LINE	the XMLReader from JAXP 
if	TokenNameif	
(	TokenNameLPAREN	
m_parserFactory	TokenNameIdentifier	 m parser Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_parserFactory	TokenNameIdentifier	 m parser Factory
=	TokenNameEQUAL	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_parserFactory	TokenNameIdentifier	 m parser Factory
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
m_parserFactory	TokenNameIdentifier	 m parser Factory
.	TokenNameDOT	
newSAXParser	TokenNameIdentifier	 new SAX Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
pce	TokenNameIdentifier	 pce
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
pce	TokenNameIdentifier	 pce
;	TokenNameSEMICOLON	
// pass along pce 	TokenNameCOMMENT_LINE	pass along pce 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
NAMESPACES_FEATURE	TokenNameIdentifier	 NAMESPACES  FEATURE
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
NAMESPACE_PREFIXES_FEATURE	TokenNameIdentifier	 NAMESPACE  PREFIXES  FEATURE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Try to carry on if we've got a parser that 	TokenNameCOMMENT_LINE	Try to carry on if we've got a parser that 
// doesn't know about namespace prefixes. 	TokenNameCOMMENT_LINE	doesn't know about namespace prefixes. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
FactoryConfigurationError	TokenNameIdentifier	 Factory Configuration Error
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
ex1	TokenNameIdentifier	 ex1
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodError	TokenNameIdentifier	 No Such Method Error
ex2	TokenNameIdentifier	 ex2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
AbstractMethodError	TokenNameIdentifier	 Abstract Method Error
ame	TokenNameIdentifier	 ame
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// Cache the XMLReader if this is the first time we've created 	TokenNameCOMMENT_LINE	Cache the XMLReader if this is the first time we've created 
// a reader for this thread. 	TokenNameCOMMENT_LINE	a reader for this thread. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
threadHasReader	TokenNameIdentifier	 thread Has Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_readers	TokenNameIdentifier	 m readers
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_inUse	TokenNameIdentifier	 m in Use
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_inUse	TokenNameIdentifier	 m in Use
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Mark the cached XMLReader as available. If the reader was not * actually in the cache, do nothing. * * @param reader The XMLReader that's being released. */	TokenNameCOMMENT_JAVADOC	 Mark the cached XMLReader as available. If the reader was not actually in the cache, do nothing. * @param reader The XMLReader that's being released. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
releaseXMLReader	TokenNameIdentifier	 release XML Reader
(	TokenNameLPAREN	
XMLReader	TokenNameIdentifier	 XML Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the reader that's being released is the cached reader 	TokenNameCOMMENT_LINE	If the reader that's being released is the cached reader 
// for this thread, remove it from the m_isUse list. 	TokenNameCOMMENT_LINE	for this thread, remove it from the m_isUse list. 
if	TokenNameif	
(	TokenNameLPAREN	
m_readers	TokenNameIdentifier	 m readers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
reader	TokenNameIdentifier	 reader
&&	TokenNameAND_AND	
reader	TokenNameIdentifier	 reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_inUse	TokenNameIdentifier	 m in Use
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
