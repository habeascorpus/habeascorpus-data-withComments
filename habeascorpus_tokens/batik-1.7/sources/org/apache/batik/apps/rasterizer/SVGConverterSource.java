/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
apps	TokenNameIdentifier	 apps
.	TokenNameDOT	
rasterizer	TokenNameIdentifier	 rasterizer
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
/** * Interface used to handle both Files and URLs in the * <tt>SVGConverter</tt> * * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> * @version $Id: SVGConverterSource.java 478160 2006-11-22 13:35:06Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Interface used to handle both Files and URLs in the <tt>SVGConverter</tt> * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> @version $Id: SVGConverterSource.java 478160 2006-11-22 13:35:06Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SVGConverterSource	TokenNameIdentifier	 SVG Converter Source
{	TokenNameLBRACE	
/** * Returns the name of the source. That would be the * name for a File or URL */	TokenNameCOMMENT_JAVADOC	 Returns the name of the source. That would be the name for a File or URL 
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets a <tt>TranscoderInput</tt> for that source */	TokenNameCOMMENT_JAVADOC	 Gets a <tt>TranscoderInput</tt> for that source 
InputStream	TokenNameIdentifier	 Input Stream
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Checks if same as source described by srcStr */	TokenNameCOMMENT_JAVADOC	 Checks if same as source described by srcStr 
boolean	TokenNameboolean	
isSameAs	TokenNameIdentifier	 is Same As
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
srcStr	TokenNameIdentifier	 src Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Checks if source can be read */	TokenNameCOMMENT_JAVADOC	 Checks if source can be read 
boolean	TokenNameboolean	
isReadable	TokenNameIdentifier	 is Readable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a URI string corresponding to this source */	TokenNameCOMMENT_JAVADOC	 Returns a URI string corresponding to this source 
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
