/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributedString	TokenNameIdentifier	 Attributed String
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
CharacterIterator	TokenNameIdentifier	 Character Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
StringCharacterIterator	TokenNameIdentifier	 String Character Iterator
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
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** * GVTACIImpl * * Used to implement SVG &lt;tspan&gt; and &lt;text&gt; * attributes. This implementation is designed for efficient support * of per-character attributes (i.e. single character attribute spans). * It supports an extended set of TextAttributes, via inner class * GVTAttributedCharacterIterator.TextAttributes. * * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> * @version $Id: GVTACIImpl.java 476924 2006-11-19 21:13:26Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 GVTACIImpl * Used to implement SVG &lt;tspan&gt; and &lt;text&gt; attributes. This implementation is designed for efficient support of per-character attributes (i.e. single character attribute spans). It supports an extended set of TextAttributes, via inner class GVTAttributedCharacterIterator.TextAttributes. * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> @version $Id: GVTACIImpl.java 476924 2006-11-19 21:13:26Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
GVTACIImpl	TokenNameIdentifier	 GVTACI Impl
implements	TokenNameimplements	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
simpleString	TokenNameIdentifier	 simple String
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
allAttributes	TokenNameIdentifier	 all Attributes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
mapList	TokenNameIdentifier	 map List
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
START_RUN	TokenNameIdentifier	 START  RUN
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
END_RUN	TokenNameIdentifier	 END  RUN
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
MID_RUN	TokenNameIdentifier	 MID  RUN
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
SINGLETON	TokenNameIdentifier	 SINGLETON
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charInRun	TokenNameIdentifier	 char In Run
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharacterIterator	TokenNameIdentifier	 Character Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
currentIndex	TokenNameIdentifier	 current Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Constructs a new GVTAttributedCharacterIterator with no attributes * and a null string. */	TokenNameCOMMENT_JAVADOC	 Constructs a new GVTAttributedCharacterIterator with no attributes and a null string. 
public	TokenNamepublic	
GVTACIImpl	TokenNameIdentifier	 GVTACI Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
simpleString	TokenNameIdentifier	 simple String
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
buildAttributeTables	TokenNameIdentifier	 build Attribute Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a GVTACIImpl whose contents are * equivalent to those of aci. * This constructor creates a new copy of the source data in <tt>aci</tt>. */	TokenNameCOMMENT_JAVADOC	 Constructs a GVTACIImpl whose contents are equivalent to those of aci. This constructor creates a new copy of the source data in <tt>aci</tt>. 
public	TokenNamepublic	
GVTACIImpl	TokenNameIdentifier	 GVTACI Impl
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buildAttributeTables	TokenNameIdentifier	 build Attribute Tables
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets this iterator's contents to an unattributed copy of String s. */	TokenNameCOMMENT_JAVADOC	 Sets this iterator's contents to an unattributed copy of String s. 
public	TokenNamepublic	
void	TokenNamevoid	
setString	TokenNameIdentifier	 set String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
simpleString	TokenNameIdentifier	 simple String
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
new	TokenNamenew	
StringCharacterIterator	TokenNameIdentifier	 String Character Iterator
(	TokenNameLPAREN	
simpleString	TokenNameIdentifier	 simple String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buildAttributeTables	TokenNameIdentifier	 build Attribute Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Assigns this iterator's contents to be equivalent to AttributedString s. */	TokenNameCOMMENT_JAVADOC	 Assigns this iterator's contents to be equivalent to AttributedString s. 
public	TokenNamepublic	
void	TokenNamevoid	
setString	TokenNameIdentifier	 set String
(	TokenNameLPAREN	
AttributedString	TokenNameIdentifier	 Attributed String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getIterator	TokenNameIdentifier	 get Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buildAttributeTables	TokenNameIdentifier	 build Attribute Tables
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets values of a per-character attribute associated with the * content string. * Characters from <tt>beginIndex</tt> to <tt>endIndex</tt> * (zero-offset) are assigned values for attribute key <tt>attr</tt> * from the array <tt>attValues.</tt> * If the length of attValues is less than character span * <tt>(endIndex-beginIndex)</tt> the last value is duplicated; * if attValues is longer than the character span * the extra values are ignored. * Note that if either beginIndex or endIndex are outside the bounds * of the current character array they are clipped accordingly. */	TokenNameCOMMENT_JAVADOC	 Sets values of a per-character attribute associated with the content string. Characters from <tt>beginIndex</tt> to <tt>endIndex</tt> (zero-offset) are assigned values for attribute key <tt>attr</tt> from the array <tt>attValues.</tt> If the length of attValues is less than character span <tt>(endIndex-beginIndex)</tt> the last value is duplicated; if attValues is longer than the character span the extra values are ignored. Note that if either beginIndex or endIndex are outside the bounds of the current character array they are clipped accordingly. 
public	TokenNamepublic	
void	TokenNamevoid	
setAttributeArray	TokenNameIdentifier	 set Attribute Array
(	TokenNameLPAREN	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attValues	TokenNameIdentifier	 att Values
,	TokenNameCOMMA	
int	TokenNameint	
beginIndex	TokenNameIdentifier	 begin Index
,	TokenNameCOMMA	
int	TokenNameint	
endIndex	TokenNameIdentifier	 end Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
beginIndex	TokenNameIdentifier	 begin Index
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
beginIndex	TokenNameIdentifier	 begin Index
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endIndex	TokenNameIdentifier	 end Index
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
endIndex	TokenNameIdentifier	 end Index
,	TokenNameCOMMA	
simpleString	TokenNameIdentifier	 simple String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
charInRun	TokenNameIdentifier	 char In Run
[	TokenNameLBRACKET	
beginIndex	TokenNameIdentifier	 begin Index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
END_RUN	TokenNameIdentifier	 END  RUN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
charInRun	TokenNameIdentifier	 char In Run
[	TokenNameLBRACKET	
beginIndex	TokenNameIdentifier	 begin Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
MID_RUN	TokenNameIdentifier	 MID  RUN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charInRun	TokenNameIdentifier	 char In Run
[	TokenNameLBRACKET	
beginIndex	TokenNameIdentifier	 begin Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
END_RUN	TokenNameIdentifier	 END  RUN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
charInRun	TokenNameIdentifier	 char In Run
[	TokenNameLBRACKET	
beginIndex	TokenNameIdentifier	 begin Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
SINGLETON	TokenNameIdentifier	 SINGLETON
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
charInRun	TokenNameIdentifier	 char In Run
[	TokenNameLBRACKET	
endIndex	TokenNameIdentifier	 end Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
END_RUN	TokenNameIdentifier	 END  RUN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charInRun	TokenNameIdentifier	 char In Run
[	TokenNameLBRACKET	
endIndex	TokenNameIdentifier	 end Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
SINGLETON	TokenNameIdentifier	 SINGLETON
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
charInRun	TokenNameIdentifier	 char In Run
[	TokenNameLBRACKET	
endIndex	TokenNameIdentifier	 end Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
MID_RUN	TokenNameIdentifier	 MID  RUN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charInRun	TokenNameIdentifier	 char In Run
[	TokenNameLBRACKET	
endIndex	TokenNameIdentifier	 end Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
START_RUN	TokenNameIdentifier	 START  RUN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
beginIndex	TokenNameIdentifier	 begin Index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
endIndex	TokenNameIdentifier	 end Index
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charInRun	TokenNameIdentifier	 char In Run
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
SINGLETON	TokenNameIdentifier	 SINGLETON
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
attValues	TokenNameIdentifier	 att Values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
)	TokenNameRPAREN	
mapList	TokenNameIdentifier	 map List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
attValues	TokenNameIdentifier	 att Values
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//From java.text.AttributedCharacterIterator 	TokenNameCOMMENT_LINE	From java.text.AttributedCharacterIterator 
/** * Get the keys of all attributes defined on the iterator's text range. */	TokenNameCOMMENT_JAVADOC	 Get the keys of all attributes defined on the iterator's text range. 
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
getAllAttributeKeys	TokenNameIdentifier	 get All Attribute Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
allAttributes	TokenNameIdentifier	 all Attributes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the value of the named attribute for the current * character. */	TokenNameCOMMENT_JAVADOC	 Get the value of the named attribute for the current character. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a map with the attributes defined on the current * character. */	TokenNameCOMMENT_JAVADOC	 Returns a map with the attributes defined on the current character. 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
)	TokenNameRPAREN	
mapList	TokenNameIdentifier	 map List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currentIndex	TokenNameIdentifier	 current Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the first character following the * run with respect to all attributes containing the current * character. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character following the run with respect to all attributes containing the current character. 
public	TokenNamepublic	
int	TokenNameint	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ndx	TokenNameIdentifier	 ndx
=	TokenNameEQUAL	
currentIndex	TokenNameIdentifier	 current Index
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
ndx	TokenNameIdentifier	 ndx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
charInRun	TokenNameIdentifier	 char In Run
[	TokenNameLBRACKET	
ndx	TokenNameIdentifier	 ndx
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
MID_RUN	TokenNameIdentifier	 MID  RUN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ndx	TokenNameIdentifier	 ndx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the first character following the * run with respect to the given attribute containing the current * character. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character following the run with respect to the given attribute containing the current character. 
public	TokenNamepublic	
int	TokenNameint	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ndx	TokenNameIdentifier	 ndx
=	TokenNameEQUAL	
currentIndex	TokenNameIdentifier	 current Index
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//to avoid null pointer, treat null value as special case:-( 	TokenNameCOMMENT_LINE	to avoid null pointer, treat null value as special case:-( 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
ndx	TokenNameIdentifier	 ndx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
)	TokenNameRPAREN	
mapList	TokenNameIdentifier	 map List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ndx	TokenNameIdentifier	 ndx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
ndx	TokenNameIdentifier	 ndx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
)	TokenNameRPAREN	
mapList	TokenNameIdentifier	 map List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ndx	TokenNameIdentifier	 ndx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ndx	TokenNameIdentifier	 ndx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the first character following the * run with respect to the given attributes containing the current * character. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character following the run with respect to the given attributes containing the current character. 
public	TokenNamepublic	
int	TokenNameint	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ndx	TokenNameIdentifier	 ndx
=	TokenNameEQUAL	
currentIndex	TokenNameIdentifier	 current Index
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
ndx	TokenNameIdentifier	 ndx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
mapList	TokenNameIdentifier	 map List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ndx	TokenNameIdentifier	 ndx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ndx	TokenNameIdentifier	 ndx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the first character of the run with * respect to all attributes containing the current character. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character of the run with respect to all attributes containing the current character. 
public	TokenNamepublic	
int	TokenNameint	
getRunStart	TokenNameIdentifier	 get Run Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ndx	TokenNameIdentifier	 ndx
=	TokenNameEQUAL	
currentIndex	TokenNameIdentifier	 current Index
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
charInRun	TokenNameIdentifier	 char In Run
[	TokenNameLBRACKET	
ndx	TokenNameIdentifier	 ndx
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
MID_RUN	TokenNameIdentifier	 MID  RUN
)	TokenNameRPAREN	
--	TokenNameMINUS_MINUS	
ndx	TokenNameIdentifier	 ndx
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ndx	TokenNameIdentifier	 ndx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the first character of the run with * respect to the given attribute containing the current character. * @param attribute The attribute for whose appearance the first offset * is requested. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character of the run with respect to the given attribute containing the current character. @param attribute The attribute for whose appearance the first offset is requested. 
public	TokenNamepublic	
int	TokenNameint	
getRunStart	TokenNameIdentifier	 get Run Start
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ndx	TokenNameIdentifier	 ndx
=	TokenNameEQUAL	
currentIndex	TokenNameIdentifier	 current Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//to avoid null pointer, treat null value as special case:-( 	TokenNameCOMMENT_LINE	to avoid null pointer, treat null value as special case:-( 
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
)	TokenNameRPAREN	
mapList	TokenNameIdentifier	 map List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ndx	TokenNameIdentifier	 ndx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
--	TokenNameMINUS_MINUS	
ndx	TokenNameIdentifier	 ndx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
)	TokenNameRPAREN	
mapList	TokenNameIdentifier	 map List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ndx	TokenNameIdentifier	 ndx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
--	TokenNameMINUS_MINUS	
ndx	TokenNameIdentifier	 ndx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ndx	TokenNameIdentifier	 ndx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the first character of the run with * respect to the given attributes containing the current character. * @param attributes the Set of attributes which begins at the returned * index. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character of the run with respect to the given attributes containing the current character. @param attributes the Set of attributes which begins at the returned index. 
public	TokenNamepublic	
int	TokenNameint	
getRunStart	TokenNameIdentifier	 get Run Start
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ndx	TokenNameIdentifier	 ndx
=	TokenNameEQUAL	
currentIndex	TokenNameIdentifier	 current Index
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
mapList	TokenNameIdentifier	 map List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ndx	TokenNameIdentifier	 ndx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
--	TokenNameMINUS_MINUS	
ndx	TokenNameIdentifier	 ndx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ndx	TokenNameIdentifier	 ndx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//From CharacterIterator 	TokenNameCOMMENT_LINE	From CharacterIterator 
/** * Create a copy of this iterator */	TokenNameCOMMENT_JAVADOC	 Create a copy of this iterator 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
cloneACI	TokenNameIdentifier	 clone ACI
=	TokenNameEQUAL	
new	TokenNamenew	
GVTACIImpl	TokenNameIdentifier	 GVTACI Impl
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cloneACI	TokenNameIdentifier	 clone ACI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the character at the current position (as returned * by getIndex()). * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Get the character at the current position (as returned by getIndex()). <br><b>Specified by:</b> java.text.CharacterIterator. 
public	TokenNamepublic	
char	TokenNamechar	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the position to getBeginIndex(). * @return the character at the start index of the text. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Sets the position to getBeginIndex(). @return the character at the start index of the text. <br><b>Specified by:</b> java.text.CharacterIterator. 
public	TokenNamepublic	
char	TokenNamechar	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the start index of the text. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Get the start index of the text. <br><b>Specified by:</b> java.text.CharacterIterator. 
public	TokenNamepublic	
int	TokenNameint	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the end index of the text. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Get the end index of the text. <br><b>Specified by:</b> java.text.CharacterIterator. 
public	TokenNamepublic	
int	TokenNameint	
getEndIndex	TokenNameIdentifier	 get End Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
getEndIndex	TokenNameIdentifier	 get End Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current index. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Get the current index. <br><b>Specified by:</b> java.text.CharacterIterator. 
public	TokenNamepublic	
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the position to getEndIndex()-1 (getEndIndex() if * the text is empty) and returns the character at that position. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Sets the position to getEndIndex()-1 (getEndIndex() if the text is empty) and returns the character at that position. <br><b>Specified by:</b> java.text.CharacterIterator. 
public	TokenNamepublic	
char	TokenNamechar	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Increments the iterator's index by one, returning the next character. * @return the character at the new index. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Increments the iterator's index by one, returning the next character. @return the character at the new index. <br><b>Specified by:</b> java.text.CharacterIterator. 
public	TokenNamepublic	
char	TokenNamechar	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Decrements the iterator's index by one and returns * the character at the new index. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Decrements the iterator's index by one and returns the character at the new index. <br><b>Specified by:</b> java.text.CharacterIterator. 
public	TokenNamepublic	
char	TokenNamechar	
previous	TokenNameIdentifier	 previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
previous	TokenNameIdentifier	 previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the position to the specified position in the text. * @param position The new (current) index into the text. * @return the character at new index <em>position</em>. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Sets the position to the specified position in the text. @param position The new (current) index into the text. @return the character at new index <em>position</em>. <br><b>Specified by:</b> java.text.CharacterIterator. 
public	TokenNamepublic	
char	TokenNamechar	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Private methods: 	TokenNameCOMMENT_LINE	Private methods: 
private	TokenNameprivate	
void	TokenNamevoid	
buildAttributeTables	TokenNameIdentifier	 build Attribute Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
allAttributes	TokenNameIdentifier	 all Attributes
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapList	TokenNameIdentifier	 map List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
simpleString	TokenNameIdentifier	 simple String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charInRun	TokenNameIdentifier	 char In Run
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
simpleString	TokenNameIdentifier	 simple String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
charInRun	TokenNameIdentifier	 char In Run
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charInRun	TokenNameIdentifier	 char In Run
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
SINGLETON	TokenNameIdentifier	 SINGLETON
;	TokenNameSEMICOLON	
/* * XXX TODO: loosen assumption, initially each character has its own * attribute map. */	TokenNameCOMMENT_BLOCK	 XXX TODO: loosen assumption, initially each character has its own attribute map. 
mapList	TokenNameIdentifier	 map List
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
buildAttributeTables	TokenNameIdentifier	 build Attribute Tables
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
allAttributes	TokenNameIdentifier	 all Attributes
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAllAttributeKeys	TokenNameIdentifier	 get All Attribute Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getEndIndex	TokenNameIdentifier	 get End Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapList	TokenNameIdentifier	 map List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charInRun	TokenNameIdentifier	 char In Run
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
charInRun	TokenNameIdentifier	 char In Run
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
SINGLETON	TokenNameIdentifier	 SINGLETON
;	TokenNameSEMICOLON	
/* * XXX TODO:loosen assumption, initially each character * has its own attribute map. */	TokenNameCOMMENT_BLOCK	 XXX TODO:loosen assumption, initially each character has its own attribute map. 
mapList	TokenNameIdentifier	 map List
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
simpleString	TokenNameIdentifier	 simple String
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Inner classes: 	TokenNameCOMMENT_LINE	Inner classes: 
/** * AttributeFilter which converts (extended) location attributes * SVGAttributedCharacterIterator.TextAttribute.X, TextAttribute.Y, * TextAttribute.ROTATE attributes to TextAttribute.TRANSFORM attributes. */	TokenNameCOMMENT_JAVADOC	 AttributeFilter which converts (extended) location attributes SVGAttributedCharacterIterator.TextAttribute.X, TextAttribute.Y, TextAttribute.ROTATE attributes to TextAttribute.TRANSFORM attributes. 
public	TokenNamepublic	
class	TokenNameclass	
TransformAttributeFilter	TokenNameIdentifier	 Transform Attribute Filter
implements	TokenNameimplements	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
AttributeFilter	TokenNameIdentifier	 Attribute Filter
{	TokenNameLBRACE	
/** * Return a new AttributedCharacterIterator instance * in which location attributes have been converted to * TextAttribute.TRANSFORM attributes. */	TokenNameCOMMENT_JAVADOC	 Return a new AttributedCharacterIterator instance in which location attributes have been converted to TextAttribute.TRANSFORM attributes. 
public	TokenNamepublic	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
mutateAttributes	TokenNameIdentifier	 mutate Attributes
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//TODO:Implement this !!! 	TokenNameCOMMENT_LINE	TODO:Implement this !!! 
return	TokenNamereturn	
aci	TokenNameIdentifier	 aci
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
