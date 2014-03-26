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
BufferedReader	TokenNameIdentifier	 Buffered Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
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
FileReader	TokenNameIdentifier	 File Reader
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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
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
Task	TokenNameIdentifier	 Task
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
/** * Keyword substitution. Input file is written to output file. * Do not make input file same as output file. * Keywords in input files look like this: @foo@. See the docs for the * setKeys method to understand how to do the substitutions. * * @since Ant 1.1 * @deprecated KeySubst is deprecated since Ant 1.1. Use Filter + Copy * instead. */	TokenNameCOMMENT_JAVADOC	 Keyword substitution. Input file is written to output file. Do not make input file same as output file. Keywords in input files look like this: @foo@. See the docs for the setKeys method to understand how to do the substitutions. * @since Ant 1.1 @deprecated KeySubst is deprecated since Ant 1.1. Use Filter + Copy instead. 
public	TokenNamepublic	
class	TokenNameclass	
KeySubst	TokenNameIdentifier	 Key Subst
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
sep	TokenNameIdentifier	 sep
=	TokenNameEQUAL	
"*"	TokenNameStringLiteral	*
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
replacements	TokenNameIdentifier	 replacements
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Do the execution. * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Do the execution. @throws BuildException on error 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"!! KeySubst is deprecated. Use Filter + Copy instead. !!"	TokenNameStringLiteral	!! KeySubst is deprecated. Use Filter + Copy instead. !!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Performing Substitutions"	TokenNameStringLiteral	Performing Substitutions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
dest	TokenNameIdentifier	 dest
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Source and destinations must not be null"	TokenNameStringLiteral	Source and destinations must not be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
br	TokenNameIdentifier	 br
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
bw	TokenNameIdentifier	 bw
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
br	TokenNameIdentifier	 br
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bw	TokenNameIdentifier	 bw
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
(	TokenNameLPAREN	
new	TokenNamenew	
FileWriter	TokenNameIdentifier	 File Writer
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
newline	TokenNameIdentifier	 newline
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
br	TokenNameIdentifier	 br
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bw	TokenNameIdentifier	 bw
.	TokenNameDOT	
newLine	TokenNameIdentifier	 new Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newline	TokenNameIdentifier	 newline
=	TokenNameEQUAL	
KeySubst	TokenNameIdentifier	 Key Subst
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
replacements	TokenNameIdentifier	 replacements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bw	TokenNameIdentifier	 bw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
newline	TokenNameIdentifier	 newline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bw	TokenNameIdentifier	 bw
.	TokenNameDOT	
newLine	TokenNameIdentifier	 new Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
br	TokenNameIdentifier	 br
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bw	TokenNameIdentifier	 bw
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
bw	TokenNameIdentifier	 bw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
br	TokenNameIdentifier	 br
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the source file. * @param s the source file */	TokenNameCOMMENT_JAVADOC	 Set the source file. @param s the source file 
public	TokenNamepublic	
void	TokenNamevoid	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the destination file. * @param dest the destination file */	TokenNameCOMMENT_JAVADOC	 Set the destination file. @param dest the destination file 
public	TokenNamepublic	
void	TokenNamevoid	
setDest	TokenNameIdentifier	 set Dest
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
dest	TokenNameIdentifier	 dest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the separator between name=value arguments * in setKeys(). By default it is "*". * @param sep the separator string */	TokenNameCOMMENT_JAVADOC	 Sets the separator between name=value arguments in setKeys(). By default it is "*". @param sep the separator string 
public	TokenNamepublic	
void	TokenNamevoid	
setSep	TokenNameIdentifier	 set Sep
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sep	TokenNameIdentifier	 sep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sep	TokenNameIdentifier	 sep
=	TokenNameEQUAL	
sep	TokenNameIdentifier	 sep
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the keys. * * Format string is like this: * <p> * name=value*name2=value * <p> * Names are case sensitive. * <p> * Use the setSep() method to change the * to something else * if you need to use * as a name or value. * @param keys a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 Sets the keys. * Format string is like this: <p> name=value*name2=value <p> Names are case sensitive. <p> Use the setSep() method to change the to something else if you need to use as a name or value. @param keys a <code>String</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setKeys	TokenNameIdentifier	 set Keys
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keys	TokenNameIdentifier	 keys
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
sep	TokenNameIdentifier	 sep
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
itok	TokenNameIdentifier	 itok
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
"="	TokenNameStringLiteral	=
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
itok	TokenNameIdentifier	 itok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
itok	TokenNameIdentifier	 itok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replacements	TokenNameIdentifier	 replacements
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A test method. * @param args not used */	TokenNameCOMMENT_JAVADOC	 A test method. @param args not used 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"VERSION"	TokenNameStringLiteral	VERSION
,	TokenNameCOMMA	
"1.0.3"	TokenNameStringLiteral	1.0.3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"ffff"	TokenNameStringLiteral	ffff
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
KeySubst	TokenNameIdentifier	 Key Subst
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
"$f ${VERSION} f ${b} jj $"	TokenNameStringLiteral	$f ${VERSION} f ${b} jj $
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Does replacement on text using the hashtable of keys. * @param origString an input string * @param keys mapping of keys to values * @return the string with the replacements in it. * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Does replacement on text using the hashtable of keys. @param origString an input string @param keys mapping of keys to values @return the string with the replacements in it. @throws BuildException on error 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
origString	TokenNameIdentifier	 orig String
,	TokenNameCOMMA	
Hashtable	TokenNameIdentifier	 Hashtable
keys	TokenNameIdentifier	 keys
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
finalString	TokenNameIdentifier	 final String
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
origString	TokenNameIdentifier	 orig String
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"${"	TokenNameStringLiteral	${
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
origString	TokenNameIdentifier	 orig String
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
origString	TokenNameIdentifier	 orig String
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
finalString	TokenNameIdentifier	 final String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
origString	TokenNameIdentifier	 orig String
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
finalString	TokenNameIdentifier	 final String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
finalString	TokenNameIdentifier	 final String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"${"	TokenNameStringLiteral	${
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
finalString	TokenNameIdentifier	 final String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
finalString	TokenNameIdentifier	 final String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
finalString	TokenNameIdentifier	 final String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
origString	TokenNameIdentifier	 orig String
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
finalString	TokenNameIdentifier	 final String
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
