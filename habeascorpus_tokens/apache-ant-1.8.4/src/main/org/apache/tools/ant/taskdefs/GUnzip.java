/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
GZIPInputStream	TokenNameIdentifier	 GZIP Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
/** * Expands a file that has been compressed with the GZIP * algorithm. Normally used to compress non-compressed archives such * as TAR files. * * @since Ant 1.1 * * @ant.task category="packaging" */	TokenNameCOMMENT_JAVADOC	 Expands a file that has been compressed with the GZIP algorithm. Normally used to compress non-compressed archives such as TAR files. * @since Ant 1.1 * @ant.task category="packaging" 
public	TokenNamepublic	
class	TokenNameclass	
GUnzip	TokenNameIdentifier	 G Unzip
extends	TokenNameextends	
Unpack	TokenNameIdentifier	 Unpack
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_EXTENSION	TokenNameIdentifier	 DEFAULT  EXTENSION
=	TokenNameEQUAL	
".gz"	TokenNameStringLiteral	.gz
;	TokenNameSEMICOLON	
/** * Get the default extension. * @return the value ".gz" */	TokenNameCOMMENT_JAVADOC	 Get the default extension. @return the value ".gz" 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getDefaultExtension	TokenNameIdentifier	 get Default Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DEFAULT_EXTENSION	TokenNameIdentifier	 DEFAULT  EXTENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implement the gunzipping. */	TokenNameCOMMENT_JAVADOC	 Implement the gunzipping. 
protected	TokenNameprotected	
void	TokenNamevoid	
extract	TokenNameIdentifier	 extract
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Expanding "	TokenNameStringLiteral	Expanding 
+	TokenNamePLUS	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileOutputStream	TokenNameIdentifier	 File Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
GZIPInputStream	TokenNameIdentifier	 GZIP Input Stream
zIn	TokenNameIdentifier	 z In
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
srcResource	TokenNameIdentifier	 src Resource
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zIn	TokenNameIdentifier	 z In
=	TokenNameEQUAL	
new	TokenNamenew	
GZIPInputStream	TokenNameIdentifier	 GZIP Input Stream
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
zIn	TokenNameIdentifier	 z In
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Problem expanding gzip "	TokenNameStringLiteral	Problem expanding gzip 
+	TokenNamePLUS	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
zIn	TokenNameIdentifier	 z In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Whether this task can deal with non-file resources. * * <p>This implementation returns true only if this task is * &lt;gunzip&gt;. Any subclass of this class that also wants to * support non-file resources needs to override this method. We * need to do so for backwards compatibility reasons since we * can't expect subclasses to support resources.</p> * @return true if this task supports non file resources. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Whether this task can deal with non-file resources. * <p>This implementation returns true only if this task is &lt;gunzip&gt;. Any subclass of this class that also wants to support non-file resources needs to override this method. We need to do so for backwards compatibility reasons since we can't expect subclasses to support resources.</p> @return true if this task supports non file resources. @since Ant 1.7 
protected	TokenNameprotected	
boolean	TokenNameboolean	
supportsNonFileResources	TokenNameIdentifier	 supports Non File Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
GUnzip	TokenNameIdentifier	 G Unzip
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
