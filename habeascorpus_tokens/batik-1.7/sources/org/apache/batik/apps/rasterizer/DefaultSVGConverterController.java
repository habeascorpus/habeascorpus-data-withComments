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
File	TokenNameIdentifier	 File
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
Transcoder	TokenNameIdentifier	 Transcoder
;	TokenNameSEMICOLON	
/** * Default controller for the * <tt>SVGConverter</tt> operation. * * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> * @version $Id: DefaultSVGConverterController.java 489226 2006-12-21 00:05:36Z cam $ */	TokenNameCOMMENT_JAVADOC	 Default controller for the <tt>SVGConverter</tt> operation. * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> @version $Id: DefaultSVGConverterController.java 489226 2006-12-21 00:05:36Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultSVGConverterController	TokenNameIdentifier	 Default SVG Converter Controller
implements	TokenNameimplements	
SVGConverterController	TokenNameIdentifier	 SVG Converter Controller
{	TokenNameLBRACE	
/** * Invoked when the rasterizer has computed the * exact description of what it should do. The controller * should return true if the transcoding process should * proceed or false otherwise. * * @param transcoder Transcoder which will be used for the conversion * @param hints set of hints that were set on the transcoder * @param sources list of SVG sources it will convert. * @param dest list of destination file it will use */	TokenNameCOMMENT_JAVADOC	 Invoked when the rasterizer has computed the exact description of what it should do. The controller should return true if the transcoding process should proceed or false otherwise. * @param transcoder Transcoder which will be used for the conversion @param hints set of hints that were set on the transcoder @param sources list of SVG sources it will convert. @param dest list of destination file it will use 
public	TokenNamepublic	
boolean	TokenNameboolean	
proceedWithComputedTask	TokenNameIdentifier	 proceed With Computed Task
(	TokenNameLPAREN	
Transcoder	TokenNameIdentifier	 Transcoder
transcoder	TokenNameIdentifier	 transcoder
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
hints	TokenNameIdentifier	 hints
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
sources	TokenNameIdentifier	 sources
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when the rasterizer is about to start transcoding * of a given source. * The controller should return true if the source should be * transcoded and false otherwise. */	TokenNameCOMMENT_JAVADOC	 Invoked when the rasterizer is about to start transcoding of a given source. The controller should return true if the source should be transcoded and false otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
proceedWithSourceTranscoding	TokenNameIdentifier	 proceed With Source Transcoding
(	TokenNameLPAREN	
SVGConverterSource	TokenNameIdentifier	 SVG Converter Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"About to transcoder source of type: "	TokenNameStringLiteral	About to transcoder source of type: 
+	TokenNamePLUS	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when the rasterizer got an error while * transcoding the input source. * The controller should return true if the transcoding process * should continue on other sources and it should return false * if it should not. * * @param errorCode see the {@link SVGConverter} error code descriptions. */	TokenNameCOMMENT_JAVADOC	 Invoked when the rasterizer got an error while transcoding the input source. The controller should return true if the transcoding process should continue on other sources and it should return false if it should not. * @param errorCode see the {@link SVGConverter} error code descriptions. 
public	TokenNamepublic	
boolean	TokenNameboolean	
proceedOnSourceTranscodingFailure	TokenNameIdentifier	 proceed On Source Transcoding Failure
(	TokenNameLPAREN	
SVGConverterSource	TokenNameIdentifier	 SVG Converter Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
errorCode	TokenNameIdentifier	 error Code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when the rasterizer successfully transcoded * the input source. */	TokenNameCOMMENT_JAVADOC	 Invoked when the rasterizer successfully transcoded the input source. 
public	TokenNamepublic	
void	TokenNamevoid	
onSourceTranscodingSuccess	TokenNameIdentifier	 on Source Transcoding Success
(	TokenNameLPAREN	
SVGConverterSource	TokenNameIdentifier	 SVG Converter Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
