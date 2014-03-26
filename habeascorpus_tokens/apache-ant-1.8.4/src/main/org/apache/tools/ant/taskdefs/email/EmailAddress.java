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
email	TokenNameIdentifier	 email
;	TokenNameSEMICOLON	
/** * Holds an email address. * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Holds an email address. * @since Ant 1.5 
public	TokenNamepublic	
class	TokenNameclass	
EmailAddress	TokenNameIdentifier	 Email Address
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
address	TokenNameIdentifier	 address
;	TokenNameSEMICOLON	
/** Creates an empty email address */	TokenNameCOMMENT_JAVADOC	 Creates an empty email address 
public	TokenNamepublic	
EmailAddress	TokenNameIdentifier	 Email Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new email address based on the given string * * @param email the email address (with or without <>) * Acceptable forms include: * address * <address> * name <address> * <address> name * (name) address * address (name) */	TokenNameCOMMENT_JAVADOC	 Creates a new email address based on the given string * @param email the email address (with or without <>) Acceptable forms include: address <address> name <address> <address> name (name) address address (name) 
// Make a limited attempt to extract a sanitized name and email address 	TokenNameCOMMENT_LINE	Make a limited attempt to extract a sanitized name and email address 
// Algorithm based on the one found in Ant's MailMessage.java 	TokenNameCOMMENT_LINE	Algorithm based on the one found in Ant's MailMessage.java 
public	TokenNamepublic	
EmailAddress	TokenNameIdentifier	 Email Address
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
email	TokenNameIdentifier	 email
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
minLen	TokenNameIdentifier	 min Len
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
email	TokenNameIdentifier	 email
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// shortcut for "<address>" 	TokenNameCOMMENT_LINE	shortcut for "<address>" 
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
minLen	TokenNameIdentifier	 min Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
email	TokenNameIdentifier	 email
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'<'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
email	TokenNameIdentifier	 email
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
email	TokenNameIdentifier	 email
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'>'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
email	TokenNameIdentifier	 email
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
address	TokenNameIdentifier	 address
=	TokenNameEQUAL	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
email	TokenNameIdentifier	 email
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
paramDepth	TokenNameIdentifier	 param Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
nStart	TokenNameIdentifier	 n Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
nEnd	TokenNameIdentifier	 n End
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
email	TokenNameIdentifier	 email
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
paramDepth	TokenNameIdentifier	 param Depth
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// support "address (name)" 	TokenNameCOMMENT_LINE	support "address (name)" 
nStart	TokenNameIdentifier	 n Start
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
paramDepth	TokenNameIdentifier	 param Depth
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// support "(name) address" 	TokenNameCOMMENT_LINE	support "(name) address" 
nEnd	TokenNameIdentifier	 n End
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
paramDepth	TokenNameIdentifier	 param Depth
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nEnd	TokenNameIdentifier	 n End
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
paramDepth	TokenNameIdentifier	 param Depth
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
!=	TokenNameNOT_EQUAL	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nStart	TokenNameIdentifier	 n Start
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// DEBUG: System.out.println( email ); 	TokenNameCOMMENT_LINE	DEBUG: System.out.println( email ); 
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DEBUG: System.out.println( "address: " + start + " " + end ); 	TokenNameCOMMENT_LINE	DEBUG: System.out.println( "address: " + start + " " + end ); 
if	TokenNameif	
(	TokenNameLPAREN	
nEnd	TokenNameIdentifier	 n End
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nEnd	TokenNameIdentifier	 n End
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DEBUG: System.out.println( "name: " + nStart + " " + nEnd ); 	TokenNameCOMMENT_LINE	DEBUG: System.out.println( "name: " + nStart + " " + nEnd ); 
this	TokenNamethis	
.	TokenNameDOT	
address	TokenNameIdentifier	 address
=	TokenNameEQUAL	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
email	TokenNameIdentifier	 email
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
email	TokenNameIdentifier	 email
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
nStart	TokenNameIdentifier	 n Start
,	TokenNameCOMMA	
nEnd	TokenNameIdentifier	 n End
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if the two substrings are longer than the original, then name 	TokenNameCOMMENT_LINE	if the two substrings are longer than the original, then name 
// contains address - so reset the name to null 	TokenNameCOMMENT_LINE	contains address - so reset the name to null 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
address	TokenNameIdentifier	 address
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A specialised trim() that trims whitespace, * '(', ')', '"', '<', '>' from the start and end of strings */	TokenNameCOMMENT_JAVADOC	 A specialised trim() that trims whitespace, '(', ')', '"', '<', '>' from the start and end of strings 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
boolean	TokenNameboolean	
trimAngleBrackets	TokenNameIdentifier	 trim Angle Brackets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
trim	TokenNameIdentifier	 trim
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
trim	TokenNameIdentifier	 trim
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
')'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'>'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
trimAngleBrackets	TokenNameIdentifier	 trim Angle Brackets
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'"'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trim	TokenNameIdentifier	 trim
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'('	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'<'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
trimAngleBrackets	TokenNameIdentifier	 trim Angle Brackets
)	TokenNameRPAREN	
||	TokenNameOR_OR	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'"'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trim	TokenNameIdentifier	 trim
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
trim	TokenNameIdentifier	 trim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the personal / display name of the address * * @param name the display name */	TokenNameCOMMENT_JAVADOC	 Sets the personal / display name of the address * @param name the display name 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the email address * * @param address the actual email address (without <>) */	TokenNameCOMMENT_JAVADOC	 Sets the email address * @param address the actual email address (without <>) 
public	TokenNamepublic	
void	TokenNamevoid	
setAddress	TokenNameIdentifier	 set Address
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
address	TokenNameIdentifier	 address
=	TokenNameEQUAL	
address	TokenNameIdentifier	 address
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a string "name &lt;address&gt;" or "address" * * @return a string representation of the address */	TokenNameCOMMENT_JAVADOC	 Constructs a string "name &lt;address&gt;" or "address" * @return a string representation of the address 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
address	TokenNameIdentifier	 address
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" <"	TokenNameStringLiteral	 <
+	TokenNamePLUS	
address	TokenNameIdentifier	 address
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the address * * @return the address part */	TokenNameCOMMENT_JAVADOC	 Returns the address * @return the address part 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAddress	TokenNameIdentifier	 get Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
address	TokenNameIdentifier	 address
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the display name * * @return the display name part */	TokenNameCOMMENT_JAVADOC	 Returns the display name * @return the display name part 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
