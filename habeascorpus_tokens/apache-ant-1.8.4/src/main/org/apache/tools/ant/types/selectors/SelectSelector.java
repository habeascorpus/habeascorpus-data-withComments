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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
Project	TokenNameIdentifier	 Project
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
PropertyHelper	TokenNameIdentifier	 Property Helper
;	TokenNameSEMICOLON	
/** * This selector just holds one other selector and forwards all * requests to it. It exists so that there is a single selector * type that can exist outside of any targets, as an element of * project. It overrides all of the reference stuff so that it * works as expected. Note that this is the only selector you * can reference. * * @since 1.5 */	TokenNameCOMMENT_JAVADOC	 This selector just holds one other selector and forwards all requests to it. It exists so that there is a single selector type that can exist outside of any targets, as an element of project. It overrides all of the reference stuff so that it works as expected. Note that this is the only selector you can reference. * @since 1.5 
public	TokenNamepublic	
class	TokenNameclass	
SelectSelector	TokenNameIdentifier	 Select Selector
extends	TokenNameextends	
BaseSelectorContainer	TokenNameIdentifier	 Base Selector Container
{	TokenNameLBRACE	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
ifCondition	TokenNameIdentifier	 if Condition
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
unlessCondition	TokenNameIdentifier	 unless Condition
;	TokenNameSEMICOLON	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
SelectSelector	TokenNameIdentifier	 Select Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @return a string describing this object */	TokenNameCOMMENT_JAVADOC	 @return a string describing this object 
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
if	TokenNameif	
(	TokenNameLPAREN	
hasSelectors	TokenNameIdentifier	 has Selectors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"{select"	TokenNameStringLiteral	{select
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ifCondition	TokenNameIdentifier	 if Condition
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" if: "	TokenNameStringLiteral	 if: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ifCondition	TokenNameIdentifier	 if Condition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
unlessCondition	TokenNameIdentifier	 unless Condition
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" unless: "	TokenNameStringLiteral	 unless: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
unlessCondition	TokenNameIdentifier	 unless Condition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs the check for circular references and returns the * referenced Selector. */	TokenNameCOMMENT_JAVADOC	 Performs the check for circular references and returns the referenced Selector. 
private	TokenNameprivate	
SelectSelector	TokenNameIdentifier	 Select Selector
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"SelectSelector"	TokenNameStringLiteral	SelectSelector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
SelectSelector	TokenNameIdentifier	 Select Selector
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicates whether there are any selectors here. * @return whether any selectors are in this container */	TokenNameCOMMENT_JAVADOC	 Indicates whether there are any selectors here. @return whether any selectors are in this container 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasSelectors	TokenNameIdentifier	 has Selectors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hasSelectors	TokenNameIdentifier	 has Selectors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
hasSelectors	TokenNameIdentifier	 has Selectors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gives the count of the number of selectors in this container * @return the number of selectors in this container */	TokenNameCOMMENT_JAVADOC	 Gives the count of the number of selectors in this container @return the number of selectors in this container 
public	TokenNamepublic	
int	TokenNameint	
selectorCount	TokenNameIdentifier	 selector Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
selectorCount	TokenNameIdentifier	 selector Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
selectorCount	TokenNameIdentifier	 selector Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the set of selectors as an array. * @param p the current project * @return an array of selectors in this container */	TokenNameCOMMENT_JAVADOC	 Returns the set of selectors as an array. @param p the current project @return an array of selectors in this container 
public	TokenNamepublic	
FileSelector	TokenNameIdentifier	 File Selector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSelectors	TokenNameIdentifier	 get Selectors
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSelectors	TokenNameIdentifier	 get Selectors
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getSelectors	TokenNameIdentifier	 get Selectors
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an enumerator for accessing the set of selectors. * @return an enumerator that goes through each of the selectors */	TokenNameCOMMENT_JAVADOC	 Returns an enumerator for accessing the set of selectors. @return an enumerator that goes through each of the selectors 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
selectorElements	TokenNameIdentifier	 selector Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
selectorElements	TokenNameIdentifier	 selector Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
selectorElements	TokenNameIdentifier	 selector Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a new selector into this container. * * @param selector the new selector to add */	TokenNameCOMMENT_JAVADOC	 Add a new selector into this container. * @param selector the new selector to add 
public	TokenNamepublic	
void	TokenNamevoid	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
FileSelector	TokenNameIdentifier	 File Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Makes sure that there is only one entry, sets an error message if * not. */	TokenNameCOMMENT_JAVADOC	 Makes sure that there is only one entry, sets an error message if not. 
public	TokenNamepublic	
void	TokenNamevoid	
verifySettings	TokenNameIdentifier	 verify Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
cnt	TokenNameIdentifier	 cnt
=	TokenNameEQUAL	
selectorCount	TokenNameIdentifier	 selector Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cnt	TokenNameIdentifier	 cnt
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
cnt	TokenNameIdentifier	 cnt
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Only one selector is allowed within the "	TokenNameStringLiteral	Only one selector is allowed within the 
+	TokenNamePLUS	
"<selector> tag"	TokenNameStringLiteral	<selector> tag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Ensures that the selector passes the conditions placed * on it with <code>if</code> and <code>unless</code>. * @return true if conditions are passed */	TokenNameCOMMENT_JAVADOC	 Ensures that the selector passes the conditions placed on it with <code>if</code> and <code>unless</code>. @return true if conditions are passed 
public	TokenNamepublic	
boolean	TokenNameboolean	
passesConditions	TokenNameIdentifier	 passes Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PropertyHelper	TokenNameIdentifier	 Property Helper
ph	TokenNameIdentifier	 ph
=	TokenNameEQUAL	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
testIfCondition	TokenNameIdentifier	 test If Condition
(	TokenNameLPAREN	
ifCondition	TokenNameIdentifier	 if Condition
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
testUnlessCondition	TokenNameIdentifier	 test Unless Condition
(	TokenNameLPAREN	
unlessCondition	TokenNameIdentifier	 unless Condition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the if attribute to an expression which must evaluate to * true or the name of an existing property for the * selector to select any files. * @param ifProperty the expression to check * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Sets the if attribute to an expression which must evaluate to true or the name of an existing property for the selector to select any files. @param ifProperty the expression to check @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setIf	TokenNameIdentifier	 set If
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
ifProperty	TokenNameIdentifier	 if Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ifCondition	TokenNameIdentifier	 if Condition
=	TokenNameEQUAL	
ifProperty	TokenNameIdentifier	 if Property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the if attribute to an expression which must evaluate to * true or the name of an existing property for the * selector to select any files. * @param ifProperty the expression to check */	TokenNameCOMMENT_JAVADOC	 Sets the if attribute to an expression which must evaluate to true or the name of an existing property for the selector to select any files. @param ifProperty the expression to check 
public	TokenNamepublic	
void	TokenNamevoid	
setIf	TokenNameIdentifier	 set If
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ifProperty	TokenNameIdentifier	 if Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setIf	TokenNameIdentifier	 set If
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
ifProperty	TokenNameIdentifier	 if Property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the unless attribute to an expression which must evaluate to * false or the name of a property which cannot exist for the * selector to select any files. * @param unlessProperty the expression to check * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Sets the unless attribute to an expression which must evaluate to false or the name of a property which cannot exist for the selector to select any files. @param unlessProperty the expression to check @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setUnless	TokenNameIdentifier	 set Unless
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
unlessProperty	TokenNameIdentifier	 unless Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
unlessCondition	TokenNameIdentifier	 unless Condition
=	TokenNameEQUAL	
unlessProperty	TokenNameIdentifier	 unless Property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the unless attribute to an expression which must evaluate to * false or the name of a property which cannot exist for the * selector to select any files. * @param unlessProperty the expression to check */	TokenNameCOMMENT_JAVADOC	 Sets the unless attribute to an expression which must evaluate to false or the name of a property which cannot exist for the selector to select any files. @param unlessProperty the expression to check 
public	TokenNamepublic	
void	TokenNamevoid	
setUnless	TokenNameIdentifier	 set Unless
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
unlessProperty	TokenNameIdentifier	 unless Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setUnless	TokenNameIdentifier	 set Unless
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
unlessProperty	TokenNameIdentifier	 unless Property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true (the file is selected) only if the if property (if any) * exists, the unless property (if any) doesn't exist, and the * contained selector (if any) selects the file. If there is no contained * selector, return true (because we assume that the point was to test * the if and unless conditions). * * @param basedir the base directory the scan is being done from * @param filename the name of the file to check * @param file a java.io.File object for the filename that the selector * can use * @return whether the file should be selected or not */	TokenNameCOMMENT_JAVADOC	 Returns true (the file is selected) only if the if property (if any) exists, the unless property (if any) doesn't exist, and the contained selector (if any) selects the file. If there is no contained selector, return true (because we assume that the point was to test the if and unless conditions). * @param basedir the base directory the scan is being done from @param filename the name of the file to check @param file a java.io.File object for the filename that the selector can use @return whether the file should be selected or not 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Deal with if and unless properties first 	TokenNameCOMMENT_LINE	Deal with if and unless properties first 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
passesConditions	TokenNameIdentifier	 passes Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
selectorElements	TokenNameIdentifier	 selector Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FileSelector	TokenNameIdentifier	 File Selector
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileSelector	TokenNameIdentifier	 File Selector
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
