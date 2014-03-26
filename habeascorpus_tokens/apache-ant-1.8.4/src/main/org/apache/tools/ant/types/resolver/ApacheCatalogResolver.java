/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
XMLCatalog	TokenNameIdentifier	 XML Catalog
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
ResourceLocation	TokenNameIdentifier	 Resource Location
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
Catalog	TokenNameIdentifier	 Catalog
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
CatalogManager	TokenNameIdentifier	 Catalog Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
CatalogResolver	TokenNameIdentifier	 Catalog Resolver
;	TokenNameSEMICOLON	
/** * <p>This class extends the CatalogResolver class provided by Norman * Walsh's resolver library in xml-commons. It provides the bridge * between the Ant XMLCatalog datatype and the xml-commons Catalog * class. XMLCatalog calls methods in this class using Reflection in * order to avoid requiring the xml-commons resolver library in the * path.</p> * * <p>The {@link org.apache.tools.ant.types.resolver.ApacheCatalog * ApacheCatalog} class is used to parse external catalog files, which * can be in either <a * href="http://oasis-open.org/committees/entity/background/9401.html"> * plain text format</a> or <a * href="http://www.oasis-open.org/committees/entity/spec-2001-08-06.html"> * XML format</a>.</p> * * <p>For each entry found in an external catalog file, if any, an * instance of {@link org.apache.tools.ant.types.ResourceLocation * ResourceLocation} is created and added to the controlling * XMLCatalog datatype. In this way, these entries will be included * in XMLCatalog's lookup algorithm. See XMLCatalog.java for more * details.</p> * * @see org.apache.tools.ant.types.XMLCatalog.CatalogResolver * @see org.apache.xml.resolver.CatalogManager * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 <p>This class extends the CatalogResolver class provided by Norman Walsh's resolver library in xml-commons. It provides the bridge between the Ant XMLCatalog datatype and the xml-commons Catalog class. XMLCatalog calls methods in this class using Reflection in order to avoid requiring the xml-commons resolver library in the path.</p> * <p>The {@link org.apache.tools.ant.types.resolver.ApacheCatalog ApacheCatalog} class is used to parse external catalog files, which can be in either <a href="http://oasis-open.org/committees/entity/background/9401.html"> plain text format</a> or <a href="http://www.oasis-open.org/committees/entity/spec-2001-08-06.html"> XML format</a>.</p> * <p>For each entry found in an external catalog file, if any, an instance of {@link org.apache.tools.ant.types.ResourceLocation ResourceLocation} is created and added to the controlling XMLCatalog datatype. In this way, these entries will be included in XMLCatalog's lookup algorithm. See XMLCatalog.java for more details.</p> * @see org.apache.tools.ant.types.XMLCatalog.CatalogResolver @see org.apache.xml.resolver.CatalogManager @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
ApacheCatalogResolver	TokenNameIdentifier	 Apache Catalog Resolver
extends	TokenNameextends	
CatalogResolver	TokenNameIdentifier	 Catalog Resolver
{	TokenNameLBRACE	
/** The XMLCatalog object to callback. */	TokenNameCOMMENT_JAVADOC	 The XMLCatalog object to callback. 
private	TokenNameprivate	
XMLCatalog	TokenNameIdentifier	 XML Catalog
xmlCatalog	TokenNameIdentifier	 xml Catalog
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// If you don't do this, you get all sorts of annoying 	TokenNameCOMMENT_LINE	If you don't do this, you get all sorts of annoying 
// warnings about a missing properties file. However, it 	TokenNameCOMMENT_LINE	warnings about a missing properties file. However, it 
// seems to work just fine with default values. Ultimately, 	TokenNameCOMMENT_LINE	seems to work just fine with default values. Ultimately, 
// we should probably include a "CatalogManager.properties" 	TokenNameCOMMENT_LINE	we should probably include a "CatalogManager.properties" 
// file in the ant jarfile with some default property 	TokenNameCOMMENT_LINE	file in the ant jarfile with some default property 
// settings. See CatalogManager.java for more details. 	TokenNameCOMMENT_LINE	settings. See CatalogManager.java for more details. 
// 	TokenNameCOMMENT_LINE	 
CatalogManager	TokenNameIdentifier	 Catalog Manager
.	TokenNameDOT	
getStaticManager	TokenNameIdentifier	 get Static Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setIgnoreMissingProperties	TokenNameIdentifier	 set Ignore Missing Properties
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Make sure CatalogResolver instantiates ApacheCatalog, 	TokenNameCOMMENT_LINE	Make sure CatalogResolver instantiates ApacheCatalog, 
// rather than a plain Catalog 	TokenNameCOMMENT_LINE	rather than a plain Catalog 
// 	TokenNameCOMMENT_LINE	 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"xml.catalog.className"	TokenNameStringLiteral	xml.catalog.className
,	TokenNameCOMMA	
ApacheCatalog	TokenNameIdentifier	 Apache Catalog
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CatalogManager	TokenNameIdentifier	 Catalog Manager
.	TokenNameDOT	
getStaticManager	TokenNameIdentifier	 get Static Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setUseStaticCatalog	TokenNameIdentifier	 set Use Static Catalog
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// debug 	TokenNameCOMMENT_LINE	debug 
// CatalogManager.getStaticManager().setVerbosity(4); 	TokenNameCOMMENT_LINE	CatalogManager.getStaticManager().setVerbosity(4); 
}	TokenNameRBRACE	
/** * Set the XMLCatalog object to callback. * @param xmlCatalog the XMLCatalog to use. */	TokenNameCOMMENT_JAVADOC	 Set the XMLCatalog object to callback. @param xmlCatalog the XMLCatalog to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setXMLCatalog	TokenNameIdentifier	 set XML Catalog
(	TokenNameLPAREN	
XMLCatalog	TokenNameIdentifier	 XML Catalog
xmlCatalog	TokenNameIdentifier	 xml Catalog
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
xmlCatalog	TokenNameIdentifier	 xml Catalog
=	TokenNameEQUAL	
xmlCatalog	TokenNameIdentifier	 xml Catalog
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * XMLCatalog calls this to add an external catalog file for each * file within a <code>&lt;catalogfiles&gt;</code> fileset. * @param file the external catalog file. */	TokenNameCOMMENT_JAVADOC	 XMLCatalog calls this to add an external catalog file for each file within a <code>&lt;catalogfiles&gt;</code> fileset. @param file the external catalog file. 
public	TokenNamepublic	
void	TokenNamevoid	
parseCatalog	TokenNameIdentifier	 parse Catalog
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Catalog	TokenNameIdentifier	 Catalog
catalog	TokenNameIdentifier	 catalog
=	TokenNameEQUAL	
getCatalog	TokenNameIdentifier	 get Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
catalog	TokenNameIdentifier	 catalog
instanceof	TokenNameinstanceof	
ApacheCatalog	TokenNameIdentifier	 Apache Catalog
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Wrong catalog type found: "	TokenNameStringLiteral	Wrong catalog type found: 
+	TokenNamePLUS	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ApacheCatalog	TokenNameIdentifier	 Apache Catalog
apacheCatalog	TokenNameIdentifier	 apache Catalog
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ApacheCatalog	TokenNameIdentifier	 Apache Catalog
)	TokenNameRPAREN	
catalog	TokenNameIdentifier	 catalog
;	TokenNameSEMICOLON	
// Pass in reference to ourselves so we can be called back. 	TokenNameCOMMENT_LINE	Pass in reference to ourselves so we can be called back. 
apacheCatalog	TokenNameIdentifier	 apache Catalog
.	TokenNameDOT	
setResolver	TokenNameIdentifier	 set Resolver
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
apacheCatalog	TokenNameIdentifier	 apache Catalog
.	TokenNameDOT	
parseCatalog	TokenNameIdentifier	 parse Catalog
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Add a PUBLIC catalog entry to the controlling XMLCatalog instance. * ApacheCatalog calls this for each PUBLIC entry found in an external * catalog file.</p> * * @param publicid The public ID of the resource * @param systemid The system ID (aka location) of the resource * @param base The base URL of the resource. If the systemid * specifies a relative URL/pathname, it is resolved using the * base. The default base for an external catalog file is the * directory in which the catalog is located. * */	TokenNameCOMMENT_JAVADOC	 <p>Add a PUBLIC catalog entry to the controlling XMLCatalog instance. ApacheCatalog calls this for each PUBLIC entry found in an external catalog file.</p> * @param publicid The public ID of the resource @param systemid The system ID (aka location) of the resource @param base The base URL of the resource. If the systemid specifies a relative URL/pathname, it is resolved using the base. The default base for an external catalog file is the directory in which the catalog is located. 
public	TokenNamepublic	
void	TokenNamevoid	
addPublicEntry	TokenNameIdentifier	 add Public Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicid	TokenNameIdentifier	 publicid
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemid	TokenNameIdentifier	 systemid
,	TokenNameCOMMA	
URL	TokenNameIdentifier	 URL
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ResourceLocation	TokenNameIdentifier	 Resource Location
dtd	TokenNameIdentifier	 dtd
=	TokenNameEQUAL	
new	TokenNamenew	
ResourceLocation	TokenNameIdentifier	 Resource Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
setBase	TokenNameIdentifier	 set Base
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
publicid	TokenNameIdentifier	 publicid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
systemid	TokenNameIdentifier	 systemid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlCatalog	TokenNameIdentifier	 xml Catalog
.	TokenNameDOT	
addDTD	TokenNameIdentifier	 add DTD
(	TokenNameLPAREN	
dtd	TokenNameIdentifier	 dtd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Add a URI catalog entry to the controlling XMLCatalog instance. * ApacheCatalog calls this for each URI entry found in an external * catalog file.</p> * * @param uri The URI of the resource * @param altURI The URI to which the resource should be mapped * (aka the location) * @param base The base URL of the resource. If the altURI * specifies a relative URL/pathname, it is resolved using the * base. The default base for an external catalog file is the * directory in which the catalog is located. * */	TokenNameCOMMENT_JAVADOC	 <p>Add a URI catalog entry to the controlling XMLCatalog instance. ApacheCatalog calls this for each URI entry found in an external catalog file.</p> * @param uri The URI of the resource @param altURI The URI to which the resource should be mapped (aka the location) @param base The base URL of the resource. If the altURI specifies a relative URL/pathname, it is resolved using the base. The default base for an external catalog file is the directory in which the catalog is located. 
public	TokenNamepublic	
void	TokenNamevoid	
addURIEntry	TokenNameIdentifier	 add URI Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
altURI	TokenNameIdentifier	 alt URI
,	TokenNameCOMMA	
URL	TokenNameIdentifier	 URL
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ResourceLocation	TokenNameIdentifier	 Resource Location
entity	TokenNameIdentifier	 entity
=	TokenNameEQUAL	
new	TokenNamenew	
ResourceLocation	TokenNameIdentifier	 Resource Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entity	TokenNameIdentifier	 entity
.	TokenNameDOT	
setBase	TokenNameIdentifier	 set Base
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entity	TokenNameIdentifier	 entity
.	TokenNameDOT	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entity	TokenNameIdentifier	 entity
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
altURI	TokenNameIdentifier	 alt URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlCatalog	TokenNameIdentifier	 xml Catalog
.	TokenNameDOT	
addEntity	TokenNameIdentifier	 add Entity
(	TokenNameLPAREN	
entity	TokenNameIdentifier	 entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//-- ApacheCatalogResolver 	TokenNameCOMMENT_LINE	-- ApacheCatalogResolver 
