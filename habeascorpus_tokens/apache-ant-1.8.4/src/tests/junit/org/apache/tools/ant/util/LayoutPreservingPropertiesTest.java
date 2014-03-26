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
File	TokenNameIdentifier	 File
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
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
LayoutPreservingPropertiesTest	TokenNameIdentifier	 Layout Preserving Properties Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
LayoutPreservingPropertiesTest	TokenNameIdentifier	 Layout Preserving Properties Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests that a properties file read by the * LayoutPreservingPropertiesFile and then saves the properties in * it. */	TokenNameCOMMENT_JAVADOC	 Tests that a properties file read by the LayoutPreservingPropertiesFile and then saves the properties in it. 
public	TokenNamepublic	
void	TokenNamevoid	
testPreserve	TokenNameIdentifier	 test Preserve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
simple	TokenNameIdentifier	 simple
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"src/etc/testcases/util/simple.properties"	TokenNameStringLiteral	src/etc/testcases/util/simple.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
simple	TokenNameIdentifier	 simple
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
lpf	TokenNameIdentifier	 lpf
=	TokenNameEQUAL	
new	TokenNamenew	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"tmp"	TokenNameStringLiteral	tmp
,	TokenNameCOMMA	
"props"	TokenNameStringLiteral	props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
saveAs	TokenNameIdentifier	 save As
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now compare original and tmp for property equivalence 	TokenNameCOMMENT_LINE	now compare original and tmp for property equivalence 
Properties	TokenNameIdentifier	 Properties
originalProps	TokenNameIdentifier	 original Props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
originalProps	TokenNameIdentifier	 original Props
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
simple	TokenNameIdentifier	 simple
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
tmpProps	TokenNameIdentifier	 tmp Props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmpProps	TokenNameIdentifier	 tmp Props
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"properties corrupted"	TokenNameStringLiteral	properties corrupted
,	TokenNameCOMMA	
originalProps	TokenNameIdentifier	 original Props
,	TokenNameCOMMA	
tmpProps	TokenNameIdentifier	 tmp Props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// and now make sure that the comments made it into the new file 	TokenNameCOMMENT_LINE	and now make sure that the comments made it into the new file 
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
readFile	TokenNameIdentifier	 read File
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"missing comment"	TokenNameStringLiteral	missing comment
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"# a comment"	TokenNameStringLiteral	# a comment
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"missing comment"	TokenNameStringLiteral	missing comment
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"! more comment"	TokenNameStringLiteral	! more comment
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests that names and value are properly escaped when being * written out. */	TokenNameCOMMENT_JAVADOC	 Tests that names and value are properly escaped when being written out. 
public	TokenNamepublic	
void	TokenNamevoid	
testEscaping	TokenNameIdentifier	 test Escaping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
lpf	TokenNameIdentifier	 lpf
=	TokenNameEQUAL	
new	TokenNamenew	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
" prop one "	TokenNameStringLiteral	 prop one 
,	TokenNameCOMMA	
" leading and trailing spaces "	TokenNameStringLiteral	 leading and trailing spaces 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"prop two"	TokenNameStringLiteral	prop two
,	TokenNameCOMMA	
"contains tab"	TokenNameStringLiteral	contains tab
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"prop three"	TokenNameStringLiteral	prop three
,	TokenNameCOMMA	
"contains newline"	TokenNameStringLiteral	contains newline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"prop four"	TokenNameStringLiteral	prop four
,	TokenNameCOMMA	
"contains carraige return"	TokenNameStringLiteral	contains carraige return
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"prop five"	TokenNameStringLiteral	prop five
,	TokenNameCOMMA	
"contains form feed"	TokenNameStringLiteral	contains form feed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"prop\six"	TokenNameStringLiteral	prop\six
,	TokenNameCOMMA	
"contains\backslash"	TokenNameStringLiteral	contains\backslash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"prop:seven"	TokenNameStringLiteral	prop:seven
,	TokenNameCOMMA	
"contains:colon"	TokenNameStringLiteral	contains:colon
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"prop=eight"	TokenNameStringLiteral	prop=eight
,	TokenNameCOMMA	
"contains=equals"	TokenNameStringLiteral	contains=equals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"prop#nine"	TokenNameStringLiteral	prop#nine
,	TokenNameCOMMA	
"contains#hash"	TokenNameStringLiteral	contains#hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"prop!ten"	TokenNameStringLiteral	prop!ten
,	TokenNameCOMMA	
"contains!exclamation"	TokenNameStringLiteral	contains!exclamation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"tmp"	TokenNameStringLiteral	tmp
,	TokenNameCOMMA	
"props"	TokenNameStringLiteral	props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
saveAs	TokenNameIdentifier	 save As
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// and check that the resulting file looks okay 	TokenNameCOMMENT_LINE	and check that the resulting file looks okay 
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
readFile	TokenNameIdentifier	 read File
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"\ prop\ one\ =\ \ leading and trailing"	TokenNameStringLiteral	\ prop\ one\ =\ \ leading and trailing
+	TokenNamePLUS	
" spaces "	TokenNameStringLiteral	 spaces 
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop\ttwo=contains\ttab"	TokenNameStringLiteral	prop\ttwo=contains\ttab
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop\nthree=contains\nnewline"	TokenNameStringLiteral	prop\nthree=contains\nnewline
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop\rfour=contains\rcarraige return"	TokenNameStringLiteral	prop\rfour=contains\rcarraige return
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop\\six=contains\\backslash"	TokenNameStringLiteral	prop\\six=contains\\backslash
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop\:seven=contains\:colon"	TokenNameStringLiteral	prop\:seven=contains\:colon
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop\=eight=contains\=equals"	TokenNameStringLiteral	prop\=eight=contains\=equals
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop\#nine=contains\#hash"	TokenNameStringLiteral	prop\#nine=contains\#hash
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop\!ten=contains\!exclamation"	TokenNameStringLiteral	prop\!ten=contains\!exclamation
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests that properties are correctly indexed, so that when we set * an existing property, it updates the logical line, and it doesn't * append a new one. */	TokenNameCOMMENT_JAVADOC	 Tests that properties are correctly indexed, so that when we set an existing property, it updates the logical line, and it doesn't append a new one. 
public	TokenNamepublic	
void	TokenNamevoid	
testOverwrite	TokenNameIdentifier	 test Overwrite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
unusual	TokenNameIdentifier	 unusual
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"src/etc/testcases/util/unusual.properties"	TokenNameStringLiteral	src/etc/testcases/util/unusual.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
unusual	TokenNameIdentifier	 unusual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
lpf	TokenNameIdentifier	 lpf
=	TokenNameEQUAL	
new	TokenNamenew	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
" prop one "	TokenNameStringLiteral	 prop one 
,	TokenNameCOMMA	
"new one"	TokenNameStringLiteral	new one
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"prop two"	TokenNameStringLiteral	prop two
,	TokenNameCOMMA	
"new two"	TokenNameStringLiteral	new two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"prop three"	TokenNameStringLiteral	prop three
,	TokenNameCOMMA	
"new three"	TokenNameStringLiteral	new three
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"tmp"	TokenNameStringLiteral	tmp
,	TokenNameCOMMA	
"props"	TokenNameStringLiteral	props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
saveAs	TokenNameIdentifier	 save As
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// and check that the resulting file looks okay 	TokenNameCOMMENT_LINE	and check that the resulting file looks okay 
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
readFile	TokenNameIdentifier	 read File
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"\ prop\ one\ =\ \ leading and"	TokenNameStringLiteral	\ prop\ one\ =\ \ leading and
+	TokenNamePLUS	
" trailing spaces "	TokenNameStringLiteral	 trailing spaces 
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"\ prop\ one\ =new one"	TokenNameStringLiteral	\ prop\ one\ =new one
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop\ttwo=contains\ttab"	TokenNameStringLiteral	prop\ttwo=contains\ttab
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop\ttwo=new two"	TokenNameStringLiteral	prop\ttwo=new two
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop\nthree=contains\nnewline"	TokenNameStringLiteral	prop\nthree=contains\nnewline
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop\nthree=new three"	TokenNameStringLiteral	prop\nthree=new three
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testStoreWithHeader	TokenNameIdentifier	 test Store With Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
simple	TokenNameIdentifier	 simple
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"src/etc/testcases/util/simple.properties"	TokenNameStringLiteral	src/etc/testcases/util/simple.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
simple	TokenNameIdentifier	 simple
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
lpf	TokenNameIdentifier	 lpf
=	TokenNameEQUAL	
new	TokenNamenew	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"tmp"	TokenNameStringLiteral	tmp
,	TokenNameCOMMA	
"props"	TokenNameStringLiteral	props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileOutputStream	TokenNameIdentifier	 File Output Stream
fos	TokenNameIdentifier	 fos
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
store	TokenNameIdentifier	 store
(	TokenNameLPAREN	
fos	TokenNameIdentifier	 fos
,	TokenNameCOMMA	
"file-header"	TokenNameStringLiteral	file-header
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fos	TokenNameIdentifier	 fos
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// and check that the resulting file looks okay 	TokenNameCOMMENT_LINE	and check that the resulting file looks okay 
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
readFile	TokenNameIdentifier	 read File
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"should have had header "	TokenNameStringLiteral	should have had header 
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"#file-header"	TokenNameStringLiteral	#file-header
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testClear	TokenNameIdentifier	 test Clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
simple	TokenNameIdentifier	 simple
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"src/etc/testcases/util/simple.properties"	TokenNameStringLiteral	src/etc/testcases/util/simple.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
simple	TokenNameIdentifier	 simple
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
lpf	TokenNameIdentifier	 lpf
=	TokenNameEQUAL	
new	TokenNamenew	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"tmp"	TokenNameStringLiteral	tmp
,	TokenNameCOMMA	
"props"	TokenNameStringLiteral	props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
saveAs	TokenNameIdentifier	 save As
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// and check that the resulting file looks okay 	TokenNameCOMMENT_LINE	and check that the resulting file looks okay 
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
readFile	TokenNameIdentifier	 read File
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"should have had no properties "	TokenNameStringLiteral	should have had no properties 
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop.alpha"	TokenNameStringLiteral	prop.alpha
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"should have had no properties "	TokenNameStringLiteral	should have had no properties 
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop.beta"	TokenNameStringLiteral	prop.beta
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"should have had no properties "	TokenNameStringLiteral	should have had no properties 
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop.gamma"	TokenNameStringLiteral	prop.gamma
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"should have had no comments"	TokenNameStringLiteral	should have had no comments
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"# a comment"	TokenNameStringLiteral	# a comment
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"should have had no comments"	TokenNameStringLiteral	should have had no comments
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"! more comment"	TokenNameStringLiteral	! more comment
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"should have had no comments"	TokenNameStringLiteral	should have had no comments
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"# now a line wrapping one"	TokenNameStringLiteral	# now a line wrapping one
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRemove	TokenNameIdentifier	 test Remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
simple	TokenNameIdentifier	 simple
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"src/etc/testcases/util/simple.properties"	TokenNameStringLiteral	src/etc/testcases/util/simple.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
simple	TokenNameIdentifier	 simple
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
lpf	TokenNameIdentifier	 lpf
=	TokenNameEQUAL	
new	TokenNamenew	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
"prop.beta"	TokenNameStringLiteral	prop.beta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"tmp"	TokenNameStringLiteral	tmp
,	TokenNameCOMMA	
"props"	TokenNameStringLiteral	props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
saveAs	TokenNameIdentifier	 save As
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// and check that the resulting file looks okay 	TokenNameCOMMENT_LINE	and check that the resulting file looks okay 
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
readFile	TokenNameIdentifier	 read File
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"should not have had prop.beta"	TokenNameStringLiteral	should not have had prop.beta
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop.beta"	TokenNameStringLiteral	prop.beta
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"should have had prop.beta's comment"	TokenNameStringLiteral	should have had prop.beta's comment
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"! more comment"	TokenNameStringLiteral	! more comment
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRemoveWithComment	TokenNameIdentifier	 test Remove With Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
simple	TokenNameIdentifier	 simple
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"src/etc/testcases/util/simple.properties"	TokenNameStringLiteral	src/etc/testcases/util/simple.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
simple	TokenNameIdentifier	 simple
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
lpf	TokenNameIdentifier	 lpf
=	TokenNameEQUAL	
new	TokenNamenew	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
setRemoveComments	TokenNameIdentifier	 set Remove Comments
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
"prop.beta"	TokenNameStringLiteral	prop.beta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"tmp"	TokenNameStringLiteral	tmp
,	TokenNameCOMMA	
"props"	TokenNameStringLiteral	props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
saveAs	TokenNameIdentifier	 save As
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// and check that the resulting file looks okay 	TokenNameCOMMENT_LINE	and check that the resulting file looks okay 
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
readFile	TokenNameIdentifier	 read File
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"should not have had prop.beta"	TokenNameStringLiteral	should not have had prop.beta
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop.beta"	TokenNameStringLiteral	prop.beta
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"should not have had prop.beta's comment"	TokenNameStringLiteral	should not have had prop.beta's comment
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"! more comment"	TokenNameStringLiteral	! more comment
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testClone	TokenNameIdentifier	 test Clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
simple	TokenNameIdentifier	 simple
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"src/etc/testcases/util/simple.properties"	TokenNameStringLiteral	src/etc/testcases/util/simple.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
simple	TokenNameIdentifier	 simple
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
lpf1	TokenNameIdentifier	 lpf1
=	TokenNameEQUAL	
new	TokenNamenew	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf1	TokenNameIdentifier	 lpf1
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
lpf2	TokenNameIdentifier	 lpf2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
)	TokenNameRPAREN	
lpf1	TokenNameIdentifier	 lpf1
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf2	TokenNameIdentifier	 lpf2
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"prop.new"	TokenNameStringLiteral	prop.new
,	TokenNameCOMMA	
"a new property"	TokenNameStringLiteral	a new property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf2	TokenNameIdentifier	 lpf2
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"prop.beta"	TokenNameStringLiteral	prop.beta
,	TokenNameCOMMA	
"a new value for beta"	TokenNameStringLiteral	a new value for beta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"size of original is wrong"	TokenNameStringLiteral	size of original is wrong
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lpf1	TokenNameIdentifier	 lpf1
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"size of clone is wrong"	TokenNameStringLiteral	size of clone is wrong
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lpf2	TokenNameIdentifier	 lpf2
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
tmp1	TokenNameIdentifier	 tmp1
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"tmp"	TokenNameStringLiteral	tmp
,	TokenNameCOMMA	
"props"	TokenNameStringLiteral	props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp1	TokenNameIdentifier	 tmp1
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf1	TokenNameIdentifier	 lpf1
.	TokenNameDOT	
saveAs	TokenNameIdentifier	 save As
(	TokenNameLPAREN	
tmp1	TokenNameIdentifier	 tmp1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
readFile	TokenNameIdentifier	 read File
(	TokenNameLPAREN	
tmp1	TokenNameIdentifier	 tmp1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
tmp2	TokenNameIdentifier	 tmp2
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"tmp"	TokenNameStringLiteral	tmp
,	TokenNameCOMMA	
"props"	TokenNameStringLiteral	props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp2	TokenNameIdentifier	 tmp2
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf2	TokenNameIdentifier	 lpf2
.	TokenNameDOT	
saveAs	TokenNameIdentifier	 save As
(	TokenNameLPAREN	
tmp2	TokenNameIdentifier	 tmp2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
readFile	TokenNameIdentifier	 read File
(	TokenNameLPAREN	
tmp2	TokenNameIdentifier	 tmp2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check original is untouched 	TokenNameCOMMENT_LINE	check original is untouched 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"should have had 'simple'"	TokenNameStringLiteral	should have had 'simple'
,	TokenNameCOMMA	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"simple"	TokenNameStringLiteral	simple
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"should not have had prop.new"	TokenNameStringLiteral	should not have had prop.new
,	TokenNameCOMMA	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop.new"	TokenNameStringLiteral	prop.new
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check clone has the changes 	TokenNameCOMMENT_LINE	check clone has the changes 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"should have had 'a new value for beta'"	TokenNameStringLiteral	should have had 'a new value for beta'
,	TokenNameCOMMA	
s2	TokenNameIdentifier	 s2
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"a new value for beta"	TokenNameStringLiteral	a new value for beta
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"should have had prop.new"	TokenNameStringLiteral	should have had prop.new
,	TokenNameCOMMA	
s2	TokenNameIdentifier	 s2
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop.new"	TokenNameStringLiteral	prop.new
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPreserveEscapeName	TokenNameIdentifier	 test Preserve Escape Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
lpf	TokenNameIdentifier	 lpf
=	TokenNameEQUAL	
new	TokenNamenew	
LayoutPreservingProperties	TokenNameIdentifier	 Layout Preserving Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
unusual	TokenNameIdentifier	 unusual
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"src/etc/testcases/util/unusual.properties"	TokenNameStringLiteral	src/etc/testcases/util/unusual.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
unusual	TokenNameIdentifier	 unusual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"prop:seven"	TokenNameStringLiteral	prop:seven
,	TokenNameCOMMA	
"new value for seven"	TokenNameStringLiteral	new value for seven
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"prop=eight"	TokenNameStringLiteral	prop=eight
,	TokenNameCOMMA	
"new value for eight"	TokenNameStringLiteral	new value for eight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"prop eleven"	TokenNameStringLiteral	prop eleven
,	TokenNameCOMMA	
"new value for eleven"	TokenNameStringLiteral	new value for eleven
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"alpha"	TokenNameStringLiteral	alpha
,	TokenNameCOMMA	
"new value for alpha"	TokenNameStringLiteral	new value for alpha
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"beta"	TokenNameStringLiteral	beta
,	TokenNameCOMMA	
"new value for beta"	TokenNameStringLiteral	new value for beta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"tmp"	TokenNameStringLiteral	tmp
,	TokenNameCOMMA	
"props"	TokenNameStringLiteral	props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpf	TokenNameIdentifier	 lpf
.	TokenNameDOT	
saveAs	TokenNameIdentifier	 save As
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// and check that the resulting file looks okay 	TokenNameCOMMENT_LINE	and check that the resulting file looks okay 
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
readFile	TokenNameIdentifier	 read File
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop\:seven=new value for seven"	TokenNameStringLiteral	prop\:seven=new value for seven
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop\=eight=new value for eight"	TokenNameStringLiteral	prop\=eight=new value for eight
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop\ eleven=new value for eleven"	TokenNameStringLiteral	prop\ eleven=new value for eleven
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"alpha=new value for alpha"	TokenNameStringLiteral	alpha=new value for alpha
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"beta=new value for beta"	TokenNameStringLiteral	beta=new value for beta
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop\:seven=contains\:colon"	TokenNameStringLiteral	prop\:seven=contains\:colon
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"prop\=eight=contains\=equals"	TokenNameStringLiteral	prop\=eight=contains\=equals
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"alpha:set with a colon"	TokenNameStringLiteral	alpha:set with a colon
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"beta set with a space"	TokenNameStringLiteral	beta set with a space
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
readFile	TokenNameIdentifier	 read File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FileInputStream	TokenNameIdentifier	 File Input Stream
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
isr	TokenNameIdentifier	 isr
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
isr	TokenNameIdentifier	 isr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isr	TokenNameIdentifier	 isr
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fis	TokenNameIdentifier	 fis
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
