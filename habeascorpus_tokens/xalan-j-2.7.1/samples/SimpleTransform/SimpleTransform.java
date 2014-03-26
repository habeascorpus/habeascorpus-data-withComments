/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SimpleTransform.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SimpleTransform.java 470245 2006-11-02 06:34:33Z minchau $ 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Transformer	TokenNameIdentifier	 Transformer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamResult	TokenNameIdentifier	 Stream Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamSource	TokenNameIdentifier	 Stream Source
;	TokenNameSEMICOLON	
/** * Use the TraX interface to perform a transformation in the simplest manner possible * (3 statements). */	TokenNameCOMMENT_JAVADOC	 Use the TraX interface to perform a transformation in the simplest manner possible (3 statements). 
public	TokenNamepublic	
class	TokenNameclass	
SimpleTransform	TokenNameIdentifier	 Simple Transform
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
,	TokenNameCOMMA	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
,	TokenNameCOMMA	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Use the static TransformerFactory.newInstance() method to instantiate 	TokenNameCOMMENT_LINE	Use the static TransformerFactory.newInstance() method to instantiate 
// a TransformerFactory. The javax.xml.transform.TransformerFactory 	TokenNameCOMMENT_LINE	a TransformerFactory. The javax.xml.transform.TransformerFactory 
// system property setting determines the actual class to instantiate -- 	TokenNameCOMMENT_LINE	system property setting determines the actual class to instantiate -- 
// org.apache.xalan.transformer.TransformerImpl. 	TokenNameCOMMENT_LINE	org.apache.xalan.transformer.TransformerImpl. 
TransformerFactory	TokenNameIdentifier	 Transformer Factory
tFactory	TokenNameIdentifier	 t Factory
=	TokenNameEQUAL	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use the TransformerFactory to instantiate a Transformer that will work with 	TokenNameCOMMENT_LINE	Use the TransformerFactory to instantiate a Transformer that will work with 
// the stylesheet you specify. This method call also processes the stylesheet 	TokenNameCOMMENT_LINE	the stylesheet you specify. This method call also processes the stylesheet 
// into a compiled Templates object. 	TokenNameCOMMENT_LINE	into a compiled Templates object. 
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
tFactory	TokenNameIdentifier	 t Factory
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
"birds.xsl"	TokenNameStringLiteral	birds.xsl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use the Transformer to apply the associated Templates object to an XML document 	TokenNameCOMMENT_LINE	Use the Transformer to apply the associated Templates object to an XML document 
// (foo.xml) and write the output to a file (foo.out). 	TokenNameCOMMENT_LINE	(foo.xml) and write the output to a file (foo.out). 
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
"birds.xml"	TokenNameStringLiteral	birds.xml
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
StreamResult	TokenNameIdentifier	 Stream Result
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
"birds.out"	TokenNameStringLiteral	birds.out
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"************* The result is in birds.out *************"	TokenNameStringLiteral	************* The result is in birds.out *************
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
