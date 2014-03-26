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
rendered	TokenNameIdentifier	 rendered
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
Raster	TokenNameIdentifier	 Raster
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
Reference	TokenNameIdentifier	 Reference
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
SoftReference	TokenNameIdentifier	 Soft Reference
;	TokenNameSEMICOLON	
/** * This is a useful class that wraps a Raster for patricipation in * an LRU Cache. When this object drops out of the LRU cache it * removes it's hard reference to the tile, but retains it's soft * reference allowing for the recovery of the tile when the JVM is * not under memory pressure * * @version $Id: TileLRUMember.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This is a useful class that wraps a Raster for patricipation in an LRU Cache. When this object drops out of the LRU cache it removes it's hard reference to the tile, but retains it's soft reference allowing for the recovery of the tile when the JVM is not under memory pressure * @version $Id: TileLRUMember.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TileLRUMember	TokenNameIdentifier	 Tile LRU Member
implements	TokenNameimplements	
LRUCache	TokenNameIdentifier	 LRU Cache
.	TokenNameDOT	
LRUObj	TokenNameIdentifier	 LRU Obj
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
LRUCache	TokenNameIdentifier	 LRU Cache
.	TokenNameDOT	
LRUNode	TokenNameIdentifier	 LRU Node
myNode	TokenNameIdentifier	 my Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Reference	TokenNameIdentifier	 Reference
wRaster	TokenNameIdentifier	 w Raster
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Raster	TokenNameIdentifier	 Raster
hRaster	TokenNameIdentifier	 h Raster
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TileLRUMember	TokenNameIdentifier	 Tile LRU Member
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
TileLRUMember	TokenNameIdentifier	 Tile LRU Member
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
ras	TokenNameIdentifier	 ras
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setRaster	TokenNameIdentifier	 set Raster
(	TokenNameLPAREN	
ras	TokenNameIdentifier	 ras
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRaster	TokenNameIdentifier	 set Raster
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
ras	TokenNameIdentifier	 ras
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hRaster	TokenNameIdentifier	 h Raster
=	TokenNameEQUAL	
ras	TokenNameIdentifier	 ras
;	TokenNameSEMICOLON	
wRaster	TokenNameIdentifier	 w Raster
=	TokenNameEQUAL	
new	TokenNamenew	
SoftReference	TokenNameIdentifier	 Soft Reference
(	TokenNameLPAREN	
ras	TokenNameIdentifier	 ras
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
checkRaster	TokenNameIdentifier	 check Raster
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hRaster	TokenNameIdentifier	 h Raster
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
wRaster	TokenNameIdentifier	 w Raster
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
wRaster	TokenNameIdentifier	 w Raster
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Raster	TokenNameIdentifier	 Raster
retrieveRaster	TokenNameIdentifier	 retrieve Raster
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hRaster	TokenNameIdentifier	 h Raster
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
hRaster	TokenNameIdentifier	 h Raster
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wRaster	TokenNameIdentifier	 w Raster
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
hRaster	TokenNameIdentifier	 h Raster
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
)	TokenNameRPAREN	
wRaster	TokenNameIdentifier	 w Raster
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hRaster	TokenNameIdentifier	 h Raster
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// didn't manage to retrieve it... 	TokenNameCOMMENT_LINE	didn't manage to retrieve it... 
wRaster	TokenNameIdentifier	 w Raster
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hRaster	TokenNameIdentifier	 h Raster
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LRUCache	TokenNameIdentifier	 LRU Cache
.	TokenNameDOT	
LRUNode	TokenNameIdentifier	 LRU Node
lruGet	TokenNameIdentifier	 lru Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
myNode	TokenNameIdentifier	 my Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
lruSet	TokenNameIdentifier	 lru Set
(	TokenNameLPAREN	
LRUCache	TokenNameIdentifier	 LRU Cache
.	TokenNameDOT	
LRUNode	TokenNameIdentifier	 LRU Node
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
{	TokenNameLBRACE	
myNode	TokenNameIdentifier	 my Node
=	TokenNameEQUAL	
nde	TokenNameIdentifier	 nde
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
lruRemove	TokenNameIdentifier	 lru Remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
myNode	TokenNameIdentifier	 my Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
hRaster	TokenNameIdentifier	 h Raster
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Removing"	TokenNameStringLiteral	Removing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
