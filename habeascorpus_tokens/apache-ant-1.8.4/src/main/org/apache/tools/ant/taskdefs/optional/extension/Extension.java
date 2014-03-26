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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
jar	TokenNameIdentifier	 jar
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
jar	TokenNameIdentifier	 jar
.	TokenNameDOT	
Manifest	TokenNameIdentifier	 Manifest
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * <p>Utility class that represents either an available "Optional Package" * (formerly known as "Standard Extension") as described in the manifest * of a JAR file, or the requirement for such an optional package.</p> * * <p>For more information about optional packages, see the document * <em>Optional Package Versioning</em> in the documentation bundle for your * Java2 Standard Edition package, in file * <code>guide/extensions/versioning.html</code>.</p> * */	TokenNameCOMMENT_JAVADOC	 <p>Utility class that represents either an available "Optional Package" (formerly known as "Standard Extension") as described in the manifest of a JAR file, or the requirement for such an optional package.</p> * <p>For more information about optional packages, see the document <em>Optional Package Versioning</em> in the documentation bundle for your Java2 Standard Edition package, in file <code>guide/extensions/versioning.html</code>.</p> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Extension	TokenNameIdentifier	 Extension
{	TokenNameLBRACE	
/** * Manifest Attribute Name object for EXTENSION_LIST. */	TokenNameCOMMENT_JAVADOC	 Manifest Attribute Name object for EXTENSION_LIST. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
EXTENSION_LIST	TokenNameIdentifier	 EXTENSION  LIST
=	TokenNameEQUAL	
new	TokenNamenew	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
(	TokenNameLPAREN	
"Extension-List"	TokenNameStringLiteral	Extension-List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <code>Name</code> object for <code>Optional-Extension-List</code> * manifest attribute used for declaring optional dependencies on * installed extensions. Note that the dependencies declared by this method * are not required for the library to operate but if present will be used. * It is NOT part of the official "Optional Package" specification. * * @see <a href="http://java.sun.com/j2se/1.3/docs/guide/extensions/spec.html#dependnecy"> * Installed extension dependency</a> */	TokenNameCOMMENT_JAVADOC	 <code>Name</code> object for <code>Optional-Extension-List</code> manifest attribute used for declaring optional dependencies on installed extensions. Note that the dependencies declared by this method are not required for the library to operate but if present will be used. It is NOT part of the official "Optional Package" specification. * @see <a href="http://java.sun.com/j2se/1.3/docs/guide/extensions/spec.html#dependnecy"> Installed extension dependency</a> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
OPTIONAL_EXTENSION_LIST	TokenNameIdentifier	 OPTIONAL  EXTENSION  LIST
=	TokenNameEQUAL	
new	TokenNamenew	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
(	TokenNameLPAREN	
"Optional-Extension-List"	TokenNameStringLiteral	Optional-Extension-List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Manifest Attribute Name object for EXTENSION_NAME. */	TokenNameCOMMENT_JAVADOC	 Manifest Attribute Name object for EXTENSION_NAME. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
EXTENSION_NAME	TokenNameIdentifier	 EXTENSION  NAME
=	TokenNameEQUAL	
new	TokenNamenew	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
(	TokenNameLPAREN	
"Extension-Name"	TokenNameStringLiteral	Extension-Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Manifest Attribute Name object for SPECIFICATION_VERSION. */	TokenNameCOMMENT_JAVADOC	 Manifest Attribute Name object for SPECIFICATION_VERSION. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
SPECIFICATION_VERSION	TokenNameIdentifier	 SPECIFICATION  VERSION
=	TokenNameEQUAL	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
.	TokenNameDOT	
SPECIFICATION_VERSION	TokenNameIdentifier	 SPECIFICATION  VERSION
;	TokenNameSEMICOLON	
/** * Manifest Attribute Name object for SPECIFICATION_VENDOR. */	TokenNameCOMMENT_JAVADOC	 Manifest Attribute Name object for SPECIFICATION_VENDOR. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
SPECIFICATION_VENDOR	TokenNameIdentifier	 SPECIFICATION  VENDOR
=	TokenNameEQUAL	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
.	TokenNameDOT	
SPECIFICATION_VENDOR	TokenNameIdentifier	 SPECIFICATION  VENDOR
;	TokenNameSEMICOLON	
/** * Manifest Attribute Name object for IMPLEMENTATION_VERSION. */	TokenNameCOMMENT_JAVADOC	 Manifest Attribute Name object for IMPLEMENTATION_VERSION. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
IMPLEMENTATION_VERSION	TokenNameIdentifier	 IMPLEMENTATION  VERSION
=	TokenNameEQUAL	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
.	TokenNameDOT	
IMPLEMENTATION_VERSION	TokenNameIdentifier	 IMPLEMENTATION  VERSION
;	TokenNameSEMICOLON	
/** * Manifest Attribute Name object for IMPLEMENTATION_VENDOR. */	TokenNameCOMMENT_JAVADOC	 Manifest Attribute Name object for IMPLEMENTATION_VENDOR. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
IMPLEMENTATION_VENDOR	TokenNameIdentifier	 IMPLEMENTATION  VENDOR
=	TokenNameEQUAL	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
.	TokenNameDOT	
IMPLEMENTATION_VENDOR	TokenNameIdentifier	 IMPLEMENTATION  VENDOR
;	TokenNameSEMICOLON	
/** * Manifest Attribute Name object for IMPLEMENTATION_URL. */	TokenNameCOMMENT_JAVADOC	 Manifest Attribute Name object for IMPLEMENTATION_URL. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
IMPLEMENTATION_URL	TokenNameIdentifier	 IMPLEMENTATION  URL
=	TokenNameEQUAL	
new	TokenNamenew	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
(	TokenNameLPAREN	
"Implementation-URL"	TokenNameStringLiteral	Implementation-URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Manifest Attribute Name object for IMPLEMENTATION_VENDOR_ID. */	TokenNameCOMMENT_JAVADOC	 Manifest Attribute Name object for IMPLEMENTATION_VENDOR_ID. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
IMPLEMENTATION_VENDOR_ID	TokenNameIdentifier	 IMPLEMENTATION  VENDOR  ID
=	TokenNameEQUAL	
new	TokenNamenew	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
(	TokenNameLPAREN	
"Implementation-Vendor-Id"	TokenNameStringLiteral	Implementation-Vendor-Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Enum indicating that extension is compatible with other extension. */	TokenNameCOMMENT_JAVADOC	 Enum indicating that extension is compatible with other extension. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Compatibility	TokenNameIdentifier	 Compatibility
COMPATIBLE	TokenNameIdentifier	 COMPATIBLE
=	TokenNameEQUAL	
new	TokenNamenew	
Compatibility	TokenNameIdentifier	 Compatibility
(	TokenNameLPAREN	
"COMPATIBLE"	TokenNameStringLiteral	COMPATIBLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Enum indicating that extension requires an upgrade * of specification to be compatible with other extension. */	TokenNameCOMMENT_JAVADOC	 Enum indicating that extension requires an upgrade of specification to be compatible with other extension. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Compatibility	TokenNameIdentifier	 Compatibility
REQUIRE_SPECIFICATION_UPGRADE	TokenNameIdentifier	 REQUIRE  SPECIFICATION  UPGRADE
=	TokenNameEQUAL	
new	TokenNamenew	
Compatibility	TokenNameIdentifier	 Compatibility
(	TokenNameLPAREN	
"REQUIRE_SPECIFICATION_UPGRADE"	TokenNameStringLiteral	REQUIRE_SPECIFICATION_UPGRADE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Enum indicating that extension requires a vendor * switch to be compatible with other extension. */	TokenNameCOMMENT_JAVADOC	 Enum indicating that extension requires a vendor switch to be compatible with other extension. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Compatibility	TokenNameIdentifier	 Compatibility
REQUIRE_VENDOR_SWITCH	TokenNameIdentifier	 REQUIRE  VENDOR  SWITCH
=	TokenNameEQUAL	
new	TokenNamenew	
Compatibility	TokenNameIdentifier	 Compatibility
(	TokenNameLPAREN	
"REQUIRE_VENDOR_SWITCH"	TokenNameStringLiteral	REQUIRE_VENDOR_SWITCH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Enum indicating that extension requires an upgrade * of implementation to be compatible with other extension. */	TokenNameCOMMENT_JAVADOC	 Enum indicating that extension requires an upgrade of implementation to be compatible with other extension. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Compatibility	TokenNameIdentifier	 Compatibility
REQUIRE_IMPLEMENTATION_UPGRADE	TokenNameIdentifier	 REQUIRE  IMPLEMENTATION  UPGRADE
=	TokenNameEQUAL	
new	TokenNamenew	
Compatibility	TokenNameIdentifier	 Compatibility
(	TokenNameLPAREN	
"REQUIRE_IMPLEMENTATION_UPGRADE"	TokenNameStringLiteral	REQUIRE_IMPLEMENTATION_UPGRADE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Enum indicating that extension is incompatible with * other extension in ways other than other enums * indicate). For example the other extension may have * a different ID. */	TokenNameCOMMENT_JAVADOC	 Enum indicating that extension is incompatible with other extension in ways other than other enums indicate). For example the other extension may have a different ID. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Compatibility	TokenNameIdentifier	 Compatibility
INCOMPATIBLE	TokenNameIdentifier	 INCOMPATIBLE
=	TokenNameEQUAL	
new	TokenNamenew	
Compatibility	TokenNameIdentifier	 Compatibility
(	TokenNameLPAREN	
"INCOMPATIBLE"	TokenNameStringLiteral	INCOMPATIBLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The name of the optional package being made available, or required. */	TokenNameCOMMENT_JAVADOC	 The name of the optional package being made available, or required. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
extensionName	TokenNameIdentifier	 extension Name
;	TokenNameSEMICOLON	
/** * The version number (dotted decimal notation) of the specification * to which this optional package conforms. */	TokenNameCOMMENT_JAVADOC	 The version number (dotted decimal notation) of the specification to which this optional package conforms. 
private	TokenNameprivate	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
specificationVersion	TokenNameIdentifier	 specification Version
;	TokenNameSEMICOLON	
/** * The name of the company or organization that originated the * specification to which this optional package conforms. */	TokenNameCOMMENT_JAVADOC	 The name of the company or organization that originated the specification to which this optional package conforms. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
specificationVendor	TokenNameIdentifier	 specification Vendor
;	TokenNameSEMICOLON	
/** * The unique identifier of the company that produced the optional * package contained in this JAR file. */	TokenNameCOMMENT_JAVADOC	 The unique identifier of the company that produced the optional package contained in this JAR file. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
implementationVendorID	TokenNameIdentifier	 implementation Vendor ID
;	TokenNameSEMICOLON	
/** * The name of the company or organization that produced this * implementation of this optional package. */	TokenNameCOMMENT_JAVADOC	 The name of the company or organization that produced this implementation of this optional package. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
implementationVendor	TokenNameIdentifier	 implementation Vendor
;	TokenNameSEMICOLON	
/** * The version number (dotted decimal notation) for this implementation * of the optional package. */	TokenNameCOMMENT_JAVADOC	 The version number (dotted decimal notation) for this implementation of the optional package. 
private	TokenNameprivate	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
implementationVersion	TokenNameIdentifier	 implementation Version
;	TokenNameSEMICOLON	
/** * The URL from which the most recent version of this optional package * can be obtained if it is not already installed. */	TokenNameCOMMENT_JAVADOC	 The URL from which the most recent version of this optional package can be obtained if it is not already installed. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
implementationURL	TokenNameIdentifier	 implementation URL
;	TokenNameSEMICOLON	
/** * Return an array of <code>Extension</code> objects representing optional * packages that are available in the JAR file associated with the * specified <code>Manifest</code>. If there are no such optional * packages, a zero-length array is returned. * * @param manifest Manifest to be parsed * @return the "available" extensions in specified manifest */	TokenNameCOMMENT_JAVADOC	 Return an array of <code>Extension</code> objects representing optional packages that are available in the JAR file associated with the specified <code>Manifest</code>. If there are no such optional packages, a zero-length array is returned. * @param manifest Manifest to be parsed @return the "available" extensions in specified manifest 
public	TokenNamepublic	
static	TokenNamestatic	
Extension	TokenNameIdentifier	 Extension
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAvailable	TokenNameIdentifier	 get Available
(	TokenNameLPAREN	
final	TokenNamefinal	
Manifest	TokenNameIdentifier	 Manifest
manifest	TokenNameIdentifier	 manifest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
manifest	TokenNameIdentifier	 manifest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Extension	TokenNameIdentifier	 Extension
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
mainAttributes	TokenNameIdentifier	 main Attributes
=	TokenNameEQUAL	
manifest	TokenNameIdentifier	 manifest
.	TokenNameDOT	
getMainAttributes	TokenNameIdentifier	 get Main Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
mainAttributes	TokenNameIdentifier	 main Attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Extension	TokenNameIdentifier	 Extension
extension	TokenNameIdentifier	 extension
=	TokenNameEQUAL	
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
mainAttributes	TokenNameIdentifier	 main Attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
manifest	TokenNameIdentifier	 manifest
.	TokenNameDOT	
getEntries	TokenNameIdentifier	 get Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Attributes	TokenNameIdentifier	 Attributes
)	TokenNameRPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Extension	TokenNameIdentifier	 Extension
extension	TokenNameIdentifier	 extension
=	TokenNameEQUAL	
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Extension	TokenNameIdentifier	 Extension
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Extension	TokenNameIdentifier	 Extension
[	TokenNameLBRACKET	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the set of <code>Extension</code> objects representing optional * packages that are required by the application contained in the JAR * file associated with the specified <code>Manifest</code>. If there * are no such optional packages, a zero-length list is returned. * * @param manifest Manifest to be parsed * @return the dependencies that are specified in manifes */	TokenNameCOMMENT_JAVADOC	 Return the set of <code>Extension</code> objects representing optional packages that are required by the application contained in the JAR file associated with the specified <code>Manifest</code>. If there are no such optional packages, a zero-length list is returned. * @param manifest Manifest to be parsed @return the dependencies that are specified in manifes 
public	TokenNamepublic	
static	TokenNamestatic	
Extension	TokenNameIdentifier	 Extension
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getRequired	TokenNameIdentifier	 get Required
(	TokenNameLPAREN	
final	TokenNamefinal	
Manifest	TokenNameIdentifier	 Manifest
manifest	TokenNameIdentifier	 manifest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getListed	TokenNameIdentifier	 get Listed
(	TokenNameLPAREN	
manifest	TokenNameIdentifier	 manifest
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
.	TokenNameDOT	
EXTENSION_LIST	TokenNameIdentifier	 EXTENSION  LIST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the set of <code>Extension</code> objects representing "Optional * Packages" that the application declares they will use if present. If * there are no such optional packages, a zero-length list is returned. * * @param manifest Manifest to be parsed * @return the optional dependencies that are specified in manifest */	TokenNameCOMMENT_JAVADOC	 Return the set of <code>Extension</code> objects representing "Optional Packages" that the application declares they will use if present. If there are no such optional packages, a zero-length list is returned. * @param manifest Manifest to be parsed @return the optional dependencies that are specified in manifest 
public	TokenNamepublic	
static	TokenNamestatic	
Extension	TokenNameIdentifier	 Extension
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getOptions	TokenNameIdentifier	 get Options
(	TokenNameLPAREN	
final	TokenNamefinal	
Manifest	TokenNameIdentifier	 Manifest
manifest	TokenNameIdentifier	 manifest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getListed	TokenNameIdentifier	 get Listed
(	TokenNameLPAREN	
manifest	TokenNameIdentifier	 manifest
,	TokenNameCOMMA	
OPTIONAL_EXTENSION_LIST	TokenNameIdentifier	 OPTIONAL  EXTENSION  LIST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add Extension to the specified manifest Attributes. * * @param attributes the attributes of manifest to add to * @param extension the extension */	TokenNameCOMMENT_JAVADOC	 Add Extension to the specified manifest Attributes. * @param attributes the attributes of manifest to add to @param extension the extension 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
addExtension	TokenNameIdentifier	 add Extension
(	TokenNameLPAREN	
final	TokenNamefinal	
Extension	TokenNameIdentifier	 Extension
extension	TokenNameIdentifier	 extension
,	TokenNameCOMMA	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addExtension	TokenNameIdentifier	 add Extension
(	TokenNameLPAREN	
extension	TokenNameIdentifier	 extension
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add Extension to the specified manifest Attributes. * Use the specified prefix so that dependencies can added * with a prefix such as "java3d-" etc. * * @param attributes the attributes of manifest to add to * @param extension the extension * @param prefix the name to prefix to extension */	TokenNameCOMMENT_JAVADOC	 Add Extension to the specified manifest Attributes. Use the specified prefix so that dependencies can added with a prefix such as "java3d-" etc. * @param attributes the attributes of manifest to add to @param extension the extension @param prefix the name to prefix to extension 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
addExtension	TokenNameIdentifier	 add Extension
(	TokenNameLPAREN	
final	TokenNamefinal	
Extension	TokenNameIdentifier	 Extension
extension	TokenNameIdentifier	 extension
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
putValue	TokenNameIdentifier	 put Value
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
EXTENSION_NAME	TokenNameIdentifier	 EXTENSION  NAME
,	TokenNameCOMMA	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getExtensionName	TokenNameIdentifier	 get Extension Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
specificationVendor	TokenNameIdentifier	 specification Vendor
=	TokenNameEQUAL	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getSpecificationVendor	TokenNameIdentifier	 get Specification Vendor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
specificationVendor	TokenNameIdentifier	 specification Vendor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
putValue	TokenNameIdentifier	 put Value
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
SPECIFICATION_VENDOR	TokenNameIdentifier	 SPECIFICATION  VENDOR
,	TokenNameCOMMA	
specificationVendor	TokenNameIdentifier	 specification Vendor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
specificationVersion	TokenNameIdentifier	 specification Version
=	TokenNameEQUAL	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getSpecificationVersion	TokenNameIdentifier	 get Specification Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
specificationVersion	TokenNameIdentifier	 specification Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
putValue	TokenNameIdentifier	 put Value
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
SPECIFICATION_VERSION	TokenNameIdentifier	 SPECIFICATION  VERSION
,	TokenNameCOMMA	
specificationVersion	TokenNameIdentifier	 specification Version
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
implementationVendorID	TokenNameIdentifier	 implementation Vendor ID
=	TokenNameEQUAL	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getImplementationVendorID	TokenNameIdentifier	 get Implementation Vendor ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
implementationVendorID	TokenNameIdentifier	 implementation Vendor ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
putValue	TokenNameIdentifier	 put Value
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
IMPLEMENTATION_VENDOR_ID	TokenNameIdentifier	 IMPLEMENTATION  VENDOR  ID
,	TokenNameCOMMA	
implementationVendorID	TokenNameIdentifier	 implementation Vendor ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
implementationVendor	TokenNameIdentifier	 implementation Vendor
=	TokenNameEQUAL	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getImplementationVendor	TokenNameIdentifier	 get Implementation Vendor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
implementationVendor	TokenNameIdentifier	 implementation Vendor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
putValue	TokenNameIdentifier	 put Value
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
IMPLEMENTATION_VENDOR	TokenNameIdentifier	 IMPLEMENTATION  VENDOR
,	TokenNameCOMMA	
implementationVendor	TokenNameIdentifier	 implementation Vendor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
implementationVersion	TokenNameIdentifier	 implementation Version
=	TokenNameEQUAL	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getImplementationVersion	TokenNameIdentifier	 get Implementation Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
implementationVersion	TokenNameIdentifier	 implementation Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
putValue	TokenNameIdentifier	 put Value
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
IMPLEMENTATION_VERSION	TokenNameIdentifier	 IMPLEMENTATION  VERSION
,	TokenNameCOMMA	
implementationVersion	TokenNameIdentifier	 implementation Version
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
implementationURL	TokenNameIdentifier	 implementation URL
=	TokenNameEQUAL	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
getImplementationURL	TokenNameIdentifier	 get Implementation URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
implementationURL	TokenNameIdentifier	 implementation URL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
putValue	TokenNameIdentifier	 put Value
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
IMPLEMENTATION_URL	TokenNameIdentifier	 IMPLEMENTATION  URL
,	TokenNameCOMMA	
implementationURL	TokenNameIdentifier	 implementation URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The constructor to create Extension object. * Note that every component is allowed to be specified * but only the extensionName is mandatory. * * @param extensionName the name of extension. * @param specificationVersion the specification Version of extension. * @param specificationVendor the specification Vendor of extension. * @param implementationVersion the implementation Version of extension. * @param implementationVendor the implementation Vendor of extension. * @param implementationVendorId the implementation VendorId of extension. * @param implementationURL the implementation URL of extension. */	TokenNameCOMMENT_JAVADOC	 The constructor to create Extension object. Note that every component is allowed to be specified but only the extensionName is mandatory. * @param extensionName the name of extension. @param specificationVersion the specification Version of extension. @param specificationVendor the specification Vendor of extension. @param implementationVersion the implementation Version of extension. @param implementationVendor the implementation Vendor of extension. @param implementationVendorId the implementation VendorId of extension. @param implementationURL the implementation URL of extension. 
public	TokenNamepublic	
Extension	TokenNameIdentifier	 Extension
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
extensionName	TokenNameIdentifier	 extension Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
specificationVersion	TokenNameIdentifier	 specification Version
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
specificationVendor	TokenNameIdentifier	 specification Vendor
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
implementationVersion	TokenNameIdentifier	 implementation Version
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
implementationVendor	TokenNameIdentifier	 implementation Vendor
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
implementationVendorId	TokenNameIdentifier	 implementation Vendor Id
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
implementationURL	TokenNameIdentifier	 implementation URL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
extensionName	TokenNameIdentifier	 extension Name
=	TokenNameEQUAL	
extensionName	TokenNameIdentifier	 extension Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
specificationVendor	TokenNameIdentifier	 specification Vendor
=	TokenNameEQUAL	
specificationVendor	TokenNameIdentifier	 specification Vendor
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
specificationVersion	TokenNameIdentifier	 specification Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
specificationVersion	TokenNameIdentifier	 specification Version
=	TokenNameEQUAL	
new	TokenNamenew	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
(	TokenNameLPAREN	
specificationVersion	TokenNameIdentifier	 specification Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
final	TokenNamefinal	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfe	TokenNameIdentifier	 nfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
"Bad specification version format '"	TokenNameStringLiteral	Bad specification version format '
+	TokenNamePLUS	
specificationVersion	TokenNameIdentifier	 specification Version
+	TokenNamePLUS	
"' in '"	TokenNameStringLiteral	' in '
+	TokenNamePLUS	
extensionName	TokenNameIdentifier	 extension Name
+	TokenNamePLUS	
"'. (Reason: "	TokenNameStringLiteral	'. (Reason: 
+	TokenNamePLUS	
nfe	TokenNameIdentifier	 nfe
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
implementationURL	TokenNameIdentifier	 implementation URL
=	TokenNameEQUAL	
implementationURL	TokenNameIdentifier	 implementation URL
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
implementationVendor	TokenNameIdentifier	 implementation Vendor
=	TokenNameEQUAL	
implementationVendor	TokenNameIdentifier	 implementation Vendor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
implementationVendorID	TokenNameIdentifier	 implementation Vendor ID
=	TokenNameEQUAL	
implementationVendorId	TokenNameIdentifier	 implementation Vendor Id
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
implementationVersion	TokenNameIdentifier	 implementation Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
implementationVersion	TokenNameIdentifier	 implementation Version
=	TokenNameEQUAL	
new	TokenNamenew	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
(	TokenNameLPAREN	
implementationVersion	TokenNameIdentifier	 implementation Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
final	TokenNamefinal	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfe	TokenNameIdentifier	 nfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
"Bad implementation version format '"	TokenNameStringLiteral	Bad implementation version format '
+	TokenNamePLUS	
implementationVersion	TokenNameIdentifier	 implementation Version
+	TokenNamePLUS	
"' in '"	TokenNameStringLiteral	' in '
+	TokenNamePLUS	
extensionName	TokenNameIdentifier	 extension Name
+	TokenNamePLUS	
"'. (Reason: "	TokenNameStringLiteral	'. (Reason: 
+	TokenNamePLUS	
nfe	TokenNameIdentifier	 nfe
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
extensionName	TokenNameIdentifier	 extension Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"extensionName property is null"	TokenNameStringLiteral	extensionName property is null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the name of the extension. * * @return the name of the extension */	TokenNameCOMMENT_JAVADOC	 Get the name of the extension. * @return the name of the extension 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExtensionName	TokenNameIdentifier	 get Extension Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
extensionName	TokenNameIdentifier	 extension Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the vendor of the extensions specification. * * @return the vendor of the extensions specification. */	TokenNameCOMMENT_JAVADOC	 Get the vendor of the extensions specification. * @return the vendor of the extensions specification. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSpecificationVendor	TokenNameIdentifier	 get Specification Vendor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
specificationVendor	TokenNameIdentifier	 specification Vendor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the version of the extensions specification. * * @return the version of the extensions specification. */	TokenNameCOMMENT_JAVADOC	 Get the version of the extensions specification. * @return the version of the extensions specification. 
public	TokenNamepublic	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
getSpecificationVersion	TokenNameIdentifier	 get Specification Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
specificationVersion	TokenNameIdentifier	 specification Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the url of the extensions implementation. * * @return the url of the extensions implementation. */	TokenNameCOMMENT_JAVADOC	 Get the url of the extensions implementation. * @return the url of the extensions implementation. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getImplementationURL	TokenNameIdentifier	 get Implementation URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
implementationURL	TokenNameIdentifier	 implementation URL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the vendor of the extensions implementation. * * @return the vendor of the extensions implementation. */	TokenNameCOMMENT_JAVADOC	 Get the vendor of the extensions implementation. * @return the vendor of the extensions implementation. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getImplementationVendor	TokenNameIdentifier	 get Implementation Vendor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
implementationVendor	TokenNameIdentifier	 implementation Vendor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the vendorID of the extensions implementation. * * @return the vendorID of the extensions implementation. */	TokenNameCOMMENT_JAVADOC	 Get the vendorID of the extensions implementation. * @return the vendorID of the extensions implementation. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getImplementationVendorID	TokenNameIdentifier	 get Implementation Vendor ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
implementationVendorID	TokenNameIdentifier	 implementation Vendor ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the version of the extensions implementation. * * @return the version of the extensions implementation. */	TokenNameCOMMENT_JAVADOC	 Get the version of the extensions implementation. * @return the version of the extensions implementation. 
public	TokenNamepublic	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
getImplementationVersion	TokenNameIdentifier	 get Implementation Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
implementationVersion	TokenNameIdentifier	 implementation Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a Compatibility enum indicating the relationship of this * <code>Extension</code> with the specified <code>Extension</code>. * * @param required Description of the required optional package * @return the enum indicating the compatibility (or lack thereof) * of specifed extension */	TokenNameCOMMENT_JAVADOC	 Return a Compatibility enum indicating the relationship of this <code>Extension</code> with the specified <code>Extension</code>. * @param required Description of the required optional package @return the enum indicating the compatibility (or lack thereof) of specifed extension 
public	TokenNamepublic	
Compatibility	TokenNameIdentifier	 Compatibility
getCompatibilityWith	TokenNameIdentifier	 get Compatibility With
(	TokenNameLPAREN	
final	TokenNamefinal	
Extension	TokenNameIdentifier	 Extension
required	TokenNameIdentifier	 required
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Extension Name must match 	TokenNameCOMMENT_LINE	Extension Name must match 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
extensionName	TokenNameIdentifier	 extension Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
required	TokenNameIdentifier	 required
.	TokenNameDOT	
getExtensionName	TokenNameIdentifier	 get Extension Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
INCOMPATIBLE	TokenNameIdentifier	 INCOMPATIBLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Available specification version must be >= required 	TokenNameCOMMENT_LINE	Available specification version must be >= required 
final	TokenNamefinal	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
requiredSpecificationVersion	TokenNameIdentifier	 required Specification Version
=	TokenNameEQUAL	
required	TokenNameIdentifier	 required
.	TokenNameDOT	
getSpecificationVersion	TokenNameIdentifier	 get Specification Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
requiredSpecificationVersion	TokenNameIdentifier	 required Specification Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
specificationVersion	TokenNameIdentifier	 specification Version
||	TokenNameOR_OR	
!	TokenNameNOT	
isCompatible	TokenNameIdentifier	 is Compatible
(	TokenNameLPAREN	
specificationVersion	TokenNameIdentifier	 specification Version
,	TokenNameCOMMA	
requiredSpecificationVersion	TokenNameIdentifier	 required Specification Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
REQUIRE_SPECIFICATION_UPGRADE	TokenNameIdentifier	 REQUIRE  SPECIFICATION  UPGRADE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Implementation Vendor ID must match 	TokenNameCOMMENT_LINE	Implementation Vendor ID must match 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
requiredImplementationVendorID	TokenNameIdentifier	 required Implementation Vendor ID
=	TokenNameEQUAL	
required	TokenNameIdentifier	 required
.	TokenNameDOT	
getImplementationVendorID	TokenNameIdentifier	 get Implementation Vendor ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
requiredImplementationVendorID	TokenNameIdentifier	 required Implementation Vendor ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
implementationVendorID	TokenNameIdentifier	 implementation Vendor ID
||	TokenNameOR_OR	
!	TokenNameNOT	
implementationVendorID	TokenNameIdentifier	 implementation Vendor ID
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
requiredImplementationVendorID	TokenNameIdentifier	 required Implementation Vendor ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
REQUIRE_VENDOR_SWITCH	TokenNameIdentifier	 REQUIRE  VENDOR  SWITCH
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Implementation version must be >= required 	TokenNameCOMMENT_LINE	Implementation version must be >= required 
final	TokenNamefinal	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
requiredImplementationVersion	TokenNameIdentifier	 required Implementation Version
=	TokenNameEQUAL	
required	TokenNameIdentifier	 required
.	TokenNameDOT	
getImplementationVersion	TokenNameIdentifier	 get Implementation Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
requiredImplementationVersion	TokenNameIdentifier	 required Implementation Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
implementationVersion	TokenNameIdentifier	 implementation Version
||	TokenNameOR_OR	
!	TokenNameNOT	
isCompatible	TokenNameIdentifier	 is Compatible
(	TokenNameLPAREN	
implementationVersion	TokenNameIdentifier	 implementation Version
,	TokenNameCOMMA	
requiredImplementationVersion	TokenNameIdentifier	 required Implementation Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
REQUIRE_IMPLEMENTATION_UPGRADE	TokenNameIdentifier	 REQUIRE  IMPLEMENTATION  UPGRADE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// This available optional package satisfies the requirements 	TokenNameCOMMENT_LINE	This available optional package satisfies the requirements 
return	TokenNamereturn	
COMPATIBLE	TokenNameIdentifier	 COMPATIBLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return <code>true</code> if the specified <code>Extension</code> * (which represents an optional package required by an application) * is satisfied by this <code>Extension</code> (which represents an * optional package that is already installed. Otherwise, return * <code>false</code>. * * @param required Description of the required optional package * @return true if the specified extension is compatible with this extension */	TokenNameCOMMENT_JAVADOC	 Return <code>true</code> if the specified <code>Extension</code> (which represents an optional package required by an application) is satisfied by this <code>Extension</code> (which represents an optional package that is already installed. Otherwise, return <code>false</code>. * @param required Description of the required optional package @return true if the specified extension is compatible with this extension 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompatibleWith	TokenNameIdentifier	 is Compatible With
(	TokenNameLPAREN	
final	TokenNamefinal	
Extension	TokenNameIdentifier	 Extension
required	TokenNameIdentifier	 required
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
COMPATIBLE	TokenNameIdentifier	 COMPATIBLE
==	TokenNameEQUAL_EQUAL	
getCompatibilityWith	TokenNameIdentifier	 get Compatibility With
(	TokenNameLPAREN	
required	TokenNameIdentifier	 required
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a String representation of this object. * * @return string representation of object. */	TokenNameCOMMENT_JAVADOC	 Return a String representation of this object. * @return string representation of object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
brace	TokenNameIdentifier	 brace
=	TokenNameEQUAL	
": "	TokenNameStringLiteral	: 
;	TokenNameSEMICOLON	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
EXTENSION_NAME	TokenNameIdentifier	 EXTENSION  NAME
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
brace	TokenNameIdentifier	 brace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
extensionName	TokenNameIdentifier	 extension Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
specificationVersion	TokenNameIdentifier	 specification Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SPECIFICATION_VERSION	TokenNameIdentifier	 SPECIFICATION  VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
brace	TokenNameIdentifier	 brace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
specificationVersion	TokenNameIdentifier	 specification Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
specificationVendor	TokenNameIdentifier	 specification Vendor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SPECIFICATION_VENDOR	TokenNameIdentifier	 SPECIFICATION  VENDOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
brace	TokenNameIdentifier	 brace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
specificationVendor	TokenNameIdentifier	 specification Vendor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
implementationVersion	TokenNameIdentifier	 implementation Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
IMPLEMENTATION_VERSION	TokenNameIdentifier	 IMPLEMENTATION  VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
brace	TokenNameIdentifier	 brace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
implementationVersion	TokenNameIdentifier	 implementation Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
implementationVendorID	TokenNameIdentifier	 implementation Vendor ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
IMPLEMENTATION_VENDOR_ID	TokenNameIdentifier	 IMPLEMENTATION  VENDOR  ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
brace	TokenNameIdentifier	 brace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
implementationVendorID	TokenNameIdentifier	 implementation Vendor ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
implementationVendor	TokenNameIdentifier	 implementation Vendor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
IMPLEMENTATION_VENDOR	TokenNameIdentifier	 IMPLEMENTATION  VENDOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
brace	TokenNameIdentifier	 brace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
implementationVendor	TokenNameIdentifier	 implementation Vendor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
implementationURL	TokenNameIdentifier	 implementation URL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
IMPLEMENTATION_URL	TokenNameIdentifier	 IMPLEMENTATION  URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
brace	TokenNameIdentifier	 brace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
implementationURL	TokenNameIdentifier	 implementation URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return <code>true</code> if the first version number is greater than * or equal to the second; otherwise return <code>false</code>. * * @param first First version number (dotted decimal) * @param second Second version number (dotted decimal) */	TokenNameCOMMENT_JAVADOC	 Return <code>true</code> if the first version number is greater than or equal to the second; otherwise return <code>false</code>. * @param first First version number (dotted decimal) @param second Second version number (dotted decimal) 
private	TokenNameprivate	
boolean	TokenNameboolean	
isCompatible	TokenNameIdentifier	 is Compatible
(	TokenNameLPAREN	
final	TokenNamefinal	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
final	TokenNamefinal	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
isGreaterThanOrEqual	TokenNameIdentifier	 is Greater Than Or Equal
(	TokenNameLPAREN	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve all the extensions listed under a particular key * (Usually EXTENSION_LIST or OPTIONAL_EXTENSION_LIST). * * @param manifest the manifest to extract extensions from * @param listKey the key used to get list (Usually * EXTENSION_LIST or OPTIONAL_EXTENSION_LIST) * @return the list of listed extensions */	TokenNameCOMMENT_JAVADOC	 Retrieve all the extensions listed under a particular key (Usually EXTENSION_LIST or OPTIONAL_EXTENSION_LIST). * @param manifest the manifest to extract extensions from @param listKey the key used to get list (Usually EXTENSION_LIST or OPTIONAL_EXTENSION_LIST) @return the list of listed extensions 
private	TokenNameprivate	
static	TokenNamestatic	
Extension	TokenNameIdentifier	 Extension
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getListed	TokenNameIdentifier	 get Listed
(	TokenNameLPAREN	
final	TokenNamefinal	
Manifest	TokenNameIdentifier	 Manifest
manifest	TokenNameIdentifier	 manifest
,	TokenNameCOMMA	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
listKey	TokenNameIdentifier	 list Key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
mainAttributes	TokenNameIdentifier	 main Attributes
=	TokenNameEQUAL	
manifest	TokenNameIdentifier	 manifest
.	TokenNameDOT	
getMainAttributes	TokenNameIdentifier	 get Main Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
mainAttributes	TokenNameIdentifier	 main Attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
mainAttributes	TokenNameIdentifier	 main Attributes
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
,	TokenNameCOMMA	
listKey	TokenNameIdentifier	 list Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
manifest	TokenNameIdentifier	 manifest
.	TokenNameDOT	
getEntries	TokenNameIdentifier	 get Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Attributes	TokenNameIdentifier	 Attributes
)	TokenNameRPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
,	TokenNameCOMMA	
listKey	TokenNameIdentifier	 list Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Extension	TokenNameIdentifier	 Extension
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Extension	TokenNameIdentifier	 Extension
[	TokenNameLBRACKET	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add required optional packages defined in the specified * attributes entry, if any. * * @param attributes Attributes to be parsed * @param required list to add required optional packages to * @param listKey the key to use to lookup list, usually EXTENSION_LIST * or OPTIONAL_EXTENSION_LIST */	TokenNameCOMMENT_JAVADOC	 Add required optional packages defined in the specified attributes entry, if any. * @param attributes Attributes to be parsed @param required list to add required optional packages to @param listKey the key to use to lookup list, usually EXTENSION_LIST or OPTIONAL_EXTENSION_LIST 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
required	TokenNameIdentifier	 required
,	TokenNameCOMMA	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
listKey	TokenNameIdentifier	 list Key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
listKey	TokenNameIdentifier	 list Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
extentions	TokenNameIdentifier	 extentions
=	TokenNameEQUAL	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
extentions	TokenNameIdentifier	 extentions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
extentions	TokenNameIdentifier	 extentions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"-"	TokenNameStringLiteral	-
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Extension	TokenNameIdentifier	 Extension
extension	TokenNameIdentifier	 extension
=	TokenNameEQUAL	
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
required	TokenNameIdentifier	 required
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Splits the string on every token into an array of strings. * * @param string the string * @param onToken the token * @return the resultant array */	TokenNameCOMMENT_JAVADOC	 Splits the string on every token into an array of strings. * @param string the string @param onToken the token @return the resultant array 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
onToken	TokenNameIdentifier	 on Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
onToken	TokenNameIdentifier	 on Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
countTokens	TokenNameIdentifier	 count Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Extract an Extension from Attributes. * Prefix indicates the prefix checked for each string. * Usually the prefix is <em>"&lt;extension&gt;-"</em> if looking for a * <b>Required</b> extension. If you are looking for an * <b>Available</b> extension * then the prefix is <em>""</em>. * * @param prefix the prefix for each attribute name * @param attributes Attributes to searched * @return the new Extension object, or null */	TokenNameCOMMENT_JAVADOC	 Extract an Extension from Attributes. Prefix indicates the prefix checked for each string. Usually the prefix is <em>"&lt;extension&gt;-"</em> if looking for a <b>Required</b> extension. If you are looking for an <b>Available</b> extension then the prefix is <em>""</em>. * @param prefix the prefix for each attribute name @param attributes Attributes to searched @return the new Extension object, or null 
private	TokenNameprivate	
static	TokenNamestatic	
Extension	TokenNameIdentifier	 Extension
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//WARNING: We trim the values of all the attributes because 	TokenNameCOMMENT_LINE	WARNING: We trim the values of all the attributes because 
//Some extension declarations are badly defined (ie have spaces 	TokenNameCOMMENT_LINE	Some extension declarations are badly defined (ie have spaces 
//after version or vendorID) 	TokenNameCOMMENT_LINE	after version or vendorID) 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
nameKey	TokenNameIdentifier	 name Key
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
EXTENSION_NAME	TokenNameIdentifier	 EXTENSION  NAME
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
getTrimmedString	TokenNameIdentifier	 get Trimmed String
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
nameKey	TokenNameIdentifier	 name Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
specVendorKey	TokenNameIdentifier	 spec Vendor Key
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
SPECIFICATION_VENDOR	TokenNameIdentifier	 SPECIFICATION  VENDOR
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
specVendor	TokenNameIdentifier	 spec Vendor
=	TokenNameEQUAL	
getTrimmedString	TokenNameIdentifier	 get Trimmed String
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
specVendorKey	TokenNameIdentifier	 spec Vendor Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
specVersionKey	TokenNameIdentifier	 spec Version Key
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
SPECIFICATION_VERSION	TokenNameIdentifier	 SPECIFICATION  VERSION
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
specVersion	TokenNameIdentifier	 spec Version
=	TokenNameEQUAL	
getTrimmedString	TokenNameIdentifier	 get Trimmed String
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
specVersionKey	TokenNameIdentifier	 spec Version Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
impVersionKey	TokenNameIdentifier	 imp Version Key
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
IMPLEMENTATION_VERSION	TokenNameIdentifier	 IMPLEMENTATION  VERSION
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
impVersion	TokenNameIdentifier	 imp Version
=	TokenNameEQUAL	
getTrimmedString	TokenNameIdentifier	 get Trimmed String
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
impVersionKey	TokenNameIdentifier	 imp Version Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
impVendorKey	TokenNameIdentifier	 imp Vendor Key
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
IMPLEMENTATION_VENDOR	TokenNameIdentifier	 IMPLEMENTATION  VENDOR
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
impVendor	TokenNameIdentifier	 imp Vendor
=	TokenNameEQUAL	
getTrimmedString	TokenNameIdentifier	 get Trimmed String
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
impVendorKey	TokenNameIdentifier	 imp Vendor Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
impVendorIDKey	TokenNameIdentifier	 imp Vendor ID Key
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
IMPLEMENTATION_VENDOR_ID	TokenNameIdentifier	 IMPLEMENTATION  VENDOR  ID
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
impVendorId	TokenNameIdentifier	 imp Vendor Id
=	TokenNameEQUAL	
getTrimmedString	TokenNameIdentifier	 get Trimmed String
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
impVendorIDKey	TokenNameIdentifier	 imp Vendor ID Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
impURLKey	TokenNameIdentifier	 imp URL Key
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
IMPLEMENTATION_URL	TokenNameIdentifier	 IMPLEMENTATION  URL
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
impURL	TokenNameIdentifier	 imp URL
=	TokenNameEQUAL	
getTrimmedString	TokenNameIdentifier	 get Trimmed String
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
impURLKey	TokenNameIdentifier	 imp URL Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Extension	TokenNameIdentifier	 Extension
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
specVersion	TokenNameIdentifier	 spec Version
,	TokenNameCOMMA	
specVendor	TokenNameIdentifier	 spec Vendor
,	TokenNameCOMMA	
impVersion	TokenNameIdentifier	 imp Version
,	TokenNameCOMMA	
impVendor	TokenNameIdentifier	 imp Vendor
,	TokenNameCOMMA	
impVendorId	TokenNameIdentifier	 imp Vendor Id
,	TokenNameCOMMA	
impURL	TokenNameIdentifier	 imp URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Trim the supplied string if the string is non-null * * @param value the string to trim or null * @return the trimmed string or null */	TokenNameCOMMENT_JAVADOC	 Trim the supplied string if the string is non-null * @param value the string to trim or null @return the trimmed string or null 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getTrimmedString	TokenNameIdentifier	 get Trimmed String
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
value	TokenNameIdentifier	 value
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
