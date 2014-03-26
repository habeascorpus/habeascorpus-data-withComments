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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
/** Hashtable implementation that allows delayed construction * of expensive objects * * All operations that need access to the full list of objects * will call initAll() first. Get and put are cheap. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Hashtable implementation that allows delayed construction of expensive objects * All operations that need access to the full list of objects will call initAll() first. Get and put are cheap. * @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
LazyHashtable	TokenNameIdentifier	 Lazy Hashtable
extends	TokenNameextends	
Hashtable	TokenNameIdentifier	 Hashtable
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
protected	TokenNameprotected	
boolean	TokenNameboolean	
initAllDone	TokenNameIdentifier	 init All Done
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** No arg constructor. */	TokenNameCOMMENT_JAVADOC	 No arg constructor. 
public	TokenNamepublic	
LazyHashtable	TokenNameIdentifier	 Lazy Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Used to be part of init. It must be done once - but * we delay it until we do need _all_ tasks. Otherwise we * just get the tasks that we need, and avoid costly init. */	TokenNameCOMMENT_JAVADOC	 Used to be part of init. It must be done once - but we delay it until we do need _all_ tasks. Otherwise we just get the tasks that we need, and avoid costly init. 
protected	TokenNameprotected	
void	TokenNamevoid	
initAll	TokenNameIdentifier	 init All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
initAllDone	TokenNameIdentifier	 init All Done
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
initAllDone	TokenNameIdentifier	 init All Done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a enumeration over the elements. * @return an enumeration. */	TokenNameCOMMENT_JAVADOC	 Get a enumeration over the elements. @return an enumeration. 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initAll	TokenNameIdentifier	 init All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if the table is empty. * @return true if it is. */	TokenNameCOMMENT_JAVADOC	 Check if the table is empty. @return true if it is. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initAll	TokenNameIdentifier	 init All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the size of the table. * @return the size. */	TokenNameCOMMENT_JAVADOC	 Get the size of the table. @return the size. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initAll	TokenNameIdentifier	 init All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if the table contains a particular value. * @param value the value to look for. * @return true if the table contains the value. */	TokenNameCOMMENT_JAVADOC	 Check if the table contains a particular value. @param value the value to look for. @return true if the table contains the value. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initAll	TokenNameIdentifier	 init All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if the table contains a particular key. * @param value the key to look for. * @return true if the table contains key. */	TokenNameCOMMENT_JAVADOC	 Check if the table contains a particular key. @param value the key to look for. @return true if the table contains key. 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initAll	TokenNameIdentifier	 init All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to {@link #contains contains}. * @param value the value to look for. * @return true if the table contains the value. */	TokenNameCOMMENT_JAVADOC	 Delegates to {@link #contains contains}. @param value the value to look for. @return true if the table contains the value. 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsValue	TokenNameIdentifier	 contains Value
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an enumeration over the keys. * @return an enumeration. */	TokenNameCOMMENT_JAVADOC	 Get an enumeration over the keys. @return an enumeration. 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initAll	TokenNameIdentifier	 init All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XXX Unfortunately JDK1.2 adds entrySet(), keySet(), values() - 	TokenNameCOMMENT_LINE	XXX Unfortunately JDK1.2 adds entrySet(), keySet(), values() - 
// implementing this requires a small hack, we can add it later. 	TokenNameCOMMENT_LINE	implementing this requires a small hack, we can add it later. 
}	TokenNameRBRACE	
