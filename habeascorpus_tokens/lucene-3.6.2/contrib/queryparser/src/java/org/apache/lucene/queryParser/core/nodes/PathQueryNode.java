package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
nodes	TokenNameIdentifier	 nodes
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
EscapeQuerySyntax	TokenNameIdentifier	 Escape Query Syntax
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
EscapeQuerySyntax	TokenNameIdentifier	 Escape Query Syntax
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
;	TokenNameSEMICOLON	
/** * A {@link PathQueryNode} is used to store queries like * /company/USA/California /product/shoes/brown. QueryText are objects that * contain the text, begin position and end position in the query. * <p> * Example how the text parser creates these objects: * </p> * <pre> * List values = ArrayList(); * values.add(new PathQueryNode.QueryText("company", 1, 7)); * values.add(new PathQueryNode.QueryText("USA", 9, 12)); * values.add(new PathQueryNode.QueryText("California", 14, 23)); * QueryNode q = new PathQueryNode(values); * </pre> */	TokenNameCOMMENT_JAVADOC	 A {@link PathQueryNode} is used to store queries like /company/USA/California /product/shoes/brown. QueryText are objects that contain the text, begin position and end position in the query. <p> Example how the text parser creates these objects: </p> <pre> List values = ArrayList(); values.add(new PathQueryNode.QueryText("company", 1, 7)); values.add(new PathQueryNode.QueryText("USA", 9, 12)); values.add(new PathQueryNode.QueryText("California", 14, 23)); QueryNode q = new PathQueryNode(values); </pre> 
public	TokenNamepublic	
class	TokenNameclass	
PathQueryNode	TokenNameIdentifier	 Path Query Node
extends	TokenNameextends	
QueryNodeImpl	TokenNameIdentifier	 Query Node Impl
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
8325921322405804789L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
QueryText	TokenNameIdentifier	 Query Text
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
CharSequence	TokenNameIdentifier	 Char Sequence
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * != null The term's begin position. */	TokenNameCOMMENT_JAVADOC	 != null The term's begin position. 
int	TokenNameint	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
/** * The term's end position. */	TokenNameCOMMENT_JAVADOC	 The term's end position. 
int	TokenNameint	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
/** * @param value * - text value * @param begin * - position in the query string * @param end * - position in the query string */	TokenNameCOMMENT_JAVADOC	 @param value - text value @param begin - position in the query string @param end - position in the query string 
public	TokenNamepublic	
QueryText	TokenNameIdentifier	 Query Text
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
begin	TokenNameIdentifier	 begin
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
QueryText	TokenNameIdentifier	 Query Text
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
QueryText	TokenNameIdentifier	 Query Text
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
QueryText	TokenNameIdentifier	 Query Text
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the value */	TokenNameCOMMENT_JAVADOC	 @return the value 
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the begin */	TokenNameCOMMENT_JAVADOC	 @return the begin 
public	TokenNamepublic	
int	TokenNameint	
getBegin	TokenNameIdentifier	 get Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the end */	TokenNameCOMMENT_JAVADOC	 @return the end 
public	TokenNamepublic	
int	TokenNameint	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
begin	TokenNameIdentifier	 begin
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryText	TokenNameIdentifier	 Query Text
>	TokenNameGREATER	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * @param pathElements * - List of QueryText objects */	TokenNameCOMMENT_JAVADOC	 @param pathElements - List of QueryText objects 
public	TokenNamepublic	
PathQueryNode	TokenNameIdentifier	 Path Query Node
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryText	TokenNameIdentifier	 Query Text
>	TokenNameGREATER	
pathElements	TokenNameIdentifier	 path Elements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
pathElements	TokenNameIdentifier	 path Elements
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pathElements	TokenNameIdentifier	 path Elements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this should not happen 	TokenNameCOMMENT_LINE	this should not happen 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"PathQuerynode requires more 2 or more path elements."	TokenNameStringLiteral	PathQuerynode requires more 2 or more path elements.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the a List with all QueryText elements * * @return QueryText List size */	TokenNameCOMMENT_JAVADOC	 Returns the a List with all QueryText elements * @return QueryText List size 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryText	TokenNameIdentifier	 Query Text
>	TokenNameGREATER	
getPathElements	TokenNameIdentifier	 get Path Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the a List with all QueryText elements */	TokenNameCOMMENT_JAVADOC	 Returns the a List with all QueryText elements 
public	TokenNamepublic	
void	TokenNamevoid	
setPathElements	TokenNameIdentifier	 set Path Elements
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryText	TokenNameIdentifier	 Query Text
>	TokenNameGREATER	
elements	TokenNameIdentifier	 elements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
elements	TokenNameIdentifier	 elements
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the a specific QueryText element * * @return QueryText List size */	TokenNameCOMMENT_JAVADOC	 Returns the a specific QueryText element * @return QueryText List size 
public	TokenNamepublic	
QueryText	TokenNameIdentifier	 Query Text
getPathElement	TokenNameIdentifier	 get Path Element
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the CharSequence value of a specific QueryText element * * @return the CharSequence for a specific QueryText element */	TokenNameCOMMENT_JAVADOC	 Returns the CharSequence value of a specific QueryText element * @return the CharSequence for a specific QueryText element 
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
getFirstPathElement	TokenNameIdentifier	 get First Path Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a List QueryText element from position startIndex * * @return a List QueryText element from position startIndex */	TokenNameCOMMENT_JAVADOC	 Returns a List QueryText element from position startIndex * @return a List QueryText element from position startIndex 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryText	TokenNameIdentifier	 Query Text
>	TokenNameGREATER	
getPathElements	TokenNameIdentifier	 get Path Elements
(	TokenNameLPAREN	
int	TokenNameint	
startIndex	TokenNameIdentifier	 start Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
PathQueryNode	TokenNameIdentifier	 Path Query Node
.	TokenNameDOT	
QueryText	TokenNameIdentifier	 Query Text
>	TokenNameGREATER	
rValues	TokenNameIdentifier	 r Values
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PathQueryNode	TokenNameIdentifier	 Path Query Node
.	TokenNameDOT	
QueryText	TokenNameIdentifier	 Query Text
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
startIndex	TokenNameIdentifier	 start Index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
rValues	TokenNameIdentifier	 r Values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this will not happen 	TokenNameCOMMENT_LINE	this will not happen 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
rValues	TokenNameIdentifier	 r Values
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
CharSequence	TokenNameIdentifier	 Char Sequence
getPathString	TokenNameIdentifier	 get Path String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
QueryText	TokenNameIdentifier	 Query Text
pathelement	TokenNameIdentifier	 pathelement
:	TokenNameCOLON	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
pathelement	TokenNameIdentifier	 pathelement
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
toQueryString	TokenNameIdentifier	 to Query String
(	TokenNameLPAREN	
EscapeQuerySyntax	TokenNameIdentifier	 Escape Query Syntax
escaper	TokenNameIdentifier	 escaper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getFirstPathElement	TokenNameIdentifier	 get First Path Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
QueryText	TokenNameIdentifier	 Query Text
pathelement	TokenNameIdentifier	 pathelement
:	TokenNameCOLON	
getPathElements	TokenNameIdentifier	 get Path Elements
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharSequence	TokenNameIdentifier	 Char Sequence
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
escaper	TokenNameIdentifier	 escaper
.	TokenNameDOT	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
pathelement	TokenNameIdentifier	 pathelement
.	TokenNameDOT	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"/""	TokenNameStringLiteral	/"
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QueryText	TokenNameIdentifier	 Query Text
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
"<path start='"	TokenNameStringLiteral	<path start='
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
begin	TokenNameIdentifier	 begin
+	TokenNamePLUS	
"' end='"	TokenNameStringLiteral	' end='
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
"' path='"	TokenNameStringLiteral	' path='
+	TokenNamePLUS	
getPathString	TokenNameIdentifier	 get Path String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'/>"	TokenNameStringLiteral	'/>
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
QueryNode	TokenNameIdentifier	 Query Node
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
PathQueryNode	TokenNameIdentifier	 Path Query Node
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PathQueryNode	TokenNameIdentifier	 Path Query Node
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// copy children 	TokenNameCOMMENT_LINE	copy children 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryText	TokenNameIdentifier	 Query Text
>	TokenNameGREATER	
localValues	TokenNameIdentifier	 local Values
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
QueryText	TokenNameIdentifier	 Query Text
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
QueryText	TokenNameIdentifier	 Query Text
value	TokenNameIdentifier	 value
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localValues	TokenNameIdentifier	 local Values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
localValues	TokenNameIdentifier	 local Values
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
