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
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
classfile	TokenNameIdentifier	 classfile
.	TokenNameDOT	
ClassParser	TokenNameIdentifier	 Class Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
classfile	TokenNameIdentifier	 classfile
.	TokenNameDOT	
ConstantValue	TokenNameIdentifier	 Constant Value
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
classfile	TokenNameIdentifier	 classfile
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
classfile	TokenNameIdentifier	 classfile
.	TokenNameDOT	
JavaClass	TokenNameIdentifier	 Java Class
;	TokenNameSEMICOLON	
// CheckStyle:HideUtilityClassConstructorCheck OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:HideUtilityClassConstructorCheck OFF - bc 
/** * Helper class that filters constants from a Java Class * */	TokenNameCOMMENT_JAVADOC	 Helper class that filters constants from a Java Class 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
JavaClassHelper	TokenNameIdentifier	 Java Class Helper
{	TokenNameLBRACE	
/** System specific line separator. */	TokenNameCOMMENT_JAVADOC	 System specific line separator. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LS	TokenNameIdentifier	 LS
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the constants declared in a file as name=value * * @param bytes the class as a array of bytes * @return a StringBuffer contains the name=value pairs * @exception IOException if an error occurs */	TokenNameCOMMENT_JAVADOC	 Get the constants declared in a file as name=value * @param bytes the class as a array of bytes @return a StringBuffer contains the name=value pairs @exception IOException if an error occurs 
public	TokenNamepublic	
static	TokenNamestatic	
StringBuffer	TokenNameIdentifier	 String Buffer
getConstants	TokenNameIdentifier	 get Constants
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
bis	TokenNameIdentifier	 bis
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ClassParser	TokenNameIdentifier	 Class Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
ClassParser	TokenNameIdentifier	 Class Parser
(	TokenNameLPAREN	
bis	TokenNameIdentifier	 bis
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
JavaClass	TokenNameIdentifier	 Java Class
javaClass	TokenNameIdentifier	 java Class
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
javaClass	TokenNameIdentifier	 java Class
.	TokenNameDOT	
getFields	TokenNameIdentifier	 get Fields
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
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ConstantValue	TokenNameIdentifier	 Constant Value
cv	TokenNameIdentifier	 cv
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getConstantValue	TokenNameIdentifier	 get Constant Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cv	TokenNameIdentifier	 cv
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
cvs	TokenNameIdentifier	 cvs
=	TokenNameEQUAL	
cv	TokenNameIdentifier	 cv
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Remove start and end quotes if field is a String 	TokenNameCOMMENT_LINE	Remove start and end quotes if field is a String 
if	TokenNameif	
(	TokenNameLPAREN	
cvs	TokenNameIdentifier	 cvs
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
cvs	TokenNameIdentifier	 cvs
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cvs	TokenNameIdentifier	 cvs
=	TokenNameEQUAL	
cvs	TokenNameIdentifier	 cvs
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cvs	TokenNameIdentifier	 cvs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
cvs	TokenNameIdentifier	 cvs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
LS	TokenNameIdentifier	 LS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
