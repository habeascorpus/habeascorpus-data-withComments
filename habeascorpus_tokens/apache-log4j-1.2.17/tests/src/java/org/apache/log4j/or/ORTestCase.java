/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// 	TokenNameCOMMENT_LINE	 
// Log4j uses the JUnit framework for internal unit testing. JUnit 	TokenNameCOMMENT_LINE	Log4j uses the JUnit framework for internal unit testing. JUnit 
// available from 	TokenNameCOMMENT_LINE	available from 
// 	TokenNameCOMMENT_LINE	 
// http://www.junit.org 	TokenNameCOMMENT_LINE	http://www.junit.org 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
or	TokenNameIdentifier	 or
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestSuite	TokenNameIdentifier	 Test Suite
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** Unit test the {@link ObjectRenderer}. @author Ceki G&uuml;lc&uuml; @since 1.0 */	TokenNameCOMMENT_JAVADOC	 Unit test the {@link ObjectRenderer}. @author Ceki G&uuml;lc&uuml; @since 1.0 
public	TokenNamepublic	
class	TokenNameclass	
ORTestCase	TokenNameIdentifier	 OR Test Case
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
static	TokenNamestatic	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
aor	TokenNameIdentifier	 aor
;	TokenNameSEMICOLON	
static	TokenNamestatic	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
bor	TokenNameIdentifier	 bor
;	TokenNameSEMICOLON	
static	TokenNamestatic	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
xor	TokenNameIdentifier	 xor
;	TokenNameSEMICOLON	
static	TokenNamestatic	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
yor	TokenNameIdentifier	 yor
;	TokenNameSEMICOLON	
static	TokenNamestatic	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
oor	TokenNameIdentifier	 oor
;	TokenNameSEMICOLON	
static	TokenNamestatic	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
nor	TokenNameIdentifier	 nor
;	TokenNameSEMICOLON	
static	TokenNamestatic	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
ior	TokenNameIdentifier	 ior
;	TokenNameSEMICOLON	
static	TokenNamestatic	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
cor	TokenNameIdentifier	 cor
;	TokenNameSEMICOLON	
static	TokenNamestatic	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
sor	TokenNameIdentifier	 sor
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ORTestCase	TokenNameIdentifier	 OR Test Case
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aor	TokenNameIdentifier	 aor
=	TokenNameEQUAL	
new	TokenNamenew	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
(	TokenNameLPAREN	
"A"	TokenNameStringLiteral	A
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bor	TokenNameIdentifier	 bor
=	TokenNameEQUAL	
new	TokenNamenew	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
(	TokenNameLPAREN	
"B"	TokenNameStringLiteral	B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xor	TokenNameIdentifier	 xor
=	TokenNameEQUAL	
new	TokenNamenew	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
(	TokenNameLPAREN	
"X"	TokenNameStringLiteral	X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yor	TokenNameIdentifier	 yor
=	TokenNameEQUAL	
new	TokenNamenew	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
(	TokenNameLPAREN	
"Y"	TokenNameStringLiteral	Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oor	TokenNameIdentifier	 oor
=	TokenNameEQUAL	
new	TokenNamenew	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
(	TokenNameLPAREN	
"Object"	TokenNameStringLiteral	Object
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nor	TokenNameIdentifier	 nor
=	TokenNameEQUAL	
new	TokenNamenew	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
(	TokenNameLPAREN	
"Number"	TokenNameStringLiteral	Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ior	TokenNameIdentifier	 ior
=	TokenNameEQUAL	
new	TokenNamenew	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
(	TokenNameLPAREN	
"Integer"	TokenNameStringLiteral	Integer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cor	TokenNameIdentifier	 cor
=	TokenNameEQUAL	
new	TokenNamenew	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
(	TokenNameLPAREN	
"Comparable"	TokenNameStringLiteral	Comparable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sor	TokenNameIdentifier	 sor
=	TokenNameEQUAL	
new	TokenNamenew	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
(	TokenNameLPAREN	
"Serializable"	TokenNameStringLiteral	Serializable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add: no renderer 	TokenNameCOMMENT_LINE	Add: no renderer 
// Expect: defaultRenderer 	TokenNameCOMMENT_LINE	Expect: defaultRenderer 
public	TokenNamepublic	
void	TokenNamevoid	
test1	TokenNameIdentifier	 test1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RendererMap	TokenNameIdentifier	 Renderer Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
RendererMap	TokenNameIdentifier	 Renderer Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
dr	TokenNameIdentifier	 dr
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
getDefaultRenderer	TokenNameIdentifier	 get Default Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
dr	TokenNameIdentifier	 dr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add: Integer renderer 	TokenNameCOMMENT_LINE	Add: Integer renderer 
// Expect: Integer renderer 	TokenNameCOMMENT_LINE	Expect: Integer renderer 
public	TokenNamepublic	
void	TokenNamevoid	
test2	TokenNameIdentifier	 test2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RendererMap	TokenNameIdentifier	 Renderer Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
RendererMap	TokenNameIdentifier	 Renderer Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
ior	TokenNameIdentifier	 ior
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
ior	TokenNameIdentifier	 ior
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add: Number renderer 	TokenNameCOMMENT_LINE	Add: Number renderer 
// Expect: Number 	TokenNameCOMMENT_LINE	Expect: Number 
public	TokenNamepublic	
void	TokenNamevoid	
test3	TokenNameIdentifier	 test3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RendererMap	TokenNameIdentifier	 Renderer Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
RendererMap	TokenNameIdentifier	 Renderer Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Number	TokenNameIdentifier	 Number
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
ior	TokenNameIdentifier	 ior
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
ior	TokenNameIdentifier	 ior
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add: Object renderer 	TokenNameCOMMENT_LINE	Add: Object renderer 
// Result: Object 	TokenNameCOMMENT_LINE	Result: Object 
public	TokenNamepublic	
void	TokenNamevoid	
test4	TokenNameIdentifier	 test4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RendererMap	TokenNameIdentifier	 Renderer Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
RendererMap	TokenNameIdentifier	 Renderer Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
oor	TokenNameIdentifier	 oor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
oor	TokenNameIdentifier	 oor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add: Object, Number, Integer 	TokenNameCOMMENT_LINE	Add: Object, Number, Integer 
// Expect: Integer 	TokenNameCOMMENT_LINE	Expect: Integer 
public	TokenNamepublic	
void	TokenNamevoid	
test5	TokenNameIdentifier	 test5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RendererMap	TokenNameIdentifier	 Renderer Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
RendererMap	TokenNameIdentifier	 Renderer Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
oor	TokenNameIdentifier	 oor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Number	TokenNameIdentifier	 Number
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
nor	TokenNameIdentifier	 nor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
ior	TokenNameIdentifier	 ior
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
ior	TokenNameIdentifier	 ior
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add: Object, Number 	TokenNameCOMMENT_LINE	Add: Object, Number 
// Expect: Number 	TokenNameCOMMENT_LINE	Expect: Number 
public	TokenNamepublic	
void	TokenNamevoid	
test6	TokenNameIdentifier	 test6
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RendererMap	TokenNameIdentifier	 Renderer Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
RendererMap	TokenNameIdentifier	 Renderer Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
oor	TokenNameIdentifier	 oor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Number	TokenNameIdentifier	 Number
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
nor	TokenNameIdentifier	 nor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
nor	TokenNameIdentifier	 nor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add: Comparable 	TokenNameCOMMENT_LINE	Add: Comparable 
// Expect: Comparable 	TokenNameCOMMENT_LINE	Expect: Comparable 
public	TokenNamepublic	
void	TokenNamevoid	
test7	TokenNameIdentifier	 test7
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
RendererMap	TokenNameIdentifier	 Renderer Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
RendererMap	TokenNameIdentifier	 Renderer Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
comparable	TokenNameIdentifier	 comparable
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
comparable	TokenNameIdentifier	 comparable
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"java.lang.Comparable"	TokenNameStringLiteral	java.lang.Comparable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// likely JDK 1.1 	TokenNameCOMMENT_LINE	likely JDK 1.1 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
comparable	TokenNameIdentifier	 comparable
,	TokenNameCOMMA	
cor	TokenNameIdentifier	 cor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
cor	TokenNameIdentifier	 cor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add: Serializable 	TokenNameCOMMENT_LINE	Add: Serializable 
// Expect: Serializablee 	TokenNameCOMMENT_LINE	Expect: Serializablee 
public	TokenNamepublic	
void	TokenNamevoid	
test8	TokenNameIdentifier	 test8
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RendererMap	TokenNameIdentifier	 Renderer Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
RendererMap	TokenNameIdentifier	 Renderer Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Serializable	TokenNameIdentifier	 Serializable
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
sor	TokenNameIdentifier	 sor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
sor	TokenNameIdentifier	 sor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add: Y 	TokenNameCOMMENT_LINE	Add: Y 
// Expect: Y 	TokenNameCOMMENT_LINE	Expect: Y 
public	TokenNamepublic	
void	TokenNamevoid	
test9	TokenNameIdentifier	 test9
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RendererMap	TokenNameIdentifier	 Renderer Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
RendererMap	TokenNameIdentifier	 Renderer Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Y	TokenNameIdentifier	 Y
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
yor	TokenNameIdentifier	 yor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
B	TokenNameIdentifier	 B
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
yor	TokenNameIdentifier	 yor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add: X 	TokenNameCOMMENT_LINE	Add: X 
// Expect: X 	TokenNameCOMMENT_LINE	Expect: X 
public	TokenNamepublic	
void	TokenNamevoid	
test10	TokenNameIdentifier	 test10
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RendererMap	TokenNameIdentifier	 Renderer Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
RendererMap	TokenNameIdentifier	 Renderer Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
X	TokenNameIdentifier	 X
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
xor	TokenNameIdentifier	 xor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
B	TokenNameIdentifier	 B
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
xor	TokenNameIdentifier	 xor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Test	TokenNameIdentifier	 Test
suite	TokenNameIdentifier	 suite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TestSuite	TokenNameIdentifier	 Test Suite
suite	TokenNameIdentifier	 suite
=	TokenNameEQUAL	
new	TokenNamenew	
TestSuite	TokenNameIdentifier	 Test Suite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
ORTestCase	TokenNameIdentifier	 OR Test Case
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
ORTestCase	TokenNameIdentifier	 OR Test Case
(	TokenNameLPAREN	
"test2"	TokenNameStringLiteral	test2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
ORTestCase	TokenNameIdentifier	 OR Test Case
(	TokenNameLPAREN	
"test3"	TokenNameStringLiteral	test3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
ORTestCase	TokenNameIdentifier	 OR Test Case
(	TokenNameLPAREN	
"test4"	TokenNameStringLiteral	test4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
ORTestCase	TokenNameIdentifier	 OR Test Case
(	TokenNameLPAREN	
"test5"	TokenNameStringLiteral	test5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
ORTestCase	TokenNameIdentifier	 OR Test Case
(	TokenNameLPAREN	
"test6"	TokenNameStringLiteral	test6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
ORTestCase	TokenNameIdentifier	 OR Test Case
(	TokenNameLPAREN	
"test7"	TokenNameStringLiteral	test7
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
ORTestCase	TokenNameIdentifier	 OR Test Case
(	TokenNameLPAREN	
"test8"	TokenNameStringLiteral	test8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
ORTestCase	TokenNameIdentifier	 OR Test Case
(	TokenNameLPAREN	
"test9"	TokenNameStringLiteral	test9
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
ORTestCase	TokenNameIdentifier	 OR Test Case
(	TokenNameLPAREN	
"test10"	TokenNameStringLiteral	test10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
suite	TokenNameIdentifier	 suite
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
implements	TokenNameimplements	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
UTObjectRenderer	TokenNameIdentifier	 UT Object Renderer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
doRender	TokenNameIdentifier	 do Render
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
"UTObjectRenderer: "	TokenNameStringLiteral	UTObjectRenderer: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
interface	TokenNameinterface	
X	TokenNameIdentifier	 X
{	TokenNameLBRACE	
}	TokenNameRBRACE	
interface	TokenNameinterface	
Y	TokenNameIdentifier	 Y
extends	TokenNameextends	
X	TokenNameIdentifier	 X
{	TokenNameLBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
A	TokenNameIdentifier	 A
implements	TokenNameimplements	
Y	TokenNameIdentifier	 Y
{	TokenNameLBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
B	TokenNameIdentifier	 B
extends	TokenNameextends	
A	TokenNameIdentifier	 A
{	TokenNameLBRACE	
}	TokenNameRBRACE	
