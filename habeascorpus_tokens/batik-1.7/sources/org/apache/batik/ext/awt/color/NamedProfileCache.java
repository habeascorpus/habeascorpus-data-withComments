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
color	TokenNameIdentifier	 color
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SoftReferenceCache	TokenNameIdentifier	 Soft Reference Cache
;	TokenNameSEMICOLON	
/** * This class manages a cache of soft references to named profiles that * we have already loaded. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: NamedProfileCache.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class manages a cache of soft references to named profiles that we have already loaded. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: NamedProfileCache.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
NamedProfileCache	TokenNameIdentifier	 Named Profile Cache
extends	TokenNameextends	
SoftReferenceCache	TokenNameIdentifier	 Soft Reference Cache
{	TokenNameLBRACE	
static	TokenNamestatic	
NamedProfileCache	TokenNameIdentifier	 Named Profile Cache
theCache	TokenNameIdentifier	 the Cache
=	TokenNameEQUAL	
new	TokenNamenew	
NamedProfileCache	TokenNameIdentifier	 Named Profile Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
NamedProfileCache	TokenNameIdentifier	 Named Profile Cache
getDefaultCache	TokenNameIdentifier	 get Default Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
theCache	TokenNameIdentifier	 the Cache
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Let people create there own caches. */	TokenNameCOMMENT_JAVADOC	 Let people create there own caches. 
public	TokenNamepublic	
NamedProfileCache	TokenNameIdentifier	 Named Profile Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Check if <tt>request(profileName)</tt> will return with a ICCColorSpaceExt * (not putting you on the hook for it). Note that it is possible * that this will return true but between this call and the call * to request the soft-reference will be cleared. So it * is still possible for request to return NULL, just much less * likely (you can always call 'clear' in that case). */	TokenNameCOMMENT_JAVADOC	 Check if <tt>request(profileName)</tt> will return with a ICCColorSpaceExt (not putting you on the hook for it). Note that it is possible that this will return true but between this call and the call to request the soft-reference will be cleared. So it is still possible for request to return NULL, just much less likely (you can always call 'clear' in that case). 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
isPresent	TokenNameIdentifier	 is Present
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
profileName	TokenNameIdentifier	 profile Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
isPresentImpl	TokenNameIdentifier	 is Present Impl
(	TokenNameLPAREN	
profileName	TokenNameIdentifier	 profile Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if <tt>request(profileName)</tt> will return immediately with the * ICCColorSpaceExt. Note that it is possible that this will return * true but between this call and the call to request the * soft-reference will be cleared. */	TokenNameCOMMENT_JAVADOC	 Check if <tt>request(profileName)</tt> will return immediately with the ICCColorSpaceExt. Note that it is possible that this will return true but between this call and the call to request the soft-reference will be cleared. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
profileName	TokenNameIdentifier	 profile Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
isDoneImpl	TokenNameIdentifier	 is Done Impl
(	TokenNameLPAREN	
profileName	TokenNameIdentifier	 profile Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If this returns null then you are now 'on the hook'. * to put the ICCColorSpaceExt associated with String into the * cache. */	TokenNameCOMMENT_JAVADOC	 If this returns null then you are now 'on the hook'. to put the ICCColorSpaceExt associated with String into the cache. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
ICCColorSpaceExt	TokenNameIdentifier	 ICC Color Space Ext
request	TokenNameIdentifier	 request
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
profileName	TokenNameIdentifier	 profile Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ICCColorSpaceExt	TokenNameIdentifier	 ICC Color Space Ext
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
requestImpl	TokenNameIdentifier	 request Impl
(	TokenNameLPAREN	
profileName	TokenNameIdentifier	 profile Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clear the entry for String. * This is the easiest way to 'get off the hook'. * if you didn't indend to get on it. */	TokenNameCOMMENT_JAVADOC	 Clear the entry for String. This is the easiest way to 'get off the hook'. if you didn't indend to get on it. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
profileName	TokenNameIdentifier	 profile Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
clearImpl	TokenNameIdentifier	 clear Impl
(	TokenNameLPAREN	
profileName	TokenNameIdentifier	 profile Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Associate bi with profileName. bi is only referenced through * a soft reference so don't rely on the cache to keep it * around. If the map no longer contains our profileName it was * probably cleared or flushed since we were put on the hook * for it, so in that case we will do nothing. */	TokenNameCOMMENT_JAVADOC	 Associate bi with profileName. bi is only referenced through a soft reference so don't rely on the cache to keep it around. If the map no longer contains our profileName it was probably cleared or flushed since we were put on the hook for it, so in that case we will do nothing. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
profileName	TokenNameIdentifier	 profile Name
,	TokenNameCOMMA	
ICCColorSpaceExt	TokenNameIdentifier	 ICC Color Space Ext
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
putImpl	TokenNameIdentifier	 put Impl
(	TokenNameLPAREN	
profileName	TokenNameIdentifier	 profile Name
,	TokenNameCOMMA	
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
