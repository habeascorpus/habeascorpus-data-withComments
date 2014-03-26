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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
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
Arrays	TokenNameIdentifier	 Arrays
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
Specification	TokenNameIdentifier	 Specification
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MISSING	TokenNameIdentifier	 MISSING
=	TokenNameEQUAL	
"Missing "	TokenNameStringLiteral	Missing 
;	TokenNameSEMICOLON	
/** * Manifest Attribute Name object for SPECIFICATION_TITLE. */	TokenNameCOMMENT_JAVADOC	 Manifest Attribute Name object for SPECIFICATION_TITLE. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
SPECIFICATION_TITLE	TokenNameIdentifier	 SPECIFICATION  TITLE
=	TokenNameEQUAL	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
.	TokenNameDOT	
SPECIFICATION_TITLE	TokenNameIdentifier	 SPECIFICATION  TITLE
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
/** * Manifest Attribute Name object for IMPLEMENTATION_TITLE. */	TokenNameCOMMENT_JAVADOC	 Manifest Attribute Name object for IMPLEMENTATION_TITLE. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
IMPLEMENTATION_TITLE	TokenNameIdentifier	 IMPLEMENTATION  TITLE
=	TokenNameEQUAL	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
.	TokenNameDOT	
IMPLEMENTATION_TITLE	TokenNameIdentifier	 IMPLEMENTATION  TITLE
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
/** * Enum indicating that extension is compatible with other Package * Specification. */	TokenNameCOMMENT_JAVADOC	 Enum indicating that extension is compatible with other Package Specification. 
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
/** * Enum indicating that extension requires an upgrade * of specification to be compatible with other Package Specification. */	TokenNameCOMMENT_JAVADOC	 Enum indicating that extension requires an upgrade of specification to be compatible with other Package Specification. 
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
/** * Enum indicating that extension requires a vendor * switch to be compatible with other Package Specification. */	TokenNameCOMMENT_JAVADOC	 Enum indicating that extension requires a vendor switch to be compatible with other Package Specification. 
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
/** * Enum indicating that extension requires an upgrade * of implementation to be compatible with other Package Specification. */	TokenNameCOMMENT_JAVADOC	 Enum indicating that extension requires an upgrade of implementation to be compatible with other Package Specification. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Compatibility	TokenNameIdentifier	 Compatibility
REQUIRE_IMPLEMENTATION_CHANGE	TokenNameIdentifier	 REQUIRE  IMPLEMENTATION  CHANGE
=	TokenNameEQUAL	
new	TokenNamenew	
Compatibility	TokenNameIdentifier	 Compatibility
(	TokenNameLPAREN	
"REQUIRE_IMPLEMENTATION_CHANGE"	TokenNameStringLiteral	REQUIRE_IMPLEMENTATION_CHANGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This enum indicates that an extension is incompatible with * other Package Specification in ways other than other enums * indicate. For example, the other Package Specification * may have a different ID. */	TokenNameCOMMENT_JAVADOC	 This enum indicates that an extension is incompatible with other Package Specification in ways other than other enums indicate. For example, the other Package Specification may have a different ID. 
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
/** * The name of the Package Specification. */	TokenNameCOMMENT_JAVADOC	 The name of the Package Specification. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
specificationTitle	TokenNameIdentifier	 specification Title
;	TokenNameSEMICOLON	
/** * The version number (dotted decimal notation) of the specification * to which this optional package conforms. */	TokenNameCOMMENT_JAVADOC	 The version number (dotted decimal notation) of the specification to which this optional package conforms. 
private	TokenNameprivate	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
specificationVersion	TokenNameIdentifier	 specification Version
;	TokenNameSEMICOLON	
/** * The name of the company or organization that originated the * specification to which this specification conforms. */	TokenNameCOMMENT_JAVADOC	 The name of the company or organization that originated the specification to which this specification conforms. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
specificationVendor	TokenNameIdentifier	 specification Vendor
;	TokenNameSEMICOLON	
/** * The title of implementation. */	TokenNameCOMMENT_JAVADOC	 The title of implementation. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
implementationTitle	TokenNameIdentifier	 implementation Title
;	TokenNameSEMICOLON	
/** * The name of the company or organization that produced this * implementation of this specification. */	TokenNameCOMMENT_JAVADOC	 The name of the company or organization that produced this implementation of this specification. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
implementationVendor	TokenNameIdentifier	 implementation Vendor
;	TokenNameSEMICOLON	
/** * The version string for implementation. The version string is * opaque. */	TokenNameCOMMENT_JAVADOC	 The version string for implementation. The version string is opaque. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
implementationVersion	TokenNameIdentifier	 implementation Version
;	TokenNameSEMICOLON	
/** * The sections of jar that the specification applies to. */	TokenNameCOMMENT_JAVADOC	 The sections of jar that the specification applies to. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sections	TokenNameIdentifier	 sections
;	TokenNameSEMICOLON	
/** * Return an array of <code>Package Specification</code> objects. * If there are no such optional packages, a zero-length array is returned. * * @param manifest Manifest to be parsed * @return the Package Specifications extensions in specified manifest * @throws ParseException if the attributes of the specifications cannot * be parsed according to their expected formats. */	TokenNameCOMMENT_JAVADOC	 Return an array of <code>Package Specification</code> objects. If there are no such optional packages, a zero-length array is returned. * @param manifest Manifest to be parsed @return the Package Specifications extensions in specified manifest @throws ParseException if the attributes of the specifications cannot be parsed according to their expected formats. 
public	TokenNamepublic	
static	TokenNamestatic	
Specification	TokenNameIdentifier	 Specification
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSpecifications	TokenNameIdentifier	 get Specifications
(	TokenNameLPAREN	
final	TokenNamefinal	
Manifest	TokenNameIdentifier	 Manifest
manifest	TokenNameIdentifier	 manifest
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
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
Specification	TokenNameIdentifier	 Specification
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
Specification	TokenNameIdentifier	 Specification
specification	TokenNameIdentifier	 specification
=	TokenNameEQUAL	
getSpecification	TokenNameIdentifier	 get Specification
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
specification	TokenNameIdentifier	 specification
)	TokenNameRPAREN	
{	TokenNameLBRACE	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
specification	TokenNameIdentifier	 specification
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
trimmedResults	TokenNameIdentifier	 trimmed Results
=	TokenNameEQUAL	
removeDuplicates	TokenNameIdentifier	 remove Duplicates
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Specification	TokenNameIdentifier	 Specification
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
trimmedResults	TokenNameIdentifier	 trimmed Results
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Specification	TokenNameIdentifier	 Specification
[	TokenNameLBRACKET	
trimmedResults	TokenNameIdentifier	 trimmed Results
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The constructor to create Package Specification object. * Note that every component is allowed to be specified * but only the specificationTitle is mandatory. * * @param specificationTitle the name of specification. * @param specificationVersion the specification Version. * @param specificationVendor the specification Vendor. * @param implementationTitle the title of implementation. * @param implementationVersion the implementation Version. * @param implementationVendor the implementation Vendor. */	TokenNameCOMMENT_JAVADOC	 The constructor to create Package Specification object. Note that every component is allowed to be specified but only the specificationTitle is mandatory. * @param specificationTitle the name of specification. @param specificationVersion the specification Version. @param specificationVendor the specification Vendor. @param implementationTitle the title of implementation. @param implementationVersion the implementation Version. @param implementationVendor the implementation Vendor. 
public	TokenNamepublic	
Specification	TokenNameIdentifier	 Specification
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
specificationTitle	TokenNameIdentifier	 specification Title
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
implementationTitle	TokenNameIdentifier	 implementation Title
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
implementationVersion	TokenNameIdentifier	 implementation Version
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
implementationVendor	TokenNameIdentifier	 implementation Vendor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
specificationTitle	TokenNameIdentifier	 specification Title
,	TokenNameCOMMA	
specificationVersion	TokenNameIdentifier	 specification Version
,	TokenNameCOMMA	
specificationVendor	TokenNameIdentifier	 specification Vendor
,	TokenNameCOMMA	
implementationTitle	TokenNameIdentifier	 implementation Title
,	TokenNameCOMMA	
implementationVersion	TokenNameIdentifier	 implementation Version
,	TokenNameCOMMA	
implementationVendor	TokenNameIdentifier	 implementation Vendor
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The constructor to create Package Specification object. * Note that every component is allowed to be specified * but only the specificationTitle is mandatory. * * @param specificationTitle the name of specification. * @param specificationVersion the specification Version. * @param specificationVendor the specification Vendor. * @param implementationTitle the title of implementation. * @param implementationVersion the implementation Version. * @param implementationVendor the implementation Vendor. * @param sections the sections/packages that Specification applies to. */	TokenNameCOMMENT_JAVADOC	 The constructor to create Package Specification object. Note that every component is allowed to be specified but only the specificationTitle is mandatory. * @param specificationTitle the name of specification. @param specificationVersion the specification Version. @param specificationVendor the specification Vendor. @param implementationTitle the title of implementation. @param implementationVersion the implementation Version. @param implementationVendor the implementation Vendor. @param sections the sections/packages that Specification applies to. 
public	TokenNamepublic	
Specification	TokenNameIdentifier	 Specification
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
specificationTitle	TokenNameIdentifier	 specification Title
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
implementationTitle	TokenNameIdentifier	 implementation Title
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
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sections	TokenNameIdentifier	 sections
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
specificationTitle	TokenNameIdentifier	 specification Title
=	TokenNameEQUAL	
specificationTitle	TokenNameIdentifier	 specification Title
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
specificationTitle	TokenNameIdentifier	 specification Title
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
implementationTitle	TokenNameIdentifier	 implementation Title
=	TokenNameEQUAL	
implementationTitle	TokenNameIdentifier	 implementation Title
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
implementationVendor	TokenNameIdentifier	 implementation Vendor
=	TokenNameEQUAL	
implementationVendor	TokenNameIdentifier	 implementation Vendor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
implementationVersion	TokenNameIdentifier	 implementation Version
=	TokenNameEQUAL	
implementationVersion	TokenNameIdentifier	 implementation Version
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
specificationTitle	TokenNameIdentifier	 specification Title
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"specificationTitle"	TokenNameStringLiteral	specificationTitle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
copy	TokenNameIdentifier	 copy
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
sections	TokenNameIdentifier	 sections
)	TokenNameRPAREN	
{	TokenNameLBRACE	
copy	TokenNameIdentifier	 copy
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
sections	TokenNameIdentifier	 sections
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
copy	TokenNameIdentifier	 copy
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sections	TokenNameIdentifier	 sections
=	TokenNameEQUAL	
copy	TokenNameIdentifier	 copy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the title of the specification. * * @return the title of speciication */	TokenNameCOMMENT_JAVADOC	 Get the title of the specification. * @return the title of speciication 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSpecificationTitle	TokenNameIdentifier	 get Specification Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
specificationTitle	TokenNameIdentifier	 specification Title
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the vendor of the specification. * * @return the vendor of the specification. */	TokenNameCOMMENT_JAVADOC	 Get the vendor of the specification. * @return the vendor of the specification. 
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
/** * Get the title of the specification. * * @return the title of the specification. */	TokenNameCOMMENT_JAVADOC	 Get the title of the specification. * @return the title of the specification. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getImplementationTitle	TokenNameIdentifier	 get Implementation Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
implementationTitle	TokenNameIdentifier	 implementation Title
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the version of the specification. * * @return the version of the specification. */	TokenNameCOMMENT_JAVADOC	 Get the version of the specification. * @return the version of the specification. 
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
/** * Get the version of the implementation. * * @return the version of the implementation. */	TokenNameCOMMENT_JAVADOC	 Get the version of the implementation. * @return the version of the implementation. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getImplementationVersion	TokenNameIdentifier	 get Implementation Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
implementationVersion	TokenNameIdentifier	 implementation Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return an array containing sections to which specification applies * or null if relevent to no sections. * * @return an array containing sections to which specification applies * or null if relevent to no sections. */	TokenNameCOMMENT_JAVADOC	 Return an array containing sections to which specification applies or null if relevent to no sections. * @return an array containing sections to which specification applies or null if relevent to no sections. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSections	TokenNameIdentifier	 get Sections
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
sections	TokenNameIdentifier	 sections
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newSections	TokenNameIdentifier	 new Sections
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
sections	TokenNameIdentifier	 sections
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newSections	TokenNameIdentifier	 new Sections
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newSections	TokenNameIdentifier	 new Sections
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a Compatibility enum indicating the relationship of this * <code>Package Specification</code> with the specified * <code>Extension</code>. * * @param other the other specification * @return the enum indicating the compatibility (or lack thereof) * of specifed Package Specification */	TokenNameCOMMENT_JAVADOC	 Return a Compatibility enum indicating the relationship of this <code>Package Specification</code> with the specified <code>Extension</code>. * @param other the other specification @return the enum indicating the compatibility (or lack thereof) of specifed Package Specification 
public	TokenNamepublic	
Compatibility	TokenNameIdentifier	 Compatibility
getCompatibilityWith	TokenNameIdentifier	 get Compatibility With
(	TokenNameLPAREN	
final	TokenNamefinal	
Specification	TokenNameIdentifier	 Specification
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Specification Name must match 	TokenNameCOMMENT_LINE	Specification Name must match 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
specificationTitle	TokenNameIdentifier	 specification Title
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getSpecificationTitle	TokenNameIdentifier	 get Specification Title
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
otherSpecificationVersion	TokenNameIdentifier	 other Specification Version
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
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
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
otherSpecificationVersion	TokenNameIdentifier	 other Specification Version
||	TokenNameOR_OR	
!	TokenNameNOT	
isCompatible	TokenNameIdentifier	 is Compatible
(	TokenNameLPAREN	
specificationVersion	TokenNameIdentifier	 specification Version
,	TokenNameCOMMA	
otherSpecificationVersion	TokenNameIdentifier	 other Specification Version
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
otherImplementationVendor	TokenNameIdentifier	 other Implementation Vendor
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
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
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
otherImplementationVendor	TokenNameIdentifier	 other Implementation Vendor
||	TokenNameOR_OR	
!	TokenNameNOT	
implementationVendor	TokenNameIdentifier	 implementation Vendor
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
otherImplementationVendor	TokenNameIdentifier	 other Implementation Vendor
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
String	TokenNameIdentifier	 String
otherImplementationVersion	TokenNameIdentifier	 other Implementation Version
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
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
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
otherImplementationVersion	TokenNameIdentifier	 other Implementation Version
||	TokenNameOR_OR	
!	TokenNameNOT	
implementationVersion	TokenNameIdentifier	 implementation Version
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
otherImplementationVersion	TokenNameIdentifier	 other Implementation Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
REQUIRE_IMPLEMENTATION_CHANGE	TokenNameIdentifier	 REQUIRE  IMPLEMENTATION  CHANGE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// This available optional package satisfies the requirements 	TokenNameCOMMENT_LINE	This available optional package satisfies the requirements 
return	TokenNamereturn	
COMPATIBLE	TokenNameIdentifier	 COMPATIBLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return <code>true</code> if the specified <code>package</code> * is satisfied by this <code>Specification</code>. Otherwise, return * <code>false</code>. * * @param other the specification * @return true if the specification is compatible with this specification */	TokenNameCOMMENT_JAVADOC	 Return <code>true</code> if the specified <code>package</code> is satisfied by this <code>Specification</code>. Otherwise, return <code>false</code>. * @param other the specification @return true if the specification is compatible with this specification 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompatibleWith	TokenNameIdentifier	 is Compatible With
(	TokenNameLPAREN	
final	TokenNamefinal	
Specification	TokenNameIdentifier	 Specification
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
COMPATIBLE	TokenNameIdentifier	 COMPATIBLE
==	TokenNameEQUAL_EQUAL	
getCompatibilityWith	TokenNameIdentifier	 get Compatibility With
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
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
SPECIFICATION_TITLE	TokenNameIdentifier	 SPECIFICATION  TITLE
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
specificationTitle	TokenNameIdentifier	 specification Title
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
implementationTitle	TokenNameIdentifier	 implementation Title
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
IMPLEMENTATION_TITLE	TokenNameIdentifier	 IMPLEMENTATION  TITLE
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
implementationTitle	TokenNameIdentifier	 implementation Title
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
/** * Combine all specifications objects that are identical except * for the sections. * * <p>Note this is very inefficent and should probably be fixed * in the future.</p> * * @param list the array of results to trim * @return an array list with all duplicates removed */	TokenNameCOMMENT_JAVADOC	 Combine all specifications objects that are identical except for the sections. * <p>Note this is very inefficent and should probably be fixed in the future.</p> * @param list the array of results to trim @return an array list with all duplicates removed 
private	TokenNameprivate	
static	TokenNamestatic	
ArrayList	TokenNameIdentifier	 Array List
removeDuplicates	TokenNameIdentifier	 remove Duplicates
(	TokenNameLPAREN	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
list	TokenNameIdentifier	 list
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
ArrayList	TokenNameIdentifier	 Array List
sections	TokenNameIdentifier	 sections
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Specification	TokenNameIdentifier	 Specification
specification	TokenNameIdentifier	 specification
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Specification	TokenNameIdentifier	 Specification
)	TokenNameRPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Specification	TokenNameIdentifier	 Specification
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Specification	TokenNameIdentifier	 Specification
)	TokenNameRPAREN	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isEqual	TokenNameIdentifier	 is Equal
(	TokenNameLPAREN	
specification	TokenNameIdentifier	 specification
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
otherSections	TokenNameIdentifier	 other Sections
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getSections	TokenNameIdentifier	 get Sections
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
otherSections	TokenNameIdentifier	 other Sections
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
otherSections	TokenNameIdentifier	 other Sections
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
Specification	TokenNameIdentifier	 Specification
merged	TokenNameIdentifier	 merged
=	TokenNameEQUAL	
mergeInSections	TokenNameIdentifier	 merge In Sections
(	TokenNameLPAREN	
specification	TokenNameIdentifier	 specification
,	TokenNameCOMMA	
sections	TokenNameIdentifier	 sections
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Reset list of sections 	TokenNameCOMMENT_LINE	Reset list of sections 
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
results	TokenNameIdentifier	 results
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test if two specifications are equal except for their sections. * * @param specification one specificaiton * @param other the ohter specification * @return true if two specifications are equal except for their * sections, else false */	TokenNameCOMMENT_JAVADOC	 Test if two specifications are equal except for their sections. * @param specification one specificaiton @param other the ohter specification @return true if two specifications are equal except for their sections, else false 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isEqual	TokenNameIdentifier	 is Equal
(	TokenNameLPAREN	
final	TokenNamefinal	
Specification	TokenNameIdentifier	 Specification
specification	TokenNameIdentifier	 specification
,	TokenNameCOMMA	
final	TokenNamefinal	
Specification	TokenNameIdentifier	 Specification
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
specification	TokenNameIdentifier	 specification
.	TokenNameDOT	
getSpecificationTitle	TokenNameIdentifier	 get Specification Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getSpecificationTitle	TokenNameIdentifier	 get Specification Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
specification	TokenNameIdentifier	 specification
.	TokenNameDOT	
getSpecificationVersion	TokenNameIdentifier	 get Specification Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isEqual	TokenNameIdentifier	 is Equal
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getSpecificationVersion	TokenNameIdentifier	 get Specification Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
specification	TokenNameIdentifier	 specification
.	TokenNameDOT	
getSpecificationVendor	TokenNameIdentifier	 get Specification Vendor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getSpecificationVendor	TokenNameIdentifier	 get Specification Vendor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
specification	TokenNameIdentifier	 specification
.	TokenNameDOT	
getImplementationTitle	TokenNameIdentifier	 get Implementation Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getImplementationTitle	TokenNameIdentifier	 get Implementation Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
specification	TokenNameIdentifier	 specification
.	TokenNameDOT	
getImplementationVersion	TokenNameIdentifier	 get Implementation Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getImplementationVersion	TokenNameIdentifier	 get Implementation Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
specification	TokenNameIdentifier	 specification
.	TokenNameDOT	
getImplementationVendor	TokenNameIdentifier	 get Implementation Vendor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getImplementationVendor	TokenNameIdentifier	 get Implementation Vendor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Merge the specified sections into specified section and return result. * If no sections to be added then just return original specification. * * @param specification the specification * @param sectionsToAdd the list of sections to merge * @return the merged specification */	TokenNameCOMMENT_JAVADOC	 Merge the specified sections into specified section and return result. If no sections to be added then just return original specification. * @param specification the specification @param sectionsToAdd the list of sections to merge @return the merged specification 
private	TokenNameprivate	
static	TokenNamestatic	
Specification	TokenNameIdentifier	 Specification
mergeInSections	TokenNameIdentifier	 merge In Sections
(	TokenNameLPAREN	
final	TokenNamefinal	
Specification	TokenNameIdentifier	 Specification
specification	TokenNameIdentifier	 specification
,	TokenNameCOMMA	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
sectionsToAdd	TokenNameIdentifier	 sections To Add
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
sectionsToAdd	TokenNameIdentifier	 sections To Add
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
specification	TokenNameIdentifier	 specification
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sectionsToAdd	TokenNameIdentifier	 sections To Add
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
specification	TokenNameIdentifier	 specification
.	TokenNameDOT	
getSections	TokenNameIdentifier	 get Sections
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sections	TokenNameIdentifier	 sections
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
sectionsToAdd	TokenNameIdentifier	 sections To Add
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
sectionsToAdd	TokenNameIdentifier	 sections To Add
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Specification	TokenNameIdentifier	 Specification
(	TokenNameLPAREN	
specification	TokenNameIdentifier	 specification
.	TokenNameDOT	
getSpecificationTitle	TokenNameIdentifier	 get Specification Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
specification	TokenNameIdentifier	 specification
.	TokenNameDOT	
getSpecificationVersion	TokenNameIdentifier	 get Specification Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
specification	TokenNameIdentifier	 specification
.	TokenNameDOT	
getSpecificationVendor	TokenNameIdentifier	 get Specification Vendor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
specification	TokenNameIdentifier	 specification
.	TokenNameDOT	
getImplementationTitle	TokenNameIdentifier	 get Implementation Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
specification	TokenNameIdentifier	 specification
.	TokenNameDOT	
getImplementationVersion	TokenNameIdentifier	 get Implementation Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
specification	TokenNameIdentifier	 specification
.	TokenNameDOT	
getImplementationVendor	TokenNameIdentifier	 get Implementation Vendor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sections	TokenNameIdentifier	 sections
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
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
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
/** * Extract an Package Specification from Attributes. * * @param attributes Attributes to searched * @return the new Specification object, or null */	TokenNameCOMMENT_JAVADOC	 Extract an Package Specification from Attributes. * @param attributes Attributes to searched @return the new Specification object, or null 
private	TokenNameprivate	
static	TokenNamestatic	
Specification	TokenNameIdentifier	 Specification
getSpecification	TokenNameIdentifier	 get Specification
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
section	TokenNameIdentifier	 section
,	TokenNameCOMMA	
final	TokenNamefinal	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
//WARNING: We trim the values of all the attributes because 	TokenNameCOMMENT_LINE	WARNING: We trim the values of all the attributes because 
//Some extension declarations are badly defined (ie have spaces 	TokenNameCOMMENT_LINE	Some extension declarations are badly defined (ie have spaces 
//after version or vendor) 	TokenNameCOMMENT_LINE	after version or vendor) 
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
SPECIFICATION_TITLE	TokenNameIdentifier	 SPECIFICATION  TITLE
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
specVendor	TokenNameIdentifier	 spec Vendor
=	TokenNameEQUAL	
getTrimmedString	TokenNameIdentifier	 get Trimmed String
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
SPECIFICATION_VENDOR	TokenNameIdentifier	 SPECIFICATION  VENDOR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
specVendor	TokenNameIdentifier	 spec Vendor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
MISSING	TokenNameIdentifier	 MISSING
+	TokenNamePLUS	
SPECIFICATION_VENDOR	TokenNameIdentifier	 SPECIFICATION  VENDOR
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
SPECIFICATION_VERSION	TokenNameIdentifier	 SPECIFICATION  VERSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
specVersion	TokenNameIdentifier	 spec Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
MISSING	TokenNameIdentifier	 MISSING
+	TokenNamePLUS	
SPECIFICATION_VERSION	TokenNameIdentifier	 SPECIFICATION  VERSION
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
impTitle	TokenNameIdentifier	 imp Title
=	TokenNameEQUAL	
getTrimmedString	TokenNameIdentifier	 get Trimmed String
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
IMPLEMENTATION_TITLE	TokenNameIdentifier	 IMPLEMENTATION  TITLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
impTitle	TokenNameIdentifier	 imp Title
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
MISSING	TokenNameIdentifier	 MISSING
+	TokenNamePLUS	
IMPLEMENTATION_TITLE	TokenNameIdentifier	 IMPLEMENTATION  TITLE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
IMPLEMENTATION_VERSION	TokenNameIdentifier	 IMPLEMENTATION  VERSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
impVersion	TokenNameIdentifier	 imp Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
MISSING	TokenNameIdentifier	 MISSING
+	TokenNamePLUS	
IMPLEMENTATION_VERSION	TokenNameIdentifier	 IMPLEMENTATION  VERSION
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
IMPLEMENTATION_VENDOR	TokenNameIdentifier	 IMPLEMENTATION  VENDOR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
impVendor	TokenNameIdentifier	 imp Vendor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
MISSING	TokenNameIdentifier	 MISSING
+	TokenNamePLUS	
IMPLEMENTATION_VENDOR	TokenNameIdentifier	 IMPLEMENTATION  VENDOR
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Specification	TokenNameIdentifier	 Specification
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
specVersion	TokenNameIdentifier	 spec Version
,	TokenNameCOMMA	
specVendor	TokenNameIdentifier	 spec Vendor
,	TokenNameCOMMA	
impTitle	TokenNameIdentifier	 imp Title
,	TokenNameCOMMA	
impVersion	TokenNameIdentifier	 imp Version
,	TokenNameCOMMA	
impVendor	TokenNameIdentifier	 imp Vendor
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
section	TokenNameIdentifier	 section
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
