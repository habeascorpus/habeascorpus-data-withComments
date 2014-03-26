/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * The <tt>TranscodingHints</tt> class defines a way to pass * transcoding parameters or options to any transcoders. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: TranscodingHints.java 588550 2007-10-26 07:52:41Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 The <tt>TranscodingHints</tt> class defines a way to pass transcoding parameters or options to any transcoders. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: TranscodingHints.java 588550 2007-10-26 07:52:41Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
extends	TokenNameextends	
HashMap	TokenNameIdentifier	 Hash Map
{	TokenNameLBRACE	
/** * Constructs a new empty <tt>TranscodingHints</tt>. */	TokenNameCOMMENT_JAVADOC	 Constructs a new empty <tt>TranscodingHints</tt>. 
public	TokenNamepublic	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new <tt>TranscodingHints</tt> with keys and values * initialized from the specified Map object (which may be null). * * @param init a map of key/value pairs to initialize the hints * or null if the object should be empty */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>TranscodingHints</tt> with keys and values initialized from the specified Map object (which may be null). * @param init a map of key/value pairs to initialize the hints or null if the object should be empty 
public	TokenNamepublic	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
init	TokenNameIdentifier	 init
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
init	TokenNameIdentifier	 init
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
init	TokenNameIdentifier	 init
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns <tt>true</tt> if this <tt>TranscodingHints</tt> contains a * mapping for the specified key, false otherwise. * * @param key key whose present in this <tt>TranscodingHints</tt> * is to be tested. * @exception ClassCastException key is not of type * <tt>TranscodingHints.Key</tt> */	TokenNameCOMMENT_JAVADOC	 Returns <tt>true</tt> if this <tt>TranscodingHints</tt> contains a mapping for the specified key, false otherwise. * @param key key whose present in this <tt>TranscodingHints</tt> is to be tested. @exception ClassCastException key is not of type <tt>TranscodingHints.Key</tt> 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value to which the specified key is mapped. * * @param key a trancoding hint key * @exception ClassCastException key is not of type * <tt>TranscodingHints.Key</tt> */	TokenNameCOMMENT_JAVADOC	 Returns the value to which the specified key is mapped. * @param key a trancoding hint key @exception ClassCastException key is not of type <tt>TranscodingHints.Key</tt> 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Maps the specified <tt>key</tt> to the specified <tt>value</tt> * in this <tt>TranscodingHints</tt> object. * * @param key the trancoding hint key. * @param value the trancoding hint value. * @exception IllegalArgumentException value is not * appropriate for the specified key. * @exception ClassCastException key is not of type * <tt>TranscodingHints.Key</tt> */	TokenNameCOMMENT_JAVADOC	 Maps the specified <tt>key</tt> to the specified <tt>value</tt> in this <tt>TranscodingHints</tt> object. * @param key the trancoding hint key. @param value the trancoding hint value. @exception IllegalArgumentException value is not appropriate for the specified key. @exception ClassCastException key is not of type <tt>TranscodingHints.Key</tt> 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Key	TokenNameIdentifier	 Key
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
.	TokenNameDOT	
isCompatibleValue	TokenNameIdentifier	 is Compatible Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
" incompatible with "	TokenNameStringLiteral	 incompatible with 
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the key and its corresponding value from this * <tt>TranscodingHints</tt> object. * * @param key the trancoding hints key that needs to be removed * @exception ClassCastException key is not of type * <tt>TranscodingHints.Key</tt> */	TokenNameCOMMENT_JAVADOC	 Removes the key and its corresponding value from this <tt>TranscodingHints</tt> object. * @param key the trancoding hints key that needs to be removed @exception ClassCastException key is not of type <tt>TranscodingHints.Key</tt> 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copies all of the keys and corresponding values from the * specified <tt>TranscodingHints</tt> object to this * <tt>TranscodingHints</tt> object. */	TokenNameCOMMENT_JAVADOC	 Copies all of the keys and corresponding values from the specified <tt>TranscodingHints</tt> object to this <tt>TranscodingHints</tt> object. 
public	TokenNamepublic	
void	TokenNamevoid	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copies all of the mappings from the specified <tt>Map</tt> * to this <tt>TranscodingHints</tt>. * * @param m mappings to be stored in this <tt>TranscodingHints</tt>. * @exception ClassCastException key is not of type * <tt>TranscodingHints.Key</tt> */	TokenNameCOMMENT_JAVADOC	 Copies all of the mappings from the specified <tt>Map</tt> to this <tt>TranscodingHints</tt>. * @param m mappings to be stored in this <tt>TranscodingHints</tt>. @exception ClassCastException key is not of type <tt>TranscodingHints.Key</tt> 
public	TokenNamepublic	
void	TokenNamevoid	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
instanceof	TokenNameinstanceof	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
)	TokenNameRPAREN	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Defines the base type of all keys used to control various * aspects of the transcoding operations. */	TokenNameCOMMENT_JAVADOC	 Defines the base type of all keys used to control various aspects of the transcoding operations. 
public	TokenNamepublic	
abstract	TokenNameabstract	
static	TokenNamestatic	
class	TokenNameclass	
Key	TokenNameIdentifier	 Key
{	TokenNameLBRACE	
/** * Constructs a key. */	TokenNameCOMMENT_JAVADOC	 Constructs a key. 
protected	TokenNameprotected	
Key	TokenNameIdentifier	 Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns true if the specified object is a valid value for * this key, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified object is a valid value for this key, false otherwise. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isCompatibleValue	TokenNameIdentifier	 is Compatible Value
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
