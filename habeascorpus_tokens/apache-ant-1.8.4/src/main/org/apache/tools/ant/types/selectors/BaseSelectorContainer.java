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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
BuildException	TokenNameIdentifier	 Build Exception
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
DataType	TokenNameIdentifier	 Data Type
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
.	TokenNameDOT	
modifiedselector	TokenNameIdentifier	 modifiedselector
.	TokenNameDOT	
ModifiedSelector	TokenNameIdentifier	 Modified Selector
;	TokenNameSEMICOLON	
/** * This is the base class for selectors that can contain other selectors. * * @since 1.5 */	TokenNameCOMMENT_JAVADOC	 This is the base class for selectors that can contain other selectors. * @since 1.5 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
BaseSelectorContainer	TokenNameIdentifier	 Base Selector Container
extends	TokenNameextends	
BaseSelector	TokenNameIdentifier	 Base Selector
implements	TokenNameimplements	
SelectorContainer	TokenNameIdentifier	 Selector Container
{	TokenNameLBRACE	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
selectorsList	TokenNameIdentifier	 selectors List
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
BaseSelectorContainer	TokenNameIdentifier	 Base Selector Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Indicates whether there are any selectors here. * @return true if there are selectors */	TokenNameCOMMENT_JAVADOC	 Indicates whether there are any selectors here. @return true if there are selectors 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasSelectors	TokenNameIdentifier	 has Selectors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
!	TokenNameNOT	
(	TokenNameLPAREN	
selectorsList	TokenNameIdentifier	 selectors List
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gives the count of the number of selectors in this container * @return the number of selectors */	TokenNameCOMMENT_JAVADOC	 Gives the count of the number of selectors in this container @return the number of selectors 
public	TokenNamepublic	
int	TokenNameint	
selectorCount	TokenNameIdentifier	 selector Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
selectorsList	TokenNameIdentifier	 selectors List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the set of selectors as an array. * @param p the current project * @return an array of selectors */	TokenNameCOMMENT_JAVADOC	 Returns the set of selectors as an array. @param p the current project @return an array of selectors 
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
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileSelector	TokenNameIdentifier	 File Selector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
FileSelector	TokenNameIdentifier	 File Selector
[	TokenNameLBRACKET	
selectorsList	TokenNameIdentifier	 selectors List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
selectorsList	TokenNameIdentifier	 selectors List
.	TokenNameDOT	
copyInto	TokenNameIdentifier	 copy Into
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an enumerator for accessing the set of selectors. * @return an enumerator for the selectors */	TokenNameCOMMENT_JAVADOC	 Returns an enumerator for accessing the set of selectors. @return an enumerator for the selectors 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
selectorElements	TokenNameIdentifier	 selector Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
selectorsList	TokenNameIdentifier	 selectors List
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert the Selectors within this container to a string. This will * just be a helper class for the subclasses that put their own name * around the contents listed here. * * @return comma separated list of Selectors contained in this one */	TokenNameCOMMENT_JAVADOC	 Convert the Selectors within this container to a string. This will just be a helper class for the subclasses that put their own name around the contents listed here. * @return comma separated list of Selectors contained in this one 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
selectorElements	TokenNameIdentifier	 selector Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
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
selectorsList	TokenNameIdentifier	 selectors List
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChecked	TokenNameIdentifier	 set Checked
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>This implementation validates the container by calling * verifySettings() and then validates each contained selector * provided that the selector implements the validate interface. * </p> * <p>Ordinarily, this will validate all the elements of a selector * container even if the isSelected() method of some elements is * never called. This has two effects:</p> * <ul> * <li>Validation will often occur twice. * <li>Since it is not required that selectors derive from * BaseSelector, there could be selectors in the container whose * error conditions are not detected if their isSelected() call * is never made. * </ul> */	TokenNameCOMMENT_JAVADOC	 <p>This implementation validates the container by calling verifySettings() and then validates each contained selector provided that the selector implements the validate interface. </p> <p>Ordinarily, this will validate all the elements of a selector container even if the isSelected() method of some elements is never called. This has two effects:</p> <ul> <li>Validation will often occur twice. <li>Since it is not required that selectors derive from BaseSelector, there could be selectors in the container whose error conditions are not detected if their isSelected() call is never made. </ul> 
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
verifySettings	TokenNameIdentifier	 verify Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
errmsg	TokenNameIdentifier	 errmsg
=	TokenNameEQUAL	
getError	TokenNameIdentifier	 get Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
errmsg	TokenNameIdentifier	 errmsg
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
errmsg	TokenNameIdentifier	 errmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
selectorElements	TokenNameIdentifier	 selector Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
BaseSelector	TokenNameIdentifier	 Base Selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BaseSelector	TokenNameIdentifier	 Base Selector
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Method that each selector will implement to create their selection * behaviour. This is what makes SelectorContainer abstract. * * @param basedir the base directory the scan is being done from * @param filename the name of the file to check * @param file a java.io.File object for the filename that the selector * can use * @return whether the file should be selected or not */	TokenNameCOMMENT_JAVADOC	 Method that each selector will implement to create their selection behaviour. This is what makes SelectorContainer abstract. * @param basedir the base directory the scan is being done from @param filename the name of the file to check @param file a java.io.File object for the filename that the selector can use @return whether the file should be selected or not 
public	TokenNamepublic	
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
/* Methods below all add specific selectors */	TokenNameCOMMENT_BLOCK	 Methods below all add specific selectors 
/** * add a "Select" selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a "Select" selector entry on the selector list @param selector the selector to add 
public	TokenNamepublic	
void	TokenNamevoid	
addSelector	TokenNameIdentifier	 add Selector
(	TokenNameLPAREN	
SelectSelector	TokenNameIdentifier	 Select Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add an "And" selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add an "And" selector entry on the selector list @param selector the selector to add 
public	TokenNamepublic	
void	TokenNamevoid	
addAnd	TokenNameIdentifier	 add And
(	TokenNameLPAREN	
AndSelector	TokenNameIdentifier	 And Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add an "Or" selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add an "Or" selector entry on the selector list @param selector the selector to add 
public	TokenNamepublic	
void	TokenNamevoid	
addOr	TokenNameIdentifier	 add Or
(	TokenNameLPAREN	
OrSelector	TokenNameIdentifier	 Or Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a "Not" selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a "Not" selector entry on the selector list @param selector the selector to add 
public	TokenNamepublic	
void	TokenNamevoid	
addNot	TokenNameIdentifier	 add Not
(	TokenNameLPAREN	
NotSelector	TokenNameIdentifier	 Not Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a "None" selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a "None" selector entry on the selector list @param selector the selector to add 
public	TokenNamepublic	
void	TokenNamevoid	
addNone	TokenNameIdentifier	 add None
(	TokenNameLPAREN	
NoneSelector	TokenNameIdentifier	 None Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a majority selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a majority selector entry on the selector list @param selector the selector to add 
public	TokenNamepublic	
void	TokenNamevoid	
addMajority	TokenNameIdentifier	 add Majority
(	TokenNameLPAREN	
MajoritySelector	TokenNameIdentifier	 Majority Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a selector date entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a selector date entry on the selector list @param selector the selector to add 
public	TokenNamepublic	
void	TokenNamevoid	
addDate	TokenNameIdentifier	 add Date
(	TokenNameLPAREN	
DateSelector	TokenNameIdentifier	 Date Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a selector size entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a selector size entry on the selector list @param selector the selector to add 
public	TokenNamepublic	
void	TokenNamevoid	
addSize	TokenNameIdentifier	 add Size
(	TokenNameLPAREN	
SizeSelector	TokenNameIdentifier	 Size Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a selector filename entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a selector filename entry on the selector list @param selector the selector to add 
public	TokenNamepublic	
void	TokenNamevoid	
addFilename	TokenNameIdentifier	 add Filename
(	TokenNameLPAREN	
FilenameSelector	TokenNameIdentifier	 Filename Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add an extended selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add an extended selector entry on the selector list @param selector the selector to add 
public	TokenNamepublic	
void	TokenNamevoid	
addCustom	TokenNameIdentifier	 add Custom
(	TokenNameLPAREN	
ExtendSelector	TokenNameIdentifier	 Extend Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a contains selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a contains selector entry on the selector list @param selector the selector to add 
public	TokenNamepublic	
void	TokenNamevoid	
addContains	TokenNameIdentifier	 add Contains
(	TokenNameLPAREN	
ContainsSelector	TokenNameIdentifier	 Contains Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a present selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a present selector entry on the selector list @param selector the selector to add 
public	TokenNamepublic	
void	TokenNamevoid	
addPresent	TokenNameIdentifier	 add Present
(	TokenNameLPAREN	
PresentSelector	TokenNameIdentifier	 Present Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a depth selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a depth selector entry on the selector list @param selector the selector to add 
public	TokenNamepublic	
void	TokenNamevoid	
addDepth	TokenNameIdentifier	 add Depth
(	TokenNameLPAREN	
DepthSelector	TokenNameIdentifier	 Depth Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a depends selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a depends selector entry on the selector list @param selector the selector to add 
public	TokenNamepublic	
void	TokenNamevoid	
addDepend	TokenNameIdentifier	 add Depend
(	TokenNameLPAREN	
DependSelector	TokenNameIdentifier	 Depend Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * adds a different selector to the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 adds a different selector to the selector list @param selector the selector to add 
public	TokenNamepublic	
void	TokenNamevoid	
addDifferent	TokenNameIdentifier	 add Different
(	TokenNameLPAREN	
DifferentSelector	TokenNameIdentifier	 Different Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * adds a type selector to the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 adds a type selector to the selector list @param selector the selector to add 
public	TokenNamepublic	
void	TokenNamevoid	
addType	TokenNameIdentifier	 add Type
(	TokenNameLPAREN	
TypeSelector	TokenNameIdentifier	 Type Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a regular expression selector entry on the selector list * @param selector the selector to add */	TokenNameCOMMENT_JAVADOC	 add a regular expression selector entry on the selector list @param selector the selector to add 
public	TokenNamepublic	
void	TokenNamevoid	
addContainsRegexp	TokenNameIdentifier	 add Contains Regexp
(	TokenNameLPAREN	
ContainsRegexpSelector	TokenNameIdentifier	 Contains Regexp Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add the modified selector * @param selector the selector to add * @since ant 1.6 */	TokenNameCOMMENT_JAVADOC	 add the modified selector @param selector the selector to add @since ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
addModified	TokenNameIdentifier	 add Modified
(	TokenNameLPAREN	
ModifiedSelector	TokenNameIdentifier	 Modified Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addReadable	TokenNameIdentifier	 add Readable
(	TokenNameLPAREN	
ReadableSelector	TokenNameIdentifier	 Readable Selector
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addWritable	TokenNameIdentifier	 add Writable
(	TokenNameLPAREN	
WritableSelector	TokenNameIdentifier	 Writable Selector
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add an arbitary selector * @param selector the selector to add * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 add an arbitary selector @param selector the selector to add @since Ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FileSelector	TokenNameIdentifier	 File Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
stk	TokenNameIdentifier	 stk
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isChecked	TokenNameIdentifier	 is Checked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
stk	TokenNameIdentifier	 stk
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
selectorsList	TokenNameIdentifier	 selectors List
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
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
DataType	TokenNameIdentifier	 Data Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pushAndInvokeCircularReferenceCheck	TokenNameIdentifier	 push And Invoke Circular Reference Check
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DataType	TokenNameIdentifier	 Data Type
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
stk	TokenNameIdentifier	 stk
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
setChecked	TokenNameIdentifier	 set Checked
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
