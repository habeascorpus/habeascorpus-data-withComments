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
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
jsp	TokenNameIdentifier	 jsp
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * This is a class derived from the Jasper code * (org.apache.jasper.compiler.CommandLineCompiler) to map from a JSP filename * to a valid Java classname. * */	TokenNameCOMMENT_JAVADOC	 This is a class derived from the Jasper code (org.apache.jasper.compiler.CommandLineCompiler) to map from a JSP filename to a valid Java classname. 
public	TokenNamepublic	
class	TokenNameclass	
JspNameMangler	TokenNameIdentifier	 Jsp Name Mangler
implements	TokenNameimplements	
JspMangler	TokenNameIdentifier	 Jsp Mangler
{	TokenNameLBRACE	
// CheckStyle:ConstantNameCheck OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:ConstantNameCheck OFF - bc 
/** * this is the list of keywords which can not be used as classnames */	TokenNameCOMMENT_JAVADOC	 this is the list of keywords which can not be used as classnames 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keywords	TokenNameIdentifier	 keywords
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"assert"	TokenNameStringLiteral	assert
,	TokenNameCOMMA	
"abstract"	TokenNameStringLiteral	abstract
,	TokenNameCOMMA	
"boolean"	TokenNameStringLiteral	boolean
,	TokenNameCOMMA	
"break"	TokenNameStringLiteral	break
,	TokenNameCOMMA	
"byte"	TokenNameStringLiteral	byte
,	TokenNameCOMMA	
"case"	TokenNameStringLiteral	case
,	TokenNameCOMMA	
"catch"	TokenNameStringLiteral	catch
,	TokenNameCOMMA	
"char"	TokenNameStringLiteral	char
,	TokenNameCOMMA	
"class"	TokenNameStringLiteral	class
,	TokenNameCOMMA	
"const"	TokenNameStringLiteral	const
,	TokenNameCOMMA	
"continue"	TokenNameStringLiteral	continue
,	TokenNameCOMMA	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
"do"	TokenNameStringLiteral	do
,	TokenNameCOMMA	
"double"	TokenNameStringLiteral	double
,	TokenNameCOMMA	
"else"	TokenNameStringLiteral	else
,	TokenNameCOMMA	
"extends"	TokenNameStringLiteral	extends
,	TokenNameCOMMA	
"final"	TokenNameStringLiteral	final
,	TokenNameCOMMA	
"finally"	TokenNameStringLiteral	finally
,	TokenNameCOMMA	
"float"	TokenNameStringLiteral	float
,	TokenNameCOMMA	
"for"	TokenNameStringLiteral	for
,	TokenNameCOMMA	
"goto"	TokenNameStringLiteral	goto
,	TokenNameCOMMA	
"if"	TokenNameStringLiteral	if
,	TokenNameCOMMA	
"implements"	TokenNameStringLiteral	implements
,	TokenNameCOMMA	
"import"	TokenNameStringLiteral	import
,	TokenNameCOMMA	
"instanceof"	TokenNameStringLiteral	instanceof
,	TokenNameCOMMA	
"int"	TokenNameStringLiteral	int
,	TokenNameCOMMA	
"interface"	TokenNameStringLiteral	interface
,	TokenNameCOMMA	
"long"	TokenNameStringLiteral	long
,	TokenNameCOMMA	
"native"	TokenNameStringLiteral	native
,	TokenNameCOMMA	
"new"	TokenNameStringLiteral	new
,	TokenNameCOMMA	
"package"	TokenNameStringLiteral	package
,	TokenNameCOMMA	
"private"	TokenNameStringLiteral	private
,	TokenNameCOMMA	
"protected"	TokenNameStringLiteral	protected
,	TokenNameCOMMA	
"public"	TokenNameStringLiteral	public
,	TokenNameCOMMA	
"return"	TokenNameStringLiteral	return
,	TokenNameCOMMA	
"short"	TokenNameStringLiteral	short
,	TokenNameCOMMA	
"static"	TokenNameStringLiteral	static
,	TokenNameCOMMA	
"super"	TokenNameStringLiteral	super
,	TokenNameCOMMA	
"switch"	TokenNameStringLiteral	switch
,	TokenNameCOMMA	
"synchronized"	TokenNameStringLiteral	synchronized
,	TokenNameCOMMA	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
"throw"	TokenNameStringLiteral	throw
,	TokenNameCOMMA	
"throws"	TokenNameStringLiteral	throws
,	TokenNameCOMMA	
"transient"	TokenNameStringLiteral	transient
,	TokenNameCOMMA	
"try"	TokenNameStringLiteral	try
,	TokenNameCOMMA	
"void"	TokenNameStringLiteral	void
,	TokenNameCOMMA	
"volatile"	TokenNameStringLiteral	volatile
,	TokenNameCOMMA	
"while"	TokenNameStringLiteral	while
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// CheckStyle:ConstantNameCheck ON 	TokenNameCOMMENT_LINE	CheckStyle:ConstantNameCheck ON 
/** * map from a jsp file to a java filename; does not do packages * * @param jspFile file * @return java filename */	TokenNameCOMMENT_JAVADOC	 map from a jsp file to a java filename; does not do packages * @param jspFile file @return java filename 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
mapJspToJavaName	TokenNameIdentifier	 map Jsp To Java Name
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
jspFile	TokenNameIdentifier	 jsp File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mapJspToBaseName	TokenNameIdentifier	 map Jsp To Base Name
(	TokenNameLPAREN	
jspFile	TokenNameIdentifier	 jsp File
)	TokenNameRPAREN	
+	TokenNamePLUS	
".java"	TokenNameStringLiteral	.java
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * map from a jsp file to a base name; does not deal with extensions * * @param jspFile jspFile file * @return exensionless potentially remapped name */	TokenNameCOMMENT_JAVADOC	 map from a jsp file to a base name; does not deal with extensions * @param jspFile jspFile file @return exensionless potentially remapped name 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mapJspToBaseName	TokenNameIdentifier	 map Jsp To Base Name
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
jspFile	TokenNameIdentifier	 jsp File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
stripExtension	TokenNameIdentifier	 strip Extension
(	TokenNameLPAREN	
jspFile	TokenNameIdentifier	 jsp File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// since we don't mangle extensions like the servlet does, 	TokenNameCOMMENT_LINE	since we don't mangle extensions like the servlet does, 
// we need to check for keywords as class names 	TokenNameCOMMENT_LINE	we need to check for keywords as class names 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
keywords	TokenNameIdentifier	 keywords
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keywords	TokenNameIdentifier	 keywords
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
className	TokenNameIdentifier	 class Name
+=	TokenNamePLUS_EQUAL	
"%"	TokenNameStringLiteral	%
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Fix for invalid characters. If you think of more add to the list. 	TokenNameCOMMENT_LINE	Fix for invalid characters. If you think of more add to the list. 
StringBuffer	TokenNameIdentifier	 String Buffer
modifiedClassName	TokenNameIdentifier	 modified Class Name
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// first char is more restrictive than the rest 	TokenNameCOMMENT_LINE	first char is more restrictive than the rest 
char	TokenNamechar	
firstChar	TokenNameIdentifier	 first Char
=	TokenNameEQUAL	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isJavaIdentifierStart	TokenNameIdentifier	 is Java Identifier Start
(	TokenNameLPAREN	
firstChar	TokenNameIdentifier	 first Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modifiedClassName	TokenNameIdentifier	 modified Class Name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
firstChar	TokenNameIdentifier	 first Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
modifiedClassName	TokenNameIdentifier	 modified Class Name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
mangleChar	TokenNameIdentifier	 mangle Char
(	TokenNameLPAREN	
firstChar	TokenNameIdentifier	 first Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this is the rest 	TokenNameCOMMENT_LINE	this is the rest 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
subChar	TokenNameIdentifier	 sub Char
=	TokenNameEQUAL	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isJavaIdentifierPart	TokenNameIdentifier	 is Java Identifier Part
(	TokenNameLPAREN	
subChar	TokenNameIdentifier	 sub Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modifiedClassName	TokenNameIdentifier	 modified Class Name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
subChar	TokenNameIdentifier	 sub Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
modifiedClassName	TokenNameIdentifier	 modified Class Name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
mangleChar	TokenNameIdentifier	 mangle Char
(	TokenNameLPAREN	
subChar	TokenNameIdentifier	 sub Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
modifiedClassName	TokenNameIdentifier	 modified Class Name
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get short filename from file * * @param jspFile file in * @return file without any jsp extension */	TokenNameCOMMENT_JAVADOC	 get short filename from file * @param jspFile file in @return file without any jsp extension 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
stripExtension	TokenNameIdentifier	 strip Extension
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
jspFile	TokenNameIdentifier	 jsp File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
removeSuffix	TokenNameIdentifier	 remove Suffix
(	TokenNameLPAREN	
jspFile	TokenNameIdentifier	 jsp File
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
".jsp"	TokenNameStringLiteral	.jsp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * definition of the char escaping algorithm * * @param ch char to mangle * @return mangled string; 5 digit hex value */	TokenNameCOMMENT_JAVADOC	 definition of the char escaping algorithm * @param ch char to mangle @return mangled string; 5 digit hex value 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
mangleChar	TokenNameIdentifier	 mangle Char
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
'/'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nzeros	TokenNameIdentifier	 nzeros
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
-	TokenNameMINUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'_'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
nzeros	TokenNameIdentifier	 nzeros
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
resultIndex	TokenNameIdentifier	 result Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
nzeros	TokenNameIdentifier	 nzeros
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
resultIndex	TokenNameIdentifier	 result Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
}	TokenNameRBRACE	
/** * taking in the substring representing the path relative to the source dir * return a new string representing the destination path * not supported, as jasper in tomcat4.0 doesnt either * @param path not used * @return null always. */	TokenNameCOMMENT_JAVADOC	 taking in the substring representing the path relative to the source dir return a new string representing the destination path not supported, as jasper in tomcat4.0 doesnt either @param path not used @return null always. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
mapPath	TokenNameIdentifier	 map Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
