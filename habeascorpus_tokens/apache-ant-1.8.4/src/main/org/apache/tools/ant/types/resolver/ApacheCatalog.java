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
CatalogEntry	TokenNameIdentifier	 Catalog Entry
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
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
PublicId	TokenNameIdentifier	 Public Id
;	TokenNameSEMICOLON	
/** * This class extends the Catalog class provided by Norman Walsh's * resolver library in xml-commons in order to add classpath entity * and URI resolution. Since XMLCatalog already does classpath * resolution, we simply add all CatalogEntry instances back to the * controlling XMLCatalog instance. This is done via a callback * mechanism. ApacheCatalog is <em>only</em> used for external * catalog files. Inline entries (currently <code>&lt;dtd&gt;</code> * and <code>&lt;entity&gt;</code>) are not added to ApacheCatalog. * See XMLCatalog.java for the details of the entity and URI * resolution algorithms. * * @see org.apache.tools.ant.types.XMLCatalog.CatalogResolver * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 This class extends the Catalog class provided by Norman Walsh's resolver library in xml-commons in order to add classpath entity and URI resolution. Since XMLCatalog already does classpath resolution, we simply add all CatalogEntry instances back to the controlling XMLCatalog instance. This is done via a callback mechanism. ApacheCatalog is <em>only</em> used for external catalog files. Inline entries (currently <code>&lt;dtd&gt;</code> and <code>&lt;entity&gt;</code>) are not added to ApacheCatalog. See XMLCatalog.java for the details of the entity and URI resolution algorithms. * @see org.apache.tools.ant.types.XMLCatalog.CatalogResolver @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
ApacheCatalog	TokenNameIdentifier	 Apache Catalog
extends	TokenNameextends	
Catalog	TokenNameIdentifier	 Catalog
{	TokenNameLBRACE	
/** The resolver object to callback. */	TokenNameCOMMENT_JAVADOC	 The resolver object to callback. 
private	TokenNameprivate	
ApacheCatalogResolver	TokenNameIdentifier	 Apache Catalog Resolver
resolver	TokenNameIdentifier	 resolver
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * <p>Create a new ApacheCatalog instance.</p> * * <p>This method overrides the superclass method of the same name * in order to set the resolver object for callbacks. The reason * we have to do this is that internally Catalog creates a new * instance of itself for each external catalog file processed. * That is, if two external catalog files are processed, there * will be a total of two ApacheCatalog instances, and so on.</p> * @return the catalog. */	TokenNameCOMMENT_JAVADOC	 <p>Create a new ApacheCatalog instance.</p> * <p>This method overrides the superclass method of the same name in order to set the resolver object for callbacks. The reason we have to do this is that internally Catalog creates a new instance of itself for each external catalog file processed. That is, if two external catalog files are processed, there will be a total of two ApacheCatalog instances, and so on.</p> @return the catalog. 
protected	TokenNameprotected	
Catalog	TokenNameIdentifier	 Catalog
newCatalog	TokenNameIdentifier	 new Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ApacheCatalog	TokenNameIdentifier	 Apache Catalog
cat	TokenNameIdentifier	 cat
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ApacheCatalog	TokenNameIdentifier	 Apache Catalog
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
newCatalog	TokenNameIdentifier	 new Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
setResolver	TokenNameIdentifier	 set Resolver
(	TokenNameLPAREN	
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cat	TokenNameIdentifier	 cat
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the resolver object to callback. * @param resolver the apache catalog resolver. */	TokenNameCOMMENT_JAVADOC	 Set the resolver object to callback. @param resolver the apache catalog resolver. 
public	TokenNamepublic	
void	TokenNamevoid	
setResolver	TokenNameIdentifier	 set Resolver
(	TokenNameLPAREN	
ApacheCatalogResolver	TokenNameIdentifier	 Apache Catalog Resolver
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>This method overrides the superclass method of the same name * in order to add catalog entries back to the controlling * XMLCatalog instance. In this way, we can add classpath lookup * for these entries.</p> * * <p>When we add an external catalog file, the entries inside it * get parsed by this method. Therefore, we override it to add * each of them back to the controlling XMLCatalog instance. This * is done by performing a callback to the ApacheCatalogResolver, * which in turn calls the XMLCatalog.</p> * * <p>XMLCatalog currently only understands <code>PUBLIC</code> * and <code>URI</code> entry types, so we ignore the other types.</p> * * @param entry The CatalogEntry to process. */	TokenNameCOMMENT_JAVADOC	 <p>This method overrides the superclass method of the same name in order to add catalog entries back to the controlling XMLCatalog instance. In this way, we can add classpath lookup for these entries.</p> * <p>When we add an external catalog file, the entries inside it get parsed by this method. Therefore, we override it to add each of them back to the controlling XMLCatalog instance. This is done by performing a callback to the ApacheCatalogResolver, which in turn calls the XMLCatalog.</p> * <p>XMLCatalog currently only understands <code>PUBLIC</code> and <code>URI</code> entry types, so we ignore the other types.</p> * @param entry The CatalogEntry to process. 
public	TokenNamepublic	
void	TokenNamevoid	
addEntry	TokenNameIdentifier	 add Entry
(	TokenNameLPAREN	
CatalogEntry	TokenNameIdentifier	 Catalog Entry
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getEntryType	TokenNameIdentifier	 get Entry Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
PUBLIC	TokenNameIdentifier	 PUBLIC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
publicid	TokenNameIdentifier	 publicid
=	TokenNameEQUAL	
PublicId	TokenNameIdentifier	 Public Id
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getEntryArg	TokenNameIdentifier	 get Entry Arg
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
systemid	TokenNameIdentifier	 systemid
=	TokenNameEQUAL	
normalizeURI	TokenNameIdentifier	 normalize URI
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getEntryArg	TokenNameIdentifier	 get Entry Arg
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resolver	TokenNameIdentifier	 resolver
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
catalogManager	TokenNameIdentifier	 catalog Manager
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
.	TokenNameDOT	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"Internal Error: null ApacheCatalogResolver"	TokenNameStringLiteral	Internal Error: null ApacheCatalogResolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
addPublicEntry	TokenNameIdentifier	 add Public Entry
(	TokenNameLPAREN	
publicid	TokenNameIdentifier	 publicid
,	TokenNameCOMMA	
systemid	TokenNameIdentifier	 systemid
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
URI	TokenNameIdentifier	 URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
normalizeURI	TokenNameIdentifier	 normalize URI
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getEntryArg	TokenNameIdentifier	 get Entry Arg
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
altURI	TokenNameIdentifier	 alt URI
=	TokenNameEQUAL	
normalizeURI	TokenNameIdentifier	 normalize URI
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getEntryArg	TokenNameIdentifier	 get Entry Arg
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resolver	TokenNameIdentifier	 resolver
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
catalogManager	TokenNameIdentifier	 catalog Manager
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
.	TokenNameDOT	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"Internal Error: null ApacheCatalogResolver"	TokenNameStringLiteral	Internal Error: null ApacheCatalogResolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
addURIEntry	TokenNameIdentifier	 add URI Entry
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
altURI	TokenNameIdentifier	 alt URI
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
addEntry	TokenNameIdentifier	 add Entry
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//- ApacheCatalog 	TokenNameCOMMENT_LINE	- ApacheCatalog 
