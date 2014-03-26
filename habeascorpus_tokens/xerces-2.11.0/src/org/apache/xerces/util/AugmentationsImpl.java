/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
Augmentations	TokenNameIdentifier	 Augmentations
;	TokenNameSEMICOLON	
/** * This class provides an implementation for Augmentations interface. * Augmentations interface defines a hashtable of additional data that could * be passed along the document pipeline. The information can contain extra * arguments or infoset augmentations, for example PSVI. This additional * information is identified by a String key. * <p> * * @author Elena Litani, IBM * @version $Id: AugmentationsImpl.java 606488 2007-12-22 20:40:16Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class provides an implementation for Augmentations interface. Augmentations interface defines a hashtable of additional data that could be passed along the document pipeline. The information can contain extra arguments or infoset augmentations, for example PSVI. This additional information is identified by a String key. <p> * @author Elena Litani, IBM @version $Id: AugmentationsImpl.java 606488 2007-12-22 20:40:16Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
AugmentationsImpl	TokenNameIdentifier	 Augmentations Impl
implements	TokenNameimplements	
Augmentations	TokenNameIdentifier	 Augmentations
{	TokenNameLBRACE	
private	TokenNameprivate	
AugmentationsItemsContainer	TokenNameIdentifier	 Augmentations Items Container
fAugmentationsContainer	TokenNameIdentifier	 f Augmentations Container
=	TokenNameEQUAL	
new	TokenNamenew	
SmallContainer	TokenNameIdentifier	 Small Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add additional information identified by a key to the Augmentations structure. * * @param key Identifier, can't be <code>null</code> * @param item Additional information * * @return the previous value of the specified key in the Augmentations strucutre, * or <code>null</code> if it did not have one. */	TokenNameCOMMENT_JAVADOC	 Add additional information identified by a key to the Augmentations structure. * @param key Identifier, can't be <code>null</code> @param item Additional information * @return the previous value of the specified key in the Augmentations strucutre, or <code>null</code> if it did not have one. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
putItem	TokenNameIdentifier	 put Item
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
oldValue	TokenNameIdentifier	 old Value
=	TokenNameEQUAL	
fAugmentationsContainer	TokenNameIdentifier	 f Augmentations Container
.	TokenNameDOT	
putItem	TokenNameIdentifier	 put Item
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldValue	TokenNameIdentifier	 old Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fAugmentationsContainer	TokenNameIdentifier	 f Augmentations Container
.	TokenNameDOT	
isFull	TokenNameIdentifier	 is Full
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAugmentationsContainer	TokenNameIdentifier	 f Augmentations Container
=	TokenNameEQUAL	
fAugmentationsContainer	TokenNameIdentifier	 f Augmentations Container
.	TokenNameDOT	
expand	TokenNameIdentifier	 expand
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
oldValue	TokenNameIdentifier	 old Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get information identified by a key from the Augmentations structure * * @param key Identifier, can't be <code>null</code> * * @return the value to which the key is mapped in the Augmentations structure; * <code>null</code> if the key is not mapped to any value. */	TokenNameCOMMENT_JAVADOC	 Get information identified by a key from the Augmentations structure * @param key Identifier, can't be <code>null</code> * @return the value to which the key is mapped in the Augmentations structure; <code>null</code> if the key is not mapped to any value. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getItem	TokenNameIdentifier	 get Item
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fAugmentationsContainer	TokenNameIdentifier	 f Augmentations Container
.	TokenNameDOT	
getItem	TokenNameIdentifier	 get Item
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove additional info from the Augmentations structure * * @param key Identifier, can't be <code>null</code> */	TokenNameCOMMENT_JAVADOC	 Remove additional info from the Augmentations structure * @param key Identifier, can't be <code>null</code> 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
removeItem	TokenNameIdentifier	 remove Item
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fAugmentationsContainer	TokenNameIdentifier	 f Augmentations Container
.	TokenNameDOT	
removeItem	TokenNameIdentifier	 remove Item
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an enumeration of the keys in the Augmentations structure * */	TokenNameCOMMENT_JAVADOC	 Returns an enumeration of the keys in the Augmentations structure 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fAugmentationsContainer	TokenNameIdentifier	 f Augmentations Container
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove all objects from the Augmentations structure. */	TokenNameCOMMENT_JAVADOC	 Remove all objects from the Augmentations structure. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAllItems	TokenNameIdentifier	 remove All Items
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAugmentationsContainer	TokenNameIdentifier	 f Augmentations Container
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fAugmentationsContainer	TokenNameIdentifier	 f Augmentations Container
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
AugmentationsItemsContainer	TokenNameIdentifier	 Augmentations Items Container
{	TokenNameLBRACE	
abstract	TokenNameabstract	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
putItem	TokenNameIdentifier	 put Item
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getItem	TokenNameIdentifier	 get Item
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
removeItem	TokenNameIdentifier	 remove Item
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
public	TokenNamepublic	
boolean	TokenNameboolean	
isFull	TokenNameIdentifier	 is Full
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
public	TokenNamepublic	
AugmentationsItemsContainer	TokenNameIdentifier	 Augmentations Items Container
expand	TokenNameIdentifier	 expand
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
SmallContainer	TokenNameIdentifier	 Small Container
extends	TokenNameextends	
AugmentationsItemsContainer	TokenNameIdentifier	 Augmentations Items Container
{	TokenNameLBRACE	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
SIZE_LIMIT	TokenNameIdentifier	 SIZE  LIMIT
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fAugmentations	TokenNameIdentifier	 f Augmentations
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
SIZE_LIMIT	TokenNameIdentifier	 SIZE  LIMIT
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
fNumEntries	TokenNameIdentifier	 f Num Entries
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SmallContainerKeyEnumeration	TokenNameIdentifier	 Small Container Key Enumeration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getItem	TokenNameIdentifier	 get Item
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
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
fNumEntries	TokenNameIdentifier	 f Num Entries
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
putItem	TokenNameIdentifier	 put Item
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
item	TokenNameIdentifier	 item
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
fNumEntries	TokenNameIdentifier	 f Num Entries
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
oldValue	TokenNameIdentifier	 old Value
=	TokenNameEQUAL	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
return	TokenNamereturn	
oldValue	TokenNameIdentifier	 old Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
fNumEntries	TokenNameIdentifier	 f Num Entries
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
fNumEntries	TokenNameIdentifier	 f Num Entries
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
fNumEntries	TokenNameIdentifier	 f Num Entries
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
removeItem	TokenNameIdentifier	 remove Item
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
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
fNumEntries	TokenNameIdentifier	 f Num Entries
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
oldValue	TokenNameIdentifier	 old Value
=	TokenNameEQUAL	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
fNumEntries	TokenNameIdentifier	 f Num Entries
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
fNumEntries	TokenNameIdentifier	 f Num Entries
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
fNumEntries	TokenNameIdentifier	 f Num Entries
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fNumEntries	TokenNameIdentifier	 f Num Entries
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
oldValue	TokenNameIdentifier	 old Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
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
fNumEntries	TokenNameIdentifier	 f Num Entries
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fNumEntries	TokenNameIdentifier	 f Num Entries
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isFull	TokenNameIdentifier	 is Full
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fNumEntries	TokenNameIdentifier	 f Num Entries
==	TokenNameEQUAL_EQUAL	
SIZE_LIMIT	TokenNameIdentifier	 SIZE  LIMIT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AugmentationsItemsContainer	TokenNameIdentifier	 Augmentations Items Container
expand	TokenNameIdentifier	 expand
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LargeContainer	TokenNameIdentifier	 Large Container
expandedContainer	TokenNameIdentifier	 expanded Container
=	TokenNameEQUAL	
new	TokenNamenew	
LargeContainer	TokenNameIdentifier	 Large Container
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
fNumEntries	TokenNameIdentifier	 f Num Entries
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expandedContainer	TokenNameIdentifier	 expanded Container
.	TokenNameDOT	
putItem	TokenNameIdentifier	 put Item
(	TokenNameLPAREN	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
expandedContainer	TokenNameIdentifier	 expanded Container
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buff	TokenNameIdentifier	 buff
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"SmallContainer - fNumEntries == "	TokenNameStringLiteral	SmallContainer - fNumEntries == 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fNumEntries	TokenNameIdentifier	 f Num Entries
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
SIZE_LIMIT	TokenNameIdentifier	 SIZE  LIMIT
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" fAugmentations["	TokenNameStringLiteral	 fAugmentations[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"] == "	TokenNameStringLiteral	] == 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"; fAugmentations["	TokenNameStringLiteral	; fAugmentations[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"] == "	TokenNameStringLiteral	] == 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
class	TokenNameclass	
SmallContainerKeyEnumeration	TokenNameIdentifier	 Small Container Key Enumeration
implements	TokenNameimplements	
Enumeration	TokenNameIdentifier	 Enumeration
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
enumArray	TokenNameIdentifier	 enum Array
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
fNumEntries	TokenNameIdentifier	 f Num Entries
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
SmallContainerKeyEnumeration	TokenNameIdentifier	 Small Container Key Enumeration
(	TokenNameLPAREN	
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
fNumEntries	TokenNameIdentifier	 f Num Entries
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
enumArray	TokenNameIdentifier	 enum Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fAugmentations	TokenNameIdentifier	 f Augmentations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
<	TokenNameLESS	
enumArray	TokenNameIdentifier	 enum Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
>=	TokenNameGREATER_EQUAL	
enumArray	TokenNameIdentifier	 enum Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
nextVal	TokenNameIdentifier	 next Val
=	TokenNameEQUAL	
enumArray	TokenNameIdentifier	 enum Array
[	TokenNameLBRACKET	
next	TokenNameIdentifier	 next
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
enumArray	TokenNameIdentifier	 enum Array
[	TokenNameLBRACKET	
next	TokenNameIdentifier	 next
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nextVal	TokenNameIdentifier	 next Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
LargeContainer	TokenNameIdentifier	 Large Container
extends	TokenNameextends	
AugmentationsItemsContainer	TokenNameIdentifier	 Augmentations Items Container
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
HashMap	TokenNameIdentifier	 Hash Map
fAugmentations	TokenNameIdentifier	 f Augmentations
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getItem	TokenNameIdentifier	 get Item
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fAugmentations	TokenNameIdentifier	 f Augmentations
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
putItem	TokenNameIdentifier	 put Item
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fAugmentations	TokenNameIdentifier	 f Augmentations
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
removeItem	TokenNameIdentifier	 remove Item
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fAugmentations	TokenNameIdentifier	 f Augmentations
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
enumeration	TokenNameIdentifier	 enumeration
(	TokenNameLPAREN	
fAugmentations	TokenNameIdentifier	 f Augmentations
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAugmentations	TokenNameIdentifier	 f Augmentations
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isFull	TokenNameIdentifier	 is Full
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AugmentationsItemsContainer	TokenNameIdentifier	 Augmentations Items Container
expand	TokenNameIdentifier	 expand
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buff	TokenNameIdentifier	 buff
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"LargeContainer"	TokenNameStringLiteral	LargeContainer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
fAugmentations	TokenNameIdentifier	 f Augmentations
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
entries	TokenNameIdentifier	 entries
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
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" key == "	TokenNameStringLiteral	 key == 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"; value == "	TokenNameStringLiteral	; value == 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
