package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
configuration	TokenNameIdentifier	 configuration
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * A path translator that resolves relative paths against a specific base directory. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 A path translator that resolves relative paths against a specific base directory. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
BasedirBeanConfigurationPathTranslator	TokenNameIdentifier	 Basedir Bean Configuration Path Translator
implements	TokenNameimplements	
BeanConfigurationPathTranslator	TokenNameIdentifier	 Bean Configuration Path Translator
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
;	TokenNameSEMICOLON	
/** * Creates a new path translator using the specified base directory. * * @param basedir The base directory to resolve relative paths against, may be {@code null} to disable path * translation. */	TokenNameCOMMENT_JAVADOC	 Creates a new path translator using the specified base directory. * @param basedir The base directory to resolve relative paths against, may be {@code null} to disable path translation. 
public	TokenNamepublic	
BasedirBeanConfigurationPathTranslator	TokenNameIdentifier	 Basedir Bean Configuration Path Translator
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
basedir	TokenNameIdentifier	 basedir
=	TokenNameEQUAL	
basedir	TokenNameIdentifier	 basedir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
File	TokenNameIdentifier	 File
translatePath	TokenNameIdentifier	 translate Path
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
basedir	TokenNameIdentifier	 basedir
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
isAbsolute	TokenNameIdentifier	 is Absolute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// path is already absolute, we're done 	TokenNameCOMMENT_LINE	path is already absolute, we're done 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// drive-relative Windows path, don't align with base dir but with drive root 	TokenNameCOMMENT_LINE	drive-relative Windows path, don't align with base dir but with drive root 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getAbsoluteFile	TokenNameIdentifier	 get Absolute File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// an ordinary relative path, align with base dir 	TokenNameCOMMENT_LINE	an ordinary relative path, align with base dir 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsoluteFile	TokenNameIdentifier	 get Absolute File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
