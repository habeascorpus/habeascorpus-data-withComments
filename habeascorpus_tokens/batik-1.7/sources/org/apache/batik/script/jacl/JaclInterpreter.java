/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
script	TokenNameIdentifier	 script
.	TokenNameDOT	
jacl	TokenNameIdentifier	 jacl
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
Reader	TokenNameIdentifier	 Reader
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
script	TokenNameIdentifier	 script
.	TokenNameDOT	
InterpreterException	TokenNameIdentifier	 Interpreter Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
tcl	TokenNameIdentifier	 tcl
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Interp	TokenNameIdentifier	 Interp
;	TokenNameSEMICOLON	
import	TokenNameimport	
tcl	TokenNameIdentifier	 tcl
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ReflectObject	TokenNameIdentifier	 Reflect Object
;	TokenNameSEMICOLON	
import	TokenNameimport	
tcl	TokenNameIdentifier	 tcl
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
TclException	TokenNameIdentifier	 Tcl Exception
;	TokenNameSEMICOLON	
/** * A simple implementation of <code>Interpreter</code> interface to use * JACL Tcl parser. * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @version $Id: JaclInterpreter.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A simple implementation of <code>Interpreter</code> interface to use JACL Tcl parser. @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @version $Id: JaclInterpreter.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
JaclInterpreter	TokenNameIdentifier	 Jacl Interpreter
implements	TokenNameimplements	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
script	TokenNameIdentifier	 script
.	TokenNameDOT	
Interpreter	TokenNameIdentifier	 Interpreter
{	TokenNameLBRACE	
private	TokenNameprivate	
Interp	TokenNameIdentifier	 Interp
interpreter	TokenNameIdentifier	 interpreter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
JaclInterpreter	TokenNameIdentifier	 Jacl Interpreter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
interpreter	TokenNameIdentifier	 interpreter
=	TokenNameEQUAL	
new	TokenNamenew	
Interp	TokenNameIdentifier	 Interp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
interpreter	TokenNameIdentifier	 interpreter
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
"package require java"	TokenNameStringLiteral	package require java
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TclException	TokenNameIdentifier	 Tcl Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// org.apache.batik.script.Intepreter implementation 	TokenNameCOMMENT_LINE	org.apache.batik.script.Intepreter implementation 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
scriptreader	TokenNameIdentifier	 scriptreader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
scriptreader	TokenNameIdentifier	 scriptreader
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
scriptreader	TokenNameIdentifier	 scriptreader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// oops jacl doesn't accept reader in its eval method :-( 	TokenNameCOMMENT_LINE	oops jacl doesn't accept reader in its eval method :-( 
StringBuffer	TokenNameIdentifier	 String Buffer
sbuffer	TokenNameIdentifier	 sbuffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
1024	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
scriptreader	TokenNameIdentifier	 scriptreader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sbuffer	TokenNameIdentifier	 sbuffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
sbuffer	TokenNameIdentifier	 sbuffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
script	TokenNameIdentifier	 script
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
interpreter	TokenNameIdentifier	 interpreter
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
script	TokenNameIdentifier	 script
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TclException	TokenNameIdentifier	 Tcl Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InterpreterException	TokenNameIdentifier	 Interpreter Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InterpreterException	TokenNameIdentifier	 Interpreter Exception
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
interpreter	TokenNameIdentifier	 interpreter
.	TokenNameDOT	
getResult	TokenNameIdentifier	 get Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
interpreter	TokenNameIdentifier	 interpreter
.	TokenNameDOT	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
bindObject	TokenNameIdentifier	 bind Object
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
interpreter	TokenNameIdentifier	 interpreter
.	TokenNameDOT	
setVar	TokenNameIdentifier	 set Var
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ReflectObject	TokenNameIdentifier	 Reflect Object
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
interpreter	TokenNameIdentifier	 interpreter
,	TokenNameCOMMA	
object	TokenNameIdentifier	 object
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TclException	TokenNameIdentifier	 Tcl Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should not happened we just register an object 	TokenNameCOMMENT_LINE	should not happened we just register an object 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setOut	TokenNameIdentifier	 set Out
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no implementation of a default output function in Jacl 	TokenNameCOMMENT_LINE	no implementation of a default output function in Jacl 
}	TokenNameRBRACE	
// org.apache.batik.i18n.Localizable implementation 	TokenNameCOMMENT_LINE	org.apache.batik.i18n.Localizable implementation 
public	TokenNamepublic	
Locale	TokenNameIdentifier	 Locale
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
