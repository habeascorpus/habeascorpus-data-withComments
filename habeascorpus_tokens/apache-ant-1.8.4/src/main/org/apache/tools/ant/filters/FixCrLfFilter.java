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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
Os	TokenNameIdentifier	 Os
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
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
;	TokenNameSEMICOLON	
/** * Converts text to local OS formatting conventions, as well as repair text * damaged by misconfigured or misguided editors or file transfer programs. * <p> * This filter can take the following arguments: * <ul> * <li>eof * <li>eol * <li>fixlast * <li>javafiles * <li>tab * <li>tablength * </ul> * None of which are required. * <p> * This version generalises the handling of EOL characters, and allows for * CR-only line endings (the standard on Mac systems prior to OS X). Tab * handling has also been generalised to accommodate any tabwidth from 2 to 80, * inclusive. Importantly, it can leave untouched any literal TAB characters * embedded within Java string or character constants. * <p> * <em>Caution:</em> run with care on carefully formatted files. This may * sound obvious, but if you don't specify asis, presume that your files are * going to be modified. If "tabs" is "add" or "remove", whitespace characters * may be added or removed as necessary. Similarly, for EOLs, eol="asis" * actually means convert to your native O/S EOL convention while eol="crlf" or * cr="add" can result in CR characters being removed in one special case * accommodated, i.e., CRCRLF is regarded as a single EOL to handle cases where * other programs have converted CRLF into CRCRLF. * * <P> * Example: * * <pre> * &lt;&lt;fixcrlf tab=&quot;add&quot; eol=&quot;crlf&quot; eof=&quot;asis&quot;/&gt; * </pre> * * Or: * * <pre> * &lt;filterreader classname=&quot;org.apache.tools.ant.filters.FixCrLfFilter&quot;&gt; * &lt;param eol=&quot;crlf&quot; tab=&quot;asis&quot;/&gt; * &lt;/filterreader&gt; * </pre> * */	TokenNameCOMMENT_JAVADOC	 Converts text to local OS formatting conventions, as well as repair text damaged by misconfigured or misguided editors or file transfer programs. <p> This filter can take the following arguments: <ul> <li>eof <li>eol <li>fixlast <li>javafiles <li>tab <li>tablength </ul> None of which are required. <p> This version generalises the handling of EOL characters, and allows for CR-only line endings (the standard on Mac systems prior to OS X). Tab handling has also been generalised to accommodate any tabwidth from 2 to 80, inclusive. Importantly, it can leave untouched any literal TAB characters embedded within Java string or character constants. <p> <em>Caution:</em> run with care on carefully formatted files. This may sound obvious, but if you don't specify asis, presume that your files are going to be modified. If "tabs" is "add" or "remove", whitespace characters may be added or removed as necessary. Similarly, for EOLs, eol="asis" actually means convert to your native O/S EOL convention while eol="crlf" or cr="add" can result in CR characters being removed in one special case accommodated, i.e., CRCRLF is regarded as a single EOL to handle cases where other programs have converted CRLF into CRCRLF. * <P> Example: * <pre> &lt;&lt;fixcrlf tab=&quot;add&quot; eol=&quot;crlf&quot; eof=&quot;asis&quot;/&gt; </pre> * Or: * <pre> &lt;filterreader classname=&quot;org.apache.tools.ant.filters.FixCrLfFilter&quot;&gt; &lt;param eol=&quot;crlf&quot; tab=&quot;asis&quot;/&gt; &lt;/filterreader&gt; </pre> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
FixCrLfFilter	TokenNameIdentifier	 Fix Cr Lf Filter
extends	TokenNameextends	
BaseParamFilterReader	TokenNameIdentifier	 Base Param Filter Reader
implements	TokenNameimplements	
ChainableReader	TokenNameIdentifier	 Chainable Reader
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_TAB_LENGTH	TokenNameIdentifier	 DEFAULT  TAB  LENGTH
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MIN_TAB_LENGTH	TokenNameIdentifier	 MIN  TAB  LENGTH
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_TAB_LENGTH	TokenNameIdentifier	 MAX  TAB  LENGTH
=	TokenNameEQUAL	
80	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
CTRLZ	TokenNameIdentifier	 CTRLZ
=	TokenNameEQUAL	
''	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
tabLength	TokenNameIdentifier	 tab Length
=	TokenNameEQUAL	
DEFAULT_TAB_LENGTH	TokenNameIdentifier	 DEFAULT  TAB  LENGTH
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CrLf	TokenNameIdentifier	 Cr Lf
eol	TokenNameIdentifier	 eol
;	TokenNameSEMICOLON	
private	TokenNameprivate	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
ctrlz	TokenNameIdentifier	 ctrlz
;	TokenNameSEMICOLON	
private	TokenNameprivate	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
tabs	TokenNameIdentifier	 tabs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
javafiles	TokenNameIdentifier	 javafiles
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
fixlast	TokenNameIdentifier	 fixlast
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
initialized	TokenNameIdentifier	 initialized
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Constructor for "dummy" instances. * * @see BaseFilterReader#BaseFilterReader() */	TokenNameCOMMENT_JAVADOC	 Constructor for "dummy" instances. * @see BaseFilterReader#BaseFilterReader() 
public	TokenNamepublic	
FixCrLfFilter	TokenNameIdentifier	 Fix Cr Lf Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new filtered reader. * * @param in * A Reader object providing the underlying stream. Must not be * <code>null</code>. * @throws IOException on error. */	TokenNameCOMMENT_JAVADOC	 Create a new filtered reader. * @param in A Reader object providing the underlying stream. Must not be <code>null</code>. @throws IOException on error. 
public	TokenNamepublic	
FixCrLfFilter	TokenNameIdentifier	 Fix Cr Lf Filter
(	TokenNameLPAREN	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Instance initializer: Executes just after the super() call in this 	TokenNameCOMMENT_LINE	Instance initializer: Executes just after the super() call in this 
// class's constructor. 	TokenNameCOMMENT_LINE	class's constructor. 
{	TokenNameLBRACE	
tabs	TokenNameIdentifier	 tabs
=	TokenNameEQUAL	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
.	TokenNameDOT	
ASIS	TokenNameIdentifier	 ASIS
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"mac"	TokenNameStringLiteral	mac
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"unix"	TokenNameStringLiteral	unix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ctrlz	TokenNameIdentifier	 ctrlz
=	TokenNameEQUAL	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
.	TokenNameDOT	
REMOVE	TokenNameIdentifier	 REMOVE
;	TokenNameSEMICOLON	
setEol	TokenNameIdentifier	 set Eol
(	TokenNameLPAREN	
CrLf	TokenNameIdentifier	 Cr Lf
.	TokenNameDOT	
MAC	TokenNameIdentifier	 MAC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"dos"	TokenNameStringLiteral	dos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ctrlz	TokenNameIdentifier	 ctrlz
=	TokenNameEQUAL	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
.	TokenNameDOT	
ASIS	TokenNameIdentifier	 ASIS
;	TokenNameSEMICOLON	
setEol	TokenNameIdentifier	 set Eol
(	TokenNameLPAREN	
CrLf	TokenNameIdentifier	 Cr Lf
.	TokenNameDOT	
DOS	TokenNameIdentifier	 DOS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ctrlz	TokenNameIdentifier	 ctrlz
=	TokenNameEQUAL	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
.	TokenNameDOT	
REMOVE	TokenNameIdentifier	 REMOVE
;	TokenNameSEMICOLON	
setEol	TokenNameIdentifier	 set Eol
(	TokenNameLPAREN	
CrLf	TokenNameIdentifier	 Cr Lf
.	TokenNameDOT	
UNIX	TokenNameIdentifier	 UNIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a new FixCrLfFilter using the passed in Reader for instantiation. * * @param rdr * A Reader object providing the underlying stream. Must not be * <code>null</code>. * * @return a new filter based on this configuration, but filtering the * specified reader. */	TokenNameCOMMENT_JAVADOC	 Create a new FixCrLfFilter using the passed in Reader for instantiation. * @param rdr A Reader object providing the underlying stream. Must not be <code>null</code>. * @return a new filter based on this configuration, but filtering the specified reader. 
public	TokenNamepublic	
Reader	TokenNameIdentifier	 Reader
chain	TokenNameIdentifier	 chain
(	TokenNameLPAREN	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
rdr	TokenNameIdentifier	 rdr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
FixCrLfFilter	TokenNameIdentifier	 Fix Cr Lf Filter
newFilter	TokenNameIdentifier	 new Filter
=	TokenNameEQUAL	
new	TokenNamenew	
FixCrLfFilter	TokenNameIdentifier	 Fix Cr Lf Filter
(	TokenNameLPAREN	
rdr	TokenNameIdentifier	 rdr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setJavafiles	TokenNameIdentifier	 set Javafiles
(	TokenNameLPAREN	
getJavafiles	TokenNameIdentifier	 get Javafiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setEol	TokenNameIdentifier	 set Eol
(	TokenNameLPAREN	
getEol	TokenNameIdentifier	 get Eol
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setTab	TokenNameIdentifier	 set Tab
(	TokenNameLPAREN	
getTab	TokenNameIdentifier	 get Tab
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
setEof	TokenNameIdentifier	 set Eof
(	TokenNameLPAREN	
getEof	TokenNameIdentifier	 get Eof
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setFixlast	TokenNameIdentifier	 set Fixlast
(	TokenNameLPAREN	
getFixlast	TokenNameIdentifier	 get Fixlast
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
initInternalFilters	TokenNameIdentifier	 init Internal Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newFilter	TokenNameIdentifier	 new Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
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
/** * Get how DOS EOF (control-z) characters are being handled. * * @return values: * <ul> * <li>add: ensure that there is an eof at the end of the file * <li>asis: leave eof characters alone * <li>remove: remove any eof character found at the end * </ul> */	TokenNameCOMMENT_JAVADOC	 Get how DOS EOF (control-z) characters are being handled. * @return values: <ul> <li>add: ensure that there is an eof at the end of the file <li>asis: leave eof characters alone <li>remove: remove any eof character found at the end </ul> 
public	TokenNamepublic	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
getEof	TokenNameIdentifier	 get Eof
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Return copy so that the call must call setEof() to change the state 	TokenNameCOMMENT_LINE	Return copy so that the call must call setEof() to change the state 
// of fixCRLF 	TokenNameCOMMENT_LINE	of fixCRLF 
return	TokenNamereturn	
ctrlz	TokenNameIdentifier	 ctrlz
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get how EndOfLine characters are being handled. * * @return values: * <ul> * <li>asis: convert line endings to your O/S convention * <li>cr: convert line endings to CR * <li>lf: convert line endings to LF * <li>crlf: convert line endings to CRLF * </ul> */	TokenNameCOMMENT_JAVADOC	 Get how EndOfLine characters are being handled. * @return values: <ul> <li>asis: convert line endings to your O/S convention <li>cr: convert line endings to CR <li>lf: convert line endings to LF <li>crlf: convert line endings to CRLF </ul> 
public	TokenNamepublic	
CrLf	TokenNameIdentifier	 Cr Lf
getEol	TokenNameIdentifier	 get Eol
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Return copy so that the call must call setEol() to change the state 	TokenNameCOMMENT_LINE	Return copy so that the call must call setEol() to change the state 
// of fixCRLF 	TokenNameCOMMENT_LINE	of fixCRLF 
return	TokenNamereturn	
eol	TokenNameIdentifier	 eol
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get whether a missing EOL be added to the final line of the stream. * * @return true if a filtered file will always end with an EOL */	TokenNameCOMMENT_JAVADOC	 Get whether a missing EOL be added to the final line of the stream. * @return true if a filtered file will always end with an EOL 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFixlast	TokenNameIdentifier	 get Fixlast
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fixlast	TokenNameIdentifier	 fixlast
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get whether the stream is to be treated as though it contains Java * source. * <P> * This attribute is only used in assocation with the &quot;<i><b>tab</b></i>&quot; * attribute. Tabs found in Java literals are protected from changes by this * filter. * * @return true if whitespace in Java character and string literals is * ignored. */	TokenNameCOMMENT_JAVADOC	 Get whether the stream is to be treated as though it contains Java source. <P> This attribute is only used in assocation with the &quot;<i><b>tab</b></i>&quot; attribute. Tabs found in Java literals are protected from changes by this filter. * @return true if whitespace in Java character and string literals is ignored. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getJavafiles	TokenNameIdentifier	 get Javafiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
javafiles	TokenNameIdentifier	 javafiles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return how tab characters are being handled. * * @return values: * <ul> * <li>add: convert sequences of spaces which span a tab stop to * tabs * <li>asis: leave tab and space characters alone * <li>remove: convert tabs to spaces * </ul> */	TokenNameCOMMENT_JAVADOC	 Return how tab characters are being handled. * @return values: <ul> <li>add: convert sequences of spaces which span a tab stop to tabs <li>asis: leave tab and space characters alone <li>remove: convert tabs to spaces </ul> 
public	TokenNamepublic	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
getTab	TokenNameIdentifier	 get Tab
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Return copy so that the caller must call setTab() to change the state 	TokenNameCOMMENT_LINE	Return copy so that the caller must call setTab() to change the state 
// of fixCRLF. 	TokenNameCOMMENT_LINE	of fixCRLF. 
return	TokenNamereturn	
tabs	TokenNameIdentifier	 tabs
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the tab length to use. * * @return the length of tab in spaces */	TokenNameCOMMENT_JAVADOC	 Get the tab length to use. * @return the length of tab in spaces 
public	TokenNamepublic	
int	TokenNameint	
getTablength	TokenNameIdentifier	 get Tablength
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tabLength	TokenNameIdentifier	 tab Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
calculateEolString	TokenNameIdentifier	 calculate Eol String
(	TokenNameLPAREN	
CrLf	TokenNameIdentifier	 Cr Lf
eol	TokenNameIdentifier	 eol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Calculate the EOL string per the current config 	TokenNameCOMMENT_LINE	Calculate the EOL string per the current config 
if	TokenNameif	
(	TokenNameLPAREN	
eol	TokenNameIdentifier	 eol
==	TokenNameEQUAL_EQUAL	
CrLf	TokenNameIdentifier	 Cr Lf
.	TokenNameDOT	
ASIS	TokenNameIdentifier	 ASIS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
eol	TokenNameIdentifier	 eol
==	TokenNameEQUAL_EQUAL	
CrLf	TokenNameIdentifier	 Cr Lf
.	TokenNameDOT	
CR	TokenNameIdentifier	 CR
||	TokenNameOR_OR	
eol	TokenNameIdentifier	 eol
==	TokenNameEQUAL_EQUAL	
CrLf	TokenNameIdentifier	 Cr Lf
.	TokenNameDOT	
MAC	TokenNameIdentifier	 MAC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
eol	TokenNameIdentifier	 eol
==	TokenNameEQUAL_EQUAL	
CrLf	TokenNameIdentifier	 Cr Lf
.	TokenNameDOT	
CRLF	TokenNameIdentifier	 CRLF
||	TokenNameOR_OR	
eol	TokenNameIdentifier	 eol
==	TokenNameEQUAL_EQUAL	
CrLf	TokenNameIdentifier	 Cr Lf
.	TokenNameDOT	
DOS	TokenNameIdentifier	 DOS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// assume (eol == CrLf.LF || eol == CrLf.UNIX) 	TokenNameCOMMENT_LINE	assume (eol == CrLf.LF || eol == CrLf.UNIX) 
return	TokenNamereturn	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Wrap the input stream with the internal filters necessary to perform the * configuration settings. */	TokenNameCOMMENT_JAVADOC	 Wrap the input stream with the internal filters necessary to perform the configuration settings. 
private	TokenNameprivate	
void	TokenNamevoid	
initInternalFilters	TokenNameIdentifier	 init Internal Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If I'm removing an EOF character, do so first so that the other 	TokenNameCOMMENT_LINE	If I'm removing an EOF character, do so first so that the other 
// filters don't see that character. 	TokenNameCOMMENT_LINE	filters don't see that character. 
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ctrlz	TokenNameIdentifier	 ctrlz
==	TokenNameEQUAL_EQUAL	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
.	TokenNameDOT	
REMOVE	TokenNameIdentifier	 REMOVE
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
RemoveEofFilter	TokenNameIdentifier	 Remove Eof Filter
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
:	TokenNameCOLON	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
// Change all EOL characters to match the calculated EOL string. If 	TokenNameCOMMENT_LINE	Change all EOL characters to match the calculated EOL string. If 
// configured to do so, append a trailing EOL so that the file ends on 	TokenNameCOMMENT_LINE	configured to do so, append a trailing EOL so that the file ends on 
// a EOL. 	TokenNameCOMMENT_LINE	a EOL. 
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
NormalizeEolFilter	TokenNameIdentifier	 Normalize Eol Filter
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
calculateEolString	TokenNameIdentifier	 calculate Eol String
(	TokenNameLPAREN	
eol	TokenNameIdentifier	 eol
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getFixlast	TokenNameIdentifier	 get Fixlast
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tabs	TokenNameIdentifier	 tabs
!=	TokenNameNOT_EQUAL	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
.	TokenNameDOT	
ASIS	TokenNameIdentifier	 ASIS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If filtering Java source, prevent changes to whitespace in 	TokenNameCOMMENT_LINE	If filtering Java source, prevent changes to whitespace in 
// character and string literals. 	TokenNameCOMMENT_LINE	character and string literals. 
if	TokenNameif	
(	TokenNameLPAREN	
getJavafiles	TokenNameIdentifier	 get Javafiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
MaskJavaTabLiteralsFilter	TokenNameIdentifier	 Mask Java Tab Literals Filter
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add/Remove tabs 	TokenNameCOMMENT_LINE	Add/Remove tabs 
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
(	TokenNameLPAREN	
tabs	TokenNameIdentifier	 tabs
==	TokenNameEQUAL_EQUAL	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
.	TokenNameDOT	
ADD	TokenNameIdentifier	 ADD
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
)	TokenNameRPAREN	
new	TokenNamenew	
AddTabFilter	TokenNameIdentifier	 Add Tab Filter
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
getTablength	TokenNameIdentifier	 get Tablength
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
)	TokenNameRPAREN	
new	TokenNamenew	
RemoveTabFilter	TokenNameIdentifier	 Remove Tab Filter
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
getTablength	TokenNameIdentifier	 get Tablength
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add missing EOF character 	TokenNameCOMMENT_LINE	Add missing EOF character 
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ctrlz	TokenNameIdentifier	 ctrlz
==	TokenNameEQUAL_EQUAL	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
.	TokenNameDOT	
ADD	TokenNameIdentifier	 ADD
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
AddEofFilter	TokenNameIdentifier	 Add Eof Filter
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
:	TokenNameCOLON	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
initialized	TokenNameIdentifier	 initialized
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the next character in the filtered stream. * * @return the next character in the resulting stream, or -1 if the end of * the resulting stream has been reached. * * @exception IOException * if the underlying stream throws an IOException during * reading. */	TokenNameCOMMENT_JAVADOC	 Return the next character in the filtered stream. * @return the next character in the resulting stream, or -1 if the end of the resulting stream has been reached. * @exception IOException if the underlying stream throws an IOException during reading. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
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
initialized	TokenNameIdentifier	 initialized
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initInternalFilters	TokenNameIdentifier	 init Internal Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specify how DOS EOF (control-z) characters are to be handled. * * @param attr * valid values: * <ul> * <li>add: ensure that there is an eof at the end of the file * <li>asis: leave eof characters alone * <li>remove: remove any eof character found at the end * </ul> */	TokenNameCOMMENT_JAVADOC	 Specify how DOS EOF (control-z) characters are to be handled. * @param attr valid values: <ul> <li>add: ensure that there is an eof at the end of the file <li>asis: leave eof characters alone <li>remove: remove any eof character found at the end </ul> 
public	TokenNamepublic	
void	TokenNamevoid	
setEof	TokenNameIdentifier	 set Eof
(	TokenNameLPAREN	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ctrlz	TokenNameIdentifier	 ctrlz
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specify how end of line (EOL) characters are to be handled. * * @param attr * valid values: * <ul> * <li>asis: convert line endings to your O/S convention * <li>cr: convert line endings to CR * <li>lf: convert line endings to LF * <li>crlf: convert line endings to CRLF * </ul> */	TokenNameCOMMENT_JAVADOC	 Specify how end of line (EOL) characters are to be handled. * @param attr valid values: <ul> <li>asis: convert line endings to your O/S convention <li>cr: convert line endings to CR <li>lf: convert line endings to LF <li>crlf: convert line endings to CRLF </ul> 
public	TokenNamepublic	
void	TokenNamevoid	
setEol	TokenNameIdentifier	 set Eol
(	TokenNameLPAREN	
CrLf	TokenNameIdentifier	 Cr Lf
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eol	TokenNameIdentifier	 eol
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specify whether a missing EOL will be added to the final line of input. * * @param fixlast * if true a missing EOL will be appended. */	TokenNameCOMMENT_JAVADOC	 Specify whether a missing EOL will be added to the final line of input. * @param fixlast if true a missing EOL will be appended. 
public	TokenNamepublic	
void	TokenNamevoid	
setFixlast	TokenNameIdentifier	 set Fixlast
(	TokenNameLPAREN	
boolean	TokenNameboolean	
fixlast	TokenNameIdentifier	 fixlast
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fixlast	TokenNameIdentifier	 fixlast
=	TokenNameEQUAL	
fixlast	TokenNameIdentifier	 fixlast
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicate whether this stream contains Java source. * * This attribute is only used in assocation with the &quot;<i><b>tab</b></i>&quot; * attribute. * * @param javafiles * set to true to prevent this filter from changing tabs found in * Java literals. */	TokenNameCOMMENT_JAVADOC	 Indicate whether this stream contains Java source. * This attribute is only used in assocation with the &quot;<i><b>tab</b></i>&quot; attribute. * @param javafiles set to true to prevent this filter from changing tabs found in Java literals. 
public	TokenNamepublic	
void	TokenNamevoid	
setJavafiles	TokenNameIdentifier	 set Javafiles
(	TokenNameLPAREN	
boolean	TokenNameboolean	
javafiles	TokenNameIdentifier	 javafiles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
javafiles	TokenNameIdentifier	 javafiles
=	TokenNameEQUAL	
javafiles	TokenNameIdentifier	 javafiles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specify how tab characters are to be handled. * * @param attr * valid values: * <ul> * <li>add: convert sequences of spaces which span a tab stop to * tabs * <li>asis: leave tab and space characters alone * <li>remove: convert tabs to spaces * </ul> */	TokenNameCOMMENT_JAVADOC	 Specify how tab characters are to be handled. * @param attr valid values: <ul> <li>add: convert sequences of spaces which span a tab stop to tabs <li>asis: leave tab and space characters alone <li>remove: convert tabs to spaces </ul> 
public	TokenNamepublic	
void	TokenNamevoid	
setTab	TokenNameIdentifier	 set Tab
(	TokenNameLPAREN	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tabs	TokenNameIdentifier	 tabs
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specify tab length in characters. * * @param tabLength * specify the length of tab in spaces. Valid values are between * 2 and 80 inclusive. The default for this parameter is 8. * @throws IOException on error. */	TokenNameCOMMENT_JAVADOC	 Specify tab length in characters. * @param tabLength specify the length of tab in spaces. Valid values are between 2 and 80 inclusive. The default for this parameter is 8. @throws IOException on error. 
public	TokenNamepublic	
void	TokenNamevoid	
setTablength	TokenNameIdentifier	 set Tablength
(	TokenNameLPAREN	
int	TokenNameint	
tabLength	TokenNameIdentifier	 tab Length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tabLength	TokenNameIdentifier	 tab Length
<	TokenNameLESS	
MIN_TAB_LENGTH	TokenNameIdentifier	 MIN  TAB  LENGTH
||	TokenNameOR_OR	
tabLength	TokenNameIdentifier	 tab Length
>	TokenNameGREATER	
MAX_TAB_LENGTH	TokenNameIdentifier	 MAX  TAB  LENGTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"tablength must be between "	TokenNameStringLiteral	tablength must be between 
+	TokenNamePLUS	
MIN_TAB_LENGTH	TokenNameIdentifier	 MIN  TAB  LENGTH
+	TokenNamePLUS	
" and "	TokenNameStringLiteral	 and 
+	TokenNamePLUS	
MAX_TAB_LENGTH	TokenNameIdentifier	 MAX  TAB  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tabLength	TokenNameIdentifier	 tab Length
=	TokenNameEQUAL	
tabLength	TokenNameIdentifier	 tab Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This filter reader redirects all read I/O methods through its own read() * method. * * <P> * The input stream is already buffered by the copy task so this doesn't * significantly impact performance while it makes writing the individual * fix filters much easier. * </P> */	TokenNameCOMMENT_JAVADOC	 This filter reader redirects all read I/O methods through its own read() method. * <P> The input stream is already buffered by the copy task so this doesn't significantly impact performance while it makes writing the individual fix filters much easier. </P> 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
SimpleFilterReader	TokenNameIdentifier	 Simple Filter Reader
extends	TokenNameextends	
Reader	TokenNameIdentifier	 Reader
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PREEMPT_BUFFER_LENGTH	TokenNameIdentifier	 PREEMPT  BUFFER  LENGTH
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
preempt	TokenNameIdentifier	 preempt
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
PREEMPT_BUFFER_LENGTH	TokenNameIdentifier	 PREEMPT  BUFFER  LENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
preemptIndex	TokenNameIdentifier	 preempt Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SimpleFilterReader	TokenNameIdentifier	 Simple Filter Reader
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
preempt	TokenNameIdentifier	 preempt
[	TokenNameLBRACKET	
preemptIndex	TokenNameIdentifier	 preempt Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
p2	TokenNameIdentifier	 p2
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
preempt	TokenNameIdentifier	 preempt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
preempt	TokenNameIdentifier	 preempt
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
preempt	TokenNameIdentifier	 preempt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preempt	TokenNameIdentifier	 preempt
=	TokenNameEQUAL	
p2	TokenNameIdentifier	 p2
;	TokenNameSEMICOLON	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cs	TokenNameIdentifier	 cs
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cs	TokenNameIdentifier	 cs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Does this filter want to block edits on the last character returned * by read()? */	TokenNameCOMMENT_JAVADOC	 Does this filter want to block edits on the last character returned by read()? 
public	TokenNamepublic	
boolean	TokenNameboolean	
editsBlocked	TokenNameIdentifier	 edits Blocked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
in	TokenNameIdentifier	 in
instanceof	TokenNameinstanceof	
SimpleFilterReader	TokenNameIdentifier	 Simple Filter Reader
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SimpleFilterReader	TokenNameIdentifier	 Simple Filter Reader
)	TokenNameRPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
.	TokenNameDOT	
editsBlocked	TokenNameIdentifier	 edits Blocked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
preemptIndex	TokenNameIdentifier	 preempt Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
preempt	TokenNameIdentifier	 preempt
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
preemptIndex	TokenNameIdentifier	 preempt Index
]	TokenNameRBRACKET	
:	TokenNameCOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
markSupported	TokenNameIdentifier	 mark Supported
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
markSupported	TokenNameIdentifier	 mark Supported
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
ready	TokenNameIdentifier	 ready
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
ready	TokenNameIdentifier	 ready
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
long	TokenNamelong	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// CheckStyle:InnerAssignment OFF - leave alone 	TokenNameCOMMENT_LINE	CheckStyle:InnerAssignment OFF - leave alone 
while	TokenNamewhile	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if at EOF with no characters in the buffer, return EOF 	TokenNameCOMMENT_LINE	if at EOF with no characters in the buffer, return EOF 
return	TokenNamereturn	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
MaskJavaTabLiteralsFilter	TokenNameIdentifier	 Mask Java Tab Literals Filter
extends	TokenNameextends	
SimpleFilterReader	TokenNameIdentifier	 Simple Filter Reader
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
editsBlocked	TokenNameIdentifier	 edits Blocked
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
JAVA	TokenNameIdentifier	 JAVA
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
IN_CHAR_CONST	TokenNameIdentifier	 IN  CHAR  CONST
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
IN_STR_CONST	TokenNameIdentifier	 IN  STR  CONST
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
IN_SINGLE_COMMENT	TokenNameIdentifier	 IN  SINGLE  COMMENT
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
IN_MULTI_COMMENT	TokenNameIdentifier	 IN  MULTI  COMMENT
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TRANS_TO_COMMENT	TokenNameIdentifier	 TRANS  TO  COMMENT
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TRANS_FROM_MULTI	TokenNameIdentifier	 TRANS  FROM  MULTI
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MaskJavaTabLiteralsFilter	TokenNameIdentifier	 Mask Java Tab Literals Filter
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
JAVA	TokenNameIdentifier	 JAVA
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
editsBlocked	TokenNameIdentifier	 edits Blocked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
editsBlocked	TokenNameIdentifier	 edits Blocked
||	TokenNameOR_OR	
super	TokenNamesuper	
.	TokenNameDOT	
editsBlocked	TokenNameIdentifier	 edits Blocked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
thisChar	TokenNameIdentifier	 this Char
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Mask, block from being edited, all characters in constants. 	TokenNameCOMMENT_LINE	Mask, block from being edited, all characters in constants. 
editsBlocked	TokenNameIdentifier	 edits Blocked
=	TokenNameEQUAL	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
IN_CHAR_CONST	TokenNameIdentifier	 IN  CHAR  CONST
||	TokenNameOR_OR	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
IN_STR_CONST	TokenNameIdentifier	 IN  STR  CONST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
JAVA	TokenNameIdentifier	 JAVA
:	TokenNameCOLON	
// The current character is always emitted. 	TokenNameCOMMENT_LINE	The current character is always emitted. 
switch	TokenNameswitch	
(	TokenNameLPAREN	
thisChar	TokenNameIdentifier	 this Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
IN_CHAR_CONST	TokenNameIdentifier	 IN  CHAR  CONST
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
IN_STR_CONST	TokenNameIdentifier	 IN  STR  CONST
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'/'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
TRANS_TO_COMMENT	TokenNameIdentifier	 TRANS  TO  COMMENT
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// Fall tru 	TokenNameCOMMENT_LINE	Fall tru 
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
IN_CHAR_CONST	TokenNameIdentifier	 IN  CHAR  CONST
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
thisChar	TokenNameIdentifier	 this Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
JAVA	TokenNameIdentifier	 JAVA
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// Fall tru 	TokenNameCOMMENT_LINE	Fall tru 
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
IN_STR_CONST	TokenNameIdentifier	 IN  STR  CONST
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
thisChar	TokenNameIdentifier	 this Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
JAVA	TokenNameIdentifier	 JAVA
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// Fall tru 	TokenNameCOMMENT_LINE	Fall tru 
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
IN_SINGLE_COMMENT	TokenNameIdentifier	 IN  SINGLE  COMMENT
:	TokenNameCOLON	
// The current character is always emitted. 	TokenNameCOMMENT_LINE	The current character is always emitted. 
switch	TokenNameswitch	
(	TokenNameLPAREN	
thisChar	TokenNameIdentifier	 this Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'\n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// EOL 	TokenNameCOMMENT_LINE	EOL 
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
JAVA	TokenNameIdentifier	 JAVA
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// Fall tru 	TokenNameCOMMENT_LINE	Fall tru 
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
IN_MULTI_COMMENT	TokenNameIdentifier	 IN  MULTI  COMMENT
:	TokenNameCOLON	
// The current character is always emitted. 	TokenNameCOMMENT_LINE	The current character is always emitted. 
switch	TokenNameswitch	
(	TokenNameLPAREN	
thisChar	TokenNameIdentifier	 this Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'*'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
TRANS_FROM_MULTI	TokenNameIdentifier	 TRANS  FROM  MULTI
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// Fall tru 	TokenNameCOMMENT_LINE	Fall tru 
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TRANS_TO_COMMENT	TokenNameIdentifier	 TRANS  TO  COMMENT
:	TokenNameCOLON	
// The current character is always emitted. 	TokenNameCOMMENT_LINE	The current character is always emitted. 
switch	TokenNameswitch	
(	TokenNameLPAREN	
thisChar	TokenNameIdentifier	 this Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'*'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
IN_MULTI_COMMENT	TokenNameIdentifier	 IN  MULTI  COMMENT
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'/'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
IN_SINGLE_COMMENT	TokenNameIdentifier	 IN  SINGLE  COMMENT
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
IN_CHAR_CONST	TokenNameIdentifier	 IN  CHAR  CONST
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
IN_STR_CONST	TokenNameIdentifier	 IN  STR  CONST
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
JAVA	TokenNameIdentifier	 JAVA
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TRANS_FROM_MULTI	TokenNameIdentifier	 TRANS  FROM  MULTI
:	TokenNameCOLON	
// The current character is always emitted. 	TokenNameCOMMENT_LINE	The current character is always emitted. 
switch	TokenNameswitch	
(	TokenNameLPAREN	
thisChar	TokenNameIdentifier	 this Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'/'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
JAVA	TokenNameIdentifier	 JAVA
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// Fall tru 	TokenNameCOMMENT_LINE	Fall tru 
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// Fall tru 	TokenNameCOMMENT_LINE	Fall tru 
}	TokenNameRBRACE	
return	TokenNamereturn	
thisChar	TokenNameIdentifier	 this Char
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
NormalizeEolFilter	TokenNameIdentifier	 Normalize Eol Filter
extends	TokenNameextends	
SimpleFilterReader	TokenNameIdentifier	 Simple Filter Reader
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
previousWasEOL	TokenNameIdentifier	 previous Was EOL
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
fixLast	TokenNameIdentifier	 fix Last
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
normalizedEOL	TokenNameIdentifier	 normalized EOL
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
eol	TokenNameIdentifier	 eol
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NormalizeEolFilter	TokenNameIdentifier	 Normalize Eol Filter
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
eolString	TokenNameIdentifier	 eol String
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fixLast	TokenNameIdentifier	 fix Last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eol	TokenNameIdentifier	 eol
=	TokenNameEQUAL	
eolString	TokenNameIdentifier	 eol String
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fixLast	TokenNameIdentifier	 fix Last
=	TokenNameEQUAL	
fixLast	TokenNameIdentifier	 fix Last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
thisChar	TokenNameIdentifier	 this Char
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
normalizedEOL	TokenNameIdentifier	 normalized EOL
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
numEOL	TokenNameIdentifier	 num EOL
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
atEnd	TokenNameIdentifier	 at End
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
thisChar	TokenNameIdentifier	 this Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CTRLZ	TokenNameIdentifier	 CTRLZ
:	TokenNameCOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
atEnd	TokenNameIdentifier	 at End
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fixLast	TokenNameIdentifier	 fix Last
&&	TokenNameAND_AND	
!	TokenNameNOT	
previousWasEOL	TokenNameIdentifier	 previous Was EOL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numEOL	TokenNameIdentifier	 num EOL
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
thisChar	TokenNameIdentifier	 this Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
atEnd	TokenNameIdentifier	 at End
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fixLast	TokenNameIdentifier	 fix Last
&&	TokenNameAND_AND	
!	TokenNameNOT	
previousWasEOL	TokenNameIdentifier	 previous Was EOL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numEOL	TokenNameIdentifier	 num EOL
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// EOL was "\n" 	TokenNameCOMMENT_LINE	EOL was "\n" 
numEOL	TokenNameIdentifier	 num EOL
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
numEOL	TokenNameIdentifier	 num EOL
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c2	TokenNameIdentifier	 c2
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// EOL was "\r\r\n" 	TokenNameCOMMENT_LINE	EOL was "\r\r\n" 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// EOL was "\r\r" - handle as two consecutive "\r" and 	TokenNameCOMMENT_LINE	EOL was "\r\r" - handle as two consecutive "\r" and 
// "\r" 	TokenNameCOMMENT_LINE	"\r" 
numEOL	TokenNameIdentifier	 num EOL
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// EOL was "\r\n" 	TokenNameCOMMENT_LINE	EOL was "\r\n" 
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// EOL was "\r" 	TokenNameCOMMENT_LINE	EOL was "\r" 
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
// Fall tru 	TokenNameCOMMENT_LINE	Fall tru 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numEOL	TokenNameIdentifier	 num EOL
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
numEOL	TokenNameIdentifier	 num EOL
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
eol	TokenNameIdentifier	 eol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
normalizedEOL	TokenNameIdentifier	 normalized EOL
+=	TokenNamePLUS_EQUAL	
eol	TokenNameIdentifier	 eol
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
previousWasEOL	TokenNameIdentifier	 previous Was EOL
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
thisChar	TokenNameIdentifier	 this Char
=	TokenNameEQUAL	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
atEnd	TokenNameIdentifier	 at End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
previousWasEOL	TokenNameIdentifier	 previous Was EOL
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
normalizedEOL	TokenNameIdentifier	 normalized EOL
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
thisChar	TokenNameIdentifier	 this Char
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
AddEofFilter	TokenNameIdentifier	 Add Eof Filter
extends	TokenNameextends	
SimpleFilterReader	TokenNameIdentifier	 Simple Filter Reader
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
lastChar	TokenNameIdentifier	 last Char
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AddEofFilter	TokenNameIdentifier	 Add Eof Filter
(	TokenNameLPAREN	
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
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
thisChar	TokenNameIdentifier	 this Char
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if source is EOF but last character was NOT ctrl-z, return ctrl-z 	TokenNameCOMMENT_LINE	if source is EOF but last character was NOT ctrl-z, return ctrl-z 
if	TokenNameif	
(	TokenNameLPAREN	
thisChar	TokenNameIdentifier	 this Char
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastChar	TokenNameIdentifier	 last Char
!=	TokenNameNOT_EQUAL	
CTRLZ	TokenNameIdentifier	 CTRLZ
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastChar	TokenNameIdentifier	 last Char
=	TokenNameEQUAL	
CTRLZ	TokenNameIdentifier	 CTRLZ
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lastChar	TokenNameIdentifier	 last Char
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
lastChar	TokenNameIdentifier	 last Char
=	TokenNameEQUAL	
thisChar	TokenNameIdentifier	 this Char
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
thisChar	TokenNameIdentifier	 this Char
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
RemoveEofFilter	TokenNameIdentifier	 Remove Eof Filter
extends	TokenNameextends	
SimpleFilterReader	TokenNameIdentifier	 Simple Filter Reader
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
lookAhead	TokenNameIdentifier	 look Ahead
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RemoveEofFilter	TokenNameIdentifier	 Remove Eof Filter
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
lookAhead	TokenNameIdentifier	 look Ahead
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lookAhead	TokenNameIdentifier	 look Ahead
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
lookAhead2	TokenNameIdentifier	 look Ahead2
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If source at EOF and lookAhead is ctrl-z, return EOF (NOT ctrl-z) 	TokenNameCOMMENT_LINE	If source at EOF and lookAhead is ctrl-z, return EOF (NOT ctrl-z) 
if	TokenNameif	
(	TokenNameLPAREN	
lookAhead2	TokenNameIdentifier	 look Ahead2
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
lookAhead	TokenNameIdentifier	 look Ahead
==	TokenNameEQUAL_EQUAL	
CTRLZ	TokenNameIdentifier	 CTRLZ
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Return current look-ahead 	TokenNameCOMMENT_LINE	Return current look-ahead 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
lookAhead	TokenNameIdentifier	 look Ahead
;	TokenNameSEMICOLON	
lookAhead	TokenNameIdentifier	 look Ahead
=	TokenNameEQUAL	
lookAhead2	TokenNameIdentifier	 look Ahead2
;	TokenNameSEMICOLON	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
AddTabFilter	TokenNameIdentifier	 Add Tab Filter
extends	TokenNameextends	
SimpleFilterReader	TokenNameIdentifier	 Simple Filter Reader
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
tabLength	TokenNameIdentifier	 tab Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AddTabFilter	TokenNameIdentifier	 Add Tab Filter
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
int	TokenNameint	
tabLength	TokenNameIdentifier	 tab Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tabLength	TokenNameIdentifier	 tab Length
=	TokenNameEQUAL	
tabLength	TokenNameIdentifier	 tab Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'\r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
' '	TokenNameCharacterLiteral	
:	TokenNameCOLON	
columnNumber	TokenNameIdentifier	 column Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
editsBlocked	TokenNameIdentifier	 edits Blocked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
colNextTab	TokenNameIdentifier	 col Next Tab
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
columnNumber	TokenNameIdentifier	 column Number
+	TokenNamePLUS	
tabLength	TokenNameIdentifier	 tab Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
tabLength	TokenNameIdentifier	 tab Length
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
tabLength	TokenNameIdentifier	 tab Length
;	TokenNameSEMICOLON	
int	TokenNameint	
countSpaces	TokenNameIdentifier	 count Spaces
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
numTabs	TokenNameIdentifier	 num Tabs
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
scanWhitespace	TokenNameIdentifier	 scan Whitespace
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
' '	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
columnNumber	TokenNameIdentifier	 column Number
==	TokenNameEQUAL_EQUAL	
colNextTab	TokenNameIdentifier	 col Next Tab
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numTabs	TokenNameIdentifier	 num Tabs
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
countSpaces	TokenNameIdentifier	 count Spaces
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
colNextTab	TokenNameIdentifier	 col Next Tab
+=	TokenNamePLUS_EQUAL	
tabLength	TokenNameIdentifier	 tab Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
countSpaces	TokenNameIdentifier	 count Spaces
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\t'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
colNextTab	TokenNameIdentifier	 col Next Tab
;	TokenNameSEMICOLON	
numTabs	TokenNameIdentifier	 num Tabs
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
countSpaces	TokenNameIdentifier	 count Spaces
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
colNextTab	TokenNameIdentifier	 col Next Tab
+=	TokenNamePLUS_EQUAL	
tabLength	TokenNameIdentifier	 tab Length
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
scanWhitespace	TokenNameIdentifier	 scan Whitespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
countSpaces	TokenNameIdentifier	 count Spaces
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
columnNumber	TokenNameIdentifier	 column Number
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
numTabs	TokenNameIdentifier	 num Tabs
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
columnNumber	TokenNameIdentifier	 column Number
-=	TokenNameMINUS_EQUAL	
tabLength	TokenNameIdentifier	 tab Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
' '	TokenNameCharacterLiteral	
:	TokenNameCOLON	
columnNumber	TokenNameIdentifier	 column Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\t'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
tabLength	TokenNameIdentifier	 tab Length
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// Fall tru 	TokenNameCOMMENT_LINE	Fall tru 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\t'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
columnNumber	TokenNameIdentifier	 column Number
+	TokenNamePLUS	
tabLength	TokenNameIdentifier	 tab Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
tabLength	TokenNameIdentifier	 tab Length
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
tabLength	TokenNameIdentifier	 tab Length
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
columnNumber	TokenNameIdentifier	 column Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
RemoveTabFilter	TokenNameIdentifier	 Remove Tab Filter
extends	TokenNameextends	
SimpleFilterReader	TokenNameIdentifier	 Simple Filter Reader
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
tabLength	TokenNameIdentifier	 tab Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RemoveTabFilter	TokenNameIdentifier	 Remove Tab Filter
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
int	TokenNameint	
tabLength	TokenNameIdentifier	 tab Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tabLength	TokenNameIdentifier	 tab Length
=	TokenNameEQUAL	
tabLength	TokenNameIdentifier	 tab Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'\r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\t'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
int	TokenNameint	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
tabLength	TokenNameIdentifier	 tab Length
-	TokenNameMINUS	
columnNumber	TokenNameIdentifier	 column Number
%	TokenNameREMAINDER	
tabLength	TokenNameIdentifier	 tab Length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
editsBlocked	TokenNameIdentifier	 edits Blocked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
width	TokenNameIdentifier	 width
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
width	TokenNameIdentifier	 width
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
' '	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
columnNumber	TokenNameIdentifier	 column Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Enumerated attribute with the values "asis", "add" and "remove". */	TokenNameCOMMENT_JAVADOC	 Enumerated attribute with the values "asis", "add" and "remove". 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
ASIS	TokenNameIdentifier	 ASIS
=	TokenNameEQUAL	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
"asis"	TokenNameStringLiteral	asis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
ADD	TokenNameIdentifier	 ADD
=	TokenNameEQUAL	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
"add"	TokenNameStringLiteral	add
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
REMOVE	TokenNameIdentifier	 REMOVE
=	TokenNameEQUAL	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
"remove"	TokenNameStringLiteral	remove
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"add"	TokenNameStringLiteral	add
,	TokenNameCOMMA	
"asis"	TokenNameStringLiteral	asis
,	TokenNameCOMMA	
"remove"	TokenNameStringLiteral	remove
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Equality depending in the index. * @param other the object to test equality against. * @return true if the object has the same index as this. */	TokenNameCOMMENT_JAVADOC	 Equality depending in the index. @param other the object to test equality against. @return true if the object has the same index as this. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
&&	TokenNameAND_AND	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Hashcode depending on the index. * @return the index as the hashcode. */	TokenNameCOMMENT_JAVADOC	 Hashcode depending on the index. @return the index as the hashcode. 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ASIS	TokenNameIdentifier	 ASIS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ASIS	TokenNameIdentifier	 ASIS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ADD	TokenNameIdentifier	 ADD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ADD	TokenNameIdentifier	 ADD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
REMOVE	TokenNameIdentifier	 REMOVE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
REMOVE	TokenNameIdentifier	 REMOVE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"No replacement for "	TokenNameStringLiteral	No replacement for 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Works like clone() but doesn't show up in the Javadocs 	TokenNameCOMMENT_LINE	Works like clone() but doesn't show up in the Javadocs 
private	TokenNameprivate	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an instance of this enumerated value based on the string value. * @param value the value to use. * @return an enumerated instance. */	TokenNameCOMMENT_JAVADOC	 Create an instance of this enumerated value based on the string value. @param value the value to use. @return an enumerated instance. 
public	TokenNamepublic	
static	TokenNamestatic	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
AddAsisRemove	TokenNameIdentifier	 Add Asis Remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Enumerated attribute with the values "asis", "cr", "lf" and "crlf". */	TokenNameCOMMENT_JAVADOC	 Enumerated attribute with the values "asis", "cr", "lf" and "crlf". 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
CrLf	TokenNameIdentifier	 Cr Lf
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
CrLf	TokenNameIdentifier	 Cr Lf
ASIS	TokenNameIdentifier	 ASIS
=	TokenNameEQUAL	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
"asis"	TokenNameStringLiteral	asis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
CrLf	TokenNameIdentifier	 Cr Lf
CR	TokenNameIdentifier	 CR
=	TokenNameEQUAL	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
"cr"	TokenNameStringLiteral	cr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
CrLf	TokenNameIdentifier	 Cr Lf
CRLF	TokenNameIdentifier	 CRLF
=	TokenNameEQUAL	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
"crlf"	TokenNameStringLiteral	crlf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
CrLf	TokenNameIdentifier	 Cr Lf
DOS	TokenNameIdentifier	 DOS
=	TokenNameEQUAL	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
"dos"	TokenNameStringLiteral	dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
CrLf	TokenNameIdentifier	 Cr Lf
LF	TokenNameIdentifier	 LF
=	TokenNameEQUAL	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
"lf"	TokenNameStringLiteral	lf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
CrLf	TokenNameIdentifier	 Cr Lf
MAC	TokenNameIdentifier	 MAC
=	TokenNameEQUAL	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
"mac"	TokenNameStringLiteral	mac
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
CrLf	TokenNameIdentifier	 Cr Lf
UNIX	TokenNameIdentifier	 UNIX
=	TokenNameEQUAL	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
"unix"	TokenNameStringLiteral	unix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see EnumeratedAttribute#getValues */	TokenNameCOMMENT_JAVADOC	 @see EnumeratedAttribute#getValues 
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
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"asis"	TokenNameStringLiteral	asis
,	TokenNameCOMMA	
"cr"	TokenNameStringLiteral	cr
,	TokenNameCOMMA	
"lf"	TokenNameStringLiteral	lf
,	TokenNameCOMMA	
"crlf"	TokenNameStringLiteral	crlf
,	TokenNameCOMMA	
"mac"	TokenNameStringLiteral	mac
,	TokenNameCOMMA	
"unix"	TokenNameStringLiteral	unix
,	TokenNameCOMMA	
"dos"	TokenNameStringLiteral	dos
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Equality depending in the index. * @param other the object to test equality against. * @return true if the object has the same index as this. */	TokenNameCOMMENT_JAVADOC	 Equality depending in the index. @param other the object to test equality against. @return true if the object has the same index as this. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
CrLf	TokenNameIdentifier	 Cr Lf
&&	TokenNameAND_AND	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CrLf	TokenNameIdentifier	 Cr Lf
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Hashcode depending on the index. * @return the index as the hashcode. */	TokenNameCOMMENT_JAVADOC	 Hashcode depending on the index. @return the index as the hashcode. 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
CrLf	TokenNameIdentifier	 Cr Lf
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ASIS	TokenNameIdentifier	 ASIS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ASIS	TokenNameIdentifier	 ASIS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
CR	TokenNameIdentifier	 CR
)	TokenNameRPAREN	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
MAC	TokenNameIdentifier	 MAC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CR	TokenNameIdentifier	 CR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
CRLF	TokenNameIdentifier	 CRLF
)	TokenNameRPAREN	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
DOS	TokenNameIdentifier	 DOS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CRLF	TokenNameIdentifier	 CRLF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
LF	TokenNameIdentifier	 LF
)	TokenNameRPAREN	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
UNIX	TokenNameIdentifier	 UNIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LF	TokenNameIdentifier	 LF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"No replacement for "	TokenNameStringLiteral	No replacement for 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Works like clone() but doesn't show up in the Javadocs 	TokenNameCOMMENT_LINE	Works like clone() but doesn't show up in the Javadocs 
private	TokenNameprivate	
CrLf	TokenNameIdentifier	 Cr Lf
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an instance of this enumerated value based on the string value. * @param value the value to use. * @return an enumerated instance. */	TokenNameCOMMENT_JAVADOC	 Create an instance of this enumerated value based on the string value. @param value the value to use. @return an enumerated instance. 
public	TokenNamepublic	
static	TokenNamestatic	
CrLf	TokenNameIdentifier	 Cr Lf
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CrLf	TokenNameIdentifier	 Cr Lf
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
CrLf	TokenNameIdentifier	 Cr Lf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
