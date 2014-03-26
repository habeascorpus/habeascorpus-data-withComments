/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
/** * Implements an XHTML serializer supporting both DOM and SAX * pretty serializing. For usage instructions see either {@link * Serializer} or {@link BaseMarkupSerializer}. * * @deprecated This class was deprecated in Xerces 2.6.2. It is * recommended that new applications use JAXP's Transformation API * for XML (TrAX) for serializing XHTML. See the Xerces documentation * for more information. * @version $Revision: 447253 $ $Date: 2006-09-18 01:32:50 -0400 (Mon, 18 Sep 2006) $ * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> * @see Serializer */	TokenNameCOMMENT_JAVADOC	 Implements an XHTML serializer supporting both DOM and SAX pretty serializing. For usage instructions see either {@link Serializer} or {@link BaseMarkupSerializer}. * @deprecated This class was deprecated in Xerces 2.6.2. It is recommended that new applications use JAXP's Transformation API for XML (TrAX) for serializing XHTML. See the Xerces documentation for more information. @version $Revision: 447253 $ $Date: 2006-09-18 01:32:50 -0400 (Mon, 18 Sep 2006) $ @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> @see Serializer 
public	TokenNamepublic	
class	TokenNameclass	
XHTMLSerializer	TokenNameIdentifier	 XHTML Serializer
extends	TokenNameextends	
HTMLSerializer	TokenNameIdentifier	 HTML Serializer
{	TokenNameLBRACE	
/** * Constructs a new serializer. The serializer cannot be used without * calling {@link #setOutputCharStream} or {@link #setOutputByteStream} * first. */	TokenNameCOMMENT_JAVADOC	 Constructs a new serializer. The serializer cannot be used without calling {@link #setOutputCharStream} or {@link #setOutputByteStream} first. 
public	TokenNamepublic	
XHTMLSerializer	TokenNameIdentifier	 XHTML Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
new	TokenNamenew	
OutputFormat	TokenNameIdentifier	 Output Format
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XHTML	TokenNameIdentifier	 XHTML
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new serializer. The serializer cannot be used without * calling {@link #setOutputCharStream} or {@link #setOutputByteStream} * first. */	TokenNameCOMMENT_JAVADOC	 Constructs a new serializer. The serializer cannot be used without calling {@link #setOutputCharStream} or {@link #setOutputByteStream} first. 
public	TokenNamepublic	
XHTMLSerializer	TokenNameIdentifier	 XHTML Serializer
(	TokenNameLPAREN	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
format	TokenNameIdentifier	 format
:	TokenNameCOLON	
new	TokenNamenew	
OutputFormat	TokenNameIdentifier	 Output Format
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XHTML	TokenNameIdentifier	 XHTML
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new serializer that writes to the specified writer * using the specified output format. If <tt>format</tt> is null, * will use a default output format. * * @param writer The writer to use * @param format The output format to use, null for the default */	TokenNameCOMMENT_JAVADOC	 Constructs a new serializer that writes to the specified writer using the specified output format. If <tt>format</tt> is null, will use a default output format. * @param writer The writer to use @param format The output format to use, null for the default 
public	TokenNamepublic	
XHTMLSerializer	TokenNameIdentifier	 XHTML Serializer
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
format	TokenNameIdentifier	 format
:	TokenNameCOLON	
new	TokenNamenew	
OutputFormat	TokenNameIdentifier	 Output Format
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XHTML	TokenNameIdentifier	 XHTML
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setOutputCharStream	TokenNameIdentifier	 set Output Char Stream
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new serializer that writes to the specified output * stream using the specified output format. If <tt>format</tt> * is null, will use a default output format. * * @param output The output stream to use * @param format The output format to use, null for the default */	TokenNameCOMMENT_JAVADOC	 Constructs a new serializer that writes to the specified output stream using the specified output format. If <tt>format</tt> is null, will use a default output format. * @param output The output stream to use @param format The output format to use, null for the default 
public	TokenNamepublic	
XHTMLSerializer	TokenNameIdentifier	 XHTML Serializer
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
format	TokenNameIdentifier	 format
:	TokenNameCOLON	
new	TokenNamenew	
OutputFormat	TokenNameIdentifier	 Output Format
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XHTML	TokenNameIdentifier	 XHTML
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setOutputByteStream	TokenNameIdentifier	 set Output Byte Stream
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
format	TokenNameIdentifier	 format
:	TokenNameCOLON	
new	TokenNamenew	
OutputFormat	TokenNameIdentifier	 Output Format
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XHTML	TokenNameIdentifier	 XHTML
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
