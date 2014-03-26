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
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
renderable	TokenNameIdentifier	 renderable
.	TokenNameDOT	
Filter	TokenNameIdentifier	 Filter
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
ParsedURL	TokenNameIdentifier	 Parsed URL
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
/** * This class manages a cache of soft references to Images that * we have already loaded. * * <p> * Adding an image is two fold. First you add the ParsedURL, this lets * the cache know that someone is working on this ParsedURL. Then when * the completed RenderedImage is ready you put it into the cache. * </p> * <p> * If someone requests a ParsedURL after it has been added but before it has * been put they will be blocked until the put. * </p> * * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> * @version $Id: URLImageCache.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class manages a cache of soft references to Images that we have already loaded. * <p> Adding an image is two fold. First you add the ParsedURL, this lets the cache know that someone is working on this ParsedURL. Then when the completed RenderedImage is ready you put it into the cache. </p> <p> If someone requests a ParsedURL after it has been added but before it has been put they will be blocked until the put. </p> * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> @version $Id: URLImageCache.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
URLImageCache	TokenNameIdentifier	 URL Image Cache
extends	TokenNameextends	
SoftReferenceCache	TokenNameIdentifier	 Soft Reference Cache
{	TokenNameLBRACE	
static	TokenNamestatic	
URLImageCache	TokenNameIdentifier	 URL Image Cache
theCache	TokenNameIdentifier	 the Cache
=	TokenNameEQUAL	
new	TokenNamenew	
URLImageCache	TokenNameIdentifier	 URL Image Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
URLImageCache	TokenNameIdentifier	 URL Image Cache
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
URLImageCache	TokenNameIdentifier	 URL Image Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Check if <tt>request(url)</tt> will return with a Filter * (not putting you on the hook for it). Note that it is possible * that this will return true but between this call and the call * to request the soft-reference will be cleared. So it * is still possible for request to return NULL, just much less * likely (you can always call 'clear' in that case). */	TokenNameCOMMENT_JAVADOC	 Check if <tt>request(url)</tt> will return with a Filter (not putting you on the hook for it). Note that it is possible that this will return true but between this call and the call to request the soft-reference will be cleared. So it is still possible for request to return NULL, just much less likely (you can always call 'clear' in that case). 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
isPresent	TokenNameIdentifier	 is Present
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
purl	TokenNameIdentifier	 purl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
isPresentImpl	TokenNameIdentifier	 is Present Impl
(	TokenNameLPAREN	
purl	TokenNameIdentifier	 purl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if <tt>request(url)</tt> will return immediately with the * Filter. Note that it is possible that this will return * true but between this call and the call to request the * soft-reference will be cleared. */	TokenNameCOMMENT_JAVADOC	 Check if <tt>request(url)</tt> will return immediately with the Filter. Note that it is possible that this will return true but between this call and the call to request the soft-reference will be cleared. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
purl	TokenNameIdentifier	 purl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
isDoneImpl	TokenNameIdentifier	 is Done Impl
(	TokenNameLPAREN	
purl	TokenNameIdentifier	 purl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If this returns null then you are now 'on the hook'. * to put the Filter associated with ParsedURL into the * cache. */	TokenNameCOMMENT_JAVADOC	 If this returns null then you are now 'on the hook'. to put the Filter associated with ParsedURL into the cache. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Filter	TokenNameIdentifier	 Filter
request	TokenNameIdentifier	 request
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
purl	TokenNameIdentifier	 purl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
requestImpl	TokenNameIdentifier	 request Impl
(	TokenNameLPAREN	
purl	TokenNameIdentifier	 purl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clear the entry for ParsedURL. * This is the easiest way to 'get off the hook'. * if you didn't indend to get on it. */	TokenNameCOMMENT_JAVADOC	 Clear the entry for ParsedURL. This is the easiest way to 'get off the hook'. if you didn't indend to get on it. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
purl	TokenNameIdentifier	 purl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
clearImpl	TokenNameIdentifier	 clear Impl
(	TokenNameLPAREN	
purl	TokenNameIdentifier	 purl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Associate bi with purl. bi is only referenced through * a soft reference so don't rely on the cache to keep it * around. If the map no longer contains our purl it was * probably cleared or flushed since we were put on the hook * for it, so in that case we will do nothing. */	TokenNameCOMMENT_JAVADOC	 Associate bi with purl. bi is only referenced through a soft reference so don't rely on the cache to keep it around. If the map no longer contains our purl it was probably cleared or flushed since we were put on the hook for it, so in that case we will do nothing. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
purl	TokenNameIdentifier	 purl
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filt	TokenNameIdentifier	 filt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
putImpl	TokenNameIdentifier	 put Impl
(	TokenNameLPAREN	
purl	TokenNameIdentifier	 purl
,	TokenNameCOMMA	
filt	TokenNameIdentifier	 filt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
