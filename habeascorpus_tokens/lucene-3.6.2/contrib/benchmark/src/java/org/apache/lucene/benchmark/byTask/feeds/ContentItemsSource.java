package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
feeds	TokenNameIdentifier	 feeds
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Closeable	TokenNameIdentifier	 Closeable
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Config	TokenNameIdentifier	 Config
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Format	TokenNameIdentifier	 Format
;	TokenNameSEMICOLON	
/** * Base class for source of data for benchmarking * <p> * Keeps track of various statistics, such as how many data items were generated, * size in bytes etc. * <p> * Supports the following configuration parameters: * <ul> * <li><b>content.source.forever</b> - specifies whether to generate items * forever (<b>default=true</b>). * <li><b>content.source.verbose</b> - specifies whether messages should be * output by the content source (<b>default=false</b>). * <li><b>content.source.encoding</b> - specifies which encoding to use when * reading the files of that content source. Certain implementations may define * a default value if this parameter is not specified. (<b>default=null</b>). * <li><b>content.source.log.step</b> - specifies for how many items a * message should be logged. If set to 0 it means no logging should occur. * <b>NOTE:</b> if verbose is set to false, logging should not occur even if * logStep is not 0 (<b>default=0</b>). * </ul> */	TokenNameCOMMENT_JAVADOC	 Base class for source of data for benchmarking <p> Keeps track of various statistics, such as how many data items were generated, size in bytes etc. <p> Supports the following configuration parameters: <ul> <li><b>content.source.forever</b> - specifies whether to generate items forever (<b>default=true</b>). <li><b>content.source.verbose</b> - specifies whether messages should be output by the content source (<b>default=false</b>). <li><b>content.source.encoding</b> - specifies which encoding to use when reading the files of that content source. Certain implementations may define a default value if this parameter is not specified. (<b>default=null</b>). <li><b>content.source.log.step</b> - specifies for how many items a message should be logged. If set to 0 it means no logging should occur. <b>NOTE:</b> if verbose is set to false, logging should not occur even if logStep is not 0 (<b>default=0</b>). </ul> 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ContentItemsSource	TokenNameIdentifier	 Content Items Source
implements	TokenNameimplements	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
private	TokenNameprivate	
long	TokenNamelong	
bytesCount	TokenNameIdentifier	 bytes Count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
totalBytesCount	TokenNameIdentifier	 total Bytes Count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
itemCount	TokenNameIdentifier	 item Count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
totalItemCount	TokenNameIdentifier	 total Item Count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Config	TokenNameIdentifier	 Config
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
lastPrintedNumUniqueTexts	TokenNameIdentifier	 last Printed Num Unique Texts
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
lastPrintedNumUniqueBytes	TokenNameIdentifier	 last Printed Num Unique Bytes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
printNum	TokenNameIdentifier	 print Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
forever	TokenNameIdentifier	 forever
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
logStep	TokenNameIdentifier	 log Step
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
/** update count of bytes generated by this source */	TokenNameCOMMENT_JAVADOC	 update count of bytes generated by this source 
protected	TokenNameprotected	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
addBytes	TokenNameIdentifier	 add Bytes
(	TokenNameLPAREN	
long	TokenNamelong	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytesCount	TokenNameIdentifier	 bytes Count
+=	TokenNamePLUS_EQUAL	
numBytes	TokenNameIdentifier	 num Bytes
;	TokenNameSEMICOLON	
totalBytesCount	TokenNameIdentifier	 total Bytes Count
+=	TokenNamePLUS_EQUAL	
numBytes	TokenNameIdentifier	 num Bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** update count of items generated by this source */	TokenNameCOMMENT_JAVADOC	 update count of items generated by this source 
protected	TokenNameprotected	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
addItem	TokenNameIdentifier	 add Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
itemCount	TokenNameIdentifier	 item Count
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
totalItemCount	TokenNameIdentifier	 total Item Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A convenience method for collecting all the files of a content source from * a given directory. The collected {@link File} instances are stored in the * given <code>files</code>. */	TokenNameCOMMENT_JAVADOC	 A convenience method for collecting all the files of a content source from a given directory. The collected {@link File} instances are stored in the given <code>files</code>. 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
collectFiles	TokenNameIdentifier	 collect Files
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
canRead	TokenNameIdentifier	 can Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dirFiles	TokenNameIdentifier	 dir Files
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
listFiles	TokenNameIdentifier	 list Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
dirFiles	TokenNameIdentifier	 dir Files
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
dirFiles	TokenNameIdentifier	 dir Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
dirFiles	TokenNameIdentifier	 dir Files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
collectFiles	TokenNameIdentifier	 collect Files
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
canRead	TokenNameIdentifier	 can Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns true whether it's time to log a message (depending on verbose and * the number of items generated). */	TokenNameCOMMENT_JAVADOC	 Returns true whether it's time to log a message (depending on verbose and the number of items generated). 
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
shouldLog	TokenNameIdentifier	 should Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
verbose	TokenNameIdentifier	 verbose
&&	TokenNameAND_AND	
logStep	TokenNameIdentifier	 log Step
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
itemCount	TokenNameIdentifier	 item Count
%	TokenNameREMAINDER	
logStep	TokenNameIdentifier	 log Step
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Called when reading from this content source is no longer required. */	TokenNameCOMMENT_JAVADOC	 Called when reading from this content source is no longer required. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Returns the number of bytes generated since last reset. */	TokenNameCOMMENT_JAVADOC	 Returns the number of bytes generated since last reset. 
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
getBytesCount	TokenNameIdentifier	 get Bytes Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bytesCount	TokenNameIdentifier	 bytes Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the number of generated items since last reset. */	TokenNameCOMMENT_JAVADOC	 Returns the number of generated items since last reset. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getItemsCount	TokenNameIdentifier	 get Items Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
itemCount	TokenNameIdentifier	 item Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Config	TokenNameIdentifier	 Config
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the total number of bytes that were generated by this source. */	TokenNameCOMMENT_JAVADOC	 Returns the total number of bytes that were generated by this source. 
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
getTotalBytesCount	TokenNameIdentifier	 get Total Bytes Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
totalBytesCount	TokenNameIdentifier	 total Bytes Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the total number of generated items. */	TokenNameCOMMENT_JAVADOC	 Returns the total number of generated items. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getTotalItemsCount	TokenNameIdentifier	 get Total Items Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
totalItemCount	TokenNameIdentifier	 total Item Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets the input for this content source, so that the test would behave as * if it was just started, input-wise. * <p> * <b>NOTE:</b> the default implementation resets the number of bytes and * items generated since the last reset, so it's important to call * super.resetInputs in case you override this method. */	TokenNameCOMMENT_JAVADOC	 Resets the input for this content source, so that the test would behave as if it was just started, input-wise. <p> <b>NOTE:</b> the default implementation resets the number of bytes and items generated since the last reset, so it's important to call super.resetInputs in case you override this method. 
public	TokenNamepublic	
void	TokenNamevoid	
resetInputs	TokenNameIdentifier	 reset Inputs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
bytesCount	TokenNameIdentifier	 bytes Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
itemCount	TokenNameIdentifier	 item Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the {@link Config} for this content source. If you override this * method, you must call super.setConfig. */	TokenNameCOMMENT_JAVADOC	 Sets the {@link Config} for this content source. If you override this method, you must call super.setConfig. 
public	TokenNamepublic	
void	TokenNamevoid	
setConfig	TokenNameIdentifier	 set Config
(	TokenNameLPAREN	
Config	TokenNameIdentifier	 Config
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
forever	TokenNameIdentifier	 forever
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"content.source.forever"	TokenNameStringLiteral	content.source.forever
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logStep	TokenNameIdentifier	 log Step
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"content.source.log.step"	TokenNameStringLiteral	content.source.log.step
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
verbose	TokenNameIdentifier	 verbose
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"content.source.verbose"	TokenNameStringLiteral	content.source.verbose
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"content.source.encoding"	TokenNameStringLiteral	content.source.encoding
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
printStatistics	TokenNameIdentifier	 print Statistics
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
itemsName	TokenNameIdentifier	 items Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
print	TokenNameIdentifier	 print
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
col	TokenNameIdentifier	 col
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
newline	TokenNameIdentifier	 newline
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"------------> "	TokenNameStringLiteral	------------> 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" statistics ("	TokenNameStringLiteral	 statistics (
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
printNum	TokenNameIdentifier	 print Num
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"): "	TokenNameStringLiteral	): 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
newline	TokenNameIdentifier	 newline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nut	TokenNameIdentifier	 nut
=	TokenNameEQUAL	
getTotalItemsCount	TokenNameIdentifier	 get Total Items Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nut	TokenNameIdentifier	 nut
>	TokenNameGREATER	
lastPrintedNumUniqueTexts	TokenNameIdentifier	 last Printed Num Unique Texts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
print	TokenNameIdentifier	 print
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"total count of "	TokenNameStringLiteral	total count of 
+	TokenNamePLUS	
itemsName	TokenNameIdentifier	 items Name
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Format	TokenNameIdentifier	 Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nut	TokenNameIdentifier	 nut
,	TokenNameCOMMA	
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
newline	TokenNameIdentifier	 newline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastPrintedNumUniqueTexts	TokenNameIdentifier	 last Printed Num Unique Texts
=	TokenNameEQUAL	
nut	TokenNameIdentifier	 nut
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
nub	TokenNameIdentifier	 nub
=	TokenNameEQUAL	
getTotalBytesCount	TokenNameIdentifier	 get Total Bytes Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nub	TokenNameIdentifier	 nub
>	TokenNameGREATER	
lastPrintedNumUniqueBytes	TokenNameIdentifier	 last Printed Num Unique Bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
print	TokenNameIdentifier	 print
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"total bytes of "	TokenNameStringLiteral	total bytes of 
+	TokenNamePLUS	
itemsName	TokenNameIdentifier	 items Name
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Format	TokenNameIdentifier	 Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nub	TokenNameIdentifier	 nub
,	TokenNameCOMMA	
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
newline	TokenNameIdentifier	 newline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastPrintedNumUniqueBytes	TokenNameIdentifier	 last Printed Num Unique Bytes
=	TokenNameEQUAL	
nub	TokenNameIdentifier	 nub
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getItemsCount	TokenNameIdentifier	 get Items Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
print	TokenNameIdentifier	 print
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"num "	TokenNameStringLiteral	num 
+	TokenNamePLUS	
itemsName	TokenNameIdentifier	 items Name
+	TokenNamePLUS	
" added since last inputs reset: "	TokenNameStringLiteral	 added since last inputs reset: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Format	TokenNameIdentifier	 Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getItemsCount	TokenNameIdentifier	 get Items Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
newline	TokenNameIdentifier	 newline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"total bytes added for "	TokenNameStringLiteral	total bytes added for 
+	TokenNamePLUS	
itemsName	TokenNameIdentifier	 items Name
+	TokenNamePLUS	
" since last inputs reset: "	TokenNameStringLiteral	 since last inputs reset: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Format	TokenNameIdentifier	 Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getBytesCount	TokenNameIdentifier	 get Bytes Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
newline	TokenNameIdentifier	 newline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
print	TokenNameIdentifier	 print
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
newline	TokenNameIdentifier	 newline
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printNum	TokenNameIdentifier	 print Num
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
