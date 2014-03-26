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
Parameter	TokenNameIdentifier	 Parameter
;	TokenNameSEMICOLON	
/** * Converts tabs to spaces. * * Example: * * <pre>&lt;tabtospaces tablength=&quot;8&quot;/&gt;</pre> * * Or: * * <pre>&lt;filterreader classname=&quot;org.apache.tools.ant.filters.TabsToSpaces&quot;&gt; * &lt;param name=&quot;tablength&quot; value=&quot;8&quot;/&gt; * &lt;/filterreader&gt;</pre> * */	TokenNameCOMMENT_JAVADOC	 Converts tabs to spaces. * Example: * <pre>&lt;tabtospaces tablength=&quot;8&quot;/&gt;</pre> * Or: * <pre>&lt;filterreader classname=&quot;org.apache.tools.ant.filters.TabsToSpaces&quot;&gt; &lt;param name=&quot;tablength&quot; value=&quot;8&quot;/&gt; &lt;/filterreader&gt;</pre> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TabsToSpaces	TokenNameIdentifier	 Tabs To Spaces
extends	TokenNameextends	
BaseParamFilterReader	TokenNameIdentifier	 Base Param Filter Reader
implements	TokenNameimplements	
ChainableReader	TokenNameIdentifier	 Chainable Reader
{	TokenNameLBRACE	
/** The default tab length. */	TokenNameCOMMENT_JAVADOC	 The default tab length. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_TAB_LENGTH	TokenNameIdentifier	 DEFAULT  TAB  LENGTH
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Parameter name for the length of a tab. */	TokenNameCOMMENT_JAVADOC	 Parameter name for the length of a tab. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TAB_LENGTH_KEY	TokenNameIdentifier	 TAB  LENGTH  KEY
=	TokenNameEQUAL	
"tablength"	TokenNameStringLiteral	tablength
;	TokenNameSEMICOLON	
/** Tab length in this filter. */	TokenNameCOMMENT_JAVADOC	 Tab length in this filter. 
private	TokenNameprivate	
int	TokenNameint	
tabLength	TokenNameIdentifier	 tab Length
=	TokenNameEQUAL	
DEFAULT_TAB_LENGTH	TokenNameIdentifier	 DEFAULT  TAB  LENGTH
;	TokenNameSEMICOLON	
/** The number of spaces still to be read to represent the last-read tab. */	TokenNameCOMMENT_JAVADOC	 The number of spaces still to be read to represent the last-read tab. 
private	TokenNameprivate	
int	TokenNameint	
spacesRemaining	TokenNameIdentifier	 spaces Remaining
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Constructor for "dummy" instances. * * @see BaseFilterReader#BaseFilterReader() */	TokenNameCOMMENT_JAVADOC	 Constructor for "dummy" instances. * @see BaseFilterReader#BaseFilterReader() 
public	TokenNamepublic	
TabsToSpaces	TokenNameIdentifier	 Tabs To Spaces
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
TabsToSpaces	TokenNameIdentifier	 Tabs To Spaces
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
/** * Returns the next character in the filtered stream, converting tabs * to the specified number of spaces. * * @return the next character in the resulting stream, or -1 * if the end of the resulting stream has been reached * * @exception IOException if the underlying stream throws an IOException * during reading */	TokenNameCOMMENT_JAVADOC	 Returns the next character in the filtered stream, converting tabs to the specified number of spaces. * @return the next character in the resulting stream, or -1 if the end of the resulting stream has been reached * @exception IOException if the underlying stream throws an IOException during reading 
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
!	TokenNameNOT	
getInitialized	TokenNameIdentifier	 get Initialized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setInitialized	TokenNameIdentifier	 set Initialized
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
spacesRemaining	TokenNameIdentifier	 spaces Remaining
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
spacesRemaining	TokenNameIdentifier	 spaces Remaining
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
' '	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
spacesRemaining	TokenNameIdentifier	 spaces Remaining
=	TokenNameEQUAL	
tabLength	TokenNameIdentifier	 tab Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
' '	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the tab length. * * @param tabLength the number of spaces to be used when converting a tab. */	TokenNameCOMMENT_JAVADOC	 Sets the tab length. * @param tabLength the number of spaces to be used when converting a tab. 
public	TokenNamepublic	
void	TokenNamevoid	
setTablength	TokenNameIdentifier	 set Tablength
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
tabLength	TokenNameIdentifier	 tab Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tabLength	TokenNameIdentifier	 tab Length
=	TokenNameEQUAL	
tabLength	TokenNameIdentifier	 tab Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the tab length. * * @return the number of spaces used when converting a tab */	TokenNameCOMMENT_JAVADOC	 Returns the tab length. * @return the number of spaces used when converting a tab 
private	TokenNameprivate	
int	TokenNameint	
getTablength	TokenNameIdentifier	 get Tablength
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tabLength	TokenNameIdentifier	 tab Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new TabsToSpaces using the passed in * Reader for instantiation. * * @param rdr A Reader object providing the underlying stream. * Must not be <code>null</code>. * * @return a new filter based on this configuration, but filtering * the specified reader */	TokenNameCOMMENT_JAVADOC	 Creates a new TabsToSpaces using the passed in Reader for instantiation. * @param rdr A Reader object providing the underlying stream. Must not be <code>null</code>. * @return a new filter based on this configuration, but filtering the specified reader 
public	TokenNamepublic	
Reader	TokenNameIdentifier	 Reader
chain	TokenNameIdentifier	 chain
(	TokenNameLPAREN	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
rdr	TokenNameIdentifier	 rdr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TabsToSpaces	TokenNameIdentifier	 Tabs To Spaces
newFilter	TokenNameIdentifier	 new Filter
=	TokenNameEQUAL	
new	TokenNamenew	
TabsToSpaces	TokenNameIdentifier	 Tabs To Spaces
(	TokenNameLPAREN	
rdr	TokenNameIdentifier	 rdr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setTablength	TokenNameIdentifier	 set Tablength
(	TokenNameLPAREN	
getTablength	TokenNameIdentifier	 get Tablength
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setInitialized	TokenNameIdentifier	 set Initialized
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newFilter	TokenNameIdentifier	 new Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses the parameters to set the tab length. */	TokenNameCOMMENT_JAVADOC	 Parses the parameters to set the tab length. 
private	TokenNameprivate	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Parameter	TokenNameIdentifier	 Parameter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
getParameters	TokenNameIdentifier	 get Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
TAB_LENGTH_KEY	TokenNameIdentifier	 TAB  LENGTH  KEY
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tabLength	TokenNameIdentifier	 tab Length
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
