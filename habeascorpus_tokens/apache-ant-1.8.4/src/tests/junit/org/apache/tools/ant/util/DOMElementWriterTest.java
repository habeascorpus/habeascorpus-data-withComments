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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringWriter	TokenNameIdentifier	 String Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
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
/** * Tests for org.apache.tools.ant.util.DOMElementWriter. * */	TokenNameCOMMENT_JAVADOC	 Tests for org.apache.tools.ant.util.DOMElementWriter. 
public	TokenNamepublic	
class	TokenNameclass	
DOMElementWriterTest	TokenNameIdentifier	 DOM Element Writer Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DOMElementWriterTest	TokenNameIdentifier	 DOM Element Writer Test
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
testIsReference	TokenNameIdentifier	 test Is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"&#20;"	TokenNameStringLiteral	&#20;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
"&#20;"	TokenNameStringLiteral	&#20;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"&#x20;"	TokenNameStringLiteral	&#x20;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
"&#x20;"	TokenNameStringLiteral	&#x20;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"&#xA0;"	TokenNameStringLiteral	&#xA0;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
"&#xA0;"	TokenNameStringLiteral	&#xA0;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"&#A0;"	TokenNameStringLiteral	&#A0;
,	TokenNameCOMMA	
!	TokenNameNOT	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
"&#A0;"	TokenNameStringLiteral	&#A0;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"20;"	TokenNameStringLiteral	20;
,	TokenNameCOMMA	
!	TokenNameNOT	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
"20;"	TokenNameStringLiteral	20;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"&#20"	TokenNameStringLiteral	&#20
,	TokenNameCOMMA	
!	TokenNameNOT	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
"&#20"	TokenNameStringLiteral	&#20
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"&quot;"	TokenNameStringLiteral	&quot;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
"&quot;"	TokenNameStringLiteral	&quot;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"&apos;"	TokenNameStringLiteral	&apos;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
"&apos;"	TokenNameStringLiteral	&apos;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"&gt;"	TokenNameStringLiteral	&gt;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
"&gt;"	TokenNameStringLiteral	&gt;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"&lt;"	TokenNameStringLiteral	&lt;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
"&lt;"	TokenNameStringLiteral	&lt;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"&amp;"	TokenNameStringLiteral	&amp;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
"&amp;"	TokenNameStringLiteral	&amp;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEncode	TokenNameIdentifier	 test Encode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;#20;"	TokenNameStringLiteral	&amp;#20;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
"&#20;"	TokenNameStringLiteral	&#20;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;#x20;"	TokenNameStringLiteral	&amp;#x20;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
"&#x20;"	TokenNameStringLiteral	&#x20;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;#xA0;"	TokenNameStringLiteral	&amp;#xA0;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
"&#xA0;"	TokenNameStringLiteral	&#xA0;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;#A0;"	TokenNameStringLiteral	&amp;#A0;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
"&#A0;"	TokenNameStringLiteral	&#A0;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"20;"	TokenNameStringLiteral	20;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
"20;"	TokenNameStringLiteral	20;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;#20"	TokenNameStringLiteral	&amp;#20
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
"&#20"	TokenNameStringLiteral	&#20
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;quot;"	TokenNameStringLiteral	&amp;quot;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
"&quot;"	TokenNameStringLiteral	&quot;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;apos;"	TokenNameStringLiteral	&amp;apos;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
"&apos;"	TokenNameStringLiteral	&apos;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;gt;"	TokenNameStringLiteral	&amp;gt;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
"&gt;"	TokenNameStringLiteral	&gt;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;lt;"	TokenNameStringLiteral	&amp;lt;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
"&lt;"	TokenNameStringLiteral	&lt;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;amp;"	TokenNameStringLiteral	&amp;amp;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
"&amp;"	TokenNameStringLiteral	&amp;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&quot;"	TokenNameStringLiteral	&quot;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&lt;"	TokenNameStringLiteral	&lt;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
"<"	TokenNameStringLiteral	<
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;"	TokenNameStringLiteral	&amp;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
"&"	TokenNameStringLiteral	&
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
""	TokenNameStringLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEncodeAttributeValue	TokenNameIdentifier	 test Encode Attribute Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;#20;"	TokenNameStringLiteral	&amp;#20;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodeAttributeValue	TokenNameIdentifier	 encode Attribute Value
(	TokenNameLPAREN	
"&#20;"	TokenNameStringLiteral	&#20;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;#x20;"	TokenNameStringLiteral	&amp;#x20;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodeAttributeValue	TokenNameIdentifier	 encode Attribute Value
(	TokenNameLPAREN	
"&#x20;"	TokenNameStringLiteral	&#x20;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;#xA0;"	TokenNameStringLiteral	&amp;#xA0;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodeAttributeValue	TokenNameIdentifier	 encode Attribute Value
(	TokenNameLPAREN	
"&#xA0;"	TokenNameStringLiteral	&#xA0;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;#A0;"	TokenNameStringLiteral	&amp;#A0;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodeAttributeValue	TokenNameIdentifier	 encode Attribute Value
(	TokenNameLPAREN	
"&#A0;"	TokenNameStringLiteral	&#A0;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"20;"	TokenNameStringLiteral	20;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodeAttributeValue	TokenNameIdentifier	 encode Attribute Value
(	TokenNameLPAREN	
"20;"	TokenNameStringLiteral	20;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;#20"	TokenNameStringLiteral	&amp;#20
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodeAttributeValue	TokenNameIdentifier	 encode Attribute Value
(	TokenNameLPAREN	
"&#20"	TokenNameStringLiteral	&#20
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;quot;"	TokenNameStringLiteral	&amp;quot;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodeAttributeValue	TokenNameIdentifier	 encode Attribute Value
(	TokenNameLPAREN	
"&quot;"	TokenNameStringLiteral	&quot;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;apos;"	TokenNameStringLiteral	&amp;apos;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodeAttributeValue	TokenNameIdentifier	 encode Attribute Value
(	TokenNameLPAREN	
"&apos;"	TokenNameStringLiteral	&apos;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;gt;"	TokenNameStringLiteral	&amp;gt;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodeAttributeValue	TokenNameIdentifier	 encode Attribute Value
(	TokenNameLPAREN	
"&gt;"	TokenNameStringLiteral	&gt;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;lt;"	TokenNameStringLiteral	&amp;lt;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodeAttributeValue	TokenNameIdentifier	 encode Attribute Value
(	TokenNameLPAREN	
"&lt;"	TokenNameStringLiteral	&lt;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;amp;"	TokenNameStringLiteral	&amp;amp;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodeAttributeValue	TokenNameIdentifier	 encode Attribute Value
(	TokenNameLPAREN	
"&amp;"	TokenNameStringLiteral	&amp;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&quot;"	TokenNameStringLiteral	&quot;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodeAttributeValue	TokenNameIdentifier	 encode Attribute Value
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&lt;"	TokenNameStringLiteral	&lt;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodeAttributeValue	TokenNameIdentifier	 encode Attribute Value
(	TokenNameLPAREN	
"<"	TokenNameStringLiteral	<
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&amp;"	TokenNameStringLiteral	&amp;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodeAttributeValue	TokenNameIdentifier	 encode Attribute Value
(	TokenNameLPAREN	
"&"	TokenNameStringLiteral	&
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodeAttributeValue	TokenNameIdentifier	 encode Attribute Value
(	TokenNameLPAREN	
""	TokenNameStringLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&#xd;&#xa;&#x9;"	TokenNameStringLiteral	&#xd;&#xa;&#x9;
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodeAttributeValue	TokenNameIdentifier	 encode Attribute Value
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAttributeWithWhitespace	TokenNameIdentifier	 test Attribute With Whitespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
newDocument	TokenNameIdentifier	 new Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"bar baz"	TokenNameStringLiteral	bar baz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringWriter	TokenNameIdentifier	 String Writer
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<root foo="bar&#xa;baz" />"	TokenNameStringLiteral	<root foo="bar&#xa;baz" />
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEncodeData	TokenNameIdentifier	 test Encode Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"&#20;"20;&"	TokenNameStringLiteral	&#20;"20;&
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodedata	TokenNameIdentifier	 encodedata
(	TokenNameLPAREN	
"&#20;"20;&"	TokenNameStringLiteral	&#20;"20;&
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodedata	TokenNameIdentifier	 encodedata
(	TokenNameLPAREN	
""	TokenNameStringLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIsLegalCharacter	TokenNameIdentifier	 test Is Legal Character
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"0x00"	TokenNameStringLiteral	0x00
,	TokenNameCOMMA	
!	TokenNameNOT	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isLegalCharacter	TokenNameIdentifier	 is Legal Character
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"0x09"	TokenNameStringLiteral	0x09
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isLegalCharacter	TokenNameIdentifier	 is Legal Character
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"0x0A"	TokenNameStringLiteral	0x0A
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isLegalCharacter	TokenNameIdentifier	 is Legal Character
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"0x0C"	TokenNameStringLiteral	0x0C
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isLegalCharacter	TokenNameIdentifier	 is Legal Character
(	TokenNameLPAREN	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"0x1F"	TokenNameStringLiteral	0x1F
,	TokenNameCOMMA	
!	TokenNameNOT	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isLegalCharacter	TokenNameIdentifier	 is Legal Character
(	TokenNameLPAREN	
''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"0x20"	TokenNameStringLiteral	0x20
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isLegalCharacter	TokenNameIdentifier	 is Legal Character
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"0xD7FF"	TokenNameStringLiteral	0xD7FF
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isLegalCharacter	TokenNameIdentifier	 is Legal Character
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"0xD800"	TokenNameStringLiteral	0xD800
,	TokenNameCOMMA	
!	TokenNameNOT	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isLegalCharacter	TokenNameIdentifier	 is Legal Character
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"0xDFFF"	TokenNameStringLiteral	0xDFFF
,	TokenNameCOMMA	
!	TokenNameNOT	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isLegalCharacter	TokenNameIdentifier	 is Legal Character
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"0xE000"	TokenNameStringLiteral	0xE000
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isLegalCharacter	TokenNameIdentifier	 is Legal Character
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"0xFFFD"	TokenNameStringLiteral	0xFFFD
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isLegalCharacter	TokenNameIdentifier	 is Legal Character
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"0xFFFE"	TokenNameStringLiteral	0xFFFE
,	TokenNameCOMMA	
!	TokenNameNOT	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
isLegalCharacter	TokenNameIdentifier	 is Legal Character
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCDATAEndEncoding	TokenNameIdentifier	 test CDATA End Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"]>"	TokenNameStringLiteral	]>
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodedata	TokenNameIdentifier	 encodedata
(	TokenNameLPAREN	
"]>"	TokenNameStringLiteral	]>
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"]]"	TokenNameStringLiteral	]]
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodedata	TokenNameIdentifier	 encodedata
(	TokenNameLPAREN	
"]]"	TokenNameStringLiteral	]]
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"]]]]><![CDATA[>"	TokenNameStringLiteral	]]]]><![CDATA[>
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodedata	TokenNameIdentifier	 encodedata
(	TokenNameLPAREN	
"]]>"	TokenNameStringLiteral	]]>
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"]]]]><![CDATA[>A"	TokenNameStringLiteral	]]]]><![CDATA[>A
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodedata	TokenNameIdentifier	 encodedata
(	TokenNameLPAREN	
"]]>A"	TokenNameStringLiteral	]]>A
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"A]]]]><![CDATA[>"	TokenNameStringLiteral	A]]]]><![CDATA[>
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodedata	TokenNameIdentifier	 encodedata
(	TokenNameLPAREN	
"A]]>"	TokenNameStringLiteral	A]]>
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"A]]]]><![CDATA[>A"	TokenNameStringLiteral	A]]]]><![CDATA[>A
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodedata	TokenNameIdentifier	 encodedata
(	TokenNameLPAREN	
"A]]>A"	TokenNameStringLiteral	A]]>A
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"A]]]]><![CDATA[>B]]]]><![CDATA[>C"	TokenNameStringLiteral	A]]]]><![CDATA[>B]]]]><![CDATA[>C
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
encodedata	TokenNameIdentifier	 encodedata
(	TokenNameLPAREN	
"A]]>B]]>C"	TokenNameStringLiteral	A]]>B]]>C
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoAdditionalWhiteSpaceForText	TokenNameIdentifier	 test No Additional White Space For Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
newDocument	TokenNameIdentifier	 new Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
appendTextElement	TokenNameIdentifier	 append Text Element
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
"textElement"	TokenNameStringLiteral	textElement
,	TokenNameCOMMA	
"content"	TokenNameStringLiteral	content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringWriter	TokenNameIdentifier	 String Writer
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<root>"	TokenNameStringLiteral	<root>
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
" <textElement>content</textElement>"	TokenNameStringLiteral	 <textElement>content</textElement>
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
"</root>"	TokenNameStringLiteral	</root>
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoAdditionalWhiteSpaceForCDATA	TokenNameIdentifier	 test No Additional White Space For CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
newDocument	TokenNameIdentifier	 new Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
appendCDATAElement	TokenNameIdentifier	 append CDATA Element
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
"cdataElement"	TokenNameStringLiteral	cdataElement
,	TokenNameCOMMA	
"content"	TokenNameStringLiteral	content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringWriter	TokenNameIdentifier	 String Writer
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<root>"	TokenNameStringLiteral	<root>
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
" <cdataElement><![CDATA[content]]></cdataElement>"	TokenNameStringLiteral	 <cdataElement><![CDATA[content]]></cdataElement>
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
"</root>"	TokenNameStringLiteral	</root>
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoAdditionalWhiteSpaceForEmptyElement	TokenNameIdentifier	 test No Additional White Space For Empty Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
newDocument	TokenNameIdentifier	 new Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
createChildElement	TokenNameIdentifier	 create Child Element
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
"emptyElement"	TokenNameStringLiteral	emptyElement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringWriter	TokenNameIdentifier	 String Writer
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<root>"	TokenNameStringLiteral	<root>
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
// + " <emptyElement></emptyElement>" 	TokenNameCOMMENT_LINE	+ " <emptyElement></emptyElement>" 
+	TokenNamePLUS	
" <emptyElement />"	TokenNameStringLiteral	 <emptyElement />
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
"</root>"	TokenNameStringLiteral	</root>
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoNSPrefixByDefault	TokenNameIdentifier	 test No NS Prefix By Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
newDocument	TokenNameIdentifier	 new Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
"urn:foo"	TokenNameStringLiteral	urn:foo
,	TokenNameCOMMA	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
"urn:foo2"	TokenNameStringLiteral	urn:foo2
,	TokenNameCOMMA	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
"baz"	TokenNameStringLiteral	baz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringWriter	TokenNameIdentifier	 String Writer
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<root bar="baz" />"	TokenNameStringLiteral	<root bar="baz" />
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNSOnElement	TokenNameIdentifier	 test NS On Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
newDocument	TokenNameIdentifier	 new Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
"urn:foo"	TokenNameStringLiteral	urn:foo
,	TokenNameCOMMA	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
"urn:foo2"	TokenNameStringLiteral	urn:foo2
,	TokenNameCOMMA	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
"baz"	TokenNameStringLiteral	baz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringWriter	TokenNameIdentifier	 String Writer
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
.	TokenNameDOT	
XmlNamespacePolicy	TokenNameIdentifier	 Xml Namespace Policy
.	TokenNameDOT	
ONLY_QUALIFY_ELEMENTS	TokenNameIdentifier	 ONLY  QUALIFY  ELEMENTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<root bar="baz" xmlns="urn:foo" />"	TokenNameStringLiteral	<root bar="baz" xmlns="urn:foo" />
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNSPrefixOnAttribute	TokenNameIdentifier	 test NS Prefix On Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
newDocument	TokenNameIdentifier	 new Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
"urn:foo"	TokenNameStringLiteral	urn:foo
,	TokenNameCOMMA	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
"urn:foo2"	TokenNameStringLiteral	urn:foo2
,	TokenNameCOMMA	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
"baz"	TokenNameStringLiteral	baz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringWriter	TokenNameIdentifier	 String Writer
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
.	TokenNameDOT	
XmlNamespacePolicy	TokenNameIdentifier	 Xml Namespace Policy
.	TokenNameDOT	
QUALIFY_ALL	TokenNameIdentifier	 QUALIFY  ALL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<root ns0:bar="baz" xmlns="urn:foo""	TokenNameStringLiteral	<root ns0:bar="baz" xmlns="urn:foo"
+	TokenNamePLUS	
" xmlns:ns0="urn:foo2" />"	TokenNameStringLiteral	 xmlns:ns0="urn:foo2" />
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNSPrefixOnAttributeEvenWithoutElement	TokenNameIdentifier	 test NS Prefix On Attribute Even Without Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
newDocument	TokenNameIdentifier	 new Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
"urn:foo"	TokenNameStringLiteral	urn:foo
,	TokenNameCOMMA	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
"urn:foo2"	TokenNameStringLiteral	urn:foo2
,	TokenNameCOMMA	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
"baz"	TokenNameStringLiteral	baz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringWriter	TokenNameIdentifier	 String Writer
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
new	TokenNamenew	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
.	TokenNameDOT	
XmlNamespacePolicy	TokenNameIdentifier	 Xml Namespace Policy
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<root ns0:bar="baz" xmlns:ns0="urn:foo2" />"	TokenNameStringLiteral	<root ns0:bar="baz" xmlns:ns0="urn:foo2" />
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNSGetsReused	TokenNameIdentifier	 test NS Gets Reused
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
newDocument	TokenNameIdentifier	 new Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
"urn:foo"	TokenNameStringLiteral	urn:foo
,	TokenNameCOMMA	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
"urn:foo"	TokenNameStringLiteral	urn:foo
,	TokenNameCOMMA	
"child"	TokenNameStringLiteral	child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringWriter	TokenNameIdentifier	 String Writer
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
.	TokenNameDOT	
XmlNamespacePolicy	TokenNameIdentifier	 Xml Namespace Policy
.	TokenNameDOT	
ONLY_QUALIFY_ELEMENTS	TokenNameIdentifier	 ONLY  QUALIFY  ELEMENTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<root xmlns="urn:foo">"	TokenNameStringLiteral	<root xmlns="urn:foo">
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
" <child />"	TokenNameStringLiteral	 <child />
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
"</root>"	TokenNameStringLiteral	</root>
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNSGoesOutOfScope	TokenNameIdentifier	 test NS Goes Out Of Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
newDocument	TokenNameIdentifier	 new Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
"urn:foo"	TokenNameStringLiteral	urn:foo
,	TokenNameCOMMA	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
"urn:foo2"	TokenNameStringLiteral	urn:foo2
,	TokenNameCOMMA	
"child"	TokenNameStringLiteral	child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
child2	TokenNameIdentifier	 child2
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
"urn:foo2"	TokenNameStringLiteral	urn:foo2
,	TokenNameCOMMA	
"child"	TokenNameStringLiteral	child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
child2	TokenNameIdentifier	 child2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
grandChild	TokenNameIdentifier	 grand Child
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
"urn:foo2"	TokenNameStringLiteral	urn:foo2
,	TokenNameCOMMA	
"grandchild"	TokenNameStringLiteral	grandchild
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child2	TokenNameIdentifier	 child2
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
grandChild	TokenNameIdentifier	 grand Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
child3	TokenNameIdentifier	 child3
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
"urn:foo2"	TokenNameStringLiteral	urn:foo2
,	TokenNameCOMMA	
"child"	TokenNameStringLiteral	child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
child3	TokenNameIdentifier	 child3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringWriter	TokenNameIdentifier	 String Writer
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
.	TokenNameDOT	
XmlNamespacePolicy	TokenNameIdentifier	 Xml Namespace Policy
.	TokenNameDOT	
ONLY_QUALIFY_ELEMENTS	TokenNameIdentifier	 ONLY  QUALIFY  ELEMENTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<root xmlns="urn:foo">"	TokenNameStringLiteral	<root xmlns="urn:foo">
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
" <ns0:child xmlns:ns0="urn:foo2" />"	TokenNameStringLiteral	 <ns0:child xmlns:ns0="urn:foo2" />
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
" <ns1:child xmlns:ns1="urn:foo2">"	TokenNameStringLiteral	 <ns1:child xmlns:ns1="urn:foo2">
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
" <ns1:grandchild />"	TokenNameStringLiteral	 <ns1:grandchild />
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
" </ns1:child>"	TokenNameStringLiteral	 </ns1:child>
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
" <ns2:child xmlns:ns2="urn:foo2" />"	TokenNameStringLiteral	 <ns2:child xmlns:ns2="urn:foo2" />
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
"</root>"	TokenNameStringLiteral	</root>
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
