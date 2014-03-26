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
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
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
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PushbackReader	TokenNameIdentifier	 Pushback Reader
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
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
/** * <p>A Properties collection which preserves comments and whitespace * present in the input stream from which it was loaded.</p> * <p>The class defers the usual work of the <a href="http://java.sun.com/j2se/1.3/docs/api/java/util/Properties.html">java.util.Properties</a> * class to there, but it also keeps track of the contents of the * input stream from which it was loaded (if applicable), so that it can * write out the properties in as close a form as possible to the input.</p> * If no changes occur to property values, the output should be the same * as the input, except for the leading date stamp, as normal for a * properties file. Properties added are appended to the file. Properties * whose values are changed are changed in place. Properties that are * removed are excised. If the <code>removeComments</code> flag is set, * then the comments immediately preceding the property are also removed.</p> * <p>If a second set of properties is loaded into an existing set, the * lines of the second set are added to the end. Note however, that if a * property already stored is present in a stream subsequently loaded, then * that property is removed before the new value is set. For example, * consider the file</p> * <pre> # the first line * alpha=one * * # the second line * beta=two</pre> * <p>This file is loaded, and then the following is also loaded into the * same <code>LayoutPreservingProperties</code> object</p> * <pre> # association * beta=band * * # and finally * gamma=rays</pre> * </p>The resulting collection sequence of logical lines depends on whether * or not <code>removeComments</code> was set at the time the second stream * is loaded. If it is set, then the resulting list of lines is</p> * <pre> # the first line * alpha=one * * # association * beta=band * * # and finally * gamma=rays</pre> * <p>If the flag is not set, then the comment "the second line" is retained, * although the key-value pair <code>beta=two</code> is removed.</p> */	TokenNameCOMMENT_JAVADOC	 <p>A Properties collection which preserves comments and whitespace present in the input stream from which it was loaded.</p> <p>The class defers the usual work of the <a href="http://java.sun.com/j2se/1.3/docs/api/java/util/Properties.html">java.util.Properties</a> class to there, but it also keeps track of the contents of the input stream from which it was loaded (if applicable), so that it can write out the properties in as close a form as possible to the input.</p> If no changes occur to property values, the output should be the same as the input, except for the leading date stamp, as normal for a properties file. Properties added are appended to the file. Properties whose values are changed are changed in place. Properties that are removed are excised. If the <code>removeComments</code> flag is set, then the comments immediately preceding the property are also removed.</p> <p>If a second set of properties is loaded into an existing set, the lines of the second set are added to the end. Note however, that if a property already stored is present in a stream subsequently loaded, then that property is removed before the new value is set. For example, consider the file</p> <pre> # the first line alpha=one * # the second line beta=two</pre> <p>This file is loaded, and then the following is also loaded into the same <code>LayoutPreservingProperties</code> object</p> <pre> # association beta=band * # and finally gamma=rays</pre> </p>The resulting collection sequence of logical lines depends on whether or not <code>removeComments</code> was set at the time the second stream is loaded. If it is set, then the resulting list of lines is</p> <pre> # the first line alpha=one * # association beta=band * # and finally gamma=rays</pre> <p>If the flag is not set, then the comment "the second line" is retained, although the key-value pair <code>beta=two</code> is removed.</p> 
public	TokenNamepublic	
class	TokenNameclass	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
extends	TokenNameextends	
Properties	TokenNameIdentifier	 Properties
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
LS	TokenNameIdentifier	 LS
=	TokenNameEQUAL	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
;	TokenNameSEMICOLON	
/** * Logical lines have escaping and line continuation taken care * of. Comments and blank lines are logical lines; they are not * removed. */	TokenNameCOMMENT_JAVADOC	 Logical lines have escaping and line continuation taken care of. Comments and blank lines are logical lines; they are not removed. 
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
logicalLines	TokenNameIdentifier	 logical Lines
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Position in the <code>logicalLines</code> list, keyed by property name. */	TokenNameCOMMENT_JAVADOC	 Position in the <code>logicalLines</code> list, keyed by property name. 
private	TokenNameprivate	
HashMap	TokenNameIdentifier	 Hash Map
keyedPairLines	TokenNameIdentifier	 keyed Pair Lines
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Flag to indicate that, when we remove a property from the file, we * also want to remove the comments that precede it. */	TokenNameCOMMENT_JAVADOC	 Flag to indicate that, when we remove a property from the file, we also want to remove the comments that precede it. 
private	TokenNameprivate	
boolean	TokenNameboolean	
removeComments	TokenNameIdentifier	 remove Comments
;	TokenNameSEMICOLON	
/** * Create a new, empty, Properties collection, with no defaults. */	TokenNameCOMMENT_JAVADOC	 Create a new, empty, Properties collection, with no defaults. 
public	TokenNamepublic	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new, empty, Properties collection, with the specified defaults. * @param defaults the default property values */	TokenNameCOMMENT_JAVADOC	 Create a new, empty, Properties collection, with the specified defaults. @param defaults the default property values 
public	TokenNamepublic	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
defaults	TokenNameIdentifier	 defaults
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
defaults	TokenNameIdentifier	 defaults
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <code>true</code> if comments are removed along with * properties, or <code>false</code> otherwise. If * <code>true</code>, then when a property is removed, the comment * preceding it in the original file is removed also. * @return <code>true</code> if leading comments are removed when * a property is removed; <code>false</code> otherwise */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if comments are removed along with properties, or <code>false</code> otherwise. If <code>true</code>, then when a property is removed, the comment preceding it in the original file is removed also. @return <code>true</code> if leading comments are removed when a property is removed; <code>false</code> otherwise 
public	TokenNamepublic	
boolean	TokenNameboolean	
isRemoveComments	TokenNameIdentifier	 is Remove Comments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
removeComments	TokenNameIdentifier	 remove Comments
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the behaviour for comments accompanying properties that * are being removed. If <code>true</code>, then when a property * is removed, the comment preceding it in the original file is * removed also. * @param val <code>true</code> if leading comments are to be * removed when a property is removed; <code>false</code> * otherwise */	TokenNameCOMMENT_JAVADOC	 Sets the behaviour for comments accompanying properties that are being removed. If <code>true</code>, then when a property is removed, the comment preceding it in the original file is removed also. @param val <code>true</code> if leading comments are to be removed when a property is removed; <code>false</code> otherwise 
public	TokenNamepublic	
void	TokenNamevoid	
setRemoveComments	TokenNameIdentifier	 set Remove Comments
(	TokenNameLPAREN	
boolean	TokenNameboolean	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeComments	TokenNameIdentifier	 remove Comments
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inStream	TokenNameIdentifier	 in Stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
readLines	TokenNameIdentifier	 read Lines
(	TokenNameLPAREN	
inStream	TokenNameIdentifier	 in Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ba	TokenNameIdentifier	 ba
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
ResourceUtils	TokenNameIdentifier	 Resource Utils
.	TokenNameDOT	
ISO_8859_1	TokenNameIdentifier	 ISO 8859 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
bais	TokenNameIdentifier	 bais
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
ba	TokenNameIdentifier	 ba
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
throws	TokenNamethrows	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the above call will have failed if key or value are null 	TokenNameCOMMENT_LINE	the above call will have failed if key or value are null 
innerSetProperty	TokenNameIdentifier	 inner Set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the above call will have failed if key or value are null 	TokenNameCOMMENT_LINE	the above call will have failed if key or value are null 
innerSetProperty	TokenNameIdentifier	 inner Set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Store a new key-value pair, or add a new one. The normal * functionality is taken care of by the superclass in the call to * {@link #setProperty}; this method takes care of this classes * extensions. * @param key the key of the property to be stored * @param value the value to be stored */	TokenNameCOMMENT_JAVADOC	 Store a new key-value pair, or add a new one. The normal functionality is taken care of by the superclass in the call to {@link #setProperty}; this method takes care of this classes extensions. @param key the key of the property to be stored @param value the value to be stored 
private	TokenNameprivate	
void	TokenNamevoid	
innerSetProperty	TokenNameIdentifier	 inner Set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
escapeValue	TokenNameIdentifier	 escape Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
keyedPairLines	TokenNameIdentifier	 keyed Pair Lines
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
keyedPairLines	TokenNameIdentifier	 keyed Pair Lines
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Pair	TokenNameIdentifier	 Pair
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
)	TokenNameRPAREN	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
escapeName	TokenNameIdentifier	 escape Name
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Pair	TokenNameIdentifier	 Pair
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Pair	TokenNameIdentifier	 Pair
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setNew	TokenNameIdentifier	 set New
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keyedPairLines	TokenNameIdentifier	 keyed Pair Lines
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keyedPairLines	TokenNameIdentifier	 keyed Pair Lines
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
keyedPairLines	TokenNameIdentifier	 keyed Pair Lines
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
removeComments	TokenNameIdentifier	 remove Comments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeCommentsEndingAt	TokenNameIdentifier	 remove Comments Ending At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
dolly	TokenNameIdentifier	 dolly
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dolly	TokenNameIdentifier	 dolly
.	TokenNameDOT	
keyedPairLines	TokenNameIdentifier	 keyed Pair Lines
=	TokenNameEQUAL	
(	TokenNameLPAREN	
HashMap	TokenNameIdentifier	 Hash Map
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
keyedPairLines	TokenNameIdentifier	 keyed Pair Lines
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dolly	TokenNameIdentifier	 dolly
.	TokenNameDOT	
logicalLines	TokenNameIdentifier	 logical Lines
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
dolly	TokenNameIdentifier	 dolly
.	TokenNameDOT	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogicalLine	TokenNameIdentifier	 Logical Line
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LogicalLine	TokenNameIdentifier	 Logical Line
)	TokenNameRPAREN	
dolly	TokenNameIdentifier	 dolly
.	TokenNameDOT	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
instanceof	TokenNameinstanceof	
Pair	TokenNameIdentifier	 Pair
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Pair	TokenNameIdentifier	 Pair
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
)	TokenNameRPAREN	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
dolly	TokenNameIdentifier	 dolly
.	TokenNameDOT	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// no reason to clone other lines are they are immutable 	TokenNameCOMMENT_LINE	no reason to clone other lines are they are immutable 
}	TokenNameRBRACE	
return	TokenNamereturn	
dolly	TokenNameIdentifier	 dolly
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Echo the lines of the properties (including blanks and comments) to the * stream. * @param out the stream to write to */	TokenNameCOMMENT_JAVADOC	 Echo the lines of the properties (including blanks and comments) to the stream. @param out the stream to write to 
public	TokenNamepublic	
void	TokenNamevoid	
listLines	TokenNameIdentifier	 list Lines
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"-- logical lines --"	TokenNameStringLiteral	-- logical lines --
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogicalLine	TokenNameIdentifier	 Logical Line
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LogicalLine	TokenNameIdentifier	 Logical Line
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
instanceof	TokenNameinstanceof	
Blank	TokenNameIdentifier	 Blank
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"blank: ""	TokenNameStringLiteral	blank: "
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
instanceof	TokenNameinstanceof	
Comment	TokenNameIdentifier	 Comment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"comment: ""	TokenNameStringLiteral	comment: "
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
instanceof	TokenNameinstanceof	
Pair	TokenNameIdentifier	 Pair
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"pair: ""	TokenNameStringLiteral	pair: "
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Save the properties to a file. * @param dest the file to write to */	TokenNameCOMMENT_JAVADOC	 Save the properties to a file. @param dest the file to write to 
public	TokenNamepublic	
void	TokenNamevoid	
saveAs	TokenNameIdentifier	 save As
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FileOutputStream	TokenNameIdentifier	 File Output Stream
fos	TokenNameIdentifier	 fos
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
store	TokenNameIdentifier	 store
(	TokenNameLPAREN	
fos	TokenNameIdentifier	 fos
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fos	TokenNameIdentifier	 fos
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
store	TokenNameIdentifier	 store
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
osw	TokenNameIdentifier	 osw
=	TokenNameEQUAL	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
ResourceUtils	TokenNameIdentifier	 Resource Utils
.	TokenNameDOT	
ISO_8859_1	TokenNameIdentifier	 ISO 8859 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
skipLines	TokenNameIdentifier	 skip Lines
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
totalLines	TokenNameIdentifier	 total Lines
=	TokenNameEQUAL	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
osw	TokenNameIdentifier	 osw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"#"	TokenNameStringLiteral	#
+	TokenNamePLUS	
header	TokenNameIdentifier	 header
+	TokenNamePLUS	
LS	TokenNameIdentifier	 LS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
totalLines	TokenNameIdentifier	 total Lines
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
Comment	TokenNameIdentifier	 Comment
&&	TokenNameAND_AND	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
skipLines	TokenNameIdentifier	 skip Lines
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// we may be updatiung a file written by this class, replace 	TokenNameCOMMENT_LINE	we may be updatiung a file written by this class, replace 
// the date comment instead of adding a new one and preserving 	TokenNameCOMMENT_LINE	the date comment instead of adding a new one and preserving 
// the one written last time 	TokenNameCOMMENT_LINE	the one written last time 
if	TokenNameif	
(	TokenNameLPAREN	
totalLines	TokenNameIdentifier	 total Lines
>	TokenNameGREATER	
skipLines	TokenNameIdentifier	 skip Lines
&&	TokenNameAND_AND	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
skipLines	TokenNameIdentifier	 skip Lines
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
Comment	TokenNameIdentifier	 Comment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
DateUtils	TokenNameIdentifier	 Date Utils
.	TokenNameDOT	
parseDateFromHeader	TokenNameIdentifier	 parse Date From Header
(	TokenNameLPAREN	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
skipLines	TokenNameIdentifier	 skip Lines
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipLines	TokenNameIdentifier	 skip Lines
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
pe	TokenNameIdentifier	 pe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not an existing date comment 	TokenNameCOMMENT_LINE	not an existing date comment 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
osw	TokenNameIdentifier	 osw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"#"	TokenNameStringLiteral	#
+	TokenNamePLUS	
DateUtils	TokenNameIdentifier	 Date Utils
.	TokenNameDOT	
getDateForHeader	TokenNameIdentifier	 get Date For Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
LS	TokenNameIdentifier	 LS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
writtenSep	TokenNameIdentifier	 written Sep
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
skipLines	TokenNameIdentifier	 skip Lines
,	TokenNameCOMMA	
totalLines	TokenNameIdentifier	 total Lines
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogicalLine	TokenNameIdentifier	 Logical Line
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LogicalLine	TokenNameIdentifier	 Logical Line
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
instanceof	TokenNameinstanceof	
Pair	TokenNameIdentifier	 Pair
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
)	TokenNameRPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
.	TokenNameDOT	
isNew	TokenNameIdentifier	 is New
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
writtenSep	TokenNameIdentifier	 written Sep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
osw	TokenNameIdentifier	 osw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
LS	TokenNameIdentifier	 LS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writtenSep	TokenNameIdentifier	 written Sep
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
osw	TokenNameIdentifier	 osw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
LS	TokenNameIdentifier	 LS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
osw	TokenNameIdentifier	 osw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
LS	TokenNameIdentifier	 LS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
osw	TokenNameIdentifier	 osw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads a properties file into an internally maintained * collection of logical lines (possibly spanning physcial lines), * which make up the comments, blank lines and properties of the * file. * @param is the stream from which to read the data */	TokenNameCOMMENT_JAVADOC	 Reads a properties file into an internally maintained collection of logical lines (possibly spanning physcial lines), which make up the comments, blank lines and properties of the file. @param is the stream from which to read the data 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
readLines	TokenNameIdentifier	 read Lines
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
isr	TokenNameIdentifier	 isr
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
ResourceUtils	TokenNameIdentifier	 Resource Utils
.	TokenNameDOT	
ISO_8859_1	TokenNameIdentifier	 ISO 8859 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PushbackReader	TokenNameIdentifier	 Pushback Reader
pbr	TokenNameIdentifier	 pbr
=	TokenNameEQUAL	
new	TokenNamenew	
PushbackReader	TokenNameIdentifier	 Pushback Reader
(	TokenNameLPAREN	
isr	TokenNameIdentifier	 isr
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we add a blank line for spacing 	TokenNameCOMMENT_LINE	we add a blank line for spacing 
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Blank	TokenNameIdentifier	 Blank
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
readFirstLine	TokenNameIdentifier	 read First Line
(	TokenNameLPAREN	
pbr	TokenNameIdentifier	 pbr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedReader	TokenNameIdentifier	 Buffered Reader
br	TokenNameIdentifier	 br
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
pbr	TokenNameIdentifier	 pbr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
continuation	TokenNameIdentifier	 continuation
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
comment	TokenNameIdentifier	 comment
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
fileBuffer	TokenNameIdentifier	 file Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
logicalLineBuffer	TokenNameIdentifier	 logical Line Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fileBuffer	TokenNameIdentifier	 file Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
LS	TokenNameIdentifier	 LS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
continuation	TokenNameIdentifier	 continuation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// put in the line feed that was removed 	TokenNameCOMMENT_LINE	put in the line feed that was removed 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// could be a comment, if first non-whitespace is a # or ! 	TokenNameCOMMENT_LINE	could be a comment, if first non-whitespace is a # or ! 
comment	TokenNameIdentifier	 comment
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"^( | | )*(#|!).*"	TokenNameStringLiteral	^( | | )*(#|!).*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// continuation if not a comment and the line ends is an 	TokenNameCOMMENT_LINE	continuation if not a comment and the line ends is an 
// odd number of backslashes 	TokenNameCOMMENT_LINE	odd number of backslashes 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continuation	TokenNameIdentifier	 continuation
=	TokenNameEQUAL	
requiresContinuation	TokenNameIdentifier	 requires Continuation
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
logicalLineBuffer	TokenNameIdentifier	 logical Line Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
continuation	TokenNameIdentifier	 continuation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogicalLine	TokenNameIdentifier	 Logical Line
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
new	TokenNamenew	
Comment	TokenNameIdentifier	 Comment
(	TokenNameLPAREN	
logicalLineBuffer	TokenNameIdentifier	 logical Line Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
logicalLineBuffer	TokenNameIdentifier	 logical Line Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
new	TokenNamenew	
Blank	TokenNameIdentifier	 Blank
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
new	TokenNamenew	
Pair	TokenNameIdentifier	 Pair
(	TokenNameLPAREN	
logicalLineBuffer	TokenNameIdentifier	 logical Line Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
unescape	TokenNameIdentifier	 unescape
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
)	TokenNameRPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
keyedPairLines	TokenNameIdentifier	 keyed Pair Lines
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this key is already present, so we remove it and add 	TokenNameCOMMENT_LINE	this key is already present, so we remove it and add 
// the new one 	TokenNameCOMMENT_LINE	the new one 
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
keyedPairLines	TokenNameIdentifier	 keyed Pair Lines
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logicalLineBuffer	TokenNameIdentifier	 logical Line Buffer
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
br	TokenNameIdentifier	 br
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fileBuffer	TokenNameIdentifier	 file Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads the first line and determines the EOL-style of the file * (relies on the style to be consistent, of course). * * <p>Sets LS as a side-effect.</p> * * @return the first line without any line separator, leaves the * reader positioned after the first line separator * * @since Ant 1.8.2 */	TokenNameCOMMENT_JAVADOC	 Reads the first line and determines the EOL-style of the file (relies on the style to be consistent, of course). * <p>Sets LS as a side-effect.</p> * @return the first line without any line separator, leaves the reader positioned after the first line separator * @since Ant 1.8.2 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
readFirstLine	TokenNameIdentifier	 read First Line
(	TokenNameLPAREN	
PushbackReader	TokenNameIdentifier	 Pushback Reader
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasCR	TokenNameIdentifier	 has CR
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// when reaching EOF before the first EOL, assume native line 	TokenNameCOMMENT_LINE	when reaching EOF before the first EOL, assume native line 
// feeds 	TokenNameCOMMENT_LINE	feeds 
LS	TokenNameIdentifier	 LS
=	TokenNameEQUAL	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasCR	TokenNameIdentifier	 has CR
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// line feed is sole CR 	TokenNameCOMMENT_LINE	line feed is sole CR 
r	TokenNameIdentifier	 r
.	TokenNameDOT	
unread	TokenNameIdentifier	 unread
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LS	TokenNameIdentifier	 LS
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
hasCR	TokenNameIdentifier	 has CR
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LS	TokenNameIdentifier	 LS
=	TokenNameEQUAL	
hasCR	TokenNameIdentifier	 has CR
?	TokenNameQUESTION	
" "	TokenNameStringLiteral	 
:	TokenNameCOLON	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
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
/** * Returns <code>true</code> if the line represented by * <code>s</code> is to be continued on the next line of the file, * or <code>false</code> otherwise. * @param s the contents of the line to examine * @return <code>true</code> if the line is to be continued, * <code>false</code> otherwise */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if the line represented by <code>s</code> is to be continued on the next line of the file, or <code>false</code> otherwise. @param s the contents of the line to examine @return <code>true</code> if the line is to be continued, <code>false</code> otherwise 
private	TokenNameprivate	
boolean	TokenNameboolean	
requiresContinuation	TokenNameIdentifier	 requires Continuation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ca	TokenNameIdentifier	 ca
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ca	TokenNameIdentifier	 ca
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// trailing backslashes 	TokenNameCOMMENT_LINE	trailing backslashes 
int	TokenNameint	
tb	TokenNameIdentifier	 tb
=	TokenNameEQUAL	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tb	TokenNameIdentifier	 tb
%	TokenNameREMAINDER	
2	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Unescape the string according to the rules for a Properites * file, as laid out in the docs for <a * href="http://java.sun.com/j2se/1.3/docs/api/java/util/Properties.html">java.util.Properties</a>. * @param s the string to unescape (coming from the source file) * @return the unescaped string */	TokenNameCOMMENT_JAVADOC	 Unescape the string according to the rules for a Properites file, as laid out in the docs for <a href="http://java.sun.com/j2se/1.3/docs/api/java/util/Properties.html">java.util.Properties</a>. @param s the string to unescape (coming from the source file) @return the unescaped string 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
unescape	TokenNameIdentifier	 unescape
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * The following combinations are converted: * \n newline * \r carraige return * \f form feed * \t tab * \\ backslash *  	TokenNameCOMMENT_BLOCK	 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'\n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buffy	TokenNameIdentifier	 buffy
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we have hit out end-of-string marker 	TokenNameCOMMENT_LINE	we have hit out end-of-string marker 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// possibly an escape sequence 	TokenNameCOMMENT_LINE	possibly an escape sequence 
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
buffy	TokenNameIdentifier	 buffy
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
buffy	TokenNameIdentifier	 buffy
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'f'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
buffy	TokenNameIdentifier	 buffy
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\f'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
't'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
buffy	TokenNameIdentifier	 buffy
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'u'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// handle unicode escapes 	TokenNameCOMMENT_LINE	handle unicode escapes 
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
unescapeUnicode	TokenNameIdentifier	 unescape Unicode
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
buffy	TokenNameIdentifier	 buffy
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
buffy	TokenNameIdentifier	 buffy
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffy	TokenNameIdentifier	 buffy
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffy	TokenNameIdentifier	 buffy
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve the unicode character whose code is listed at position * <code>i</code> in the character array <code>ch</code>. * @param ch the character array containing the unicode character code * @return the character extracted */	TokenNameCOMMENT_JAVADOC	 Retrieve the unicode character whose code is listed at position <code>i</code> in the character array <code>ch</code>. @param ch the character array containing the unicode character code @return the character extracted 
private	TokenNameprivate	
char	TokenNamechar	
unescapeUnicode	TokenNameIdentifier	 unescape Unicode
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Escape the string <code>s</code> according to the rules in the * docs for <a * href="http://java.sun.com/j2se/1.3/docs/api/java/util/Properties.html">java.util.Properties</a>. * @param s the string to escape * @return the escaped string */	TokenNameCOMMENT_JAVADOC	 Escape the string <code>s</code> according to the rules in the docs for <a href="http://java.sun.com/j2se/1.3/docs/api/java/util/Properties.html">java.util.Properties</a>. @param s the string to escape @return the escaped string 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
escapeValue	TokenNameIdentifier	 escape Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Escape the string <code>s</code> according to the rules in the * docs for <a * href="http://java.sun.com/j2se/1.3/docs/api/java/util/Properties.html">java.util.Properties</a>. * This method escapes all the whitespace, not just the stuff at * the beginning. * @param s the string to escape * @return the escaped string */	TokenNameCOMMENT_JAVADOC	 Escape the string <code>s</code> according to the rules in the docs for <a href="http://java.sun.com/j2se/1.3/docs/api/java/util/Properties.html">java.util.Properties</a>. This method escapes all the whitespace, not just the stuff at the beginning. @param s the string to escape @return the escaped string 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
escapeName	TokenNameIdentifier	 escape Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Escape the string <code>s</code> according to the rules in the * docs for <a * href="http://java.sun.com/j2se/1.3/docs/api/java/util/Properties.html">java.util.Properties</a>. * @param s the string to escape * @param escapeAllSpaces if <code>true</code> the method escapes * all the spaces, if <code>false</code>, it escapes only the * leading whitespace * @return the escaped string */	TokenNameCOMMENT_JAVADOC	 Escape the string <code>s</code> according to the rules in the docs for <a href="http://java.sun.com/j2se/1.3/docs/api/java/util/Properties.html">java.util.Properties</a>. @param s the string to escape @param escapeAllSpaces if <code>true</code> the method escapes all the spaces, if <code>false</code>, it escapes only the leading whitespace @return the escaped string 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
boolean	TokenNameboolean	
escapeAllSpaces	TokenNameIdentifier	 escape All Spaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
forEscaping	TokenNameIdentifier	 for Escaping
=	TokenNameEQUAL	
" \:=#!"	TokenNameStringLiteral	 \:=#!
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
escaped	TokenNameIdentifier	 escaped
=	TokenNameEQUAL	
"tfrn\:=#!"	TokenNameStringLiteral	tfrn\:=#!
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buffy	TokenNameIdentifier	 buffy
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
leadingSpace	TokenNameIdentifier	 leading Space
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
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
escapeAllSpaces	TokenNameIdentifier	 escape All Spaces
||	TokenNameOR_OR	
leadingSpace	TokenNameIdentifier	 leading Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffy	TokenNameIdentifier	 buffy
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
leadingSpace	TokenNameIdentifier	 leading Space
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
forEscaping	TokenNameIdentifier	 for Escaping
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffy	TokenNameIdentifier	 buffy
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
escaped	TokenNameIdentifier	 escaped
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x0020	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
0x007e	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffy	TokenNameIdentifier	 buffy
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
escapeUnicode	TokenNameIdentifier	 escape Unicode
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffy	TokenNameIdentifier	 buffy
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffy	TokenNameIdentifier	 buffy
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the unicode escape sequence for a character, in the form * \	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
escapeUnicode	TokenNameIdentifier	 escape Unicode
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"\"	TokenNameStringLiteral	\
+	TokenNamePLUS	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
EscapeUnicode	TokenNameIdentifier	 Escape Unicode
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove the comments in the leading up the {@link logicalLines} * list leading up to line <code>pos</code>. * @param pos the line number to which the comments lead */	TokenNameCOMMENT_JAVADOC	 Remove the comments in the leading up the {@link logicalLines} list leading up to line <code>pos</code>. @param pos the line number to which the comments lead 
private	TokenNameprivate	
void	TokenNamevoid	
removeCommentsEndingAt	TokenNameIdentifier	 remove Comments Ending At
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* We want to remove comments preceding this position. Step * back counting blank lines (call this range B1) until we hit * something non-blank. If what we hit is not a comment, then * exit. If what we hit is a comment, then step back counting * comment lines (call this range C1). Nullify lines in C1 and * B1. */	TokenNameCOMMENT_BLOCK	 We want to remove comments preceding this position. Step back counting blank lines (call this range B1) until we hit something non-blank. If what we hit is not a comment, then exit. If what we hit is a comment, then step back counting comment lines (call this range C1). Nullify lines in C1 and B1. 
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// step pos back until it hits something non-blank 	TokenNameCOMMENT_LINE	step pos back until it hits something non-blank 
for	TokenNamefor	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
Blank	TokenNameIdentifier	 Blank
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// if the thing it hits is not a comment, then we have nothing 	TokenNameCOMMENT_LINE	if the thing it hits is not a comment, then we have nothing 
// to remove 	TokenNameCOMMENT_LINE	to remove 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
Comment	TokenNameIdentifier	 Comment
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// step back until we hit the start of the comment 	TokenNameCOMMENT_LINE	step back until we hit the start of the comment 
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
Comment	TokenNameIdentifier	 Comment
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// now we want to delete from pos+1 to end 	TokenNameCOMMENT_LINE	now we want to delete from pos+1 to end 
for	TokenNamefor	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
<=	TokenNameLESS_EQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logicalLines	TokenNameIdentifier	 logical Lines
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A logical line of the properties input stream. */	TokenNameCOMMENT_JAVADOC	 A logical line of the properties input stream. 
private	TokenNameprivate	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
LogicalLine	TokenNameIdentifier	 Logical Line
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LogicalLine	TokenNameIdentifier	 Logical Line
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A blank line of the input stream. */	TokenNameCOMMENT_JAVADOC	 A blank line of the input stream. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
Blank	TokenNameIdentifier	 Blank
extends	TokenNameextends	
LogicalLine	TokenNameIdentifier	 Logical Line
{	TokenNameLBRACE	
public	TokenNamepublic	
Blank	TokenNameIdentifier	 Blank
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A comment line of the input stream. */	TokenNameCOMMENT_JAVADOC	 A comment line of the input stream. 
private	TokenNameprivate	
class	TokenNameclass	
Comment	TokenNameIdentifier	 Comment
extends	TokenNameextends	
LogicalLine	TokenNameIdentifier	 Logical Line
{	TokenNameLBRACE	
public	TokenNamepublic	
Comment	TokenNameIdentifier	 Comment
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A key-value pair from the input stream. This may span more than * one physical line, but it is constitutes as a single logical * line. */	TokenNameCOMMENT_JAVADOC	 A key-value pair from the input stream. This may span more than one physical line, but it is constitutes as a single logical line. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
Pair	TokenNameIdentifier	 Pair
extends	TokenNameextends	
LogicalLine	TokenNameIdentifier	 Logical Line
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
added	TokenNameIdentifier	 added
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Pair	TokenNameIdentifier	 Pair
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parsePair	TokenNameIdentifier	 parse Pair
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Pair	TokenNameIdentifier	 Pair
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"="	TokenNameStringLiteral	=
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"="	TokenNameStringLiteral	=
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isNew	TokenNameIdentifier	 is New
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
added	TokenNameIdentifier	 added
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNew	TokenNameIdentifier	 set New
(	TokenNameLPAREN	
boolean	TokenNameboolean	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
added	TokenNameIdentifier	 added
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
dolly	TokenNameIdentifier	 dolly
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
dolly	TokenNameIdentifier	 dolly
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should be fine 	TokenNameCOMMENT_LINE	should be fine 
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
dolly	TokenNameIdentifier	 dolly
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
parsePair	TokenNameIdentifier	 parse Pair
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// need to find first non-escaped '=', ':', '\t' or ' '. 	TokenNameCOMMENT_LINE	need to find first non-escaped '=', ':', '\t' or ' '. 
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
findFirstSeparator	TokenNameIdentifier	 find First Separator
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// trim leading whitespace only 	TokenNameCOMMENT_LINE	trim leading whitespace only 
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// trim leading whitespace only 	TokenNameCOMMENT_LINE	trim leading whitespace only 
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
stripStart	TokenNameIdentifier	 strip Start
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
stripStart	TokenNameIdentifier	 strip Start
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
findFirstSeparator	TokenNameIdentifier	 find First Separator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Replace double backslashes with underscores so that they don't 	TokenNameCOMMENT_LINE	Replace double backslashes with underscores so that they don't 
// confuse us looking for '\t' or '\=', for example, but they also 	TokenNameCOMMENT_LINE	confuse us looking for '\t' or '\=', for example, but they also 
// don't change the position of other characters 	TokenNameCOMMENT_LINE	don't change the position of other characters 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
"\\\\"	TokenNameStringLiteral	\\\\
,	TokenNameCOMMA	
"__"	TokenNameStringLiteral	__
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Replace single backslashes followed by separators, so we don't 	TokenNameCOMMENT_LINE	Replace single backslashes followed by separators, so we don't 
// pick them up 	TokenNameCOMMENT_LINE	pick them up 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
"\\="	TokenNameStringLiteral	\\=
,	TokenNameCOMMA	
"__"	TokenNameStringLiteral	__
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
"\\:"	TokenNameStringLiteral	\\:
,	TokenNameCOMMA	
"__"	TokenNameStringLiteral	__
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
"\\ "	TokenNameStringLiteral	\\ 
,	TokenNameCOMMA	
"__"	TokenNameStringLiteral	__
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
"\\t"	TokenNameStringLiteral	\\t
,	TokenNameCOMMA	
"__"	TokenNameStringLiteral	__
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now only the unescaped separators are left 	TokenNameCOMMENT_LINE	Now only the unescaped separators are left 
return	TokenNamereturn	
indexOfAny	TokenNameIdentifier	 index Of Any
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
" := "	TokenNameStringLiteral	 := 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
indexOfAny	TokenNameIdentifier	 index Of Any
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
chars	TokenNameIdentifier	 chars
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
