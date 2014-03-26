/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
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
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileWriter	TokenNameIdentifier	 File Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
OptionConverter	TokenNameIdentifier	 Option Converter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
ErrorHandler	TokenNameIdentifier	 Error Handler
;	TokenNameSEMICOLON	
/** TempFileAppender creates new unique file for each logging statement. @author <a HREF="mailto:leos.literak@12snap.com">Leos Literak</a> @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 TempFileAppender creates new unique file for each logging statement. @author <a HREF="mailto:leos.literak@12snap.com">Leos Literak</a> @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
TempFileAppender	TokenNameIdentifier	 Temp File Appender
extends	TokenNameextends	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
{	TokenNameLBRACE	
/** A string constant used in naming the option for setting the directory where the log files will be created. Current value of this string constant is <b>Path</b>. java.io.tmpdir directory will be used, if ommited. */	TokenNameCOMMENT_JAVADOC	 A string constant used in naming the option for setting the directory where the log files will be created. Current value of this string constant is <b>Path</b>. java.io.tmpdir directory will be used, if ommited. 
static	TokenNamestatic	
final	TokenNamefinal	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
PATH_OPTION	TokenNameIdentifier	 PATH  OPTION
=	TokenNameEQUAL	
"Path"	TokenNameStringLiteral	Path
;	TokenNameSEMICOLON	
/** The default path is actual directory. */	TokenNameCOMMENT_JAVADOC	 The default path is actual directory. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** A string constant used in naming the option for setting the prefix of the log files. It has to have at least 3 characters! Current value of this string constant is <b>Prefix</b>. */	TokenNameCOMMENT_JAVADOC	 A string constant used in naming the option for setting the prefix of the log files. It has to have at least 3 characters! Current value of this string constant is <b>Prefix</b>. 
static	TokenNamestatic	
final	TokenNamefinal	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
PREFIX_OPTION	TokenNameIdentifier	 PREFIX  OPTION
=	TokenNameEQUAL	
"Prefix"	TokenNameStringLiteral	Prefix
;	TokenNameSEMICOLON	
/** The default path is actual directory. */	TokenNameCOMMENT_JAVADOC	 The default path is actual directory. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
"l4j_"	TokenNameStringLiteral	l4j_
;	TokenNameSEMICOLON	
/** A string constant used in naming the option for setting the suffix of the log files. Current value of this string constant is <b>Suffix</b>. */	TokenNameCOMMENT_JAVADOC	 A string constant used in naming the option for setting the suffix of the log files. Current value of this string constant is <b>Suffix</b>. 
static	TokenNamestatic	
final	TokenNamefinal	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
SUFFIX_OPTION	TokenNameIdentifier	 SUFFIX  OPTION
=	TokenNameEQUAL	
"Suffix"	TokenNameStringLiteral	Suffix
;	TokenNameSEMICOLON	
/** The default path is actual directory. */	TokenNameCOMMENT_JAVADOC	 The default path is actual directory. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
".tmp"	TokenNameStringLiteral	.tmp
;	TokenNameSEMICOLON	
/** Default dir */	TokenNameCOMMENT_JAVADOC	 Default dir 
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The default constructor simply calls its parent's constructor. */	TokenNameCOMMENT_JAVADOC	 The default constructor simply calls its parent's constructor. 
public	TokenNamepublic	
TempFileAppender	TokenNameIdentifier	 Temp File Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Retuns the option names for this component */	TokenNameCOMMENT_JAVADOC	 Retuns the option names for this component 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getOptionStrings	TokenNameIdentifier	 get Option Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
concatanateArrays	TokenNameIdentifier	 concatanate Arrays
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
getOptionStrings	TokenNameIdentifier	 get Option Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
PATH_OPTION	TokenNameIdentifier	 PATH  OPTION
,	TokenNameCOMMA	
PREFIX_OPTION	TokenNameIdentifier	 PREFIX  OPTION
,	TokenNameCOMMA	
SUFFIX_OPTION	TokenNameIdentifier	 SUFFIX  OPTION
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set TempFileAppender specific options. The recognized options are <b>Path</b>, <b>Prefix</b> and <b>Suffix</b>, i.e. the values of the string constants {@link #PATH_OPTION}, {@link #PREFIX_OPTION} and respectively {@link #SUFFIX_OPTION}. The options of the super class {@link AppenderSkeleton} are also recognized. */	TokenNameCOMMENT_JAVADOC	 Set TempFileAppender specific options. The recognized options are <b>Path</b>, <b>Prefix</b> and <b>Suffix</b>, i.e. the values of the string constants {@link #PATH_OPTION}, {@link #PREFIX_OPTION} and respectively {@link #SUFFIX_OPTION}. The options of the super class {@link AppenderSkeleton} are also recognized. 
public	TokenNamepublic	
void	TokenNamevoid	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
PATH_OPTION	TokenNameIdentifier	 PATH  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Path cannot be empty!"	TokenNameStringLiteral	Path cannot be empty!
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
canWrite	TokenNameIdentifier	 can Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Cannot write to directory "	TokenNameStringLiteral	Cannot write to directory 
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
+	TokenNamePLUS	
"!"	TokenNameStringLiteral	!
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
PREFIX_OPTION	TokenNameIdentifier	 PREFIX  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Prefix cannot be shorter than 3 characters!"	TokenNameStringLiteral	Prefix cannot be shorter than 3 characters!
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
SUFFIX_OPTION	TokenNameIdentifier	 SUFFIX  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Suffix cannot be empty!"	TokenNameStringLiteral	Suffix cannot be empty!
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** This method is called by {@link AppenderSkeleton#doAppend} method. <p>Whenever this method is called, new unique file is created with specified prefix and suffix. The file is closed afterwards. <p>The format of the output will depend on this appender's layout. */	TokenNameCOMMENT_JAVADOC	 This method is called by {@link AppenderSkeleton#doAppend} method. <p>Whenever this method is called, new unique file is created with specified prefix and suffix. The file is closed afterwards. <p>The format of the output will depend on this appender's layout. 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
checkEntryConditions	TokenNameIdentifier	 check Entry Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
subAppend	TokenNameIdentifier	 sub Append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This method determines if there is a sense in attempting to append. */	TokenNameCOMMENT_JAVADOC	 This method determines if there is a sense in attempting to append. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
checkEntryConditions	TokenNameIdentifier	 check Entry Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This method does actual writing */	TokenNameCOMMENT_JAVADOC	 This method does actual writing 
protected	TokenNameprotected	
void	TokenNamevoid	
subAppend	TokenNameIdentifier	 sub Append
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
suffix	TokenNameIdentifier	 suffix
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Writer	TokenNameIdentifier	 Writer
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
(	TokenNameLPAREN	
new	TokenNamenew	
FileWriter	TokenNameIdentifier	 File Writer
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* this Appender is not supposed to be used for logging of Exceptions */	TokenNameCOMMENT_BLOCK	 this Appender is not supposed to be used for logging of Exceptions 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Error during creation of temporary File!"	TokenNameStringLiteral	Error during creation of temporary File!
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
requiresLayout	TokenNameIdentifier	 requires Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* nothing to do */	TokenNameCOMMENT_BLOCK	 nothing to do 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * @author $Author: carnold $ * @version $Revision: 511036 $ * @since $Date: 2007-02-23 18:48:53 +0100 (Fri, 23 Feb 2007) $ * * $Log$ * Revision 1.1.2.1 2005/05/27 03:27:54 mwomack * Fix for #35032. Added license header to .java files that did not already have a license. * * Revision 1.1 2001/04/20 17:38:31 ceki * * Added LeosLiterak's TempFileAppender.java * */	TokenNameCOMMENT_BLOCK	 @author $Author: carnold $ @version $Revision: 511036 $ @since $Date: 2007-02-23 18:48:53 +0100 (Fri, 23 Feb 2007) $ * $Log$ Revision 1.1.2.1 2005/05/27 03:27:54 mwomack Fix for #35032. Added license header to .java files that did not already have a license. * Revision 1.1 2001/04/20 17:38:31 ceki * Added LeosLiterak's TempFileAppender.java 
