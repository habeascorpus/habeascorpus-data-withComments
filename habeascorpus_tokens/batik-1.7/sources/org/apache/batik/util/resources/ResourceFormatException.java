/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
resources	TokenNameIdentifier	 resources
;	TokenNameSEMICOLON	
/** * Signals a format error in a resource bundle * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ResourceFormatException.java 592619 2007-11-07 05:47:24Z cam $ */	TokenNameCOMMENT_JAVADOC	 Signals a format error in a resource bundle * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ResourceFormatException.java 592619 2007-11-07 05:47:24Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
/** * The class name of the resource bundle requested * @serial */	TokenNameCOMMENT_JAVADOC	 The class name of the resource bundle requested @serial 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
/** * The name of the specific resource requested by the user * @serial */	TokenNameCOMMENT_JAVADOC	 The name of the specific resource requested by the user @serial 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
/** * Constructs a ResourceFormatException with the specified information. * A detail message is a String that describes this particular exception. * @param s the detail message * @param className the name of the resource class * @param key the key for the malformed resource. */	TokenNameCOMMENT_JAVADOC	 Constructs a ResourceFormatException with the specified information. A detail message is a String that describes this particular exception. @param s the detail message @param className the name of the resource class @param key the key for the malformed resource. 
public	TokenNamepublic	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets parameter passed by constructor. */	TokenNameCOMMENT_JAVADOC	 Gets parameter passed by constructor. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets parameter passed by constructor. */	TokenNameCOMMENT_JAVADOC	 Gets parameter passed by constructor. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a printable representation of this object */	TokenNameCOMMENT_JAVADOC	 Returns a printable representation of this object 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" ("	TokenNameStringLiteral	 (
+	TokenNamePLUS	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", bundle: "	TokenNameStringLiteral	, bundle: 
+	TokenNamePLUS	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
