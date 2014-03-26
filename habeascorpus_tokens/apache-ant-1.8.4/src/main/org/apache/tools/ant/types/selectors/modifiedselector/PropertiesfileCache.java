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
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
.	TokenNameDOT	
modifiedselector	TokenNameIdentifier	 modifiedselector
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
Vector	TokenNameIdentifier	 Vector
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
Properties	TokenNameIdentifier	 Properties
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
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
;	TokenNameSEMICOLON	
/** * Use java.util.Properties for storing the values. * The use of this Cache-implementation requires the use of the parameter * <param name="cache.cachefile" .../> for defining, where to store the * properties file. * * The ModifiedSelector sets the <i>cachefile</i> to the default value * <i>cache.properties</i>. * * Supported <param>s are: * <table> * <tr> * <th>name</th><th>values</th><th>description</th><th>required</th> * </tr> * <tr> * <td> cache.cachefile </td> * <td> <i>path to file</i> </td> * <td> the name of the properties file </td> * <td> yes </td> * </tr> * </table> * * @version 2003-09-13 * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Use java.util.Properties for storing the values. The use of this Cache-implementation requires the use of the parameter <param name="cache.cachefile" .../> for defining, where to store the properties file. * The ModifiedSelector sets the <i>cachefile</i> to the default value <i>cache.properties</i>. * Supported <param>s are: <table> <tr> <th>name</th><th>values</th><th>description</th><th>required</th> </tr> <tr> <td> cache.cachefile </td> <td> <i>path to file</i> </td> <td> the name of the properties file </td> <td> yes </td> </tr> </table> * @version 2003-09-13 @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
PropertiesfileCache	TokenNameIdentifier	 Propertiesfile Cache
implements	TokenNameimplements	
Cache	TokenNameIdentifier	 Cache
{	TokenNameLBRACE	
// ----- member variables - configuration ----- 	TokenNameCOMMENT_LINE	----- member variables - configuration ----- 
/** Where to store the properties? */	TokenNameCOMMENT_JAVADOC	 Where to store the properties? 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
cachefile	TokenNameIdentifier	 cachefile
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Object for storing the key-value-pairs. */	TokenNameCOMMENT_JAVADOC	 Object for storing the key-value-pairs. 
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ----- member variables - internal use ----- 	TokenNameCOMMENT_LINE	----- member variables - internal use ----- 
/** Is the cache already loaded? Prevents from multiple load operations. */	TokenNameCOMMENT_JAVADOC	 Is the cache already loaded? Prevents from multiple load operations. 
private	TokenNameprivate	
boolean	TokenNameboolean	
cacheLoaded	TokenNameIdentifier	 cache Loaded
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Must the cache be saved? Prevents from multiple save operations. */	TokenNameCOMMENT_JAVADOC	 Must the cache be saved? Prevents from multiple save operations. 
private	TokenNameprivate	
boolean	TokenNameboolean	
cacheDirty	TokenNameIdentifier	 cache Dirty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// ----- Constructors ----- 	TokenNameCOMMENT_LINE	----- Constructors ----- 
/** Bean-Constructor. */	TokenNameCOMMENT_JAVADOC	 Bean-Constructor. 
public	TokenNamepublic	
PropertiesfileCache	TokenNameIdentifier	 Propertiesfile Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Constructor. * @param cachefile set the cachefile */	TokenNameCOMMENT_JAVADOC	 Constructor. @param cachefile set the cachefile 
public	TokenNamepublic	
PropertiesfileCache	TokenNameIdentifier	 Propertiesfile Cache
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
cachefile	TokenNameIdentifier	 cachefile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cachefile	TokenNameIdentifier	 cachefile
=	TokenNameEQUAL	
cachefile	TokenNameIdentifier	 cachefile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ----- Cache-Configuration ----- 	TokenNameCOMMENT_LINE	----- Cache-Configuration ----- 
/** * Setter. * @param file new value */	TokenNameCOMMENT_JAVADOC	 Setter. @param file new value 
public	TokenNamepublic	
void	TokenNamevoid	
setCachefile	TokenNameIdentifier	 set Cachefile
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cachefile	TokenNameIdentifier	 cachefile
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Getter. * @return the cachefile */	TokenNameCOMMENT_JAVADOC	 Getter. @return the cachefile 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getCachefile	TokenNameIdentifier	 get Cachefile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cachefile	TokenNameIdentifier	 cachefile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This cache is valid if the cachefile is set. * @return true if all is ok false otherwise */	TokenNameCOMMENT_JAVADOC	 This cache is valid if the cachefile is set. @return true if all is ok false otherwise 
public	TokenNamepublic	
boolean	TokenNameboolean	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
cachefile	TokenNameIdentifier	 cachefile
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ----- Data Access 	TokenNameCOMMENT_LINE	----- Data Access 
/** * Load the cache from underlying properties file. */	TokenNameCOMMENT_JAVADOC	 Load the cache from underlying properties file. 
public	TokenNamepublic	
void	TokenNamevoid	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cachefile	TokenNameIdentifier	 cachefile
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
cachefile	TokenNameIdentifier	 cachefile
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
cachefile	TokenNameIdentifier	 cachefile
.	TokenNameDOT	
canRead	TokenNameIdentifier	 can Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
bis	TokenNameIdentifier	 bis
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
cachefile	TokenNameIdentifier	 cachefile
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
bis	TokenNameIdentifier	 bis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bis	TokenNameIdentifier	 bis
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// after loading the cache is up to date with the file 	TokenNameCOMMENT_LINE	after loading the cache is up to date with the file 
cacheLoaded	TokenNameIdentifier	 cache Loaded
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
cacheDirty	TokenNameIdentifier	 cache Dirty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Saves modification of the cache. * Cache is only saved if there is one ore more entries. * Because entries can not be deleted by this API, this Cache * implementation checks the existence of entries before creating the file * for performance optimisation. */	TokenNameCOMMENT_JAVADOC	 Saves modification of the cache. Cache is only saved if there is one ore more entries. Because entries can not be deleted by this API, this Cache implementation checks the existence of entries before creating the file for performance optimisation. 
public	TokenNamepublic	
void	TokenNamevoid	
save	TokenNameIdentifier	 save
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
cacheDirty	TokenNameIdentifier	 cache Dirty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cachefile	TokenNameIdentifier	 cachefile
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
propertyNames	TokenNameIdentifier	 property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
bos	TokenNameIdentifier	 bos
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
cachefile	TokenNameIdentifier	 cachefile
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
store	TokenNameIdentifier	 store
(	TokenNameLPAREN	
bos	TokenNameIdentifier	 bos
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bos	TokenNameIdentifier	 bos
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bos	TokenNameIdentifier	 bos
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
cacheDirty	TokenNameIdentifier	 cache Dirty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Deletes the cache and its underlying file. */	TokenNameCOMMENT_JAVADOC	 Deletes the cache and its underlying file. 
public	TokenNamepublic	
void	TokenNamevoid	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cachefile	TokenNameIdentifier	 cachefile
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cacheLoaded	TokenNameIdentifier	 cache Loaded
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
cacheDirty	TokenNameIdentifier	 cache Dirty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a value for a given key from the cache. * @param key the key * @return the stored value */	TokenNameCOMMENT_JAVADOC	 Returns a value for a given key from the cache. @param key the key @return the stored value 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
cacheLoaded	TokenNameIdentifier	 cache Loaded
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Saves a key-value-pair in the cache. * @param key the key * @param value the value */	TokenNameCOMMENT_JAVADOC	 Saves a key-value-pair in the cache. @param key the key @param value the value 
public	TokenNamepublic	
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cacheDirty	TokenNameIdentifier	 cache Dirty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an iterator over the keys in the cache. * @return An iterator over the keys. */	TokenNameCOMMENT_JAVADOC	 Returns an iterator over the keys in the cache. @return An iterator over the keys. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
en	TokenNameIdentifier	 en
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
propertyNames	TokenNameIdentifier	 property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
en	TokenNameIdentifier	 en
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
en	TokenNameIdentifier	 en
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ----- additional ----- 	TokenNameCOMMENT_LINE	----- additional ----- 
/** * Override Object.toString(). * @return information about this cache */	TokenNameCOMMENT_JAVADOC	 Override Object.toString(). @return information about this cache 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<PropertiesfileCache:"	TokenNameStringLiteral	<PropertiesfileCache:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"cachefile="	TokenNameStringLiteral	cachefile=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
cachefile	TokenNameIdentifier	 cachefile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
";noOfEntries="	TokenNameStringLiteral	;noOfEntries=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
