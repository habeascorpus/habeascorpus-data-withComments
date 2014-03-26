/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Hashtree2Node.java 475902 2006-11-16 20:03:16Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Hashtree2Node.java 475902 2006-11-16 20:03:16Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * Simple static utility to convert Hashtable to a Node. * * @see org.apache.xalan.xslt.EnvironmentCheck * @see org.apache.xalan.lib.Extensions * @author shane_curcuru@us.ibm.com * @version $Id: Hashtree2Node.java 475902 2006-11-16 20:03:16Z minchau $ * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 Simple static utility to convert Hashtable to a Node. * @see org.apache.xalan.xslt.EnvironmentCheck @see org.apache.xalan.lib.Extensions @author shane_curcuru@us.ibm.com @version $Id: Hashtree2Node.java 475902 2006-11-16 20:03:16Z minchau $ @xsl.usage general 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Hashtree2Node	TokenNameIdentifier	 Hashtree2 Node
{	TokenNameLBRACE	
/** * Convert a Hashtable into a Node tree. * * <p>The hash may have either Hashtables as values (in which * case we recurse) or other values, in which case we print them * as &lt;item> elements, with a 'key' attribute with the value * of the key, and the element contents as the value.</p> * * <p>If args are null we simply return without doing anything. * If we encounter an error, we will attempt to add an 'ERROR' * Element with exception info; if that doesn't work we simply * return without doing anything else byt printStackTrace().</p> * * @param hash to get info from (may have sub-hashtables) * @param name to use as parent element for appended node * futurework could have namespace and prefix as well * @param container Node to append our report to * @param factory Document providing createElement, etc. services */	TokenNameCOMMENT_JAVADOC	 Convert a Hashtable into a Node tree. * <p>The hash may have either Hashtables as values (in which case we recurse) or other values, in which case we print them as &lt;item> elements, with a 'key' attribute with the value of the key, and the element contents as the value.</p> * <p>If args are null we simply return without doing anything. If we encounter an error, we will attempt to add an 'ERROR' Element with exception info; if that doesn't work we simply return without doing anything else byt printStackTrace().</p> * @param hash to get info from (may have sub-hashtables) @param name to use as parent element for appended node futurework could have namespace and prefix as well @param container Node to append our report to @param factory Document providing createElement, etc. services 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
appendHashToNode	TokenNameIdentifier	 append Hash To Node
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
container	TokenNameIdentifier	 container
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Required arguments must not be null 	TokenNameCOMMENT_LINE	Required arguments must not be null 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
container	TokenNameIdentifier	 container
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// name we will provide a default value for 	TokenNameCOMMENT_LINE	name we will provide a default value for 
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
elemName	TokenNameIdentifier	 elem Name
=	TokenNameEQUAL	
"appendHashToNode"	TokenNameStringLiteral	appendHashToNode
;	TokenNameSEMICOLON	
else	TokenNameelse	
elemName	TokenNameIdentifier	 elem Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
hashNode	TokenNameIdentifier	 hash Node
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
hashNode	TokenNameIdentifier	 hash Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
keyStr	TokenNameIdentifier	 key Str
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
instanceof	TokenNameinstanceof	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ensure a pre-order traversal; add this hashes 	TokenNameCOMMENT_LINE	Ensure a pre-order traversal; add this hashes 
// items before recursing to child hashes 	TokenNameCOMMENT_LINE	items before recursing to child hashes 
// Save name and hash in two steps 	TokenNameCOMMENT_LINE	Save name and hash in two steps 
v	TokenNameIdentifier	 v
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
keyStr	TokenNameIdentifier	 key Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Add item to node 	TokenNameCOMMENT_LINE	Add item to node 
Element	TokenNameIdentifier	 Element
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
"item"	TokenNameStringLiteral	item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
,	TokenNameCOMMA	
keyStr	TokenNameIdentifier	 key Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hashNode	TokenNameIdentifier	 hash Node
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
"item"	TokenNameStringLiteral	item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
,	TokenNameCOMMA	
keyStr	TokenNameIdentifier	 key Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
"ERROR: Reading "	TokenNameStringLiteral	ERROR: Reading 
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
" threw: "	TokenNameStringLiteral	 threw: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hashNode	TokenNameIdentifier	 hash Node
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Now go back and do the saved hashes 	TokenNameCOMMENT_LINE	Now go back and do the saved hashes 
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Retrieve name and hash in two steps 	TokenNameCOMMENT_LINE	Retrieve name and hash in two steps 
String	TokenNameIdentifier	 String
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hashtable	TokenNameIdentifier	 Hashtable
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendHashToNode	TokenNameIdentifier	 append Hash To Node
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
hashNode	TokenNameIdentifier	 hash Node
,	TokenNameCOMMA	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ooops, just bail (suggestions for a safe thing 	TokenNameCOMMENT_LINE	Ooops, just bail (suggestions for a safe thing 
// to do in this case appreciated) 	TokenNameCOMMENT_LINE	to do in this case appreciated) 
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
