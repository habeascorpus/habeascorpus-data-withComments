package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Fieldable	TokenNameIdentifier	 Fieldable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
FieldInfo	TokenNameIdentifier	 Field Info
.	TokenNameDOT	
IndexOptions	TokenNameIdentifier	 Index Options
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
IndexInput	TokenNameIdentifier	 Index Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
IndexOutput	TokenNameIdentifier	 Index Output
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringHelper	TokenNameIdentifier	 String Helper
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Collection of {@link FieldInfo}s (accessible by number or by name). * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Collection of {@link FieldInfo}s (accessible by number or by name). * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
FieldInfos	TokenNameIdentifier	 Field Infos
implements	TokenNameimplements	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
FieldInfo	TokenNameIdentifier	 Field Info
>	TokenNameGREATER	
{	TokenNameLBRACE	
// Used internally (ie not written to *.fnm files) for pre-2.9 files 	TokenNameCOMMENT_LINE	Used internally (ie not written to *.fnm files) for pre-2.9 files 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMAT_PRE	TokenNameIdentifier	 FORMAT  PRE
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// First used in 2.9; prior to 2.9 there was no format header 	TokenNameCOMMENT_LINE	First used in 2.9; prior to 2.9 there was no format header 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMAT_START	TokenNameIdentifier	 FORMAT  START
=	TokenNameEQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// First used in 3.4: omit only positional information 	TokenNameCOMMENT_LINE	First used in 3.4: omit only positional information 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMAT_OMIT_POSITIONS	TokenNameIdentifier	 FORMAT  OMIT  POSITIONS
=	TokenNameEQUAL	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// whenever you add a new format, make it 1 smaller (negative version logic)! 	TokenNameCOMMENT_LINE	whenever you add a new format, make it 1 smaller (negative version logic)! 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CURRENT_FORMAT	TokenNameIdentifier	 CURRENT  FORMAT
=	TokenNameEQUAL	
FORMAT_OMIT_POSITIONS	TokenNameIdentifier	 FORMAT  OMIT  POSITIONS
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
IS_INDEXED	TokenNameIdentifier	 IS  INDEXED
=	TokenNameEQUAL	
0x1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
STORE_TERMVECTOR	TokenNameIdentifier	 STORE  TERMVECTOR
=	TokenNameEQUAL	
0x2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
OMIT_NORMS	TokenNameIdentifier	 OMIT  NORMS
=	TokenNameEQUAL	
0x10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
STORE_PAYLOADS	TokenNameIdentifier	 STORE  PAYLOADS
=	TokenNameEQUAL	
0x20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
OMIT_TERM_FREQ_AND_POSITIONS	TokenNameIdentifier	 OMIT  TERM  FREQ  AND  POSITIONS
=	TokenNameEQUAL	
0x40	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
OMIT_POSITIONS	TokenNameIdentifier	 OMIT  POSITIONS
=	TokenNameEQUAL	
-	TokenNameMINUS	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FieldInfo	TokenNameIdentifier	 Field Info
>	TokenNameGREATER	
byNumber	TokenNameIdentifier	 by Number
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FieldInfo	TokenNameIdentifier	 Field Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
FieldInfo	TokenNameIdentifier	 Field Info
>	TokenNameGREATER	
byName	TokenNameIdentifier	 by Name
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
FieldInfo	TokenNameIdentifier	 Field Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FieldInfos	TokenNameIdentifier	 Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Construct a FieldInfos object using the directory and the name of the file * IndexInput * @param d The directory to open the IndexInput from * @param name The name of the file to open the IndexInput from in the Directory * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Construct a FieldInfos object using the directory and the name of the file IndexInput @param d The directory to open the IndexInput from @param name The name of the file to open the IndexInput from in the Directory @throws IOException 
public	TokenNamepublic	
FieldInfos	TokenNameIdentifier	 Field Infos
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexInput	TokenNameIdentifier	 Index Input
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
==	TokenNameEQUAL_EQUAL	
FORMAT_PRE	TokenNameIdentifier	 FORMAT  PRE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// LUCENE-1623: FORMAT_PRE (before there was a 	TokenNameCOMMENT_LINE	LUCENE-1623: FORMAT_PRE (before there was a 
// format) may be 2.3.2 (pre-utf8) or 2.4.x (utf8) 	TokenNameCOMMENT_LINE	format) may be 2.3.2 (pre-utf8) or 2.4.x (utf8) 
// encoding; retry with input set to pre-utf8 	TokenNameCOMMENT_LINE	encoding; retry with input set to pre-utf8 
input	TokenNameIdentifier	 input
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
setModifiedUTF8StringsMode	TokenNameIdentifier	 set Modified UT F8 Strings Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byNumber	TokenNameIdentifier	 by Number
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byName	TokenNameIdentifier	 by Name
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ignore any new exception & throw original IOE 	TokenNameCOMMENT_LINE	Ignore any new exception & throw original IOE 
throw	TokenNamethrow	
ioe	TokenNameIdentifier	 ioe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// The IOException cannot be caused by 	TokenNameCOMMENT_LINE	The IOException cannot be caused by 
// LUCENE-1623, so re-throw it 	TokenNameCOMMENT_LINE	LUCENE-1623, so re-throw it 
throw	TokenNamethrow	
ioe	TokenNameIdentifier	 ioe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FieldInfos	TokenNameIdentifier	 Field Infos
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
:	TokenNameCOLON	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a deep clone of this FieldInfos instance. */	TokenNameCOMMENT_JAVADOC	 Returns a deep clone of this FieldInfos instance. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
synchronized	TokenNamesynchronized	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldInfos	TokenNameIdentifier	 Field Infos
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FieldInfos	TokenNameIdentifier	 Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numField	TokenNameIdentifier	 num Field
=	TokenNameEQUAL	
byNumber	TokenNameIdentifier	 by Number
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
numField	TokenNameIdentifier	 num Field
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldInfo	TokenNameIdentifier	 Field Info
fi	TokenNameIdentifier	 fi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FieldInfo	TokenNameIdentifier	 Field Info
)	TokenNameRPAREN	
(	TokenNameLPAREN	
byNumber	TokenNameIdentifier	 by Number
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fis	TokenNameIdentifier	 fis
.	TokenNameDOT	
byNumber	TokenNameIdentifier	 by Number
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fis	TokenNameIdentifier	 fis
.	TokenNameDOT	
byName	TokenNameIdentifier	 by Name
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
fi	TokenNameIdentifier	 fi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fis	TokenNameIdentifier	 fis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Adds field info for a Document. */	TokenNameCOMMENT_JAVADOC	 Adds field info for a Document. 
synchronized	TokenNamesynchronized	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Fieldable	TokenNameIdentifier	 Fieldable
>	TokenNameGREATER	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getFields	TokenNameIdentifier	 get Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
:	TokenNameCOLON	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isTermVectorStored	TokenNameIdentifier	 is Term Vector Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getOmitNorms	TokenNameIdentifier	 get Omit Norms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getIndexOptions	TokenNameIdentifier	 get Index Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns true if any fields do not omitTermFreqAndPositions */	TokenNameCOMMENT_JAVADOC	 Returns true if any fields do not omitTermFreqAndPositions 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasProx	TokenNameIdentifier	 has Prox
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
numFields	TokenNameIdentifier	 num Fields
=	TokenNameEQUAL	
byNumber	TokenNameIdentifier	 by Number
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
numFields	TokenNameIdentifier	 num Fields
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
FieldInfo	TokenNameIdentifier	 Field Info
fi	TokenNameIdentifier	 fi
=	TokenNameEQUAL	
fieldInfo	TokenNameIdentifier	 field Info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
&&	TokenNameAND_AND	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calls 5 parameter add with false for all TermVector parameters. * * @param name The name of the Fieldable * @param isIndexed true if the field is indexed * @see #add(String, boolean, boolean) */	TokenNameCOMMENT_JAVADOC	 Calls 5 parameter add with false for all TermVector parameters. * @param name The name of the Fieldable @param isIndexed true if the field is indexed @see #add(String, boolean, boolean) 
synchronized	TokenNamesynchronized	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isIndexed	TokenNameIdentifier	 is Indexed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
isIndexed	TokenNameIdentifier	 is Indexed
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calls 5 parameter add with false for term vector positions and offsets. * * @param name The name of the field * @param isIndexed true if the field is indexed * @param storeTermVector true if the term vector should be stored */	TokenNameCOMMENT_JAVADOC	 Calls 5 parameter add with false for term vector positions and offsets. * @param name The name of the field @param isIndexed true if the field is indexed @param storeTermVector true if the term vector should be stored 
synchronized	TokenNamesynchronized	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isIndexed	TokenNameIdentifier	 is Indexed
,	TokenNameCOMMA	
boolean	TokenNameboolean	
storeTermVector	TokenNameIdentifier	 store Term Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
isIndexed	TokenNameIdentifier	 is Indexed
,	TokenNameCOMMA	
storeTermVector	TokenNameIdentifier	 store Term Vector
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If the field is not yet known, adds it. If it is known, checks to make * sure that the isIndexed flag is the same as was given previously for this * field. If not - marks it as being indexed. Same goes for the TermVector * parameters. * * @param name The name of the field * @param isIndexed true if the field is indexed * @param storeTermVector true if the term vector should be stored * @param omitNorms true if the norms for the indexed field should be omitted */	TokenNameCOMMENT_JAVADOC	 If the field is not yet known, adds it. If it is known, checks to make sure that the isIndexed flag is the same as was given previously for this field. If not - marks it as being indexed. Same goes for the TermVector parameters. * @param name The name of the field @param isIndexed true if the field is indexed @param storeTermVector true if the term vector should be stored @param omitNorms true if the norms for the indexed field should be omitted 
synchronized	TokenNamesynchronized	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isIndexed	TokenNameIdentifier	 is Indexed
,	TokenNameCOMMA	
boolean	TokenNameboolean	
storeTermVector	TokenNameIdentifier	 store Term Vector
,	TokenNameCOMMA	
boolean	TokenNameboolean	
omitNorms	TokenNameIdentifier	 omit Norms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
isIndexed	TokenNameIdentifier	 is Indexed
,	TokenNameCOMMA	
storeTermVector	TokenNameIdentifier	 store Term Vector
,	TokenNameCOMMA	
omitNorms	TokenNameIdentifier	 omit Norms
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If the field is not yet known, adds it. If it is known, checks to make * sure that the isIndexed flag is the same as was given previously for this * field. If not - marks it as being indexed. Same goes for the TermVector * parameters. * * @param name The name of the field * @param isIndexed true if the field is indexed * @param storeTermVector true if the term vector should be stored * @param omitNorms true if the norms for the indexed field should be omitted * @param storePayloads true if payloads should be stored for this field * @param indexOptions if term freqs should be omitted for this field */	TokenNameCOMMENT_JAVADOC	 If the field is not yet known, adds it. If it is known, checks to make sure that the isIndexed flag is the same as was given previously for this field. If not - marks it as being indexed. Same goes for the TermVector parameters. * @param name The name of the field @param isIndexed true if the field is indexed @param storeTermVector true if the term vector should be stored @param omitNorms true if the norms for the indexed field should be omitted @param storePayloads true if payloads should be stored for this field @param indexOptions if term freqs should be omitted for this field 
synchronized	TokenNamesynchronized	
public	TokenNamepublic	
FieldInfo	TokenNameIdentifier	 Field Info
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isIndexed	TokenNameIdentifier	 is Indexed
,	TokenNameCOMMA	
boolean	TokenNameboolean	
storeTermVector	TokenNameIdentifier	 store Term Vector
,	TokenNameCOMMA	
boolean	TokenNameboolean	
omitNorms	TokenNameIdentifier	 omit Norms
,	TokenNameCOMMA	
boolean	TokenNameboolean	
storePayloads	TokenNameIdentifier	 store Payloads
,	TokenNameCOMMA	
IndexOptions	TokenNameIdentifier	 Index Options
indexOptions	TokenNameIdentifier	 index Options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldInfo	TokenNameIdentifier	 Field Info
fi	TokenNameIdentifier	 fi
=	TokenNameEQUAL	
fieldInfo	TokenNameIdentifier	 field Info
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
addInternal	TokenNameIdentifier	 add Internal
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
isIndexed	TokenNameIdentifier	 is Indexed
,	TokenNameCOMMA	
storeTermVector	TokenNameIdentifier	 store Term Vector
,	TokenNameCOMMA	
omitNorms	TokenNameIdentifier	 omit Norms
,	TokenNameCOMMA	
storePayloads	TokenNameIdentifier	 store Payloads
,	TokenNameCOMMA	
indexOptions	TokenNameIdentifier	 index Options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
isIndexed	TokenNameIdentifier	 is Indexed
,	TokenNameCOMMA	
storeTermVector	TokenNameIdentifier	 store Term Vector
,	TokenNameCOMMA	
omitNorms	TokenNameIdentifier	 omit Norms
,	TokenNameCOMMA	
storePayloads	TokenNameIdentifier	 store Payloads
,	TokenNameCOMMA	
indexOptions	TokenNameIdentifier	 index Options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
||	TokenNameOR_OR	
!	TokenNameNOT	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
storePayloads	TokenNameIdentifier	 store Payloads
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fi	TokenNameIdentifier	 fi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
public	TokenNamepublic	
FieldInfo	TokenNameIdentifier	 Field Info
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FieldInfo	TokenNameIdentifier	 Field Info
fi	TokenNameIdentifier	 fi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
,	TokenNameCOMMA	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
storeTermVector	TokenNameIdentifier	 store Term Vector
,	TokenNameCOMMA	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
omitNorms	TokenNameIdentifier	 omit Norms
,	TokenNameCOMMA	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
storePayloads	TokenNameIdentifier	 store Payloads
,	TokenNameCOMMA	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
FieldInfo	TokenNameIdentifier	 Field Info
addInternal	TokenNameIdentifier	 add Internal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isIndexed	TokenNameIdentifier	 is Indexed
,	TokenNameCOMMA	
boolean	TokenNameboolean	
storeTermVector	TokenNameIdentifier	 store Term Vector
,	TokenNameCOMMA	
boolean	TokenNameboolean	
omitNorms	TokenNameIdentifier	 omit Norms
,	TokenNameCOMMA	
boolean	TokenNameboolean	
storePayloads	TokenNameIdentifier	 store Payloads
,	TokenNameCOMMA	
IndexOptions	TokenNameIdentifier	 Index Options
indexOptions	TokenNameIdentifier	 index Options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
StringHelper	TokenNameIdentifier	 String Helper
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldInfo	TokenNameIdentifier	 Field Info
fi	TokenNameIdentifier	 fi
=	TokenNameEQUAL	
new	TokenNamenew	
FieldInfo	TokenNameIdentifier	 Field Info
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
isIndexed	TokenNameIdentifier	 is Indexed
,	TokenNameCOMMA	
byNumber	TokenNameIdentifier	 by Number
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
storeTermVector	TokenNameIdentifier	 store Term Vector
,	TokenNameCOMMA	
omitNorms	TokenNameIdentifier	 omit Norms
,	TokenNameCOMMA	
storePayloads	TokenNameIdentifier	 store Payloads
,	TokenNameCOMMA	
indexOptions	TokenNameIdentifier	 index Options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byNumber	TokenNameIdentifier	 by Number
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byName	TokenNameIdentifier	 by Name
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
fi	TokenNameIdentifier	 fi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fi	TokenNameIdentifier	 fi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * lookup the number of a field by name. * * @param fieldName field's name * @return number of field, or -1 if it does not exist. */	TokenNameCOMMENT_JAVADOC	 lookup the number of a field by name. * @param fieldName field's name @return number of field, or -1 if it does not exist. 
public	TokenNamepublic	
int	TokenNameint	
fieldNumber	TokenNameIdentifier	 field Number
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldInfo	TokenNameIdentifier	 Field Info
fi	TokenNameIdentifier	 fi
=	TokenNameEQUAL	
fieldInfo	TokenNameIdentifier	 field Info
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
number	TokenNameIdentifier	 number
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
byName	TokenNameIdentifier	 by Name
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the fieldName identified by its number. * * @param fieldNumber * @return the fieldName or an empty string when the field * with the given number doesn't exist. */	TokenNameCOMMENT_JAVADOC	 Return the fieldName identified by its number. * @param fieldNumber @return the fieldName or an empty string when the field with the given number doesn't exist. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
(	TokenNameLPAREN	
int	TokenNameint	
fieldNumber	TokenNameIdentifier	 field Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldInfo	TokenNameIdentifier	 Field Info
fi	TokenNameIdentifier	 fi
=	TokenNameEQUAL	
fieldInfo	TokenNameIdentifier	 field Info
(	TokenNameLPAREN	
fieldNumber	TokenNameIdentifier	 field Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
name	TokenNameIdentifier	 name
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the fieldinfo object referenced by the fieldNumber. * @param fieldNumber * @return the FieldInfo object or null when the given fieldNumber * doesn't exist. */	TokenNameCOMMENT_JAVADOC	 Return the fieldinfo object referenced by the fieldNumber. @param fieldNumber @return the FieldInfo object or null when the given fieldNumber doesn't exist. 
public	TokenNamepublic	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
(	TokenNameLPAREN	
int	TokenNameint	
fieldNumber	TokenNameIdentifier	 field Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fieldNumber	TokenNameIdentifier	 field Number
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
byNumber	TokenNameIdentifier	 by Number
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldNumber	TokenNameIdentifier	 field Number
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
FieldInfo	TokenNameIdentifier	 Field Info
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
byNumber	TokenNameIdentifier	 by Number
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return number of fields */	TokenNameCOMMENT_JAVADOC	 @return number of fields 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
byNumber	TokenNameIdentifier	 by Number
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true if at least one field has any vectors */	TokenNameCOMMENT_JAVADOC	 @return true if at least one field has any vectors 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasVectors	TokenNameIdentifier	 has Vectors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
hasVectors	TokenNameIdentifier	 has Vectors
=	TokenNameEQUAL	
false	TokenNamefalse	
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
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
storeTermVector	TokenNameIdentifier	 store Term Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasVectors	TokenNameIdentifier	 has Vectors
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
hasVectors	TokenNameIdentifier	 has Vectors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexOutput	TokenNameIdentifier	 Index Output
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
IndexOutput	TokenNameIdentifier	 Index Output
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
CURRENT_FORMAT	TokenNameIdentifier	 CURRENT  FORMAT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldInfo	TokenNameIdentifier	 Field Info
fi	TokenNameIdentifier	 fi
=	TokenNameEQUAL	
fieldInfo	TokenNameIdentifier	 field Info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
||	TokenNameOR_OR	
!	TokenNameNOT	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
storePayloads	TokenNameIdentifier	 store Payloads
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
0x0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
)	TokenNameRPAREN	
bits	TokenNameIdentifier	 bits
|=	TokenNameOR_EQUAL	
IS_INDEXED	TokenNameIdentifier	 IS  INDEXED
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
storeTermVector	TokenNameIdentifier	 store Term Vector
)	TokenNameRPAREN	
bits	TokenNameIdentifier	 bits
|=	TokenNameOR_EQUAL	
STORE_TERMVECTOR	TokenNameIdentifier	 STORE  TERMVECTOR
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
omitNorms	TokenNameIdentifier	 omit Norms
)	TokenNameRPAREN	
bits	TokenNameIdentifier	 bits
|=	TokenNameOR_EQUAL	
OMIT_NORMS	TokenNameIdentifier	 OMIT  NORMS
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
storePayloads	TokenNameIdentifier	 store Payloads
)	TokenNameRPAREN	
bits	TokenNameIdentifier	 bits
|=	TokenNameOR_EQUAL	
STORE_PAYLOADS	TokenNameIdentifier	 STORE  PAYLOADS
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_ONLY	TokenNameIdentifier	 DOCS  ONLY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bits	TokenNameIdentifier	 bits
|=	TokenNameOR_EQUAL	
OMIT_TERM_FREQ_AND_POSITIONS	TokenNameIdentifier	 OMIT  TERM  FREQ  AND  POSITIONS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS	TokenNameIdentifier	 DOCS  AND  FREQS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bits	TokenNameIdentifier	 bits
|=	TokenNameOR_EQUAL	
OMIT_POSITIONS	TokenNameIdentifier	 OMIT  POSITIONS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeString	TokenNameIdentifier	 write String
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
firstInt	TokenNameIdentifier	 first Int
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
firstInt	TokenNameIdentifier	 first Int
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This is a real format 	TokenNameCOMMENT_LINE	This is a real format 
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
firstInt	TokenNameIdentifier	 first Int
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
FORMAT_PRE	TokenNameIdentifier	 FORMAT  PRE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
!=	TokenNameNOT_EQUAL	
FORMAT_PRE	TokenNameIdentifier	 FORMAT  PRE
&&	TokenNameAND_AND	
format	TokenNameIdentifier	 format
!=	TokenNameNOT_EQUAL	
FORMAT_START	TokenNameIdentifier	 FORMAT  START
&&	TokenNameAND_AND	
format	TokenNameIdentifier	 format
!=	TokenNameNOT_EQUAL	
FORMAT_OMIT_POSITIONS	TokenNameIdentifier	 FORMAT  OMIT  POSITIONS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
(	TokenNameLPAREN	
"unrecognized format "	TokenNameStringLiteral	unrecognized format 
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
+	TokenNamePLUS	
" in file ""	TokenNameStringLiteral	 in file "
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
==	TokenNameEQUAL_EQUAL	
FORMAT_PRE	TokenNameIdentifier	 FORMAT  PRE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
firstInt	TokenNameIdentifier	 first Int
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//read in the size 	TokenNameCOMMENT_LINE	read in the size 
}	TokenNameRBRACE	
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
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
StringHelper	TokenNameIdentifier	 String Helper
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isIndexed	TokenNameIdentifier	 is Indexed
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
&	TokenNameAND	
IS_INDEXED	TokenNameIdentifier	 IS  INDEXED
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
storeTermVector	TokenNameIdentifier	 store Term Vector
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
&	TokenNameAND	
STORE_TERMVECTOR	TokenNameIdentifier	 STORE  TERMVECTOR
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
omitNorms	TokenNameIdentifier	 omit Norms
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
&	TokenNameAND	
OMIT_NORMS	TokenNameIdentifier	 OMIT  NORMS
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
storePayloads	TokenNameIdentifier	 store Payloads
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
&	TokenNameAND	
STORE_PAYLOADS	TokenNameIdentifier	 STORE  PAYLOADS
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IndexOptions	TokenNameIdentifier	 Index Options
indexOptions	TokenNameIdentifier	 index Options
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
&	TokenNameAND	
OMIT_TERM_FREQ_AND_POSITIONS	TokenNameIdentifier	 OMIT  TERM  FREQ  AND  POSITIONS
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indexOptions	TokenNameIdentifier	 index Options
=	TokenNameEQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_ONLY	TokenNameIdentifier	 DOCS  ONLY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
&	TokenNameAND	
OMIT_POSITIONS	TokenNameIdentifier	 OMIT  POSITIONS
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
<=	TokenNameLESS_EQUAL	
FORMAT_OMIT_POSITIONS	TokenNameIdentifier	 FORMAT  OMIT  POSITIONS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indexOptions	TokenNameIdentifier	 index Options
=	TokenNameEQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS	TokenNameIdentifier	 DOCS  AND  FREQS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
(	TokenNameLPAREN	
"Corrupt fieldinfos, OMIT_POSITIONS set but format="	TokenNameStringLiteral	Corrupt fieldinfos, OMIT_POSITIONS set but format=
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
+	TokenNamePLUS	
" (resource: "	TokenNameStringLiteral	 (resource: 
+	TokenNamePLUS	
input	TokenNameIdentifier	 input
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
indexOptions	TokenNameIdentifier	 index Options
=	TokenNameEQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// LUCENE-3027: past indices were able to write 	TokenNameCOMMENT_LINE	LUCENE-3027: past indices were able to write 
// storePayloads=true when omitTFAP is also true, 	TokenNameCOMMENT_LINE	storePayloads=true when omitTFAP is also true, 
// which is invalid. We correct that, here: 	TokenNameCOMMENT_LINE	which is invalid. We correct that, here: 
if	TokenNameif	
(	TokenNameLPAREN	
indexOptions	TokenNameIdentifier	 index Options
!=	TokenNameNOT_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
storePayloads	TokenNameIdentifier	 store Payloads
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addInternal	TokenNameIdentifier	 add Internal
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
isIndexed	TokenNameIdentifier	 is Indexed
,	TokenNameCOMMA	
storeTermVector	TokenNameIdentifier	 store Term Vector
,	TokenNameCOMMA	
omitNorms	TokenNameIdentifier	 omit Norms
,	TokenNameCOMMA	
storePayloads	TokenNameIdentifier	 store Payloads
,	TokenNameCOMMA	
indexOptions	TokenNameIdentifier	 index Options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
(	TokenNameLPAREN	
"did not read all bytes from file ""	TokenNameStringLiteral	did not read all bytes from file "
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
"": read "	TokenNameStringLiteral	": read 
+	TokenNamePLUS	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" vs size "	TokenNameStringLiteral	 vs size 
+	TokenNamePLUS	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" (resource: "	TokenNameStringLiteral	 (resource: 
+	TokenNamePLUS	
input	TokenNameIdentifier	 input
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
