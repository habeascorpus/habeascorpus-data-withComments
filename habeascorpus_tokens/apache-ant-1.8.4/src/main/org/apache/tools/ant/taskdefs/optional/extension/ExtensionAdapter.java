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
DataType	TokenNameIdentifier	 Data Type
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
Reference	TokenNameIdentifier	 Reference
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
/** * Simple class that represents an Extension and conforms to Ants * patterns. * * @ant.datatype name="extension" */	TokenNameCOMMENT_JAVADOC	 Simple class that represents an Extension and conforms to Ants patterns. * @ant.datatype name="extension" 
public	TokenNamepublic	
class	TokenNameclass	
ExtensionAdapter	TokenNameIdentifier	 Extension Adapter
extends	TokenNameextends	
DataType	TokenNameIdentifier	 Data Type
{	TokenNameLBRACE	
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
/** * Set the name of extension. * * @param extensionName the name of extension */	TokenNameCOMMENT_JAVADOC	 Set the name of extension. * @param extensionName the name of extension 
public	TokenNamepublic	
void	TokenNamevoid	
setExtensionName	TokenNameIdentifier	 set Extension Name
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
extensionName	TokenNameIdentifier	 extension Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
verifyNotAReference	TokenNameIdentifier	 verify Not A Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
extensionName	TokenNameIdentifier	 extension Name
=	TokenNameEQUAL	
extensionName	TokenNameIdentifier	 extension Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the specificationVersion of extension. * * @param specificationVersion the specificationVersion of extension */	TokenNameCOMMENT_JAVADOC	 Set the specificationVersion of extension. * @param specificationVersion the specificationVersion of extension 
public	TokenNamepublic	
void	TokenNamevoid	
setSpecificationVersion	TokenNameIdentifier	 set Specification Version
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
specificationVersion	TokenNameIdentifier	 specification Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
verifyNotAReference	TokenNameIdentifier	 verify Not A Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
/** * Set the specificationVendor of extension. * * @param specificationVendor the specificationVendor of extension */	TokenNameCOMMENT_JAVADOC	 Set the specificationVendor of extension. * @param specificationVendor the specificationVendor of extension 
public	TokenNamepublic	
void	TokenNamevoid	
setSpecificationVendor	TokenNameIdentifier	 set Specification Vendor
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
specificationVendor	TokenNameIdentifier	 specification Vendor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
verifyNotAReference	TokenNameIdentifier	 verify Not A Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
specificationVendor	TokenNameIdentifier	 specification Vendor
=	TokenNameEQUAL	
specificationVendor	TokenNameIdentifier	 specification Vendor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the implementationVendorID of extension. * * @param implementationVendorID the implementationVendorID of extension */	TokenNameCOMMENT_JAVADOC	 Set the implementationVendorID of extension. * @param implementationVendorID the implementationVendorID of extension 
public	TokenNamepublic	
void	TokenNamevoid	
setImplementationVendorId	TokenNameIdentifier	 set Implementation Vendor Id
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
implementationVendorID	TokenNameIdentifier	 implementation Vendor ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
verifyNotAReference	TokenNameIdentifier	 verify Not A Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
implementationVendorID	TokenNameIdentifier	 implementation Vendor ID
=	TokenNameEQUAL	
implementationVendorID	TokenNameIdentifier	 implementation Vendor ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the implementationVendor of extension. * * @param implementationVendor the implementationVendor of extension */	TokenNameCOMMENT_JAVADOC	 Set the implementationVendor of extension. * @param implementationVendor the implementationVendor of extension 
public	TokenNamepublic	
void	TokenNamevoid	
setImplementationVendor	TokenNameIdentifier	 set Implementation Vendor
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
implementationVendor	TokenNameIdentifier	 implementation Vendor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
verifyNotAReference	TokenNameIdentifier	 verify Not A Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
implementationVendor	TokenNameIdentifier	 implementation Vendor
=	TokenNameEQUAL	
implementationVendor	TokenNameIdentifier	 implementation Vendor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the implementationVersion of extension. * * @param implementationVersion the implementationVersion of extension */	TokenNameCOMMENT_JAVADOC	 Set the implementationVersion of extension. * @param implementationVersion the implementationVersion of extension 
public	TokenNamepublic	
void	TokenNamevoid	
setImplementationVersion	TokenNameIdentifier	 set Implementation Version
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
implementationVersion	TokenNameIdentifier	 implementation Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
verifyNotAReference	TokenNameIdentifier	 verify Not A Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
/** * Set the implementationURL of extension. * * @param implementationURL the implementationURL of extension */	TokenNameCOMMENT_JAVADOC	 Set the implementationURL of extension. * @param implementationURL the implementationURL of extension 
public	TokenNamepublic	
void	TokenNamevoid	
setImplementationUrl	TokenNameIdentifier	 set Implementation Url
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
implementationURL	TokenNameIdentifier	 implementation URL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
verifyNotAReference	TokenNameIdentifier	 verify Not A Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
implementationURL	TokenNameIdentifier	 implementation URL
=	TokenNameEQUAL	
implementationURL	TokenNameIdentifier	 implementation URL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Makes this instance in effect a reference to another ExtensionAdapter * instance. * * <p>You must not set another attribute or nest elements inside * this element if you make it a reference.</p> * * @param reference the reference to which this instance is associated * @exception BuildException if this instance already has been configured. */	TokenNameCOMMENT_JAVADOC	 Makes this instance in effect a reference to another ExtensionAdapter instance. * <p>You must not set another attribute or nest elements inside this element if you make it a reference.</p> * @param reference the reference to which this instance is associated @exception BuildException if this instance already has been configured. 
public	TokenNamepublic	
void	TokenNamevoid	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
final	TokenNamefinal	
Reference	TokenNameIdentifier	 Reference
reference	TokenNameIdentifier	 reference
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
extensionName	TokenNameIdentifier	 extension Name
||	TokenNameOR_OR	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
specificationVersion	TokenNameIdentifier	 specification Version
||	TokenNameOR_OR	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
specificationVendor	TokenNameIdentifier	 specification Vendor
||	TokenNameOR_OR	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
implementationVersion	TokenNameIdentifier	 implementation Version
||	TokenNameOR_OR	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
implementationVendorID	TokenNameIdentifier	 implementation Vendor ID
||	TokenNameOR_OR	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
implementationVendor	TokenNameIdentifier	 implementation Vendor
||	TokenNameOR_OR	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
implementationURL	TokenNameIdentifier	 implementation URL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
reference	TokenNameIdentifier	 reference
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
verifyNotAReference	TokenNameIdentifier	 verify Not A Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Convert this adpater object into an extension object. * * @return the extension object */	TokenNameCOMMENT_JAVADOC	 Convert this adpater object into an extension object. * @return the extension object 
Extension	TokenNameIdentifier	 Extension
toExtension	TokenNameIdentifier	 to Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ExtensionAdapter	TokenNameIdentifier	 Extension Adapter
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toExtension	TokenNameIdentifier	 to Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
extensionName	TokenNameIdentifier	 extension Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"Extension is missing name."	TokenNameStringLiteral	Extension is missing name.
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
specificationVersionString	TokenNameIdentifier	 specification Version String
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
specificationVersion	TokenNameIdentifier	 specification Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
specificationVersionString	TokenNameIdentifier	 specification Version String
=	TokenNameEQUAL	
specificationVersion	TokenNameIdentifier	 specification Version
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
implementationVersionString	TokenNameIdentifier	 implementation Version String
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
implementationVersion	TokenNameIdentifier	 implementation Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
implementationVersionString	TokenNameIdentifier	 implementation Version String
=	TokenNameEQUAL	
implementationVersion	TokenNameIdentifier	 implementation Version
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Extension	TokenNameIdentifier	 Extension
(	TokenNameLPAREN	
extensionName	TokenNameIdentifier	 extension Name
,	TokenNameCOMMA	
specificationVersionString	TokenNameIdentifier	 specification Version String
,	TokenNameCOMMA	
specificationVendor	TokenNameIdentifier	 specification Vendor
,	TokenNameCOMMA	
implementationVersionString	TokenNameIdentifier	 implementation Version String
,	TokenNameCOMMA	
implementationVendor	TokenNameIdentifier	 implementation Vendor
,	TokenNameCOMMA	
implementationVendorID	TokenNameIdentifier	 implementation Vendor ID
,	TokenNameCOMMA	
implementationURL	TokenNameIdentifier	 implementation URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * a debug toString method. * @return the extension in a string. * @see java.lang.Object#toString() */	TokenNameCOMMENT_JAVADOC	 a debug toString method. @return the extension in a string. @see java.lang.Object#toString() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
toExtension	TokenNameIdentifier	 to Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"}"	TokenNameStringLiteral	}
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
