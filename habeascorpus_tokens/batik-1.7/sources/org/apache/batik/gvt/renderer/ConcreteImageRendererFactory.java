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
renderer	TokenNameIdentifier	 renderer
;	TokenNameSEMICOLON	
/** * This class provides a factory for renderers. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ConcreteImageRendererFactory.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides a factory for renderers. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ConcreteImageRendererFactory.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ConcreteImageRendererFactory	TokenNameIdentifier	 Concrete Image Renderer Factory
implements	TokenNameimplements	
ImageRendererFactory	TokenNameIdentifier	 Image Renderer Factory
{	TokenNameLBRACE	
/** * Creates a new renderer. */	TokenNameCOMMENT_JAVADOC	 Creates a new renderer. 
public	TokenNamepublic	
Renderer	TokenNameIdentifier	 Renderer
createRenderer	TokenNameIdentifier	 create Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createStaticImageRenderer	TokenNameIdentifier	 create Static Image Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new static image renderer */	TokenNameCOMMENT_JAVADOC	 Creates a new static image renderer 
public	TokenNamepublic	
ImageRenderer	TokenNameIdentifier	 Image Renderer
createStaticImageRenderer	TokenNameIdentifier	 create Static Image Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
onMacOSX	TokenNameIdentifier	 on Mac OSX
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
MacRenderer	TokenNameIdentifier	 Mac Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
StaticRenderer	TokenNameIdentifier	 Static Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new dynamic image renderer */	TokenNameCOMMENT_JAVADOC	 Creates a new dynamic image renderer 
public	TokenNamepublic	
ImageRenderer	TokenNameIdentifier	 Image Renderer
createDynamicImageRenderer	TokenNameIdentifier	 create Dynamic Image Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
onMacOSX	TokenNameIdentifier	 on Mac OSX
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
MacRenderer	TokenNameIdentifier	 Mac Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DynamicRenderer	TokenNameIdentifier	 Dynamic Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
onMacOSX	TokenNameIdentifier	 on Mac OSX
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
// This should be OK for applets. 	TokenNameCOMMENT_LINE	This should be OK for applets. 
onMacOSX	TokenNameIdentifier	 on Mac OSX
=	TokenNameEQUAL	
(	TokenNameLPAREN	
"Mac OS X"	TokenNameStringLiteral	Mac OS X
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"os.name"	TokenNameStringLiteral	os.name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
