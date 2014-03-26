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
filters	TokenNameIdentifier	 filters
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
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
Project	TokenNameIdentifier	 Project
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
PropertyHelper	TokenNameIdentifier	 Property Helper
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
property	TokenNameIdentifier	 property
.	TokenNameDOT	
GetProperty	TokenNameIdentifier	 Get Property
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
property	TokenNameIdentifier	 property
.	TokenNameDOT	
ParseProperties	TokenNameIdentifier	 Parse Properties
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
PropertySet	TokenNameIdentifier	 Property Set
;	TokenNameSEMICOLON	
/** * Expands Ant properties, if any, in the data. * <p> * Example:<br> * <pre>&lt;expandproperties/&gt;</pre> * Or: * <pre>&lt;filterreader * classname=&quot;org.apache.tools.ant.filters.ExpandProperties&quot;/&gt;</pre> * */	TokenNameCOMMENT_JAVADOC	 Expands Ant properties, if any, in the data. <p> Example:<br> <pre>&lt;expandproperties/&gt;</pre> Or: <pre>&lt;filterreader classname=&quot;org.apache.tools.ant.filters.ExpandProperties&quot;/&gt;</pre> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ExpandProperties	TokenNameIdentifier	 Expand Properties
extends	TokenNameextends	
BaseFilterReader	TokenNameIdentifier	 Base Filter Reader
implements	TokenNameimplements	
ChainableReader	TokenNameIdentifier	 Chainable Reader
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EOF	TokenNameIdentifier	 EOF
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PropertySet	TokenNameIdentifier	 Property Set
propertySet	TokenNameIdentifier	 property Set
;	TokenNameSEMICOLON	
/** * Constructor for "dummy" instances. * * @see BaseFilterReader#BaseFilterReader() */	TokenNameCOMMENT_JAVADOC	 Constructor for "dummy" instances. * @see BaseFilterReader#BaseFilterReader() 
public	TokenNamepublic	
ExpandProperties	TokenNameIdentifier	 Expand Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new filtered reader. * * @param in A Reader object providing the underlying stream. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a new filtered reader. * @param in A Reader object providing the underlying stream. Must not be <code>null</code>. 
public	TokenNamepublic	
ExpandProperties	TokenNameIdentifier	 Expand Properties
(	TokenNameLPAREN	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Restrict the expanded properties using a PropertySet. * @param propertySet replacement lookup */	TokenNameCOMMENT_JAVADOC	 Restrict the expanded properties using a PropertySet. @param propertySet replacement lookup 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
PropertySet	TokenNameIdentifier	 Property Set
propertySet	TokenNameIdentifier	 property Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
propertySet	TokenNameIdentifier	 property Set
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"expandproperties filter accepts only one propertyset"	TokenNameStringLiteral	expandproperties filter accepts only one propertyset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
propertySet	TokenNameIdentifier	 property Set
=	TokenNameEQUAL	
propertySet	TokenNameIdentifier	 property Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next character in the filtered stream. The original * stream is first read in fully, and the Ant properties are expanded. * The results of this expansion are then queued so they can be read * character-by-character. * * @return the next character in the resulting stream, or -1 * if the end of the resulting stream has been reached * * @exception IOException if the underlying stream throws an IOException * during reading */	TokenNameCOMMENT_JAVADOC	 Returns the next character in the filtered stream. The original stream is first read in fully, and the Ant properties are expanded. The results of this expansion are then queued so they can be read character-by-character. * @return the next character in the resulting stream, or -1 if the end of the resulting stream has been reached * @exception IOException if the underlying stream throws an IOException during reading 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
EOF	TokenNameIdentifier	 EOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GetProperty	TokenNameIdentifier	 Get Property
getProperty	TokenNameIdentifier	 get Property
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
propertySet	TokenNameIdentifier	 property Set
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProperty	TokenNameIdentifier	 get Property
=	TokenNameEQUAL	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
propertySet	TokenNameIdentifier	 property Set
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProperty	TokenNameIdentifier	 get Property
=	TokenNameEQUAL	
new	TokenNamenew	
GetProperty	TokenNameIdentifier	 Get Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
ParseProperties	TokenNameIdentifier	 Parse Properties
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
.	TokenNameDOT	
getExpanders	TokenNameIdentifier	 get Expanders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getProperty	TokenNameIdentifier	 get Property
)	TokenNameRPAREN	
.	TokenNameDOT	
parseProperties	TokenNameIdentifier	 parse Properties
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
EOF	TokenNameIdentifier	 EOF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
EOF	TokenNameIdentifier	 EOF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new ExpandProperties filter using the passed in * Reader for instantiation. * * @param rdr A Reader object providing the underlying stream. * Must not be <code>null</code>. * * @return a new filter based on this configuration, but filtering * the specified reader */	TokenNameCOMMENT_JAVADOC	 Creates a new ExpandProperties filter using the passed in Reader for instantiation. * @param rdr A Reader object providing the underlying stream. Must not be <code>null</code>. * @return a new filter based on this configuration, but filtering the specified reader 
public	TokenNamepublic	
Reader	TokenNameIdentifier	 Reader
chain	TokenNameIdentifier	 chain
(	TokenNameLPAREN	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
rdr	TokenNameIdentifier	 rdr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExpandProperties	TokenNameIdentifier	 Expand Properties
newFilter	TokenNameIdentifier	 new Filter
=	TokenNameEQUAL	
new	TokenNamenew	
ExpandProperties	TokenNameIdentifier	 Expand Properties
(	TokenNameLPAREN	
rdr	TokenNameIdentifier	 rdr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
propertySet	TokenNameIdentifier	 property Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newFilter	TokenNameIdentifier	 new Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
