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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
Task	TokenNameIdentifier	 Task
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
Commandline	TokenNameIdentifier	 Commandline
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
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
;	TokenNameSEMICOLON	
/** * Generates a key in a keystore. * * @since Ant 1.2 * * @ant.task name="genkey" category="java" */	TokenNameCOMMENT_JAVADOC	 Generates a key in a keystore. * @since Ant 1.2 * @ant.task name="genkey" category="java" 
public	TokenNamepublic	
class	TokenNameclass	
GenerateKey	TokenNameIdentifier	 Generate Key
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
/** * A DistinguishedName parameter. * This is a nested element in a dname nested element. */	TokenNameCOMMENT_JAVADOC	 A DistinguishedName parameter. This is a nested element in a dname nested element. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
DnameParam	TokenNameIdentifier	 Dname Param
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * Set the name attribute. * @param name a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 Set the name attribute. @param name a <code>String</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the name attribute. * @return the name. */	TokenNameCOMMENT_JAVADOC	 Get the name attribute. @return the name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the value attribute. * @param value a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 Set the value attribute. @param value a <code>String</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the value attribute. * @return the value. */	TokenNameCOMMENT_JAVADOC	 Get the value attribute. @return the value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A class corresponding to the dname nested element. */	TokenNameCOMMENT_JAVADOC	 A class corresponding to the dname nested element. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
DistinguishedName	TokenNameIdentifier	 Distinguished Name
{	TokenNameLBRACE	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create a param nested element. * @return a DnameParam object to be configured. */	TokenNameCOMMENT_JAVADOC	 Create a param nested element. @return a DnameParam object to be configured. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
createParam	TokenNameIdentifier	 create Param
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DnameParam	TokenNameIdentifier	 Dname Param
param	TokenNameIdentifier	 param
=	TokenNameEQUAL	
new	TokenNamenew	
DnameParam	TokenNameIdentifier	 Dname Param
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
param	TokenNameIdentifier	 param
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the nested parameters. * @return an enumeration of the nested parameters. */	TokenNameCOMMENT_JAVADOC	 Get the nested parameters. @return an enumeration of the nested parameters. 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getParams	TokenNameIdentifier	 get Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Generate a string rep of this distinguished name. * The format is each of the parameters (name = value) * separated by ','. * This is used on the command line. * @return a string rep of this name */	TokenNameCOMMENT_JAVADOC	 Generate a string rep of this distinguished name. The format is each of the parameters (name = value) separated by ','. This is used on the command line. @return a string rep of this name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
firstPass	TokenNameIdentifier	 first Pass
=	TokenNameEQUAL	
true	TokenNametrue	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
firstPass	TokenNameIdentifier	 first Pass
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" ,"	TokenNameStringLiteral	 ,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
firstPass	TokenNameIdentifier	 first Pass
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DnameParam	TokenNameIdentifier	 Dname Param
param	TokenNameIdentifier	 param
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DnameParam	TokenNameIdentifier	 Dname Param
)	TokenNameRPAREN	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
/** * Encode a name or value. * The encoded result is the same as the input string * except that each ',' is replaced by a '\,'. * @param string the value to be encoded * @return the encoded value. */	TokenNameCOMMENT_JAVADOC	 Encode a name or value. The encoded result is the same as the input string except that each ',' is replaced by a '\,'. @param string the value to be encoded @return the encoded value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
string	TokenNameIdentifier	 string
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"\,"	TokenNameStringLiteral	\,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** * The alias of signer. */	TokenNameCOMMENT_JAVADOC	 The alias of signer. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
alias	TokenNameIdentifier	 alias
;	TokenNameSEMICOLON	
/** * The name of keystore file. */	TokenNameCOMMENT_JAVADOC	 The name of keystore file. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
keystore	TokenNameIdentifier	 keystore
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
storepass	TokenNameIdentifier	 storepass
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
storetype	TokenNameIdentifier	 storetype
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
keypass	TokenNameIdentifier	 keypass
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
sigalg	TokenNameIdentifier	 sigalg
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
keyalg	TokenNameIdentifier	 keyalg
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
dname	TokenNameIdentifier	 dname
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
DistinguishedName	TokenNameIdentifier	 Distinguished Name
expandedDname	TokenNameIdentifier	 expanded Dname
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
keysize	TokenNameIdentifier	 keysize
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
validity	TokenNameIdentifier	 validity
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Distinguished name list. * * @return Distinguished name container. * @throws BuildException If specified more than once or dname * attribute is used. */	TokenNameCOMMENT_JAVADOC	 Distinguished name list. * @return Distinguished name container. @throws BuildException If specified more than once or dname attribute is used. 
public	TokenNamepublic	
DistinguishedName	TokenNameIdentifier	 Distinguished Name
createDname	TokenNameIdentifier	 create Dname
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
expandedDname	TokenNameIdentifier	 expanded Dname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"DName sub-element can only be "	TokenNameStringLiteral	DName sub-element can only be 
+	TokenNamePLUS	
"specified once."	TokenNameStringLiteral	specified once.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
dname	TokenNameIdentifier	 dname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"It is not possible to specify dname "	TokenNameStringLiteral	It is not possible to specify dname 
+	TokenNamePLUS	
" both as attribute and element."	TokenNameStringLiteral	 both as attribute and element.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
expandedDname	TokenNameIdentifier	 expanded Dname
=	TokenNameEQUAL	
new	TokenNamenew	
DistinguishedName	TokenNameIdentifier	 Distinguished Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
expandedDname	TokenNameIdentifier	 expanded Dname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The distinguished name for entity. * * @param dname distinguished name */	TokenNameCOMMENT_JAVADOC	 The distinguished name for entity. * @param dname distinguished name 
public	TokenNamepublic	
void	TokenNamevoid	
setDname	TokenNameIdentifier	 set Dname
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
dname	TokenNameIdentifier	 dname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
expandedDname	TokenNameIdentifier	 expanded Dname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"It is not possible to specify dname "	TokenNameStringLiteral	It is not possible to specify dname 
+	TokenNamePLUS	
" both as attribute and element."	TokenNameStringLiteral	 both as attribute and element.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dname	TokenNameIdentifier	 dname
=	TokenNameEQUAL	
dname	TokenNameIdentifier	 dname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The alias to add under. * * @param alias alias to add under */	TokenNameCOMMENT_JAVADOC	 The alias to add under. * @param alias alias to add under 
public	TokenNamepublic	
void	TokenNamevoid	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
alias	TokenNameIdentifier	 alias
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
alias	TokenNameIdentifier	 alias
=	TokenNameEQUAL	
alias	TokenNameIdentifier	 alias
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Keystore location. * * @param keystore location */	TokenNameCOMMENT_JAVADOC	 Keystore location. * @param keystore location 
public	TokenNamepublic	
void	TokenNamevoid	
setKeystore	TokenNameIdentifier	 set Keystore
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
keystore	TokenNameIdentifier	 keystore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
keystore	TokenNameIdentifier	 keystore
=	TokenNameEQUAL	
keystore	TokenNameIdentifier	 keystore
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Password for keystore integrity. * Must be at least 6 characters long. * @param storepass password */	TokenNameCOMMENT_JAVADOC	 Password for keystore integrity. Must be at least 6 characters long. @param storepass password 
public	TokenNamepublic	
void	TokenNamevoid	
setStorepass	TokenNameIdentifier	 set Storepass
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
storepass	TokenNameIdentifier	 storepass
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
storepass	TokenNameIdentifier	 storepass
=	TokenNameEQUAL	
storepass	TokenNameIdentifier	 storepass
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Keystore type. * * @param storetype type */	TokenNameCOMMENT_JAVADOC	 Keystore type. * @param storetype type 
public	TokenNamepublic	
void	TokenNamevoid	
setStoretype	TokenNameIdentifier	 set Storetype
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
storetype	TokenNameIdentifier	 storetype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
storetype	TokenNameIdentifier	 storetype
=	TokenNameEQUAL	
storetype	TokenNameIdentifier	 storetype
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Password for private key (if different). * * @param keypass password */	TokenNameCOMMENT_JAVADOC	 Password for private key (if different). * @param keypass password 
public	TokenNamepublic	
void	TokenNamevoid	
setKeypass	TokenNameIdentifier	 set Keypass
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
keypass	TokenNameIdentifier	 keypass
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
keypass	TokenNameIdentifier	 keypass
=	TokenNameEQUAL	
keypass	TokenNameIdentifier	 keypass
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The algorithm to use in signing. * * @param sigalg algorithm */	TokenNameCOMMENT_JAVADOC	 The algorithm to use in signing. * @param sigalg algorithm 
public	TokenNamepublic	
void	TokenNamevoid	
setSigalg	TokenNameIdentifier	 set Sigalg
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sigalg	TokenNameIdentifier	 sigalg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sigalg	TokenNameIdentifier	 sigalg
=	TokenNameEQUAL	
sigalg	TokenNameIdentifier	 sigalg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The method to use when generating name-value pair. * @param keyalg algorithm */	TokenNameCOMMENT_JAVADOC	 The method to use when generating name-value pair. @param keyalg algorithm 
public	TokenNamepublic	
void	TokenNamevoid	
setKeyalg	TokenNameIdentifier	 set Keyalg
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
keyalg	TokenNameIdentifier	 keyalg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
keyalg	TokenNameIdentifier	 keyalg
=	TokenNameEQUAL	
keyalg	TokenNameIdentifier	 keyalg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicates the size of key generated. * * @param keysize size of key * @throws BuildException If not an Integer * @todo Could convert this to a plain Integer setter. */	TokenNameCOMMENT_JAVADOC	 Indicates the size of key generated. * @param keysize size of key @throws BuildException If not an Integer @todo Could convert this to a plain Integer setter. 
public	TokenNamepublic	
void	TokenNamevoid	
setKeysize	TokenNameIdentifier	 set Keysize
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
keysize	TokenNameIdentifier	 keysize
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
keysize	TokenNameIdentifier	 keysize
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
keysize	TokenNameIdentifier	 keysize
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
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"KeySize attribute should be a integer"	TokenNameStringLiteral	KeySize attribute should be a integer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Indicates how many days certificate is valid. * * @param validity days valid * @throws BuildException If not an Integer */	TokenNameCOMMENT_JAVADOC	 Indicates how many days certificate is valid. * @param validity days valid @throws BuildException If not an Integer 
public	TokenNamepublic	
void	TokenNamevoid	
setValidity	TokenNameIdentifier	 set Validity
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
validity	TokenNameIdentifier	 validity
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
validity	TokenNameIdentifier	 validity
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
validity	TokenNameIdentifier	 validity
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
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Validity attribute should be a integer"	TokenNameStringLiteral	Validity attribute should be a integer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * If true, verbose output when signing. * @param verbose verbose or not */	TokenNameCOMMENT_JAVADOC	 If true, verbose output when signing. @param verbose verbose or not 
public	TokenNamepublic	
void	TokenNamevoid	
setVerbose	TokenNameIdentifier	 set Verbose
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
verbose	TokenNameIdentifier	 verbose
=	TokenNameEQUAL	
verbose	TokenNameIdentifier	 verbose
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the task. * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Execute the task. @throws BuildException on error 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
alias	TokenNameIdentifier	 alias
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"alias attribute must be set"	TokenNameStringLiteral	alias attribute must be set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
storepass	TokenNameIdentifier	 storepass
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"storepass attribute must be set"	TokenNameStringLiteral	storepass attribute must be set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
dname	TokenNameIdentifier	 dname
&&	TokenNameAND_AND	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
expandedDname	TokenNameIdentifier	 expanded Dname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"dname must be set"	TokenNameStringLiteral	dname must be set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-genkey "	TokenNameStringLiteral	-genkey 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-v "	TokenNameStringLiteral	-v 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-alias ""	TokenNameStringLiteral	-alias "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
alias	TokenNameIdentifier	 alias
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" "	TokenNameStringLiteral	" 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
dname	TokenNameIdentifier	 dname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-dname ""	TokenNameStringLiteral	-dname "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
dname	TokenNameIdentifier	 dname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" "	TokenNameStringLiteral	" 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
expandedDname	TokenNameIdentifier	 expanded Dname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-dname ""	TokenNameStringLiteral	-dname "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
expandedDname	TokenNameIdentifier	 expanded Dname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" "	TokenNameStringLiteral	" 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
keystore	TokenNameIdentifier	 keystore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-keystore ""	TokenNameStringLiteral	-keystore "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
keystore	TokenNameIdentifier	 keystore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" "	TokenNameStringLiteral	" 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
storepass	TokenNameIdentifier	 storepass
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-storepass ""	TokenNameStringLiteral	-storepass "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
storepass	TokenNameIdentifier	 storepass
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" "	TokenNameStringLiteral	" 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
storetype	TokenNameIdentifier	 storetype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-storetype ""	TokenNameStringLiteral	-storetype "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
storetype	TokenNameIdentifier	 storetype
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" "	TokenNameStringLiteral	" 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-keypass ""	TokenNameStringLiteral	-keypass "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
keypass	TokenNameIdentifier	 keypass
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
keypass	TokenNameIdentifier	 keypass
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
storepass	TokenNameIdentifier	 storepass
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" "	TokenNameStringLiteral	" 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
sigalg	TokenNameIdentifier	 sigalg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-sigalg ""	TokenNameStringLiteral	-sigalg "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sigalg	TokenNameIdentifier	 sigalg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" "	TokenNameStringLiteral	" 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
keyalg	TokenNameIdentifier	 keyalg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-keyalg ""	TokenNameStringLiteral	-keyalg "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
keyalg	TokenNameIdentifier	 keyalg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" "	TokenNameStringLiteral	" 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<	TokenNameLESS	
keysize	TokenNameIdentifier	 keysize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-keysize ""	TokenNameStringLiteral	-keysize "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
keysize	TokenNameIdentifier	 keysize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" "	TokenNameStringLiteral	" 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<	TokenNameLESS	
validity	TokenNameIdentifier	 validity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-validity ""	TokenNameStringLiteral	-validity "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
validity	TokenNameIdentifier	 validity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" "	TokenNameStringLiteral	" 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Generating Key for "	TokenNameStringLiteral	Generating Key for 
+	TokenNamePLUS	
alias	TokenNameIdentifier	 alias
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ExecTask	TokenNameIdentifier	 Exec Task
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
new	TokenNamenew	
ExecTask	TokenNameIdentifier	 Exec Task
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
.	TokenNameDOT	
getJdkExecutable	TokenNameIdentifier	 get Jdk Executable
(	TokenNameLPAREN	
"keytool"	TokenNameStringLiteral	keytool
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Commandline	TokenNameIdentifier	 Commandline
.	TokenNameDOT	
Argument	TokenNameIdentifier	 Argument
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
setLine	TokenNameIdentifier	 set Line
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
setFailonerror	TokenNameIdentifier	 set Failonerror
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
setTaskName	TokenNameIdentifier	 set Task Name
(	TokenNameLPAREN	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
