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
util	TokenNameIdentifier	 util
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
/** * Implementation of FileNameMapper that does simple wildcard pattern * replacements. * * <p>This does simple translations like *.foo -> *.bar where the * prefix to .foo will be left unchanged. It only handles a single * * character, use regular expressions for more complicated * situations.</p> * * <p>This is one of the more useful Mappers, it is used by javac for * example.</p> * */	TokenNameCOMMENT_JAVADOC	 Implementation of FileNameMapper that does simple wildcard pattern replacements. * <p>This does simple translations like *.foo -> *.bar where the prefix to .foo will be left unchanged. It only handles a single * character, use regular expressions for more complicated situations.</p> * <p>This is one of the more useful Mappers, it is used by javac for example.</p> 
public	TokenNamepublic	
class	TokenNameclass	
GlobPatternMapper	TokenNameIdentifier	 Glob Pattern Mapper
implements	TokenNameimplements	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** * Part of &quot;from&quot; pattern before the *. */	TokenNameCOMMENT_JAVADOC	 Part of &quot;from&quot; pattern before the *. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fromPrefix	TokenNameIdentifier	 from Prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Part of &quot;from&quot; pattern after the *. */	TokenNameCOMMENT_JAVADOC	 Part of &quot;from&quot; pattern after the *. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fromPostfix	TokenNameIdentifier	 from Postfix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Length of the prefix (&quot;from&quot; pattern). */	TokenNameCOMMENT_JAVADOC	 Length of the prefix (&quot;from&quot; pattern). 
protected	TokenNameprotected	
int	TokenNameint	
prefixLength	TokenNameIdentifier	 prefix Length
;	TokenNameSEMICOLON	
/** * Length of the postfix (&quot;from&quot; pattern). */	TokenNameCOMMENT_JAVADOC	 Length of the postfix (&quot;from&quot; pattern). 
protected	TokenNameprotected	
int	TokenNameint	
postfixLength	TokenNameIdentifier	 postfix Length
;	TokenNameSEMICOLON	
/** * Part of &quot;to&quot; pattern before the *. */	TokenNameCOMMENT_JAVADOC	 Part of &quot;to&quot; pattern before the *. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
toPrefix	TokenNameIdentifier	 to Prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Part of &quot;to&quot; pattern after the *. */	TokenNameCOMMENT_JAVADOC	 Part of &quot;to&quot; pattern after the *. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
toPostfix	TokenNameIdentifier	 to Postfix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
private	TokenNameprivate	
boolean	TokenNameboolean	
fromContainsStar	TokenNameIdentifier	 from Contains Star
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
toContainsStar	TokenNameIdentifier	 to Contains Star
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
handleDirSep	TokenNameIdentifier	 handle Dir Sep
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
caseSensitive	TokenNameIdentifier	 case Sensitive
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Attribute specifying whether to ignore the difference * between / and \ (the two common directory characters). * @param handleDirSep a boolean, default is false. * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Attribute specifying whether to ignore the difference between / and \ (the two common directory characters). @param handleDirSep a boolean, default is false. @since Ant 1.6.3 
public	TokenNamepublic	
void	TokenNamevoid	
setHandleDirSep	TokenNameIdentifier	 set Handle Dir Sep
(	TokenNameLPAREN	
boolean	TokenNameboolean	
handleDirSep	TokenNameIdentifier	 handle Dir Sep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
handleDirSep	TokenNameIdentifier	 handle Dir Sep
=	TokenNameEQUAL	
handleDirSep	TokenNameIdentifier	 handle Dir Sep
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Attribute specifying whether to ignore the difference * between / and \ (the two common directory characters). * @since Ant 1.8.3 */	TokenNameCOMMENT_JAVADOC	 Attribute specifying whether to ignore the difference between / and \ (the two common directory characters). @since Ant 1.8.3 
public	TokenNamepublic	
boolean	TokenNameboolean	
getHandleDirSep	TokenNameIdentifier	 get Handle Dir Sep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
handleDirSep	TokenNameIdentifier	 handle Dir Sep
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Attribute specifying whether to ignore the case difference * in the names. * * @param caseSensitive a boolean, default is false. * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Attribute specifying whether to ignore the case difference in the names. * @param caseSensitive a boolean, default is false. @since Ant 1.6.3 
public	TokenNamepublic	
void	TokenNamevoid	
setCaseSensitive	TokenNameIdentifier	 set Case Sensitive
(	TokenNameLPAREN	
boolean	TokenNameboolean	
caseSensitive	TokenNameIdentifier	 case Sensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
caseSensitive	TokenNameIdentifier	 case Sensitive
=	TokenNameEQUAL	
caseSensitive	TokenNameIdentifier	 case Sensitive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the &quot;from&quot; pattern. Required. * @param from a string */	TokenNameCOMMENT_JAVADOC	 Sets the &quot;from&quot; pattern. Required. @param from a string 
public	TokenNamepublic	
void	TokenNamevoid	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
from	TokenNameIdentifier	 from
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fromPrefix	TokenNameIdentifier	 from Prefix
=	TokenNameEQUAL	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
fromPostfix	TokenNameIdentifier	 from Postfix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fromPrefix	TokenNameIdentifier	 from Prefix
=	TokenNameEQUAL	
from	TokenNameIdentifier	 from
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fromPostfix	TokenNameIdentifier	 from Postfix
=	TokenNameEQUAL	
from	TokenNameIdentifier	 from
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fromContainsStar	TokenNameIdentifier	 from Contains Star
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prefixLength	TokenNameIdentifier	 prefix Length
=	TokenNameEQUAL	
fromPrefix	TokenNameIdentifier	 from Prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
postfixLength	TokenNameIdentifier	 postfix Length
=	TokenNameEQUAL	
fromPostfix	TokenNameIdentifier	 from Postfix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"this mapper requires a 'from' attribute"	TokenNameStringLiteral	this mapper requires a 'from' attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the &quot;to&quot; pattern. Required. * @param to a string */	TokenNameCOMMENT_JAVADOC	 Sets the &quot;to&quot; pattern. Required. @param to a string 
public	TokenNamepublic	
void	TokenNamevoid	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toPrefix	TokenNameIdentifier	 to Prefix
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
toPostfix	TokenNameIdentifier	 to Postfix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
toPrefix	TokenNameIdentifier	 to Prefix
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toPostfix	TokenNameIdentifier	 to Postfix
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toContainsStar	TokenNameIdentifier	 to Contains Star
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"this mapper requires a 'to' attribute"	TokenNameStringLiteral	this mapper requires a 'to' attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns null if the source file name doesn't match the * &quot;from&quot; pattern, an one-element array containing the * translated file otherwise. * @param sourceFileName the filename to map * @return a list of converted filenames */	TokenNameCOMMENT_JAVADOC	 Returns null if the source file name doesn't match the &quot;from&quot; pattern, an one-element array containing the translated file otherwise. @param sourceFileName the filename to map @return a list of converted filenames 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mapFileName	TokenNameIdentifier	 map File Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sourceFileName	TokenNameIdentifier	 source File Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
modName	TokenNameIdentifier	 mod Name
=	TokenNameEQUAL	
modifyName	TokenNameIdentifier	 modify Name
(	TokenNameLPAREN	
sourceFileName	TokenNameIdentifier	 source File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fromPrefix	TokenNameIdentifier	 from Prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
sourceFileName	TokenNameIdentifier	 source File Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
(	TokenNameLPAREN	
prefixLength	TokenNameIdentifier	 prefix Length
+	TokenNamePLUS	
postfixLength	TokenNameIdentifier	 postfix Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
fromContainsStar	TokenNameIdentifier	 from Contains Star
&&	TokenNameAND_AND	
!	TokenNameNOT	
modName	TokenNameIdentifier	 mod Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
modifyName	TokenNameIdentifier	 modify Name
(	TokenNameLPAREN	
fromPrefix	TokenNameIdentifier	 from Prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
fromContainsStar	TokenNameIdentifier	 from Contains Star
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
modName	TokenNameIdentifier	 mod Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
modifyName	TokenNameIdentifier	 modify Name
(	TokenNameLPAREN	
fromPrefix	TokenNameIdentifier	 from Prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
modName	TokenNameIdentifier	 mod Name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
modifyName	TokenNameIdentifier	 modify Name
(	TokenNameLPAREN	
fromPostfix	TokenNameIdentifier	 from Postfix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
toPrefix	TokenNameIdentifier	 to Prefix
+	TokenNamePLUS	
(	TokenNameLPAREN	
toContainsStar	TokenNameIdentifier	 to Contains Star
?	TokenNameQUESTION	
extractVariablePart	TokenNameIdentifier	 extract Variable Part
(	TokenNameLPAREN	
sourceFileName	TokenNameIdentifier	 source File Name
)	TokenNameRPAREN	
+	TokenNamePLUS	
toPostfix	TokenNameIdentifier	 to Postfix
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the part of the given string that matches the * in the * &quot;from&quot; pattern. * @param name the source file name * @return the variable part of the name */	TokenNameCOMMENT_JAVADOC	 Returns the part of the given string that matches the in the &quot;from&quot; pattern. @param name the source file name @return the variable part of the name 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
extractVariablePart	TokenNameIdentifier	 extract Variable Part
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
prefixLength	TokenNameIdentifier	 prefix Length
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
postfixLength	TokenNameIdentifier	 postfix Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * modify string based on dir char mapping and case sensitivity * @param name the name to convert * @return the converted name */	TokenNameCOMMENT_JAVADOC	 modify string based on dir char mapping and case sensitivity @param name the name to convert @return the converted name 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
modifyName	TokenNameIdentifier	 modify Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
caseSensitive	TokenNameIdentifier	 case Sensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
handleDirSep	TokenNameIdentifier	 handle Dir Sep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
