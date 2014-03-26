/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
models	TokenNameIdentifier	 models
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
models	TokenNameIdentifier	 models
.	TokenNameDOT	
CMNode	TokenNameIdentifier	 CM Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSMessageFormatter	TokenNameIdentifier	 XS Message Formatter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SecurityManager	TokenNameIdentifier	 Security Manager
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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
;	TokenNameSEMICOLON	
/** * * @xerces.internal * * @author Neeraj Bajaj * * @version $Id: CMNodeFactory.java 911823 2010-02-19 14:38:42Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 * @xerces.internal * @author Neeraj Bajaj * @version $Id: CMNodeFactory.java 911823 2010-02-19 14:38:42Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
CMNodeFactory	TokenNameIdentifier	 CM Node Factory
{	TokenNameLBRACE	
/** Property identifier: error reporter. */	TokenNameCOMMENT_JAVADOC	 Property identifier: error reporter. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_REPORTER	TokenNameIdentifier	 ERROR  REPORTER
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ERROR_REPORTER_PROPERTY	TokenNameIdentifier	 ERROR  REPORTER  PROPERTY
;	TokenNameSEMICOLON	
/** property identifier: security manager. */	TokenNameCOMMENT_JAVADOC	 property identifier: security manager. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SECURITY_MANAGER	TokenNameIdentifier	 SECURITY  MANAGER
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SECURITY_MANAGER_PROPERTY	TokenNameIdentifier	 SECURITY  MANAGER  PROPERTY
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MULTIPLICITY	TokenNameIdentifier	 MULTIPLICITY
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//count of number of nodes created 	TokenNameCOMMENT_LINE	count of number of nodes created 
private	TokenNameprivate	
int	TokenNameint	
nodeCount	TokenNameIdentifier	 node Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//No. of nodes allowed. 	TokenNameCOMMENT_LINE	No. of nodes allowed. 
private	TokenNameprivate	
int	TokenNameint	
maxNodeLimit	TokenNameIdentifier	 max Node Limit
;	TokenNameSEMICOLON	
/** * Error reporter. This property identifier is: * http://apache.org/xml/properties/internal/error-reporter */	TokenNameCOMMENT_JAVADOC	 Error reporter. This property identifier is: http://apache.org/xml/properties/internal/error-reporter 
private	TokenNameprivate	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
fErrorReporter	TokenNameIdentifier	 f Error Reporter
;	TokenNameSEMICOLON	
// stores defaults for different security holes (maxOccurLimit in current context) if it has 	TokenNameCOMMENT_LINE	stores defaults for different security holes (maxOccurLimit in current context) if it has 
// been set on the configuration. 	TokenNameCOMMENT_LINE	been set on the configuration. 
private	TokenNameprivate	
SecurityManager	TokenNameIdentifier	 Security Manager
fSecurityManager	TokenNameIdentifier	 f Security Manager
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** default constructor */	TokenNameCOMMENT_JAVADOC	 default constructor 
public	TokenNamepublic	
CMNodeFactory	TokenNameIdentifier	 CM Node Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
componentManager	TokenNameIdentifier	 component Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
)	TokenNameRPAREN	
componentManager	TokenNameIdentifier	 component Manager
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
ERROR_REPORTER	TokenNameIdentifier	 ERROR  REPORTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
fSecurityManager	TokenNameIdentifier	 f Security Manager
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SecurityManager	TokenNameIdentifier	 Security Manager
)	TokenNameRPAREN	
componentManager	TokenNameIdentifier	 component Manager
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
SECURITY_MANAGER	TokenNameIdentifier	 SECURITY  MANAGER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSecurityManager	TokenNameIdentifier	 f Security Manager
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//reset() 	TokenNameCOMMENT_LINE	reset() 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we are setting the limit of number of nodes to 3 times the maxOccurs value. 	TokenNameCOMMENT_LINE	we are setting the limit of number of nodes to 3 times the maxOccurs value. 
if	TokenNameif	
(	TokenNameLPAREN	
fSecurityManager	TokenNameIdentifier	 f Security Manager
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxNodeLimit	TokenNameIdentifier	 max Node Limit
=	TokenNameEQUAL	
fSecurityManager	TokenNameIdentifier	 f Security Manager
.	TokenNameDOT	
getMaxOccurNodeLimit	TokenNameIdentifier	 get Max Occur Node Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
MULTIPLICITY	TokenNameIdentifier	 MULTIPLICITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
CMNode	TokenNameIdentifier	 CM Node
getCMLeafNode	TokenNameIdentifier	 get CM Leaf Node
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
leaf	TokenNameIdentifier	 leaf
,	TokenNameCOMMA	
int	TokenNameint	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeCountCheck	TokenNameIdentifier	 node Count Check
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
XSCMLeaf	TokenNameIdentifier	 XSCM Leaf
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
leaf	TokenNameIdentifier	 leaf
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CMNode	TokenNameIdentifier	 CM Node
getCMRepeatingLeafNode	TokenNameIdentifier	 get CM Repeating Leaf Node
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
leaf	TokenNameIdentifier	 leaf
,	TokenNameCOMMA	
int	TokenNameint	
minOccurs	TokenNameIdentifier	 min Occurs
,	TokenNameCOMMA	
int	TokenNameint	
maxOccurs	TokenNameIdentifier	 max Occurs
,	TokenNameCOMMA	
int	TokenNameint	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeCountCheck	TokenNameIdentifier	 node Count Check
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
XSCMRepeatingLeaf	TokenNameIdentifier	 XSCM Repeating Leaf
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
leaf	TokenNameIdentifier	 leaf
,	TokenNameCOMMA	
minOccurs	TokenNameIdentifier	 min Occurs
,	TokenNameCOMMA	
maxOccurs	TokenNameIdentifier	 max Occurs
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CMNode	TokenNameIdentifier	 CM Node
getCMUniOpNode	TokenNameIdentifier	 get CM Uni Op Node
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
CMNode	TokenNameIdentifier	 CM Node
childNode	TokenNameIdentifier	 child Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeCountCheck	TokenNameIdentifier	 node Count Check
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
XSCMUniOp	TokenNameIdentifier	 XSCM Uni Op
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
childNode	TokenNameIdentifier	 child Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CMNode	TokenNameIdentifier	 CM Node
getCMBinOpNode	TokenNameIdentifier	 get CM Bin Op Node
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
CMNode	TokenNameIdentifier	 CM Node
leftNode	TokenNameIdentifier	 left Node
,	TokenNameCOMMA	
CMNode	TokenNameIdentifier	 CM Node
rightNode	TokenNameIdentifier	 right Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeCountCheck	TokenNameIdentifier	 node Count Check
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
XSCMBinOp	TokenNameIdentifier	 XSCM Bin Op
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
leftNode	TokenNameIdentifier	 left Node
,	TokenNameCOMMA	
rightNode	TokenNameIdentifier	 right Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
nodeCountCheck	TokenNameIdentifier	 node Count Check
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fSecurityManager	TokenNameIdentifier	 f Security Manager
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
nodeCount	TokenNameIdentifier	 node Count
++	TokenNamePLUS_PLUS	
>	TokenNameGREATER	
maxNodeLimit	TokenNameIdentifier	 max Node Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"nodeCount = "	TokenNameStringLiteral	nodeCount = 
+	TokenNamePLUS	
nodeCount	TokenNameIdentifier	 node Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"nodeLimit = "	TokenNameStringLiteral	nodeLimit = 
+	TokenNamePLUS	
maxNodeLimit	TokenNameIdentifier	 max Node Limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XSMessageFormatter	TokenNameIdentifier	 XS Message Formatter
.	TokenNameDOT	
SCHEMA_DOMAIN	TokenNameIdentifier	 SCHEMA  DOMAIN
,	TokenNameCOMMA	
"maxOccurLimit"	TokenNameStringLiteral	maxOccurLimit
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
maxNodeLimit	TokenNameIdentifier	 max Node Limit
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// similarly to entity manager behaviour, take into accont 	TokenNameCOMMENT_LINE	similarly to entity manager behaviour, take into accont 
// behaviour if continue-after-fatal-error is set. 	TokenNameCOMMENT_LINE	behaviour if continue-after-fatal-error is set. 
nodeCount	TokenNameIdentifier	 node Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//nodeCountCheck() 	TokenNameCOMMENT_LINE	nodeCountCheck() 
//reset the node count 	TokenNameCOMMENT_LINE	reset the node count 
public	TokenNamepublic	
void	TokenNamevoid	
resetNodeCount	TokenNameIdentifier	 reset Node Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeCount	TokenNameIdentifier	 node Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the value of a property. This method is called by the component * manager any time after reset when a property changes value. * <p> * <strong>Note:</strong> Components should silently ignore properties * that do not affect the operation of the component. * * @param propertyId The property identifier. * @param value The value of the property. * * @throws SAXNotRecognizedException The component should not throw * this exception. * @throws SAXNotSupportedException The component should not throw * this exception. */	TokenNameCOMMENT_JAVADOC	 Sets the value of a property. This method is called by the component manager any time after reset when a property changes value. <p> <strong>Note:</strong> Components should silently ignore properties that do not affect the operation of the component. * @param propertyId The property identifier. @param value The value of the property. * @throws SAXNotRecognizedException The component should not throw this exception. @throws SAXNotSupportedException The component should not throw this exception. 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyId	TokenNameIdentifier	 property Id
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
{	TokenNameLBRACE	
// Xerces properties 	TokenNameCOMMENT_LINE	Xerces properties 
if	TokenNameif	
(	TokenNameLPAREN	
propertyId	TokenNameIdentifier	 property Id
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
suffixLength	TokenNameIdentifier	 suffix Length
=	TokenNameEQUAL	
propertyId	TokenNameIdentifier	 property Id
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
suffixLength	TokenNameIdentifier	 suffix Length
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SECURITY_MANAGER_PROPERTY	TokenNameIdentifier	 SECURITY  MANAGER  PROPERTY
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
propertyId	TokenNameIdentifier	 property Id
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SECURITY_MANAGER_PROPERTY	TokenNameIdentifier	 SECURITY  MANAGER  PROPERTY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSecurityManager	TokenNameIdentifier	 f Security Manager
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SecurityManager	TokenNameIdentifier	 Security Manager
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
maxNodeLimit	TokenNameIdentifier	 max Node Limit
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fSecurityManager	TokenNameIdentifier	 f Security Manager
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
fSecurityManager	TokenNameIdentifier	 f Security Manager
.	TokenNameDOT	
getMaxOccurNodeLimit	TokenNameIdentifier	 get Max Occur Node Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
MULTIPLICITY	TokenNameIdentifier	 MULTIPLICITY
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
suffixLength	TokenNameIdentifier	 suffix Length
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ERROR_REPORTER_PROPERTY	TokenNameIdentifier	 ERROR  REPORTER  PROPERTY
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
propertyId	TokenNameIdentifier	 property Id
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ERROR_REPORTER_PROPERTY	TokenNameIdentifier	 ERROR  REPORTER  PROPERTY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// setProperty(String,Object) 	TokenNameCOMMENT_LINE	setProperty(String,Object) 
}	TokenNameRBRACE	
//CMNodeFactory() 	TokenNameCOMMENT_LINE	CMNodeFactory() 
