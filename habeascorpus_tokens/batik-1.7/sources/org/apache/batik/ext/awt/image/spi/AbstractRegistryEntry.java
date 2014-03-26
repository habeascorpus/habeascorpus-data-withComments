/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * * @version $Id: AbstractRegistryEntry.java 501094 2007-01-29 16:35:37Z deweese $ */	TokenNameCOMMENT_JAVADOC	 * @version $Id: AbstractRegistryEntry.java 501094 2007-01-29 16:35:37Z deweese $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractRegistryEntry	TokenNameIdentifier	 Abstract Registry Entry
implements	TokenNameimplements	
RegistryEntry	TokenNameIdentifier	 Registry Entry
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
float	TokenNamefloat	
priority	TokenNameIdentifier	 priority
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
exts	TokenNameIdentifier	 exts
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
mimeTypes	TokenNameIdentifier	 mime Types
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AbstractRegistryEntry	TokenNameIdentifier	 Abstract Registry Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
float	TokenNamefloat	
priority	TokenNameIdentifier	 priority
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
exts	TokenNameIdentifier	 exts
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mimeTypes	TokenNameIdentifier	 mime Types
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
priority	TokenNameIdentifier	 priority
=	TokenNameEQUAL	
priority	TokenNameIdentifier	 priority
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exts	TokenNameIdentifier	 exts
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
exts	TokenNameIdentifier	 exts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
exts	TokenNameIdentifier	 exts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
exts	TokenNameIdentifier	 exts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
exts	TokenNameIdentifier	 exts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exts	TokenNameIdentifier	 exts
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableList	TokenNameIdentifier	 unmodifiable List
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
exts	TokenNameIdentifier	 exts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mimeTypes	TokenNameIdentifier	 mime Types
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
mimeTypes	TokenNameIdentifier	 mime Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
mimeTypes	TokenNameIdentifier	 mime Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
mimeTypes	TokenNameIdentifier	 mime Types
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mimeTypes	TokenNameIdentifier	 mime Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mimeTypes	TokenNameIdentifier	 mime Types
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableList	TokenNameIdentifier	 unmodifiable List
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
mimeTypes	TokenNameIdentifier	 mime Types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractRegistryEntry	TokenNameIdentifier	 Abstract Registry Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
float	TokenNamefloat	
priority	TokenNameIdentifier	 priority
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ext	TokenNameIdentifier	 ext
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
mimeType	TokenNameIdentifier	 mime Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
priority	TokenNameIdentifier	 priority
=	TokenNameEQUAL	
priority	TokenNameIdentifier	 priority
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exts	TokenNameIdentifier	 exts
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exts	TokenNameIdentifier	 exts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ext	TokenNameIdentifier	 ext
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exts	TokenNameIdentifier	 exts
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableList	TokenNameIdentifier	 unmodifiable List
(	TokenNameLPAREN	
exts	TokenNameIdentifier	 exts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mimeTypes	TokenNameIdentifier	 mime Types
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mimeTypes	TokenNameIdentifier	 mime Types
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mimeType	TokenNameIdentifier	 mime Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mimeTypes	TokenNameIdentifier	 mime Types
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableList	TokenNameIdentifier	 unmodifiable List
(	TokenNameLPAREN	
mimeTypes	TokenNameIdentifier	 mime Types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFormatName	TokenNameIdentifier	 get Format Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getStandardExtensions	TokenNameIdentifier	 get Standard Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exts	TokenNameIdentifier	 exts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getMimeTypes	TokenNameIdentifier	 get Mime Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mimeTypes	TokenNameIdentifier	 mime Types
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
priority	TokenNameIdentifier	 priority
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
