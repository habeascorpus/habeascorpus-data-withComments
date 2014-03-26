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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
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
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
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
VectorSet	TokenNameIdentifier	 Vector Set
;	TokenNameSEMICOLON	
/** * A set of filters to be applied to something. * * A filter set may have begintoken and endtokens defined. * */	TokenNameCOMMENT_JAVADOC	 A set of filters to be applied to something. * A filter set may have begintoken and endtokens defined. 
public	TokenNamepublic	
class	TokenNameclass	
FilterSet	TokenNameIdentifier	 Filter Set
extends	TokenNameextends	
DataType	TokenNameIdentifier	 Data Type
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
/** * Individual filter component of filterset. * */	TokenNameCOMMENT_JAVADOC	 Individual filter component of filterset. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** Token which will be replaced in the filter operation. */	TokenNameCOMMENT_JAVADOC	 Token which will be replaced in the filter operation. 
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
/** The value which will replace the token in the filtering operation. */	TokenNameCOMMENT_JAVADOC	 The value which will replace the token in the filtering operation. 
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Constructor for the Filter object. * * @param token The token which will be replaced when filtering. * @param value The value which will replace the token when filtering. */	TokenNameCOMMENT_JAVADOC	 Constructor for the Filter object. * @param token The token which will be replaced when filtering. @param value The value which will replace the token when filtering. 
public	TokenNamepublic	
Filter	TokenNameIdentifier	 Filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setToken	TokenNameIdentifier	 set Token
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * No-argument conmstructor. */	TokenNameCOMMENT_JAVADOC	 No-argument conmstructor. 
public	TokenNamepublic	
Filter	TokenNameIdentifier	 Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Sets the Token attribute of the Filter object. * * @param token The new Token value. */	TokenNameCOMMENT_JAVADOC	 Sets the Token attribute of the Filter object. * @param token The new Token value. 
public	TokenNamepublic	
void	TokenNamevoid	
setToken	TokenNameIdentifier	 set Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the Value attribute of the Filter object. * * @param value The new Value value. */	TokenNameCOMMENT_JAVADOC	 Sets the Value attribute of the Filter object. * @param value The new Value value. 
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
/** * Gets the Token attribute of the Filter object. * * @return The Token value. */	TokenNameCOMMENT_JAVADOC	 Gets the Token attribute of the Filter object. * @return The Token value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the Value attribute of the Filter object. * * @return The Value value. */	TokenNameCOMMENT_JAVADOC	 Gets the Value attribute of the Filter object. * @return The Value value. 
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
/** * The filtersfile nested element. * */	TokenNameCOMMENT_JAVADOC	 The filtersfile nested element. 
public	TokenNamepublic	
class	TokenNameclass	
FiltersFile	TokenNameIdentifier	 Filters File
{	TokenNameLBRACE	
/** * Constructor for the FiltersFile object. */	TokenNameCOMMENT_JAVADOC	 Constructor for the FiltersFile object. 
public	TokenNamepublic	
FiltersFile	TokenNameIdentifier	 Filters File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Sets the file from which filters will be read. * * @param file the file from which filters will be read. */	TokenNameCOMMENT_JAVADOC	 Sets the file from which filters will be read. * @param file the file from which filters will be read. 
public	TokenNamepublic	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filtersFiles	TokenNameIdentifier	 filters Files
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * EnumeratedAttribute to set behavior WRT missing filtersfiles: * "fail" (default), "warn", "ignore". * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 EnumeratedAttribute to set behavior WRT missing filtersfiles: "fail" (default), "warn", "ignore". @since Ant 1.7 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
OnMissing	TokenNameIdentifier	 On Missing
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
VALUES	TokenNameIdentifier	 VALUES
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"fail"	TokenNameStringLiteral	fail
,	TokenNameCOMMA	
"warn"	TokenNameStringLiteral	warn
,	TokenNameCOMMA	
"ignore"	TokenNameStringLiteral	ignore
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Fail value */	TokenNameCOMMENT_JAVADOC	 Fail value 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
OnMissing	TokenNameIdentifier	 On Missing
FAIL	TokenNameIdentifier	 FAIL
=	TokenNameEQUAL	
new	TokenNamenew	
OnMissing	TokenNameIdentifier	 On Missing
(	TokenNameLPAREN	
"fail"	TokenNameStringLiteral	fail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Warn value */	TokenNameCOMMENT_JAVADOC	 Warn value 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
OnMissing	TokenNameIdentifier	 On Missing
WARN	TokenNameIdentifier	 WARN
=	TokenNameEQUAL	
new	TokenNamenew	
OnMissing	TokenNameIdentifier	 On Missing
(	TokenNameLPAREN	
"warn"	TokenNameStringLiteral	warn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Ignore value */	TokenNameCOMMENT_JAVADOC	 Ignore value 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
OnMissing	TokenNameIdentifier	 On Missing
IGNORE	TokenNameIdentifier	 IGNORE
=	TokenNameEQUAL	
new	TokenNamenew	
OnMissing	TokenNameIdentifier	 On Missing
(	TokenNameLPAREN	
"ignore"	TokenNameStringLiteral	ignore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FAIL_INDEX	TokenNameIdentifier	 FAIL  INDEX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WARN_INDEX	TokenNameIdentifier	 WARN  INDEX
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
IGNORE_INDEX	TokenNameIdentifier	 IGNORE  INDEX
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
OnMissing	TokenNameIdentifier	 On Missing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Convenience constructor. * @param value the value to set. */	TokenNameCOMMENT_JAVADOC	 Convenience constructor. @param value the value to set. 
public	TokenNamepublic	
OnMissing	TokenNameIdentifier	 On Missing
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//inherit doc 	TokenNameCOMMENT_LINE	inherit doc 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
VALUES	TokenNameIdentifier	 VALUES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** The default token start string */	TokenNameCOMMENT_JAVADOC	 The default token start string 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_TOKEN_START	TokenNameIdentifier	 DEFAULT  TOKEN  START
=	TokenNameEQUAL	
"@"	TokenNameStringLiteral	@
;	TokenNameSEMICOLON	
/** The default token end string */	TokenNameCOMMENT_JAVADOC	 The default token end string 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_TOKEN_END	TokenNameIdentifier	 DEFAULT  TOKEN  END
=	TokenNameEQUAL	
"@"	TokenNameStringLiteral	@
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
startOfToken	TokenNameIdentifier	 start Of Token
=	TokenNameEQUAL	
DEFAULT_TOKEN_START	TokenNameIdentifier	 DEFAULT  TOKEN  START
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
endOfToken	TokenNameIdentifier	 end Of Token
=	TokenNameEQUAL	
DEFAULT_TOKEN_END	TokenNameIdentifier	 DEFAULT  TOKEN  END
;	TokenNameSEMICOLON	
/** Contains a list of parsed tokens */	TokenNameCOMMENT_JAVADOC	 Contains a list of parsed tokens 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
passedTokens	TokenNameIdentifier	 passed Tokens
;	TokenNameSEMICOLON	
/** if a duplicate token is found, this is set to true */	TokenNameCOMMENT_JAVADOC	 if a duplicate token is found, this is set to true 
private	TokenNameprivate	
boolean	TokenNameboolean	
duplicateToken	TokenNameIdentifier	 duplicate Token
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
recurse	TokenNameIdentifier	 recurse
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
filterHash	TokenNameIdentifier	 filter Hash
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
filtersFiles	TokenNameIdentifier	 filters Files
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OnMissing	TokenNameIdentifier	 On Missing
onMissingFiltersFile	TokenNameIdentifier	 on Missing Filters File
=	TokenNameEQUAL	
OnMissing	TokenNameIdentifier	 On Missing
.	TokenNameDOT	
FAIL	TokenNameIdentifier	 FAIL
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
readingFiles	TokenNameIdentifier	 reading Files
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
recurseDepth	TokenNameIdentifier	 recurse Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * List of ordered filters and filter files. */	TokenNameCOMMENT_JAVADOC	 List of ordered filters and filter files. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
filters	TokenNameIdentifier	 filters
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
FilterSet	TokenNameIdentifier	 Filter Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Create a Filterset from another filterset. * * @param filterset the filterset upon which this filterset will be based. */	TokenNameCOMMENT_JAVADOC	 Create a Filterset from another filterset. * @param filterset the filterset upon which this filterset will be based. 
protected	TokenNameprotected	
FilterSet	TokenNameIdentifier	 Filter Set
(	TokenNameLPAREN	
FilterSet	TokenNameIdentifier	 Filter Set
filterset	TokenNameIdentifier	 filterset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
filters	TokenNameIdentifier	 filters
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
filterset	TokenNameIdentifier	 filterset
.	TokenNameDOT	
getFilters	TokenNameIdentifier	 get Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the filters in the filter set. * * @return a Vector of Filter instances. */	TokenNameCOMMENT_JAVADOC	 Get the filters in the filter set. * @return a Vector of Filter instances. 
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
Vector	TokenNameIdentifier	 Vector
getFilters	TokenNameIdentifier	 get Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFilters	TokenNameIdentifier	 get Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//silly hack to avoid stack overflow... 	TokenNameCOMMENT_LINE	silly hack to avoid stack overflow... 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
readingFiles	TokenNameIdentifier	 reading Files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readingFiles	TokenNameIdentifier	 reading Files
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
filtersFiles	TokenNameIdentifier	 filters Files
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readFiltersFromFile	TokenNameIdentifier	 read Filters From File
(	TokenNameLPAREN	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
)	TokenNameRPAREN	
filtersFiles	TokenNameIdentifier	 filters Files
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
filtersFiles	TokenNameIdentifier	 filters Files
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readingFiles	TokenNameIdentifier	 reading Files
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
filters	TokenNameIdentifier	 filters
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the referenced filter set. * * @return the filterset from the reference. */	TokenNameCOMMENT_JAVADOC	 Get the referenced filter set. * @return the filterset from the reference. 
protected	TokenNameprotected	
FilterSet	TokenNameIdentifier	 Filter Set
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
FilterSet	TokenNameIdentifier	 Filter Set
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
FilterSet	TokenNameIdentifier	 Filter Set
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"filterset"	TokenNameStringLiteral	filterset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the filter hash of the FilterSet. * * @return The hash of the tokens and values for quick lookup. */	TokenNameCOMMENT_JAVADOC	 Gets the filter hash of the FilterSet. * @return The hash of the tokens and values for quick lookup. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Hashtable	TokenNameIdentifier	 Hashtable
getFilterHash	TokenNameIdentifier	 get Filter Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFilterHash	TokenNameIdentifier	 get Filter Hash
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
filterHash	TokenNameIdentifier	 filter Hash
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filterHash	TokenNameIdentifier	 filter Hash
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
getFilters	TokenNameIdentifier	 get Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
getFilters	TokenNameIdentifier	 get Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterHash	TokenNameIdentifier	 filter Hash
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
filterHash	TokenNameIdentifier	 filter Hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the file containing the filters for this filterset. * * @param filtersFile sets the filter file from which to read filters * for this filter set. * @throws BuildException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Set the file containing the filters for this filterset. * @param filtersFile sets the filter file from which to read filters for this filter set. @throws BuildException if there is an error. 
public	TokenNamepublic	
void	TokenNamevoid	
setFiltersfile	TokenNameIdentifier	 set Filtersfile
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
filtersFile	TokenNameIdentifier	 filters File
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
filtersFiles	TokenNameIdentifier	 filters Files
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
filtersFile	TokenNameIdentifier	 filters File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the string used to id the beginning of a token. * * @param startOfToken The new Begintoken value. */	TokenNameCOMMENT_JAVADOC	 Set the string used to id the beginning of a token. * @param startOfToken The new Begintoken value. 
public	TokenNamepublic	
void	TokenNamevoid	
setBeginToken	TokenNameIdentifier	 set Begin Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
startOfToken	TokenNameIdentifier	 start Of Token
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
startOfToken	TokenNameIdentifier	 start Of Token
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
startOfToken	TokenNameIdentifier	 start Of Token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"beginToken must not be empty"	TokenNameStringLiteral	beginToken must not be empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
startOfToken	TokenNameIdentifier	 start Of Token
=	TokenNameEQUAL	
startOfToken	TokenNameIdentifier	 start Of Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the begin token for this filterset. * * @return the filter set's begin token for filtering. */	TokenNameCOMMENT_JAVADOC	 Get the begin token for this filterset. * @return the filter set's begin token for filtering. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBeginToken	TokenNameIdentifier	 get Begin Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBeginToken	TokenNameIdentifier	 get Begin Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
startOfToken	TokenNameIdentifier	 start Of Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the string used to id the end of a token. * * @param endOfToken The new Endtoken value. */	TokenNameCOMMENT_JAVADOC	 Set the string used to id the end of a token. * @param endOfToken The new Endtoken value. 
public	TokenNamepublic	
void	TokenNamevoid	
setEndToken	TokenNameIdentifier	 set End Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
endOfToken	TokenNameIdentifier	 end Of Token
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
endOfToken	TokenNameIdentifier	 end Of Token
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
endOfToken	TokenNameIdentifier	 end Of Token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"endToken must not be empty"	TokenNameStringLiteral	endToken must not be empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
endOfToken	TokenNameIdentifier	 end Of Token
=	TokenNameEQUAL	
endOfToken	TokenNameIdentifier	 end Of Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the end token for this filterset. * * @return the filter set's end token for replacement delimiting. */	TokenNameCOMMENT_JAVADOC	 Get the end token for this filterset. * @return the filter set's end token for replacement delimiting. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEndToken	TokenNameIdentifier	 get End Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getEndToken	TokenNameIdentifier	 get End Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
endOfToken	TokenNameIdentifier	 end Of Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether recursive token expansion is enabled. * @param recurse <code>boolean</code> whether to recurse. */	TokenNameCOMMENT_JAVADOC	 Set whether recursive token expansion is enabled. @param recurse <code>boolean</code> whether to recurse. 
public	TokenNamepublic	
void	TokenNamevoid	
setRecurse	TokenNameIdentifier	 set Recurse
(	TokenNameLPAREN	
boolean	TokenNameboolean	
recurse	TokenNameIdentifier	 recurse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
recurse	TokenNameIdentifier	 recurse
=	TokenNameEQUAL	
recurse	TokenNameIdentifier	 recurse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get whether recursive token expansion is enabled. * @return <code>boolean</code> whether enabled. */	TokenNameCOMMENT_JAVADOC	 Get whether recursive token expansion is enabled. @return <code>boolean</code> whether enabled. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isRecurse	TokenNameIdentifier	 is Recurse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
recurse	TokenNameIdentifier	 recurse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read the filters from the given file. * * @param filtersFile the file from which filters are read. * @exception BuildException when the file cannot be read. */	TokenNameCOMMENT_JAVADOC	 Read the filters from the given file. * @param filtersFile the file from which filters are read. @exception BuildException when the file cannot be read. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
readFiltersFromFile	TokenNameIdentifier	 read Filters From File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
filtersFile	TokenNameIdentifier	 filters File
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
filtersFile	TokenNameIdentifier	 filters File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handleMissingFile	TokenNameIdentifier	 handle Missing File
(	TokenNameLPAREN	
"Could not read filters from file "	TokenNameStringLiteral	Could not read filters from file 
+	TokenNamePLUS	
filtersFile	TokenNameIdentifier	 filters File
+	TokenNamePLUS	
" as it doesn't exist."	TokenNameStringLiteral	 as it doesn't exist.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filtersFile	TokenNameIdentifier	 filters File
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Reading filters from "	TokenNameStringLiteral	Reading filters from 
+	TokenNamePLUS	
filtersFile	TokenNameIdentifier	 filters File
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
filtersFile	TokenNameIdentifier	 filters File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
propertyNames	TokenNameIdentifier	 property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
filts	TokenNameIdentifier	 filts
=	TokenNameEQUAL	
getFilters	TokenNameIdentifier	 get Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
strPropName	TokenNameIdentifier	 str Prop Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
strValue	TokenNameIdentifier	 str Value
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
strPropName	TokenNameIdentifier	 str Prop Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filts	TokenNameIdentifier	 filts
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
Filter	TokenNameIdentifier	 Filter
(	TokenNameLPAREN	
strPropName	TokenNameIdentifier	 str Prop Name
,	TokenNameCOMMA	
strValue	TokenNameIdentifier	 str Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Could not read filters from file: "	TokenNameStringLiteral	Could not read filters from file: 
+	TokenNamePLUS	
filtersFile	TokenNameIdentifier	 filters File
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
handleMissingFile	TokenNameIdentifier	 handle Missing File
(	TokenNameLPAREN	
"Must specify a file rather than a directory in "	TokenNameStringLiteral	Must specify a file rather than a directory in 
+	TokenNamePLUS	
"the filtersfile attribute:"	TokenNameStringLiteral	the filtersfile attribute:
+	TokenNamePLUS	
filtersFile	TokenNameIdentifier	 filters File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
filterHash	TokenNameIdentifier	 filter Hash
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Does replacement on the given string with token matching. * This uses the defined begintoken and endtoken values which default * to @ for both. * This resets the passedTokens and calls iReplaceTokens to * do the actual replacements. * * @param line The line in which to process embedded tokens. * @return The input string after token replacement. */	TokenNameCOMMENT_JAVADOC	 Does replacement on the given string with token matching. This uses the defined begintoken and endtoken values which default to @ for both. This resets the passedTokens and calls iReplaceTokens to do the actual replacements. * @param line The line in which to process embedded tokens. @return The input string after token replacement. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
replaceTokens	TokenNameIdentifier	 replace Tokens
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iReplaceTokens	TokenNameIdentifier	 i Replace Tokens
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a new filter. * * @param filter the filter to be added. */	TokenNameCOMMENT_JAVADOC	 Add a new filter. * @param filter the filter to be added. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterHash	TokenNameIdentifier	 filter Hash
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new FiltersFile. * * @return The filtersfile that was created. */	TokenNameCOMMENT_JAVADOC	 Create a new FiltersFile. * @return The filtersfile that was created. 
public	TokenNamepublic	
FiltersFile	TokenNameIdentifier	 Filters File
createFiltersfile	TokenNameIdentifier	 create Filtersfile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FiltersFile	TokenNameIdentifier	 Filters File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a new filter made from the given token and value. * * @param token The token for the new filter. * @param value The value for the new filter. */	TokenNameCOMMENT_JAVADOC	 Add a new filter made from the given token and value. * @param token The token for the new filter. @param value The value for the new filter. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
new	TokenNamenew	
Filter	TokenNameIdentifier	 Filter
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a Filterset to this filter set. * * @param filterSet the filterset to be added to this filterset */	TokenNameCOMMENT_JAVADOC	 Add a Filterset to this filter set. * @param filterSet the filterset to be added to this filterset 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
addConfiguredFilterSet	TokenNameIdentifier	 add Configured Filter Set
(	TokenNameLPAREN	
FilterSet	TokenNameIdentifier	 Filter Set
filterSet	TokenNameIdentifier	 filter Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
filterSet	TokenNameIdentifier	 filter Set
.	TokenNameDOT	
getFilters	TokenNameIdentifier	 get Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test to see if this filter set has filters. * * @return Return true if there are filters in this set. */	TokenNameCOMMENT_JAVADOC	 Test to see if this filter set has filters. * @return Return true if there are filters in this set. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
hasFilters	TokenNameIdentifier	 has Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFilters	TokenNameIdentifier	 get Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clone the filterset. * * @return a deep clone of this filterset. * * @throws BuildException if the clone cannot be performed. */	TokenNameCOMMENT_JAVADOC	 Clone the filterset. * @return a deep clone of this filterset. * @throws BuildException if the clone cannot be performed. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
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
FilterSet	TokenNameIdentifier	 Filter Set
)	TokenNameRPAREN	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
FilterSet	TokenNameIdentifier	 Filter Set
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FilterSet	TokenNameIdentifier	 Filter Set
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
filters	TokenNameIdentifier	 filters
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
getFilters	TokenNameIdentifier	 get Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fs	TokenNameIdentifier	 fs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the behavior WRT missing filtersfiles. * @param onMissingFiltersFile the OnMissing describing the behavior. */	TokenNameCOMMENT_JAVADOC	 Set the behavior WRT missing filtersfiles. @param onMissingFiltersFile the OnMissing describing the behavior. 
public	TokenNamepublic	
void	TokenNamevoid	
setOnMissingFiltersFile	TokenNameIdentifier	 set On Missing Filters File
(	TokenNameLPAREN	
OnMissing	TokenNameIdentifier	 On Missing
onMissingFiltersFile	TokenNameIdentifier	 on Missing Filters File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
onMissingFiltersFile	TokenNameIdentifier	 on Missing Filters File
=	TokenNameEQUAL	
onMissingFiltersFile	TokenNameIdentifier	 on Missing Filters File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the onMissingFiltersFile setting. * @return the OnMissing instance. */	TokenNameCOMMENT_JAVADOC	 Get the onMissingFiltersFile setting. @return the OnMissing instance. 
public	TokenNamepublic	
OnMissing	TokenNameIdentifier	 On Missing
getOnMissingFiltersFile	TokenNameIdentifier	 get On Missing Filters File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
onMissingFiltersFile	TokenNameIdentifier	 on Missing Filters File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Does replacement on the given string with token matching. * This uses the defined begintoken and endtoken values which default * to @ for both. * * @param line The line to process the tokens in. * @return The string with the tokens replaced. */	TokenNameCOMMENT_JAVADOC	 Does replacement on the given string with token matching. This uses the defined begintoken and endtoken values which default to @ for both. * @param line The line to process the tokens in. @return The string with the tokens replaced. 
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
iReplaceTokens	TokenNameIdentifier	 i Replace Tokens
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
beginToken	TokenNameIdentifier	 begin Token
=	TokenNameEQUAL	
getBeginToken	TokenNameIdentifier	 get Begin Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
endToken	TokenNameIdentifier	 end Token
=	TokenNameEQUAL	
getEndToken	TokenNameIdentifier	 get End Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
beginToken	TokenNameIdentifier	 begin Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
getFilterHash	TokenNameIdentifier	 get Filter Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//can't have zero-length token 	TokenNameCOMMENT_LINE	can't have zero-length token 
int	TokenNameint	
endIndex	TokenNameIdentifier	 end Index
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
endToken	TokenNameIdentifier	 end Token
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
beginToken	TokenNameIdentifier	 begin Token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endIndex	TokenNameIdentifier	 end Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
beginToken	TokenNameIdentifier	 begin Token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
endIndex	TokenNameIdentifier	 end Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
recurse	TokenNameIdentifier	 recurse
&&	TokenNameAND_AND	
!	TokenNameNOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we have another token, let's parse it. 	TokenNameCOMMENT_LINE	we have another token, let's parse it. 
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
replaceTokens	TokenNameIdentifier	 replace Tokens
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Replacing: "	TokenNameStringLiteral	Replacing: 
+	TokenNamePLUS	
beginToken	TokenNameIdentifier	 begin Token
+	TokenNamePLUS	
token	TokenNameIdentifier	 token
+	TokenNamePLUS	
endToken	TokenNameIdentifier	 end Token
+	TokenNamePLUS	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
beginToken	TokenNameIdentifier	 begin Token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
endToken	TokenNameIdentifier	 end Token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// just append first character of beginToken 	TokenNameCOMMENT_LINE	just append first character of beginToken 
// and search further 	TokenNameCOMMENT_LINE	and search further 
// we can't skip the complete beginToken since 	TokenNameCOMMENT_LINE	we can't skip the complete beginToken since 
// it may contain the start of another 	TokenNameCOMMENT_LINE	it may contain the start of another 
// candidate begin token (Bugzilla 45094) 	TokenNameCOMMENT_LINE	candidate begin token (Bugzilla 45094) 
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
beginToken	TokenNameIdentifier	 begin Token
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
beginToken	TokenNameIdentifier	 begin Token
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
StringIndexOutOfBoundsException	TokenNameIdentifier	 String Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This parses tokens which point to tokens. * It also maintains a list of currently used tokens, so we cannot * get into an infinite loop. * @param line the value / token to parse. * @param parent the parent token (= the token it was parsed from). */	TokenNameCOMMENT_JAVADOC	 This parses tokens which point to tokens. It also maintains a list of currently used tokens, so we cannot get into an infinite loop. @param line the value / token to parse. @param parent the parent token (= the token it was parsed from). 
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
replaceTokens	TokenNameIdentifier	 replace Tokens
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
beginToken	TokenNameIdentifier	 begin Token
=	TokenNameEQUAL	
getBeginToken	TokenNameIdentifier	 get Begin Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
endToken	TokenNameIdentifier	 end Token
=	TokenNameEQUAL	
getEndToken	TokenNameIdentifier	 get End Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
recurseDepth	TokenNameIdentifier	 recurse Depth
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
passedTokens	TokenNameIdentifier	 passed Tokens
=	TokenNameEQUAL	
new	TokenNamenew	
VectorSet	TokenNameIdentifier	 Vector Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
recurseDepth	TokenNameIdentifier	 recurse Depth
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
passedTokens	TokenNameIdentifier	 passed Tokens
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
duplicateToken	TokenNameIdentifier	 duplicate Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
duplicateToken	TokenNameIdentifier	 duplicate Token
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Infinite loop in tokens. Currently known tokens : "	TokenNameStringLiteral	Infinite loop in tokens. Currently known tokens : 
+	TokenNamePLUS	
passedTokens	TokenNameIdentifier	 passed Tokens
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" Problem token : "	TokenNameStringLiteral	 Problem token : 
+	TokenNamePLUS	
beginToken	TokenNameIdentifier	 begin Token
+	TokenNamePLUS	
parent	TokenNameIdentifier	 parent
+	TokenNamePLUS	
endToken	TokenNameIdentifier	 end Token
+	TokenNamePLUS	
" called from "	TokenNameStringLiteral	 called from 
+	TokenNamePLUS	
beginToken	TokenNameIdentifier	 begin Token
+	TokenNamePLUS	
passedTokens	TokenNameIdentifier	 passed Tokens
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
endToken	TokenNameIdentifier	 end Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recurseDepth	TokenNameIdentifier	 recurse Depth
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
passedTokens	TokenNameIdentifier	 passed Tokens
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
iReplaceTokens	TokenNameIdentifier	 i Replace Tokens
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
beginToken	TokenNameIdentifier	 begin Token
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
duplicateToken	TokenNameIdentifier	 duplicate Token
&&	TokenNameAND_AND	
recurseDepth	TokenNameIdentifier	 recurse Depth
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
passedTokens	TokenNameIdentifier	 passed Tokens
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
duplicateToken	TokenNameIdentifier	 duplicate Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should always be the case... 	TokenNameCOMMENT_LINE	should always be the case... 
if	TokenNameif	
(	TokenNameLPAREN	
passedTokens	TokenNameIdentifier	 passed Tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
passedTokens	TokenNameIdentifier	 passed Tokens
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
passedTokens	TokenNameIdentifier	 passed Tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
passedTokens	TokenNameIdentifier	 passed Tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
beginToken	TokenNameIdentifier	 begin Token
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
endToken	TokenNameIdentifier	 end Token
;	TokenNameSEMICOLON	
duplicateToken	TokenNameIdentifier	 duplicate Token
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
passedTokens	TokenNameIdentifier	 passed Tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// remove last seen token when crawling out of recursion 	TokenNameCOMMENT_LINE	remove last seen token when crawling out of recursion 
passedTokens	TokenNameIdentifier	 passed Tokens
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
passedTokens	TokenNameIdentifier	 passed Tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
recurseDepth	TokenNameIdentifier	 recurse Depth
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
handleMissingFile	TokenNameIdentifier	 handle Missing File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
onMissingFiltersFile	TokenNameIdentifier	 on Missing Filters File
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
OnMissing	TokenNameIdentifier	 On Missing
.	TokenNameDOT	
IGNORE_INDEX	TokenNameIdentifier	 IGNORE  INDEX
:	TokenNameCOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
OnMissing	TokenNameIdentifier	 On Missing
.	TokenNameDOT	
FAIL_INDEX	TokenNameIdentifier	 FAIL  INDEX
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
OnMissing	TokenNameIdentifier	 On Missing
.	TokenNameDOT	
WARN_INDEX	TokenNameIdentifier	 WARN  INDEX
:	TokenNameCOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Invalid value for onMissingFiltersFile"	TokenNameStringLiteral	Invalid value for onMissingFiltersFile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
