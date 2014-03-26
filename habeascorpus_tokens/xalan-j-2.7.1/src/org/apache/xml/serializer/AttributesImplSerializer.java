/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: AttributesImplSerializer.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: AttributesImplSerializer.java 468654 2006-10-28 07:09:23Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
AttributesImpl	TokenNameIdentifier	 Attributes Impl
;	TokenNameSEMICOLON	
/** * This class extends org.xml.sax.helpers.AttributesImpl which implements org. * xml.sax.Attributes. But for optimization this class adds a Hashtable for * faster lookup of an index by qName, which is commonly done in the stream * serializer. * * @see org.xml.sax.Attributes * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class extends org.xml.sax.helpers.AttributesImpl which implements org. xml.sax.Attributes. But for optimization this class adds a Hashtable for faster lookup of an index by qName, which is commonly done in the stream serializer. * @see org.xml.sax.Attributes * @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
AttributesImplSerializer	TokenNameIdentifier	 Attributes Impl Serializer
extends	TokenNameextends	
AttributesImpl	TokenNameIdentifier	 Attributes Impl
{	TokenNameLBRACE	
/** * Hash table of qName/index values to quickly lookup the index * of an attributes qName. qNames are in uppercase in the hash table * to make the search case insensitive. * * The keys to the hashtable to find the index are either * "prefix:localName" or "{uri}localName". */	TokenNameCOMMENT_JAVADOC	 Hash table of qName/index values to quickly lookup the index of an attributes qName. qNames are in uppercase in the hash table to make the search case insensitive. * The keys to the hashtable to find the index are either "prefix:localName" or "{uri}localName". 
private	TokenNameprivate	
final	TokenNamefinal	
Hashtable	TokenNameIdentifier	 Hashtable
m_indexFromQName	TokenNameIdentifier	 m index From Q Name
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
m_buff	TokenNameIdentifier	 m buff
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This is the number of attributes before switching to the hash table, * and can be tuned, but 12 seems good for now - Brian M. */	TokenNameCOMMENT_JAVADOC	 This is the number of attributes before switching to the hash table, and can be tuned, but 12 seems good for now - Brian M. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX	TokenNameIdentifier	 MAX
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * One less than the number of attributes before switching to * the Hashtable. */	TokenNameCOMMENT_JAVADOC	 One less than the number of attributes before switching to the Hashtable. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAXMinus1	TokenNameIdentifier	 MAX Minus1
=	TokenNameEQUAL	
MAX	TokenNameIdentifier	 MAX
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This method gets the index of an attribute given its qName. * @param qname the qualified name of the attribute, e.g. "prefix1:locName1" * @return the integer index of the attribute. * @see org.xml.sax.Attributes#getIndex(String) */	TokenNameCOMMENT_JAVADOC	 This method gets the index of an attribute given its qName. @param qname the qualified name of the attribute, e.g. "prefix1:locName1" @return the integer index of the attribute. @see org.xml.sax.Attributes#getIndex(String) 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
MAX	TokenNameIdentifier	 MAX
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if we haven't got too many attributes let the 	TokenNameCOMMENT_LINE	if we haven't got too many attributes let the 
// super class look it up 	TokenNameCOMMENT_LINE	super class look it up 
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// we have too many attributes and the super class is slow 	TokenNameCOMMENT_LINE	we have too many attributes and the super class is slow 
// so find it quickly using our Hashtable. 	TokenNameCOMMENT_LINE	so find it quickly using our Hashtable. 
Integer	TokenNameIdentifier	 Integer
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
m_indexFromQName	TokenNameIdentifier	 m index From Q Name
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method adds the attribute, but also records its qName/index pair in * the hashtable for fast lookup by getIndex(qName). * @param uri the URI of the attribute * @param local the local name of the attribute * @param qname the qualified name of the attribute * @param type the type of the attribute * @param val the value of the attribute * * @see org.xml.sax.helpers.AttributesImpl#addAttribute(String, String, String, String, String) * @see #getIndex(String) */	TokenNameCOMMENT_JAVADOC	 This method adds the attribute, but also records its qName/index pair in the hashtable for fast lookup by getIndex(qName). @param uri the URI of the attribute @param local the local name of the attribute @param qname the qualified name of the attribute @param type the type of the attribute @param val the value of the attribute * @see org.xml.sax.helpers.AttributesImpl#addAttribute(String, String, String, String, String) @see #getIndex(String) 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
local	TokenNameIdentifier	 local
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
local	TokenNameIdentifier	 local
,	TokenNameCOMMA	
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// (index + 1) is now the number of attributes 	TokenNameCOMMENT_LINE	(index + 1) is now the number of attributes 
// so either compare (index+1) to MAX, or compare index to (MAX-1) 	TokenNameCOMMENT_LINE	so either compare (index+1) to MAX, or compare index to (MAX-1) 
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
MAXMinus1	TokenNameIdentifier	 MAX Minus1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
MAXMinus1	TokenNameIdentifier	 MAX Minus1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switchOverToHash	TokenNameIdentifier	 switch Over To Hash
(	TokenNameLPAREN	
MAX	TokenNameIdentifier	 MAX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
/* add the key with the format of "prefix:localName" */	TokenNameCOMMENT_BLOCK	 add the key with the format of "prefix:localName" 
/* we have just added the attibute, its index is the old length */	TokenNameCOMMENT_BLOCK	 we have just added the attibute, its index is the old length 
Integer	TokenNameIdentifier	 Integer
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_indexFromQName	TokenNameIdentifier	 m index From Q Name
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* now add with key of the format "{uri}localName" */	TokenNameCOMMENT_BLOCK	 now add with key of the format "{uri}localName" 
m_buff	TokenNameIdentifier	 m buff
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_buff	TokenNameIdentifier	 m buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
m_buff	TokenNameIdentifier	 m buff
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_indexFromQName	TokenNameIdentifier	 m index From Q Name
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * We are switching over to having a hash table for quick look * up of attributes, but up until now we haven't kept any * information in the Hashtable, so we now update the Hashtable. * Future additional attributes will update the Hashtable as * they are added. * @param numAtts */	TokenNameCOMMENT_JAVADOC	 We are switching over to having a hash table for quick look up of attributes, but up until now we haven't kept any information in the Hashtable, so we now update the Hashtable. Future additional attributes will update the Hashtable as they are added. @param numAtts 
private	TokenNameprivate	
void	TokenNamevoid	
switchOverToHash	TokenNameIdentifier	 switch Over To Hash
(	TokenNameLPAREN	
int	TokenNameint	
numAtts	TokenNameIdentifier	 num Atts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
numAtts	TokenNameIdentifier	 num Atts
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_indexFromQName	TokenNameIdentifier	 m index From Q Name
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add quick look-up to find with uri/local name pair 	TokenNameCOMMENT_LINE	Add quick look-up to find with uri/local name pair 
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
local	TokenNameIdentifier	 local
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_buff	TokenNameIdentifier	 m buff
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_buff	TokenNameIdentifier	 m buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
m_buff	TokenNameIdentifier	 m buff
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_indexFromQName	TokenNameIdentifier	 m index From Q Name
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method clears the accumulated attributes. * * @see org.xml.sax.helpers.AttributesImpl#clear() */	TokenNameCOMMENT_JAVADOC	 This method clears the accumulated attributes. * @see org.xml.sax.helpers.AttributesImpl#clear() 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
MAX	TokenNameIdentifier	 MAX
<=	TokenNameLESS_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if we have had enough attributes and are 	TokenNameCOMMENT_LINE	if we have had enough attributes and are 
// using the Hashtable, then clear the Hashtable too. 	TokenNameCOMMENT_LINE	using the Hashtable, then clear the Hashtable too. 
m_indexFromQName	TokenNameIdentifier	 m index From Q Name
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method sets the attributes, previous attributes are cleared, * it also keeps the hashtable up to date for quick lookup via * getIndex(qName). * @param atts the attributes to copy into these attributes. * @see org.xml.sax.helpers.AttributesImpl#setAttributes(Attributes) * @see #getIndex(String) */	TokenNameCOMMENT_JAVADOC	 This method sets the attributes, previous attributes are cleared, it also keeps the hashtable up to date for quick lookup via getIndex(qName). @param atts the attributes to copy into these attributes. @see org.xml.sax.helpers.AttributesImpl#setAttributes(Attributes) @see #getIndex(String) 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setAttributes	TokenNameIdentifier	 set Attributes
(	TokenNameLPAREN	
Attributes	TokenNameIdentifier	 Attributes
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setAttributes	TokenNameIdentifier	 set Attributes
(	TokenNameLPAREN	
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we've let the super class add the attributes, but 	TokenNameCOMMENT_LINE	we've let the super class add the attributes, but 
// we need to keep the hash table up to date ourselves for the 	TokenNameCOMMENT_LINE	we need to keep the hash table up to date ourselves for the 
// potentially new qName/index pairs for quick lookup. 	TokenNameCOMMENT_LINE	potentially new qName/index pairs for quick lookup. 
int	TokenNameint	
numAtts	TokenNameIdentifier	 num Atts
=	TokenNameEQUAL	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
MAX	TokenNameIdentifier	 MAX
<=	TokenNameLESS_EQUAL	
numAtts	TokenNameIdentifier	 num Atts
)	TokenNameRPAREN	
switchOverToHash	TokenNameIdentifier	 switch Over To Hash
(	TokenNameLPAREN	
numAtts	TokenNameIdentifier	 num Atts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method gets the index of an attribute given its uri and locanName. * @param uri the URI of the attribute name. * @param localName the local namer (after the ':' ) of the attribute name. * @return the integer index of the attribute. * @see org.xml.sax.Attributes#getIndex(String) */	TokenNameCOMMENT_JAVADOC	 This method gets the index of an attribute given its uri and locanName. @param uri the URI of the attribute name. @param localName the local namer (after the ':' ) of the attribute name. @return the integer index of the attribute. @see org.xml.sax.Attributes#getIndex(String) 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
MAX	TokenNameIdentifier	 MAX
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if we haven't got too many attributes let the 	TokenNameCOMMENT_LINE	if we haven't got too many attributes let the 
// super class look it up 	TokenNameCOMMENT_LINE	super class look it up 
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// we have too many attributes and the super class is slow 	TokenNameCOMMENT_LINE	we have too many attributes and the super class is slow 
// so find it quickly using our Hashtable. 	TokenNameCOMMENT_LINE	so find it quickly using our Hashtable. 
// Form the key of format "{uri}localName" 	TokenNameCOMMENT_LINE	Form the key of format "{uri}localName" 
m_buff	TokenNameIdentifier	 m buff
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_buff	TokenNameIdentifier	 m buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
m_buff	TokenNameIdentifier	 m buff
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
m_indexFromQName	TokenNameIdentifier	 m index From Q Name
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
