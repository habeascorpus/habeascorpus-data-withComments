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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Parameter	TokenNameIdentifier	 Parameter
;	TokenNameSEMICOLON	
/** * Selector that filters files based on the how deep in the directory * tree they are. * * @since 1.5 */	TokenNameCOMMENT_JAVADOC	 Selector that filters files based on the how deep in the directory tree they are. * @since 1.5 
public	TokenNamepublic	
class	TokenNameclass	
DepthSelector	TokenNameIdentifier	 Depth Selector
extends	TokenNameextends	
BaseExtendSelector	TokenNameIdentifier	 Base Extend Selector
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** min attribute */	TokenNameCOMMENT_JAVADOC	 min attribute 
public	TokenNamepublic	
int	TokenNameint	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** max attribute */	TokenNameCOMMENT_JAVADOC	 max attribute 
public	TokenNamepublic	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** Used for parameterized custom selector */	TokenNameCOMMENT_JAVADOC	 Used for parameterized custom selector 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MIN_KEY	TokenNameIdentifier	 MIN  KEY
=	TokenNameEQUAL	
"min"	TokenNameStringLiteral	min
;	TokenNameSEMICOLON	
/** Used for parameterized custom selector */	TokenNameCOMMENT_JAVADOC	 Used for parameterized custom selector 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MAX_KEY	TokenNameIdentifier	 MAX  KEY
=	TokenNameEQUAL	
"max"	TokenNameStringLiteral	max
;	TokenNameSEMICOLON	
/** * Creates a new <code>DepthSelector</code> instance. * */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>DepthSelector</code> instance. 
public	TokenNamepublic	
DepthSelector	TokenNameIdentifier	 Depth Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @return a string describing this object */	TokenNameCOMMENT_JAVADOC	 @return a string describing this object 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"{depthselector min: "	TokenNameStringLiteral	{depthselector min: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" max: "	TokenNameStringLiteral	 max: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The minimum depth below the basedir before a file is selected. * * @param min minimum directory levels below basedir to go */	TokenNameCOMMENT_JAVADOC	 The minimum depth below the basedir before a file is selected. * @param min minimum directory levels below basedir to go 
public	TokenNamepublic	
void	TokenNamevoid	
setMin	TokenNameIdentifier	 set Min
(	TokenNameLPAREN	
int	TokenNameint	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The minimum depth below the basedir before a file is selected. * * @param max maximum directory levels below basedir to go */	TokenNameCOMMENT_JAVADOC	 The minimum depth below the basedir before a file is selected. * @param max maximum directory levels below basedir to go 
public	TokenNamepublic	
void	TokenNamevoid	
setMax	TokenNameIdentifier	 set Max
(	TokenNameLPAREN	
int	TokenNameint	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * When using this as a custom selector, this method will be called. * It translates each parameter into the appropriate setXXX() call. * * @param parameters the complete set of parameters for this selector */	TokenNameCOMMENT_JAVADOC	 When using this as a custom selector, this method will be called. It translates each parameter into the appropriate setXXX() call. * @param parameters the complete set of parameters for this selector 
public	TokenNamepublic	
void	TokenNamevoid	
setParameters	TokenNameIdentifier	 set Parameters
(	TokenNameLPAREN	
Parameter	TokenNameIdentifier	 Parameter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setParameters	TokenNameIdentifier	 set Parameters
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
paramname	TokenNameIdentifier	 paramname
=	TokenNameEQUAL	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
MIN_KEY	TokenNameIdentifier	 MIN  KEY
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
setMin	TokenNameIdentifier	 set Min
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfe1	TokenNameIdentifier	 nfe1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Invalid minimum value "	TokenNameStringLiteral	Invalid minimum value 
+	TokenNamePLUS	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
MAX_KEY	TokenNameIdentifier	 MAX  KEY
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
setMax	TokenNameIdentifier	 set Max
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfe1	TokenNameIdentifier	 nfe1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Invalid maximum value "	TokenNameStringLiteral	Invalid maximum value 
+	TokenNamePLUS	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Invalid parameter "	TokenNameStringLiteral	Invalid parameter 
+	TokenNamePLUS	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Checks to make sure all settings are kosher. In this case, it * means that the max depth is not lower than the min depth. */	TokenNameCOMMENT_JAVADOC	 Checks to make sure all settings are kosher. In this case, it means that the max depth is not lower than the min depth. 
public	TokenNamepublic	
void	TokenNamevoid	
verifySettings	TokenNameIdentifier	 verify Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
max	TokenNameIdentifier	 max
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"You must set at least one of the min or the "	TokenNameStringLiteral	You must set at least one of the min or the 
+	TokenNamePLUS	
"max levels."	TokenNameStringLiteral	max levels.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
<	TokenNameLESS	
min	TokenNameIdentifier	 min
&&	TokenNameAND_AND	
max	TokenNameIdentifier	 max
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"The maximum depth is lower than the minimum."	TokenNameStringLiteral	The maximum depth is lower than the minimum.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The heart of the matter. This is where the selector gets to decide * on the inclusion of a file in a particular fileset. Most of the work * for this selector is offloaded into SelectorUtils, a static class * that provides the same services for both FilenameSelector and * DirectoryScanner. * * @param basedir the base directory the scan is being done from * @param filename is the name of the file to check * @param file is a java.io.File object the selector can use * @return whether the file should be selected or not */	TokenNameCOMMENT_JAVADOC	 The heart of the matter. This is where the selector gets to decide on the inclusion of a file in a particular fileset. Most of the work for this selector is offloaded into SelectorUtils, a static class that provides the same services for both FilenameSelector and DirectoryScanner. * @param basedir the base directory the scan is being done from @param filename is the name of the file to check @param file is a java.io.File object the selector can use @return whether the file should be selected or not 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// throw BuildException on error 	TokenNameCOMMENT_LINE	throw BuildException on error 
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// If you felt daring, you could cache the basedir absolute path 	TokenNameCOMMENT_LINE	If you felt daring, you could cache the basedir absolute path 
String	TokenNameIdentifier	 String
absBase	TokenNameIdentifier	 abs Base
=	TokenNameEQUAL	
basedir	TokenNameIdentifier	 basedir
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
absFile	TokenNameIdentifier	 abs File
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokBase	TokenNameIdentifier	 tok Base
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
absBase	TokenNameIdentifier	 abs Base
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokFile	TokenNameIdentifier	 tok File
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
absFile	TokenNameIdentifier	 abs File
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokFile	TokenNameIdentifier	 tok File
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
filetoken	TokenNameIdentifier	 filetoken
=	TokenNameEQUAL	
tokFile	TokenNameIdentifier	 tok File
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokBase	TokenNameIdentifier	 tok Base
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
basetoken	TokenNameIdentifier	 basetoken
=	TokenNameEQUAL	
tokBase	TokenNameIdentifier	 tok Base
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Sanity check. Ditch it if you want faster performance 	TokenNameCOMMENT_LINE	Sanity check. Ditch it if you want faster performance 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
basetoken	TokenNameIdentifier	 basetoken
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
filetoken	TokenNameIdentifier	 filetoken
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"File "	TokenNameStringLiteral	File 
+	TokenNamePLUS	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
" does not appear within "	TokenNameStringLiteral	 does not appear within 
+	TokenNamePLUS	
absBase	TokenNameIdentifier	 abs Base
+	TokenNamePLUS	
"directory"	TokenNameStringLiteral	directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
depth	TokenNameIdentifier	 depth
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
depth	TokenNameIdentifier	 depth
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokBase	TokenNameIdentifier	 tok Base
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"File "	TokenNameStringLiteral	File 
+	TokenNamePLUS	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
" is outside of "	TokenNameStringLiteral	 is outside of 
+	TokenNamePLUS	
absBase	TokenNameIdentifier	 abs Base
+	TokenNamePLUS	
"directory tree"	TokenNameStringLiteral	directory tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
depth	TokenNameIdentifier	 depth
<	TokenNameLESS	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
