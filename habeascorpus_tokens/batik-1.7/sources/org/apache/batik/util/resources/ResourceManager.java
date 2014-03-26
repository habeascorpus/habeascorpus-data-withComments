/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
resources	TokenNameIdentifier	 resources
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
/** * This class offers convenience methods to decode * resource bundle entries * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ResourceManager.java 592619 2007-11-07 05:47:24Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class offers convenience methods to decode resource bundle entries * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ResourceManager.java 592619 2007-11-07 05:47:24Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ResourceManager	TokenNameIdentifier	 Resource Manager
{	TokenNameLBRACE	
/** * The managed resource bundle */	TokenNameCOMMENT_JAVADOC	 The managed resource bundle 
protected	TokenNameprotected	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
bundle	TokenNameIdentifier	 bundle
;	TokenNameSEMICOLON	
/** * Creates a new resource manager * @param rb a resource bundle */	TokenNameCOMMENT_JAVADOC	 Creates a new resource manager @param rb a resource bundle 
public	TokenNamepublic	
ResourceManager	TokenNameIdentifier	 Resource Manager
(	TokenNameLPAREN	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
rb	TokenNameIdentifier	 rb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bundle	TokenNameIdentifier	 bundle
=	TokenNameEQUAL	
rb	TokenNameIdentifier	 rb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the string that is mapped with the given key * @param key a key in the resource bundle * @throws MissingResourceException if key is not the name of a resource */	TokenNameCOMMENT_JAVADOC	 Returns the string that is mapped with the given key @param key a key in the resource bundle @throws MissingResourceException if key is not the name of a resource 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
bundle	TokenNameIdentifier	 bundle
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the tokens that compose the string mapped * with the given key. Delimiters (" \t\n\r\f") are not returned. * @param key a key of the resource bundle * @throws MissingResourceException if key is not the name of a resource */	TokenNameCOMMENT_JAVADOC	 Returns the tokens that compose the string mapped with the given key. Delimiters (" \t\n\r\f") are not returned. @param key a key of the resource bundle @throws MissingResourceException if key is not the name of a resource 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getStringList	TokenNameIdentifier	 get String List
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getStringList	TokenNameIdentifier	 get String List
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the tokens that compose the string mapped * with the given key. Delimiters are not returned. * @param key a key of the resource bundle * @param delim the delimiters of the tokens * @throws MissingResourceException if key is not the name of a resource */	TokenNameCOMMENT_JAVADOC	 Returns the tokens that compose the string mapped with the given key. Delimiters are not returned. @param key a key of the resource bundle @param delim the delimiters of the tokens @throws MissingResourceException if key is not the name of a resource 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getStringList	TokenNameIdentifier	 get String List
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
delim	TokenNameIdentifier	 delim
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getStringList	TokenNameIdentifier	 get String List
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
delim	TokenNameIdentifier	 delim
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the tokens that compose the string mapped * with the given key * @param key a key of the resource bundle * @param delim the delimiters of the tokens * @param returnDelims if true, the delimiters are returned in the list * @throws MissingResourceException if key is not the name of a resource */	TokenNameCOMMENT_JAVADOC	 Returns the tokens that compose the string mapped with the given key @param key a key of the resource bundle @param delim the delimiters of the tokens @param returnDelims if true, the delimiters are returned in the list @throws MissingResourceException if key is not the name of a resource 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getStringList	TokenNameIdentifier	 get String List
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
delim	TokenNameIdentifier	 delim
,	TokenNameCOMMA	
boolean	TokenNameboolean	
returnDelims	TokenNameIdentifier	 return Delims
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
delim	TokenNameIdentifier	 delim
,	TokenNameCOMMA	
returnDelims	TokenNameIdentifier	 return Delims
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the boolean mapped with the given key * @param key a key of the resource bundle * @throws MissingResourceException if key is not the name of a resource * @throws ResourceFormatException if the resource is malformed */	TokenNameCOMMENT_JAVADOC	 Returns the boolean mapped with the given key @param key a key of the resource bundle @throws MissingResourceException if key is not the name of a resource @throws ResourceFormatException if the resource is malformed 
public	TokenNamepublic	
boolean	TokenNameboolean	
getBoolean	TokenNameIdentifier	 get Boolean
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
,	TokenNameCOMMA	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"false"	TokenNameStringLiteral	false
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
(	TokenNameLPAREN	
"Malformed boolean"	TokenNameStringLiteral	Malformed boolean
,	TokenNameCOMMA	
bundle	TokenNameIdentifier	 bundle
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the integer mapped with the given string * @param key a key of the resource bundle * @throws MissingResourceException if key is not the name of a resource * @throws ResourceFormatException if the resource is malformed */	TokenNameCOMMENT_JAVADOC	 Returns the integer mapped with the given string @param key a key of the resource bundle @throws MissingResourceException if key is not the name of a resource @throws ResourceFormatException if the resource is malformed 
public	TokenNamepublic	
int	TokenNameint	
getInteger	TokenNameIdentifier	 get Integer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
,	TokenNameCOMMA	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
(	TokenNameLPAREN	
"Malformed integer"	TokenNameStringLiteral	Malformed integer
,	TokenNameCOMMA	
bundle	TokenNameIdentifier	 bundle
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getCharacter	TokenNameIdentifier	 get Character
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
,	TokenNameCOMMA	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
(	TokenNameLPAREN	
"Malformed character"	TokenNameStringLiteral	Malformed character
,	TokenNameCOMMA	
bundle	TokenNameIdentifier	 bundle
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
